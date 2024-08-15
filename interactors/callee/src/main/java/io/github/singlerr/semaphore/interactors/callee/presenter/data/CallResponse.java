package io.github.singlerr.semaphore.interactors.callee.presenter.data;

import java.util.Objects;
import java.util.UUID;

public final class CallResponse {
    private final UUID callerId;
    private final UUID calleeId;
    private final ResponseType responseType;

    public CallResponse(UUID callerId, UUID calleeId, ResponseType responseType) {
        this.callerId = callerId;
        this.calleeId = calleeId;
        this.responseType = responseType;
    }

    public UUID callerId() {
        return callerId;
    }

    public UUID calleeId() {
        return calleeId;
    }

    public ResponseType responseType() {
        return responseType;
    }

    @Override
    public String toString() {
        return "CallResponse{" +
                "callerId=" + callerId +
                ", calleeId=" + calleeId +
                ", responseType=" + responseType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallResponse that = (CallResponse) o;
        return Objects.equals(callerId, that.callerId) && Objects.equals(calleeId, that.calleeId) && responseType == that.responseType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(callerId, calleeId, responseType);
    }

    public enum ResponseType{
        ACCEPT,
        REJECT
    }
}
