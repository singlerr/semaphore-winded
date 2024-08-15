package io.github.singlerr.semaphore.interactors.admin.manager.data;

import java.util.Objects;

public final class CallableEntity {
    private final int id;
    private final int stateId;

    public CallableEntity(int id, int stateId) {
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
        CallableEntity that = (CallableEntity) obj;
        return this.id == that.id &&
                this.stateId == that.stateId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stateId);
    }

    @Override
    public String toString() {
        return "CallableEntity[" +
                "id=" + id + ", " +
                "stateId=" + stateId + ']';
    }

}
