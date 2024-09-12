package io.github.singlerr.semaphore.interactors.caller.presenter.data;

import lombok.Data;

import java.util.UUID;

@Data
public class Error {
  private final UUID calleeId;
  private final UUID callerId;
  private final String reason;

}
