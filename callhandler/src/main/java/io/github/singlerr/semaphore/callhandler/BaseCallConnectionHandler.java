package io.github.singlerr.semaphore.callhandler;

import io.github.singlerr.semaphore.interactors.access.call.CallConnectionHandler;
import io.github.singlerr.semaphore.interactors.access.database.DatabaseGateway;

public abstract class BaseCallConnectionHandler implements CallConnectionHandler {

  protected final DatabaseGateway database;

  protected BaseCallConnectionHandler(DatabaseGateway database) {
    this.database = database;
  }

}
