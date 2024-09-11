package io.github.singlerr.semaphore.interactors.admin.controller.data;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public final class EntityQuery {

    private EntityQuery(){}

    public static final class GetAllEntities extends ContextAware{}

    public static final class GetEntity extends ContextAware{
        private final UUID id;

        public GetEntity(UUID id) {
            this.id = id;
        }

        public UUID id() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            GetEntity that = (GetEntity) obj;
            return this.id == that.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "GetEntity[" +
                    "id=" + id + ']';
        }
    }

    public static final class UpdateEntity extends ContextAware{

        private final UUID id;
        private final State state;

        public UpdateEntity(UUID id, State state){
            this.id = id;
            this.state = state;
        }

        public UUID id(){
            return id;
        }

        public State state(){
            return state;
        }

        @Override
        public String toString() {
            return "UpdateEntity{" +
                    "id=" + id +
                    ", state=" + state +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            UpdateEntity that = (UpdateEntity) o;
            return Objects.equals(id, that.id) && Objects.equals(state, that.state);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, state);
        }
    }

    public static final class CreateEntity extends ContextAware{

        private UUID id;

        public CreateEntity(UUID id) {
            this.id = id;
        }

        public UUID id(){
            return id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CreateEntity that = (CreateEntity) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }

        @Override
        public String toString() {
            return "CreateEntity{" +
                    "id=" + id +
                    '}';
        }
    }

    public static final class DeleteEntity extends ContextAware{
        private final UUID id;

        public DeleteEntity(UUID id) {
            this.id = id;
        }

        public UUID id() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            DeleteEntity that = (DeleteEntity) obj;
            return this.id == that.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "DeleteEntity[" +
                    "id=" + id + ']';
        }
    }

    public static final class State {

        private final int stateId;
        private final Map<UUID, Integer> missCallCount;

        public State(int stateId, Map<UUID, Integer> missCallCount){
            this.stateId = stateId;
            this.missCallCount = missCallCount;
        }

        public int stateId(){
            return this.stateId;
        }

        public Map<UUID, Integer> missCallCount(){
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
