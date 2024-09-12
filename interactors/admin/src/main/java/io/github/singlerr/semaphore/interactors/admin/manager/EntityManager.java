package io.github.singlerr.semaphore.interactors.admin.manager;

import io.github.singlerr.semaphore.interactors.admin.manager.data.CallableEntity;
import java.util.List;
import java.util.UUID;

public interface EntityManager {

  CallableEntity create(UUID id);

  void delete(UUID id);

  List<CallableEntity> getAll();

}

