package io.github.singlerr.semaphore.interactors.callee.controller.data;

import java.util.UUID;
import lombok.Data;

@Data
public class CallResponse {
  private final UUID callerId;
  private final UUID calleeId;
  private final Response response;

  public enum Response {
    ACCEPT,
    REJECT
  }
}
