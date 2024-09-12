package io.github.singlerr.semaphore.interactors.caller.presenter.data;

import lombok.Data;

import java.util.UUID;

@Data
public class InverseCallRequest {
  private final UUID callerId;
  private final UUID calleeId;
}
