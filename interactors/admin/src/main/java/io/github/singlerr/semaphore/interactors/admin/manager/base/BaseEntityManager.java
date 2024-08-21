package io.github.singlerr.semaphore.interactors.admin.manager.base;

import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;
import io.github.singlerr.semaphore.interactors.access.database.Entity;
import io.github.singlerr.semaphore.interactors.admin.manager.EntityManager;
import io.github.singlerr.semaphore.interactors.admin.manager.data.CallableEntity;

import java.util.UUID;

public abstract class BaseEntityManager implements EntityManager {

    protected final DatabaseGateway database;

    protected BaseEntityManager(DatabaseGateway database){
        this.database = database;
    }

    @Override
    public CallableEntity create(UUID id) {
        Entity entity = database.create(id);

        return new CallableEntity(entity.id(), new CallableEntity.State(entity.state().stateId(), entity.state().missCallCount()));
    }

    @Override
    public void delete(UUID id) {
        if(database.getById(id) == null)
            return;
        database.delete(id);
    }
}
