package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import io.github.singlerr.semaphore.interactors.access.call.CallState;

import java.util.Objects;
import java.util.UUID;

public final class PresentableEntity {
    private final UUID id;
    private final int state;

    public PresentableEntity(UUID id, int state) {
        this.id = id;
        this.state = state;
    }

    public UUID id() {
        return id;
    }

    public int state(){
        return state;
    }

    @Override
    public String toString() {
        return "PresentableEntity{" +
                "id=" + id +
                ", state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PresentableEntity that = (PresentableEntity) o;
        return state == that.state && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state);
    }
}
