package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.access.call.CallState;
import io.github.singlerr.semaphore.interactors.access.database.Entity;

import java.util.UUID;

public interface CallStateManager {

    void updateById(UUID entityId, Entity.State state);

    Entity.State getById(UUID entityId);

}
