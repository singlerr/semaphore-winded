package io.github.singlerr.semaphore.interactors.access.database;

import java.util.Objects;
import java.util.UUID;

public final class Entity {

    private final UUID id;
    private final int stateId;


    public Entity(UUID id, int stateId) {
        this.id = id;
        this.stateId = stateId;
    }

    public UUID id() {
        return id;
    }

    public int stateId() {
        return stateId;
    }
}
