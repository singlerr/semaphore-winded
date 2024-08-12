package io.github.singlerr.semaphore.interactors.callee.presenter;

import io.github.singlerr.semaphore.interactors.callee.presenter.data.Error;

public interface ErrorHandler {

    void error(Error entity);
}
