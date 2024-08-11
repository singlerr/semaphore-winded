package io.github.singlerr.semaphore.interactors.access.call;

public record CallConnection(int id, int calleeId, int callerId, CallState state) {
}
