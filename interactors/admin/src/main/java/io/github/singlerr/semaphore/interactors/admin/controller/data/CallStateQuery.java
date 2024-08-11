package io.github.singlerr.semaphore.interactors.admin.controller.data;

import io.github.singlerr.semaphore.interactors.access.call.CallState;

public final class CallStateQuery {

    private CallStateQuery(){}

    public record GetCallState(int id){}
    public record SetCallState(int id, CallState callState){}
}
