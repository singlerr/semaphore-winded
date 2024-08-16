package io.github.singlerr.semaphore.interactors.access.call;

import io.github.singlerr.semaphore.interactors.access.ContextAware;

import java.util.Objects;
import java.util.UUID;

public final class CallConnection extends ContextAware {
    private final UUID id;
    private final UUID calleeId;
    private final UUID callerId;
    private final CallState state;

    public CallConnection(UUID id, UUID calleeId, UUID callerId, CallState state) {
        this.id = id;
        this.calleeId = calleeId;
        this.callerId = callerId;
        this.state = state;
    }

    public UUID id() {
        return id;
    }

    public UUID calleeId() {
        return calleeId;
    }

    public UUID callerId() {
        return callerId;
    }

    public CallState state() {
        return state;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        CallConnection that = (CallConnection) obj;
        return this.id == that.id &&
                this.calleeId == that.calleeId &&
                this.callerId == that.callerId &&
                Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, calleeId, callerId, state);
    }

    @Override
    public String toString() {
        return "CallConnection[" +
                "id=" + id + ", " +
                "calleeId=" + calleeId + ", " +
                "callerId=" + callerId + ", " +
                "state=" + state + ']';
    }

}
