package io.github.singlerr.semaphore.interactors.callee.controller.base;

import io.github.singlerr.semaphore.interactors.callee.CalleeInteractor;
import io.github.singlerr.semaphore.interactors.callee.controller.CallResponseController;
import io.github.singlerr.semaphore.interactors.callee.controller.data.CallResponse;
import io.github.singlerr.semaphore.interactors.callee.manager.CallResponseManager;
import io.github.singlerr.semaphore.interactors.callee.manager.data.ResponseType;

public abstract class BaseCallResponseController implements CallResponseController {

  protected final CallResponseManager responseManager;

  protected BaseCallResponseController(CalleeInteractor interactor) {
    this.responseManager = interactor.getResponseManager();
  }

  @Override
  public void reply(CallResponse response) {
    responseManager.reply(response.getCallerId(), response.getCalleeId(),
        response.getResponse() == CallResponse.Response.ACCEPT ? ResponseType.ACCEPT :
            ResponseType.REJECT);
  }
}
