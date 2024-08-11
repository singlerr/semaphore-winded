package io.github.singlerr.semaphore.interactors.admin.manager.base;

import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;
import io.github.singlerr.semaphore.interactors.access.database.Entity;
import io.github.singlerr.semaphore.interactors.admin.manager.EntityManager;
import io.github.singlerr.semaphore.interactors.admin.manager.data.CallableEntity;

public abstract class BaseEntityManager implements EntityManager {

    protected final DatabaseGateway database;

    protected BaseEntityManager(DatabaseGateway database){
        this.database = database;
    }

    @Override
    public CallableEntity create() {
        Entity entity = database.create();

        return new CallableEntity(entity.id(), entity.stateId());
    }

    @Override
    public void delete(int id) {
        if(database.getById(id) == null)
            return;
        database.delete(id);
    }
}
