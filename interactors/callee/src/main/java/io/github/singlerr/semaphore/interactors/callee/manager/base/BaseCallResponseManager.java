package io.github.singlerr.semaphore.interactors.callee.manager.base;

import io.github.singlerr.semaphore.interactors.access.call.CallConnectionHandler;
import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;
import io.github.singlerr.semaphore.interactors.callee.CalleeInteractor;
import io.github.singlerr.semaphore.interactors.callee.manager.CallResponseManager;
import io.github.singlerr.semaphore.interactors.callee.presenter.ErrorHandler;

public abstract class BaseCallResponseManager implements CallResponseManager {

  protected final DatabaseGateway database;
  protected final ErrorHandler errorPresenter;
  protected final CallConnectionHandler callConnectionHandler;

  protected BaseCallResponseManager(DatabaseGateway database, CalleeInteractor interactor,
                                    CallConnectionHandler callConnectionHandler) {
    this.database = database;
    this.errorPresenter = interactor.getErrorPresenter();
    this.callConnectionHandler = callConnectionHandler;
  }
}
