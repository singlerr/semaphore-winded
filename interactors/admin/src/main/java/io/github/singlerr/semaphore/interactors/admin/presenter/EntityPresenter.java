package io.github.singlerr.semaphore.interactors.admin.presenter;

import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableEntity;

public interface EntityPresenter extends ErrorPresenter{

    void present(PresentableEntity entity);

}
