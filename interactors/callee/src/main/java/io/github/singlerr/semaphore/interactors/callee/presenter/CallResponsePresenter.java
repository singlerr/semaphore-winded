package io.github.singlerr.semaphore.interactors.callee.presenter;

import io.github.singlerr.semaphore.interactors.callee.presenter.data.CallResponse;

public interface CallResponsePresenter extends ErrorHandler {

  void present(CallResponse entity);

}
