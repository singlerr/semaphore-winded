package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import io.github.singlerr.semaphore.interactors.access.database.Entity;
import io.github.singlerr.semaphore.interactors.access.database.EntityType;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public final class PresentableEntity extends ContextAware {
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
