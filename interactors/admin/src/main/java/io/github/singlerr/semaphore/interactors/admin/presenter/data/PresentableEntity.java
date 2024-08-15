package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import io.github.singlerr.semaphore.interactors.access.call.CallState;

import java.util.Objects;

public final class PresentableEntity {
    private final int id;
    private final CallState callState;

    public PresentableEntity(int id, CallState callState) {
        this.id = id;
        this.callState = callState;
    }

    public int id() {
        return id;
    }

    public CallState callState() {
        return callState;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        PresentableEntity that = (PresentableEntity) obj;
        return this.id == that.id &&
                Objects.equals(this.callState, that.callState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, callState);
    }

    @Override
    public String toString() {
        return "PresentableEntity[" +
                "id=" + id + ", " +
                "callState=" + callState + ']';
    }

}
