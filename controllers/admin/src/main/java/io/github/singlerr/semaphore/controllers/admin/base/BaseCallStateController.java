package io.github.singlerr.semaphore.controllers.admin.base;

import io.github.singlerr.semaphore.interactors.access.call.CallState;
import io.github.singlerr.semaphore.interactors.admin.AdminInteractor;
import io.github.singlerr.semaphore.interactors.admin.controller.CallStateController;
import io.github.singlerr.semaphore.interactors.admin.controller.data.CallStateQuery;
import io.github.singlerr.semaphore.interactors.admin.manager.CallStateManager;
import io.github.singlerr.semaphore.interactors.admin.presenter.EntityPresenter;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.ErrorEntity;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableEntity;

public abstract class BaseCallStateController implements CallStateController {

    protected final CallStateManager callStateManager;
    protected final EntityPresenter entityPresenter;

    protected BaseCallStateController(AdminInteractor manager){
        this.callStateManager = manager.getStateManager();
        this.entityPresenter = manager.getEntityPresenter();
    }

    @Override
    public void getCallState(CallStateQuery.GetCallState query) {
        int state = callStateManager.getById(query.id());

        if(state == -1){
            entityPresenter.presentError(new ErrorEntity("해당 엔티티를 찾을 수 없습니다."));
            return;
        }

        entityPresenter.present(new PresentableEntity(query.id(), state));
    }

    @Override
    public void setCallState(CallStateQuery.SetCallState query) {
        callStateManager.updateById(query.id(), query.state());
    }
}
