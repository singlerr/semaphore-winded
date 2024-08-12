package io.github.singlerr.semaphore.interactors.admin.manager.data;

public record CallConnectionEntity(int id, int callerId, int calleeId, ConnectionState state) {
}
