package io.github.singlerr.semaphore.interactors.admin.manager.data;

import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableEntity;

import java.util.Objects;
import java.util.UUID;

public final class CallableEntity extends ContextAware{
    private final UUID id;
    private final State state;

    public CallableEntity(UUID id, State state) {
        this.id = id;
        this.state = state;
    }

    public UUID id() {
        return id;
    }

    public State state() {
        return state;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        CallableEntity that = (CallableEntity) obj;
        return this.id == that.id &&
                this.state == that.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state);
    }

    @Override
    public String toString() {
        return "CallableEntity[" +
                "id=" + id + ", " +
                "stateId=" + state + ']';
    }

    public static final class State {

        private final int stateId;
        private final int missCallCount;

        public State(int stateId, int missCallCount){
            this.stateId = stateId;
            this.missCallCount = missCallCount;
        }

        public int stateId(){
            return this.stateId;
        }

        public int missCallCount(){
            return this.missCallCount;
        }

        @Override
        public String toString() {
            return "State{" +
                    "stateId=" + stateId +
                    ", missCallCount=" + missCallCount +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            State state = (State) o;
            return stateId == state.stateId && missCallCount == state.missCallCount;
        }

        @Override
        public int hashCode() {
            return Objects.hash(stateId, missCallCount);
        }
    }
}
