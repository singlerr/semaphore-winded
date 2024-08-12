package io.github.singlerr.semaphore.interactors.callee.presenter.data;

public record Error(int calleeId, int callerId, String reason) {
}
