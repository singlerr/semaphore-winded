package io.github.singlerr.semaphore.interactors.callee.presenter.data;

import java.util.Objects;
import java.util.UUID;

public final class CallResponse {
    private final UUID callerId;
    private final UUID calleeId;

    public CallResponse(UUID callerId, UUID calleeId) {
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
        CallResponse that = (CallResponse) obj;
        return this.callerId == that.callerId &&
                this.calleeId == that.calleeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(callerId, calleeId);
    }

    @Override
    public String toString() {
        return "CallResponse[" +
                "callerId=" + callerId + ", " +
                "calleeId=" + calleeId + ']';
    }

}
