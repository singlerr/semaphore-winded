package io.github.singlerr.semaphore.interactors.admin.manager.data;

import java.util.Map;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public final class CallableEntity extends ContextAware {
  private final UUID id;
  private final State state;

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static final class State {

    private final int stateId;
    private final Map<UUID, Integer> missCallCount;
    private final EntityType entityType;
  }
}
