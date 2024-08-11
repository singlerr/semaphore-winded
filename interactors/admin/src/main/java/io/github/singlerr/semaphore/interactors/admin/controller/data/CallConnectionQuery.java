package io.github.singlerr.semaphore.interactors.admin.controller.data;

public final class CallConnectionQuery {
    private CallConnectionQuery(){}

    public record OpenConnection(int callerId, int calleeId){}
    public record CloseConnection(int id){}
    public record GetConnection(int id){}
}
