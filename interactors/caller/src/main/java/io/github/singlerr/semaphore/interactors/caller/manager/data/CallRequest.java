package io.github.singlerr.semaphore.interactors.caller.manager.data;

import lombok.Data;

import java.util.UUID;

@Data
public class CallRequest {
  private final UUID callerId;
  private final UUID calleeId;
}
