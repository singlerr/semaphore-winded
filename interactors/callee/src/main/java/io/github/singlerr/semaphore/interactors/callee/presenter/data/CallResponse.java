package io.github.singlerr.semaphore.interactors.callee.presenter.data;

import java.util.Objects;

public final class CallResponse {
    private final int callerId;
    private final int calleeId;

    public CallResponse(int callerId, int calleeId) {
        this.callerId = callerId;
        this.calleeId = calleeId;
    }

    public int callerId() {
        return callerId;
    }

    public int calleeId() {
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
