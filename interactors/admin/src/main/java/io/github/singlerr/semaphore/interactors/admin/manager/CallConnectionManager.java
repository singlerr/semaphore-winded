package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.admin.manager.data.ConnectionState;

public interface CallConnectionManager {

    void close(int connectionId);

    ConnectionState open(int callerId, int calleeId);
}
