package io.github.singlerr.semaphore.interactors.caller;

import io.github.singlerr.semaphore.interactors.caller.manager.CallRequestManager;
import io.github.singlerr.semaphore.interactors.caller.presenter.CallRequestPresenter;
import io.github.singlerr.semaphore.interactors.caller.presenter.ErrorPresenter;

public interface CallerInteractor {

  CallRequestManager getCallRequestManager();

  ErrorPresenter getErrorPresenter();

  CallRequestPresenter getCallRequestPresenter();

}
