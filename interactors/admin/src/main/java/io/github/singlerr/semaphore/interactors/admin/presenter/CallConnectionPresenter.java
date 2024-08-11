package io.github.singlerr.semaphore.interactors.admin.presenter;

import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableCallConnection;

public interface CallConnectionPresenter extends ErrorPresenter{

    void present(PresentableCallConnection entity);

}
