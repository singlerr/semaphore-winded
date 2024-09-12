package io.github.singlerr.semaphore.presenter.admin;

import io.github.singlerr.semaphore.interactors.admin.presenter.EntityPresenter;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.ErrorEntity;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableEntity;
import java.util.ArrayList;
import java.util.Collection;

public abstract class EntityPresenterAdapter implements EntityPresenter {

  protected final Collection<EntityPresenter> subPresenters;

  protected EntityPresenterAdapter() {
    this.subPresenters = new ArrayList<>();
  }

  @Override
  public void present(PresentableEntity entity) {
    subPresenters.forEach(p -> p.present(entity));
  }

  @Override
  public void presentError(ErrorEntity error) {
    subPresenters.forEach(p -> p.presentError(error));
  }
}
