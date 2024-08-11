package io.github.singlerr.semaphore.interactors.admin.presenter.data;

import io.github.singlerr.semaphore.interactors.access.call.CallState;

public record PresentableEntity(int id, CallState callState) {
}
