package io.github.singlerr.semaphore.interactors.admin.manager.data;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = false)
@Data
public final class CallConnectionEntity extends ContextAware {
  private final UUID id;
  private final UUID callerId;
  private final UUID calleeId;
  private final ConnectionState state;

}
