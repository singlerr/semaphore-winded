package io.github.singlerr.semaphore.interactors.callee.manager.base;

import io.github.singlerr.semaphore.interactors.access.call.CallConnectionHandler;
import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;
import io.github.singlerr.semaphore.interactors.callee.CalleeInteractor;
import io.github.singlerr.semaphore.interactors.callee.manager.CallResponseManager;
import io.github.singlerr.semaphore.interactors.callee.manager.data.ResponseType;
import io.github.singlerr.semaphore.interactors.callee.presenter.ErrorHandler;
import io.github.singlerr.semaphore.interactors.callee.presenter.data.Error;

public abstract class BaseCallResponseManager implements CallResponseManager {

    protected final DatabaseGateway database;
    protected final ErrorHandler errorPresenter;
    protected final CallConnectionHandler callConnectionHandler;

    protected BaseCallResponseManager(DatabaseGateway database, CalleeInteractor interactor, CallConnectionHandler callConnectionHandler){
        this.database = database;
        this.errorPresenter = interactor.getErrorPresenter();
        this.callConnectionHandler = callConnectionHandler;
    }

    @Override
    public void reply(int callerId, int calleeId, ResponseType type) {
        if(database.getById(calleeId) == null || database.getById(calleeId) == null){
            errorPresenter.error(new Error(calleeId, callerId, "온라인이 아닙니다."));
            return;
        }

    }
}
