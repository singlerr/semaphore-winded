package io.github.singlerr.semaphore.interactors.admin.controller.data;

import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

public final class CallStateQuery {

  private CallStateQuery() {
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static class OpenCall extends ContextAware {

    private final UUID callerId;
    private final UUID calleeId;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static class CloseCallById extends ContextAware {

    private final UUID id;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static class CloseCall extends ContextAware {

    private final UUID callerId;
    private final UUID calleeId;
  }
}
