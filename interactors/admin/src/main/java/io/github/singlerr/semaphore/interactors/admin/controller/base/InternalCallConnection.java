package io.github.singlerr.semaphore.interactors.admin.controller.base;

import io.github.singlerr.semaphore.interactors.admin.manager.data.ConnectionState;

record InternalCallConnection(ConnectionState connectionState, int id, int callerId, int calleeId) {
}
