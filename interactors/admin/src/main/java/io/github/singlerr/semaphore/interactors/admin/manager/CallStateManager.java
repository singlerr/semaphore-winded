package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.access.call.CallState;

import java.util.UUID;

public interface CallStateManager {

    void updateById(UUID entityId, CallState state);

    CallState getById(UUID entityId);

}
