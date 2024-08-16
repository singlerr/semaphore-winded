package io.github.singlerr.semaphore.interactors.admin.manager.base;

import io.github.singlerr.semaphore.interactors.access.call.CallState;
import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;
import io.github.singlerr.semaphore.interactors.access.database.Entity;
import io.github.singlerr.semaphore.interactors.admin.manager.CallStateManager;

import java.util.UUID;

public abstract class BaseCallStateManager implements CallStateManager {

    protected final DatabaseGateway database;

    protected BaseCallStateManager(DatabaseGateway database){
        this.database = database;
    }

    @Override
    public void updateById(UUID entityId, int state) {
        if(database.getById(entityId) == null)
            return;

        database.update(entityId, new Entity(entityId, state));
    }

    @Override
    public int getById(UUID entityId) {
        if(database.getById(entityId) == null)
            return -1;

        Entity entity = database.getById(entityId);
        return entity.stateId();
    }
}
