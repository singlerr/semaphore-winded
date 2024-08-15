package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.admin.manager.data.CallableEntity;

import java.util.UUID;

public interface EntityManager {

    CallableEntity create();

    void delete(UUID id);

}

