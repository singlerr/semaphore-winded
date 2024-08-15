package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import java.util.Objects;

public final class PresentableCallConnection {
    private final int id;
    private final int callerId;
    private final int calleeId;
    private final boolean alive;

    public PresentableCallConnection(int id, int callerId, int calleeId, boolean alive) {
        this.id = id;
        this.callerId = callerId;
        this.calleeId = calleeId;
        this.alive = alive;
    }

    public int id() {
        return id;
    }

    public int callerId() {
        return callerId;
    }

    public int calleeId() {
        return calleeId;
    }

    public boolean alive() {
        return alive;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        PresentableCallConnection that = (PresentableCallConnection) obj;
        return this.id == that.id &&
                this.callerId == that.callerId &&
                this.calleeId == that.calleeId &&
                this.alive == that.alive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, callerId, calleeId, alive);
    }

    @Override
    public String toString() {
        return "PresentableCallConnection[" +
                "id=" + id + ", " +
                "callerId=" + callerId + ", " +
                "calleeId=" + calleeId + ", " +
                "alive=" + alive + ']';
    }

}
