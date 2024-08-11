package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.access.call.CallState;

public interface CallStateManager {

    void updateById(int entityId, CallState state);

    CallState getById(int entityId);

}
