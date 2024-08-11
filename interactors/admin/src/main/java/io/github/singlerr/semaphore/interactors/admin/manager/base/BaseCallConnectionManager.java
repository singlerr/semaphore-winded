package io.github.singlerr.semaphore.interactors.admin.manager.base;

import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;
import io.github.singlerr.semaphore.interactors.admin.manager.CallConnectionManager;
import io.github.singlerr.semaphore.interactors.admin.manager.data.ConnectionState;

public abstract class BaseCallConnectionManager implements CallConnectionManager {

    protected final DatabaseGateway database;

    protected BaseCallConnectionManager(DatabaseGateway database){
        this.database = database;
    }

    protected abstract ConnectionState openConnection(int callerId, int calleeId);

    protected abstract void closeConnection(int connectionId);

    @Override
    public ConnectionState open(int callerId, int calleeId) {
        if(database.getById(calleeId) == null || database.getById(calleeId) == null)
            return null;

        return openConnection(callerId, calleeId);
    }

    @Override
    public void close(int connectionId) {
        closeConnection(connectionId);
    }
}
