package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.admin.manager.data.Call;

import java.util.UUID;

public interface CallStateManager {

  Call openCall(UUID callerId, UUID calleeId);

  Call closeCall(UUID id);

  Call closeCall(UUID callerId, UUID calleeId);

}
