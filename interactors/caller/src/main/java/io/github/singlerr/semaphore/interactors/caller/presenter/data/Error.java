package io.github.singlerr.semaphore.interactors.caller.presenter.data;

import java.util.UUID;
import lombok.Data;

@Data
public class Error {
  private final UUID calleeId;
  private final UUID callerId;
  private final String reason;

}
