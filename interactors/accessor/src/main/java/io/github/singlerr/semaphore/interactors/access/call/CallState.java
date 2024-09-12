package io.github.singlerr.semaphore.interactors.access.call;

import lombok.Getter;

@Getter
public enum CallState {
  ALIVE(0),
  DEAD(1);

  private final int id;

  CallState(int id) {
    this.id = id;
  }

}
