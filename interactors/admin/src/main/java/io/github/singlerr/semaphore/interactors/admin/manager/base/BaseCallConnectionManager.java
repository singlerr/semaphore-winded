package io.github.singlerr.semaphore.interactors.admin.manager.base;

import io.github.singlerr.semaphore.interactors.access.call.CallConnection;
import io.github.singlerr.semaphore.interactors.access.call.CallConnectionHandler;
import io.github.singlerr.semaphore.interactors.access.call.CallState;
import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;
import io.github.singlerr.semaphore.interactors.admin.manager.CallConnectionManager;
import io.github.singlerr.semaphore.interactors.admin.manager.data.CallConnectionEntity;
import io.github.singlerr.semaphore.interactors.admin.manager.data.ConnectionState;
import io.github.singlerr.semaphore.interactors.admin.presenter.CallConnectionPresenter;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.ErrorEntity;
import java.util.UUID;

public abstract class BaseCallConnectionManager implements CallConnectionManager {

  protected final DatabaseGateway database;
  protected final CallConnectionHandler callConnectionHandler;
  protected final CallConnectionPresenter presenter;

  protected BaseCallConnectionManager(DatabaseGateway database,
                                      CallConnectionHandler callConnectionHandler,
                                      CallConnectionPresenter presenter) {
    this.database = database;
    this.callConnectionHandler = callConnectionHandler;
    this.presenter = presenter;
  }

  @Override
  public CallConnectionEntity open(UUID callerId, UUID calleeId) {
    if (database.getById(calleeId) == null || database.getById(calleeId) == null) {
      presenter.presentError(new ErrorEntity("해당 엔티티를 찾을 수 없습니다."));
      return null;
    }

    CallConnection connection = this.callConnectionHandler.open(callerId, calleeId);
    if (connection == null) {
      presenter.presentError(new ErrorEntity("해당 연결을 수립할 수 없습니다."));
      return null;
    }

    return new CallConnectionEntity(connection.getId(), connection.getCallerId(),
        connection.getCalleeId(),
        connection.getState() == CallState.ALIVE ? ConnectionState.ALIVE : ConnectionState.DEAD);
  }

  @Override
  public void close(UUID connectionId) {
    this.callConnectionHandler.close(connectionId);
  }

  @Override
  public CallConnectionEntity getById(UUID id) {
    CallConnection connection = this.callConnectionHandler.getById(id);
    if (connection == null) {
      presenter.presentError(new ErrorEntity("해당 연결을 찾을 수 없습니다."));
      return null;
    }

    return new CallConnectionEntity(connection.getId(), connection.getCallerId(),
        connection.getCalleeId(),
        connection.getState() == CallState.ALIVE ? ConnectionState.ALIVE : ConnectionState.DEAD);
  }
}
