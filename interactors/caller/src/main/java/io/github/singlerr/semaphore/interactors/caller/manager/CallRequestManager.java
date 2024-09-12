package io.github.singlerr.semaphore.interactors.caller.manager;

import io.github.singlerr.semaphore.interactors.caller.manager.data.CallRequest;

public interface CallRequestManager {

  void request(CallRequest request);

}
