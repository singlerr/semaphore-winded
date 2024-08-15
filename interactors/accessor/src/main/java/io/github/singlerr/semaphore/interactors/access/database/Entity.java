package io.github.singlerr.semaphore.interactors.access.database;

import java.util.Objects;

public final class Entity {
    private final int id;
    private final int stateId;

    public Entity(int id, int stateId) {
        this.id = id;
        this.stateId = stateId;
    }

    public int id() {
        return id;
    }

    public int stateId() {
        return stateId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Entity that = (Entity) obj;
        return this.id == that.id &&
                this.stateId == that.stateId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stateId);
    }

    @Override
    public String toString() {
        return "Entity[" +
                "id=" + id + ", " +
                "stateId=" + stateId + ']';
    }

}
