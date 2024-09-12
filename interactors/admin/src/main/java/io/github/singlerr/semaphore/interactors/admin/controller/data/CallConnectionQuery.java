package io.github.singlerr.semaphore.interactors.admin.controller.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

public final class CallConnectionQuery {
  private CallConnectionQuery() {
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static class OpenConnection extends ContextAware {
    private final UUID callerId;
    private final UUID calleeId;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static class CloseConnection extends ContextAware {
    private final UUID id;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static class GetConnection extends ContextAware {
    private final UUID id;
  }
}
