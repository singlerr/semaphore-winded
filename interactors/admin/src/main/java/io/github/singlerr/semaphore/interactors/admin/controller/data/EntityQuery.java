package io.github.singlerr.semaphore.interactors.admin.controller.data;

import java.util.Objects;
import java.util.UUID;

public final class EntityQuery {

    private EntityQuery(){}

    public static final class GetEntity {
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

    public static final class CreateEntity {
        public CreateEntity() {
        }

        @Override
        public boolean equals(Object obj) {
            return obj == this || obj != null && obj.getClass() == this.getClass();
        }

        @Override
        public int hashCode() {
            return 1;
        }

        @Override
        public String toString() {
            return "CreateEntity[]";
        }
    }

    public static final class DeleteEntity {
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


}
