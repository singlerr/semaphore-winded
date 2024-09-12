package io.github.singlerr.semaphore.interactors.caller.presenter.data;

import java.util.UUID;
import lombok.Data;

@Data
public class InverseCallRequest {
  private final UUID callerId;
  private final UUID calleeId;
}
