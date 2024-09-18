package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.admin.manager.data.CallConnectionEntity;
import java.util.List;
import java.util.UUID;

public interface CallConnectionManager {

  void close(UUID connectionId);

  CallConnectionEntity open(UUID callerId, UUID calleeId);

  CallConnectionEntity getById(UUID id);

  List<CallConnectionEntity> getAll();
}
