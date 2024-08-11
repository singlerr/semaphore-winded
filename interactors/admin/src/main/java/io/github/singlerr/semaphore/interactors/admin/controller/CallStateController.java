package io.github.singlerr.semaphore.interactors.admin.controller;

import io.github.singlerr.semaphore.interactors.admin.controller.data.CallStateQuery;

public interface CallStateController {

    void getCallState(CallStateQuery.GetCallState query);

    void setCallState(CallStateQuery.SetCallState query);

}
