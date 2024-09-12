package io.github.singlerr.semaphore.interactors.admin.controller;

import io.github.singlerr.semaphore.interactors.admin.controller.data.CallStateQuery;

public interface CallStateController {

  void openCall(CallStateQuery.OpenCall query);

  void closeCall(CallStateQuery.CloseCall query);

  void closeCall(CallStateQuery.CloseCallById query);

}
