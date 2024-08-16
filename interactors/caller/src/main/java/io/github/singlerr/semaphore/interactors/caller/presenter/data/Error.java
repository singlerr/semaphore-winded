package io.github.singlerr.semaphore.interactors.caller.presenter.data;

import java.util.Objects;
import java.util.UUID;

public class Error {
    private final UUID calleeId;
    private final UUID callerId;
    private final String reason;

    public Error(UUID calleeId, UUID callerId, String reason) {
        this.calleeId = calleeId;
        this.callerId = callerId;
        this.reason = reason;
    }

    public UUID calleeId() {
        return calleeId;
    }

    public UUID callerId() {
        return callerId;
    }

    public String reason() {
        return reason;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Error that = (Error) obj;
        return this.calleeId == that.calleeId &&
                this.callerId == that.callerId &&
                Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(calleeId, callerId, reason);
    }

    @Override
    public String toString() {
        return "Error[" +
                "calleeId=" + calleeId + ", " +
                "callerId=" + callerId + ", " +
                "reason=" + reason + ']';
    }

}
