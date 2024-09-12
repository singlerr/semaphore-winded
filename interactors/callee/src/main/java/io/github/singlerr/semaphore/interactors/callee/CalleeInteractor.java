package io.github.singlerr.semaphore.interactors.callee;

import io.github.singlerr.semaphore.interactors.callee.manager.CallResponseManager;
import io.github.singlerr.semaphore.interactors.callee.presenter.CallResponsePresenter;
import io.github.singlerr.semaphore.interactors.callee.presenter.ErrorHandler;

public interface CalleeInteractor {

  CallResponseManager getResponseManager();

  ErrorHandler getErrorPresenter();

  CallResponsePresenter getResponsePresenter();

}
