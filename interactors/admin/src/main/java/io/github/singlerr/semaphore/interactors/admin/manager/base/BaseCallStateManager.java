package io.github.singlerr.semaphore.interactors.admin.manager.base;

import io.github.singlerr.semaphore.interactors.access.call.CallState;
import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;
import io.github.singlerr.semaphore.interactors.access.database.Entity;
import io.github.singlerr.semaphore.interactors.admin.manager.CallStateManager;

public abstract class BaseCallStateManager implements CallStateManager {

    protected final DatabaseGateway database;

    protected BaseCallStateManager(DatabaseGateway database){
        this.database = database;
    }

    @Override
    public void updateById(int entityId, CallState state) {
        if(database.getById(entityId) == null)
            return;

        database.update(entityId, new Entity(entityId, state.getId()));
    }

    @Override
    public CallState getById(int entityId) {
        if(database.getById(entityId) == null)
            return null;

        Entity entity = database.getById(entityId);
        for (CallState value : CallState.values()) {
            if(value.getId() == entity.stateId())
                return value;
        }
        return null;
    }
}
