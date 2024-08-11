package io.github.singlerr.semaphore.interactors.admin.presenter.data;

public record PresentableCallConnection(int id, int callerId, int calleeId, boolean alive) {
}
