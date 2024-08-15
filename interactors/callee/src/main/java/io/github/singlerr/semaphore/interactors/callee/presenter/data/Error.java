package io.github.singlerr.semaphore.interactors.callee.presenter.data;

import java.util.Objects;

public final class Error {
    private final int calleeId;
    private final int callerId;
    private final String reason;

    public Error(int calleeId, int callerId, String reason) {
        this.calleeId = calleeId;
        this.callerId = callerId;
        this.reason = reason;
    }

    public int calleeId() {
        return calleeId;
    }

    public int callerId() {
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
