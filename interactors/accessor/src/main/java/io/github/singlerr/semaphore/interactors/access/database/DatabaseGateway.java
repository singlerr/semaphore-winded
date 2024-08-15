package io.github.singlerr.semaphore.interactors.access.database;

import java.util.UUID;

public interface DatabaseGateway {

    void update(UUID id, Entity state);

    void create(UUID id, Entity newState);

    Entity create();

    void delete(UUID id);

    Entity getById(UUID id);

}
