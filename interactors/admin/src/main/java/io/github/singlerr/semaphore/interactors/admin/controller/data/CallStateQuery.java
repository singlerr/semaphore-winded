package io.github.singlerr.semaphore.interactors.admin.controller.data;

import io.github.singlerr.semaphore.interactors.access.call.CallState;

import java.util.Objects;
import java.util.UUID;

public final class CallStateQuery {

    private CallStateQuery(){}

    public static final class GetCallState {
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

    public static final class SetCallState {
        private final UUID id;
        private final CallState callState;

        public SetCallState(UUID id, CallState callState) {
            this.id = id;
            this.callState = callState;
        }

        public UUID id() {
            return id;
        }

        public CallState callState() {
            return callState;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            SetCallState that = (SetCallState) obj;
            return this.id == that.id &&
                    Objects.equals(this.callState, that.callState);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, callState);
        }

        @Override
        public String toString() {
            return "SetCallState[" +
                    "id=" + id + ", " +
                    "callState=" + callState + ']';
        }
    }
}
