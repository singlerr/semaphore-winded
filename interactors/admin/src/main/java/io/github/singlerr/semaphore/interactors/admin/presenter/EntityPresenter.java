package io.github.singlerr.semaphore.interactors.admin.presenter;

import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableEntity;

import java.util.List;

public interface EntityPresenter extends ErrorPresenter {

  void present(PresentableEntity entity);

  void present(List<PresentableEntity> entities);

}
