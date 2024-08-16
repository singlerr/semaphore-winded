package io.github.singlerr.semaphore.interactors.admin.manager.data;

import java.util.Objects;
import java.util.UUID;

public final class CallConnectionEntity extends ContextAware{
    private final UUID id;
    private final UUID callerId;
    private final UUID calleeId;
    private final ConnectionState state;

    public CallConnectionEntity(UUID id, UUID callerId, UUID calleeId, ConnectionState state) {
        this.id = id;
        this.callerId = callerId;
        this.calleeId = calleeId;
        this.state = state;
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
