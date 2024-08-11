package io.github.singlerr.semaphore.interactors.admin.controller.data;

public final class EntityQuery {

    private EntityQuery(){}

    public record GetEntity(int id){}
    public record CreateEntity(){}
    public record DeleteEntity(int id){}


}
