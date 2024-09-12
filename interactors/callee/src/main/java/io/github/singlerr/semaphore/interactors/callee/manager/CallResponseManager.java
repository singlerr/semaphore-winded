package io.github.singlerr.semaphore.interactors.callee.manager;

import io.github.singlerr.semaphore.interactors.callee.manager.data.ResponseType;
import java.util.UUID;

public interface CallResponseManager {

  void reply(UUID callerId, UUID calleeId, ResponseType type);

}
