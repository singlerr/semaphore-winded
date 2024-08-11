package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.admin.manager.data.CallableEntity;

public interface EntityManager {

    CallableEntity create();

    void delete(int id);

}

