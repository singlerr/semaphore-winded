package io.github.singlerr.semaphore.interactors.admin.controller;

import io.github.singlerr.semaphore.interactors.admin.controller.data.CallConnectionQuery;

public interface CallConnectionController {

    void openConnection(CallConnectionQuery.OpenConnection query);

    void closeConnection(CallConnectionQuery.CloseConnection query);

    void getConnection(CallConnectionQuery.GetConnection query);

}
