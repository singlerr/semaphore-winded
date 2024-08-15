package io.github.singlerr.semaphore.interactors.admin.controller.data;

import java.util.Objects;

public final class CallConnectionQuery {
    private CallConnectionQuery(){}

    public static final class OpenConnection {
        private final int callerId;
        private final int calleeId;

        public OpenConnection(int callerId, int calleeId) {
            this.callerId = callerId;
            this.calleeId = calleeId;
        }

        public int callerId() {
            return callerId;
        }

        public int calleeId() {
            return calleeId;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            OpenConnection that = (OpenConnection) obj;
            return this.callerId == that.callerId &&
                    this.calleeId == that.calleeId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(callerId, calleeId);
        }

        @Override
        public String toString() {
            return "OpenConnection[" +
                    "callerId=" + callerId + ", " +
                    "calleeId=" + calleeId + ']';
        }
    }

    public static final class CloseConnection {
        private final int id;

        public CloseConnection(int id) {
            this.id = id;
        }

        public int id() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            CloseConnection that = (CloseConnection) obj;
            return this.id == that.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "CloseConnection[" +
                    "id=" + id + ']';
        }
    }

    public static final class GetConnection {
        private final int id;

        public GetConnection(int id) {
            this.id = id;
        }

        public int id() {
            return id;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            GetConnection that = (GetConnection) obj;
            return this.id == that.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public String toString() {
            return "GetConnection[" +
                    "id=" + id + ']';
        }
    }
}
