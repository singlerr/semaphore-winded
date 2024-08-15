package io.github.singlerr.semaphore.interactors.admin.manager.data;

import java.util.Objects;

public final class CallConnectionEntity {
    private final int id;
    private final int callerId;
    private final int calleeId;
    private final ConnectionState state;

    public CallConnectionEntity(int id, int callerId, int calleeId, ConnectionState state) {
        this.id = id;
        this.callerId = callerId;
        this.calleeId = calleeId;
        this.state = state;
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

    public ConnectionState state() {
        return state;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        CallConnectionEntity that = (CallConnectionEntity) obj;
        return this.id == that.id &&
                this.callerId == that.callerId &&
                this.calleeId == that.calleeId &&
                Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, callerId, calleeId, state);
    }

    @Override
    public String toString() {
        return "CallConnectionEntity[" +
                "id=" + id + ", " +
                "callerId=" + callerId + ", " +
                "calleeId=" + calleeId + ", " +
                "state=" + state + ']';
    }

}
