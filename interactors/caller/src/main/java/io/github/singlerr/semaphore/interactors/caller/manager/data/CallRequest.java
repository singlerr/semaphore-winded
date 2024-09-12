package io.github.singlerr.semaphore.interactors.caller.manager.data;

import java.util.UUID;
import lombok.Data;

@Data
public class CallRequest {
  private final UUID callerId;
  private final UUID calleeId;
}
