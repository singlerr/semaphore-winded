package io.github.singlerr.semaphore.interactors.access.call;

public interface CallConnectionHandler {

    CallConnection open(int callerId, int calleeId);

    CallConnection close(int connectionId);

    CallConnection getById(int connectionId);

}
