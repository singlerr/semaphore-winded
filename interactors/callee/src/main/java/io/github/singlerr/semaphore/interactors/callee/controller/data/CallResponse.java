package io.github.singlerr.semaphore.interactors.callee.controller.data;

import java.util.Objects;
import java.util.UUID;

public class CallResponse {
    private final UUID callerId;
    private final UUID calleeId;
    private final Response response;

    public CallResponse(UUID callerId, UUID calleeId, Response response) {
        this.callerId = callerId;
        this.calleeId = calleeId;
        this.response = response;
    }

    public UUID callerId() {
        return callerId;
    }

    public UUID calleeId() {
        return calleeId;
    }

    public Response response() {
        return response;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        CallResponse that = (CallResponse) obj;
        return this.callerId == that.callerId &&
                this.calleeId == that.calleeId &&
                Objects.equals(this.response, that.response);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callerId, calleeId, response);
    }

    @Override
    public String toString() {
        return "CallResponse[" +
                "callerId=" + callerId + ", " +
                "calleeId=" + calleeId + ", " +
                "response=" + response + ']';
    }


    public enum Response {
        ACCEPT,
        REJECT
    }
}
