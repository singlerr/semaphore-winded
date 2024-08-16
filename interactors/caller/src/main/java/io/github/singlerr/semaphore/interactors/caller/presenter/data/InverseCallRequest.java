package io.github.singlerr.semaphore.interactors.caller.presenter.data;

import java.util.Objects;
import java.util.UUID;

public class InverseCallRequest {
    private final UUID callerId;
    private final UUID calleeId;

    public InverseCallRequest(UUID callerId, UUID calleeId) {
        this.callerId = callerId;
        this.calleeId = calleeId;
    }

    public UUID callerId() {
        return callerId;
    }

    public UUID calleeId() {
        return calleeId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        InverseCallRequest that = (InverseCallRequest) obj;
        return Objects.equals(this.callerId, that.callerId) &&
                Objects.equals(this.calleeId, that.calleeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callerId, calleeId);
    }

    @Override
    public String toString() {
        return "InverseCallRequest[" +
                "callerId=" + callerId + ", " +
                "calleeId=" + calleeId + ']';
    }

}
