package io.github.singlerr.semaphore.interactors.admin.manager.data;

import java.util.Objects;
import java.util.UUID;

public final class Call extends ContextAware{

    private final UUID id;
    private final UUID callerId;
    private final UUID calleeId;
    private final ConnectionState state;

    public Call(UUID id, UUID callerId, UUID calleeId, ConnectionState state) {
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
    public String toString() {
        return "Call{" +
                "id=" + id +
                ", callerId=" + callerId +
                ", calleeId=" + calleeId +
                ", state=" + state +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Call call = (Call) o;
        return Objects.equals(id, call.id) && Objects.equals(callerId, call.callerId) && Objects.equals(calleeId, call.calleeId) && state == call.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, callerId, calleeId, state);
    }
}
