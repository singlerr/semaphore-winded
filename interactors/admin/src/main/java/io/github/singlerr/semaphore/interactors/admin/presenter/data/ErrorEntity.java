package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import java.util.Objects;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public final class ErrorEntity extends ContextAware {
  private final String message;
}
