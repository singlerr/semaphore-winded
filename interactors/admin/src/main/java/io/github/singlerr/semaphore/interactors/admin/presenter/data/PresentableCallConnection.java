package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import java.util.Objects;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public final class PresentableCallConnection extends ContextAware {
  private final UUID id;
  private final UUID callerId;
  private final UUID calleeId;
  private final boolean alive;

}
