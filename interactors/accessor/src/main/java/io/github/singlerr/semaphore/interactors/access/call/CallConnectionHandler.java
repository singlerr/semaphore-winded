package io.github.singlerr.semaphore.interactors.access.call;

import java.util.List;
import java.util.UUID;

public interface CallConnectionHandler {

  CallConnection open(UUID callerId, UUID calleeId);

  CallConnection close(UUID connectionId);

  CallConnection getById(UUID connectionId);

  List<CallConnection> getAll();
}
