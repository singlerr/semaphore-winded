package io.github.singlerr.semaphore.interactors.access.database;

import io.github.singlerr.semaphore.interactors.access.ContextAware;
import java.util.Map;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = false)
@Data
public final class Entity extends ContextAware {

  private final UUID id;
  private final State state;

  @Data
  public static final class State {

    private final int stateId;
    private final Map<UUID, Integer> missCallCount;
    private final EntityType entityType;
  }
}
