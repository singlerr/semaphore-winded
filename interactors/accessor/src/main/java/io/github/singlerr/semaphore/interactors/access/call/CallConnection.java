package io.github.singlerr.semaphore.interactors.access.call;

import java.util.Objects;

public final class CallConnection {
    private final int id;
    private final int calleeId;
    private final int callerId;
    private final CallState state;

    public CallConnection(int id, int calleeId, int callerId, CallState state) {
        this.id = id;
        this.calleeId = calleeId;
        this.callerId = callerId;
        this.state = state;
    }

    public int id() {
        return id;
    }

    public int calleeId() {
        return calleeId;
    }

    public int callerId() {
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
