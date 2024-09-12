package io.github.singlerr.semaphore.interactors.caller.controller.data;

import lombok.Data;

import java.util.UUID;

@Data
public class CallRequest {
  private final UUID callerId;
  private final UUID calleeId;

}
