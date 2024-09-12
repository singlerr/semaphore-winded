package io.github.singlerr.semaphore.interactors.admin.controller.data;

import java.util.Map;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

public final class EntityQuery {

  private EntityQuery() {
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static final class GetAllEntities extends ContextAware {
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static final class GetEntity extends ContextAware {
    private final UUID id;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static final class UpdateEntity extends ContextAware {

    private final UUID id;
    private final State state;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static final class CreateEntity extends ContextAware {

    private final UUID id;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static final class CreateEntityWithState extends ContextAware {

    private final UUID id;
    private final State state;
  }


  @EqualsAndHashCode(callSuper = false)
  @Data
  public static final class DeleteEntity extends ContextAware {
    private final UUID id;
  }

  @EqualsAndHashCode(callSuper = false)
  @Data
  public static final class State {

    private final int stateId;
    private final Map<UUID, Integer> missCallCount;
    private final EntityType entityType;
  }
}
