package io.github.singlerr.semaphore.interactors.callee.manager;

import io.github.singlerr.semaphore.interactors.callee.manager.data.ResponseType;

public interface CallResponseManager {

    void reply(int callerId, int calleeId, ResponseType type);

}
