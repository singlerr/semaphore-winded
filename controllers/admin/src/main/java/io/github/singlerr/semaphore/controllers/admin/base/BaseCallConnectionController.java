package io.github.singlerr.semaphore.controllers.admin.base;

import io.github.singlerr.semaphore.interactors.admin.AdminInteractor;
import io.github.singlerr.semaphore.interactors.admin.controller.CallConnectionController;
import io.github.singlerr.semaphore.interactors.admin.controller.data.CallConnectionQuery;
import io.github.singlerr.semaphore.interactors.admin.manager.CallConnectionManager;
import io.github.singlerr.semaphore.interactors.admin.manager.data.CallConnectionEntity;
import io.github.singlerr.semaphore.interactors.admin.manager.data.ConnectionState;
import io.github.singlerr.semaphore.interactors.admin.presenter.CallConnectionPresenter;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableCallConnection;

public abstract class BaseCallConnectionController implements CallConnectionController {

  protected final CallConnectionManager manager;
  protected final CallConnectionPresenter presenter;

  protected BaseCallConnectionController(AdminInteractor manager) {
    this.manager = manager.getConnectionManager();
    this.presenter = manager.getConnectionPresenter();
  }

  @Override
  public void openConnection(CallConnectionQuery.OpenConnection query) {
    manager.open(query.getCallerId(), query.getCalleeId());
  }

  @Override
  public void closeConnection(CallConnectionQuery.CloseConnection query) {
    manager.close(query.getId());
  }

  @Override
  public void getConnection(CallConnectionQuery.GetConnection query) {
    CallConnectionEntity connection = manager.getById(query.getId());
    presenter.present(new PresentableCallConnection(connection.getId(), connection.getCallerId(),
        connection.getCalleeId(), connection.getState() == ConnectionState.ALIVE));
  }
}
