package io.github.singlerr.semaphore.interactors.access.database;

public interface DatabaseGateway {

    void update(int id, Entity state);

    void create(int id, Entity newState);

    Entity create();

    void delete(int id);

    Entity getById(int id);

}
