package io.github.singlerr.semaphore.interactors.callee.controller.data;

public record CallResponse(int callerId, int calleeId, Response response) {

    public enum Response{
        ACCEPT,
        REJECT
    }
}
