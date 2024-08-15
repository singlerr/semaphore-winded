package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import java.util.Objects;
import java.util.UUID;

public final class PresentableCallConnection {
    private final UUID id;
    private final UUID callerId;
    private final UUID calleeId;
    private final boolean alive;

    public PresentableCallConnection(UUID id, UUID callerId, UUID calleeId, boolean alive) {
        this.id = id;
        this.callerId = callerId;
        this.calleeId = calleeId;
        this.alive = alive;
    }

    public UUID id() {
        return id;
    }

    public UUID callerId() {
        return callerId;
    }

    public UUID calleeId() {
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
