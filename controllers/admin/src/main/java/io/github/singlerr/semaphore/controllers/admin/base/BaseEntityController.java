package io.github.singlerr.semaphore.controllers.admin.base;

import io.github.singlerr.semaphore.interactors.admin.AdminInteractor;
import io.github.singlerr.semaphore.interactors.admin.controller.EntityController;
import io.github.singlerr.semaphore.interactors.admin.controller.data.EntityQuery;
import io.github.singlerr.semaphore.interactors.admin.manager.EntityManager;
import io.github.singlerr.semaphore.interactors.admin.manager.data.CallableEntity;
import io.github.singlerr.semaphore.interactors.admin.presenter.EntityPresenter;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.ErrorEntity;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableEntity;

public abstract class BaseEntityController implements EntityController {

  protected final EntityManager entityManager;
  protected final EntityPresenter entityPresenter;

  protected BaseEntityController(AdminInteractor interactor) {
    this.entityManager = interactor.getEntityManager();
    this.entityPresenter = interactor.getEntityPresenter();
  }

  @Override
  public void createEntity(EntityQuery.CreateEntity query) {
    CallableEntity entity = entityManager.create(query.getId());

    if (entity == null) {
      entityPresenter.presentError(new ErrorEntity("error.cannot.create.entity"));
      return;
    }

    entityPresenter.present(new PresentableEntity(entity.getId(),
        new PresentableEntity.State(entity.getState().getStateId(),
            entity.getState().getMissCallCount(),
            io.github.singlerr.semaphore.interactors.access.database.EntityType.valueOf(
                entity.getState().getEntityType().name()))));
  }


  @Override
  public void deleteEntity(EntityQuery.DeleteEntity query) {
    entityManager.delete(query.getId());
  }

}
