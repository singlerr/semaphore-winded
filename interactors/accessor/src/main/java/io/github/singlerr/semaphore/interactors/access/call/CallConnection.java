package io.github.singlerr.semaphore.interactors.access.call;

import io.github.singlerr.semaphore.interactors.access.ContextAware;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public final class CallConnection extends ContextAware {
  private final UUID id;
  private final UUID calleeId;
  private final UUID callerId;
  private final CallState state;
}
