package io.github.singlerr.semaphore.interactors.admin.controller.data;

import io.github.singlerr.semaphore.interactors.access.call.CallState;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableEntity;

import java.util.Objects;
import java.util.UUID;

public final class CallStateQuery {

    private CallStateQuery(){}

    public static class GetCallState extends ContextAware{
        private final UUID id;

        public GetCallState(UUID id) {
            this.id = id;
        }

        public UUID id() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            GetCallState that = (GetCallState) obj;
            return this.id == that.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "GetCallState[" +
                    "id=" + id + ']';
        }
    }

    public static class SetCallState extends ContextAware{
        private final UUID id;
        private final State state;

        public SetCallState(UUID id, State state) {
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
        public String toString() {
            return "SetCallState{" +
                    "id=" + id +
                    ", state=" + state +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            SetCallState that = (SetCallState) o;
            return state == that.state && Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, state);
        }
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
