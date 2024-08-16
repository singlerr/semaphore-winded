package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import java.util.Objects;

public class ErrorEntity {
    private final String message;

    public ErrorEntity(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        ErrorEntity that = (ErrorEntity) obj;
        return Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "ErrorEntity[" +
                "message=" + message + ']';
    }

}
