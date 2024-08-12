package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.admin.manager.data.CallConnectionEntity;
import io.github.singlerr.semaphore.interactors.admin.manager.data.ConnectionState;

public interface CallConnectionManager {

    void close(int connectionId);

    CallConnectionEntity open(int callerId, int calleeId);

    CallConnectionEntity getById(int id);

}
