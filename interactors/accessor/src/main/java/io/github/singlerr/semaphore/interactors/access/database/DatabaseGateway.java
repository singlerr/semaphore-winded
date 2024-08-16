package io.github.singlerr.semaphore.interactors.access.database;

import java.util.List;
import java.util.UUID;

public interface DatabaseGateway {

    void update(UUID id, Entity state);

    void create(UUID id, Entity newState);

    Entity create(UUID id);

    void delete(UUID id);

    Entity getById(UUID id);

    List<Entity> getAll();

}
