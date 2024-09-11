package io.github.singlerr.semaphore.interactors.admin.controller.data;

import io.github.singlerr.semaphore.interactors.access.call.CallState;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableEntity;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public final class CallStateQuery {

    private CallStateQuery(){}

    public static class OpenCall extends ContextAware{

        private final UUID callerId;
        private final UUID calleeId;

        public OpenCall(UUID callerId, UUID calleeId) {
            this.callerId = callerId;
            this.calleeId = calleeId;
        }

        public UUID callerId(){
            return callerId;
        }

        public UUID calleeId(){
            return calleeId;
        }

        @Override
        public String toString() {
            return "OpenCall{" +
                    "callerId=" + callerId +
                    ", calleeId=" + calleeId +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            OpenCall openCall = (OpenCall) o;
            return Objects.equals(callerId, openCall.callerId) && Objects.equals(calleeId, openCall.calleeId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(callerId, calleeId);
        }
    }

    public static class CloseCallById extends ContextAware{

        private final UUID id;

        public CloseCallById(UUID id) {
            this.id = id;
        }

        public UUID id() {
            return id;
        }

        @Override
        public String toString() {
            return "CloseCallById{" +
                    "id=" + id +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CloseCallById that = (CloseCallById) o;
            return Objects.equals(id, that.id);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(id);
        }
    }

    public static class CloseCall extends ContextAware{

        private final UUID callerId;
        private final UUID calleeId;

        public CloseCall(UUID callerId, UUID calleeId){
            this.callerId = callerId;
            this.calleeId = calleeId;
        }

        public UUID callerId(){
            return callerId;
        }

        public UUID calleeId(){
            return calleeId;
        }

        @Override
        public String toString() {
            return "CloseCall{" +
                    "callerId=" + callerId +
                    ", calleeId=" + calleeId +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CloseCall closeCall = (CloseCall) o;
            return Objects.equals(callerId, closeCall.callerId) && Objects.equals(calleeId, closeCall.calleeId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(callerId, calleeId);
        }
    }
}
