package io.github.singlerr.semaphore.controllers.admin.base;

import io.github.singlerr.semaphore.interactors.access.call.CallState;
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

    protected BaseEntityController(AdminInteractor interactor){
        this.entityManager = interactor.getEntityManager();
        this.entityPresenter = interactor.getEntityPresenter();
    }

    @Override
    public void createEntity(EntityQuery.CreateEntity query) {
        CallableEntity entity = entityManager.create(query.id());

        if(entity == null){
            entityPresenter.presentError(new ErrorEntity("엔티티를 생설할 수 없습니다."));
            return;
        }

        entityPresenter.present(new PresentableEntity(entity.id(), new PresentableEntity.State(entity.state().stateId(), entity.state().missCallCount())));
    }

    @Override
    public void deleteEntity(EntityQuery.DeleteEntity query) {
        entityManager.delete(query.id());
    }

}
