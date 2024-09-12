package io.github.singlerr.semaphore.interactors.admin;

import io.github.singlerr.semaphore.interactors.admin.manager.CallConnectionManager;
import io.github.singlerr.semaphore.interactors.admin.manager.CallStateManager;
import io.github.singlerr.semaphore.interactors.admin.manager.EntityManager;
import io.github.singlerr.semaphore.interactors.admin.presenter.CallConnectionPresenter;
import io.github.singlerr.semaphore.interactors.admin.presenter.EntityPresenter;

public interface AdminInteractor {

  CallConnectionManager getConnectionManager();

  CallStateManager getStateManager();

  EntityManager getEntityManager();


  CallConnectionPresenter getConnectionPresenter();

  EntityPresenter getEntityPresenter();
}
