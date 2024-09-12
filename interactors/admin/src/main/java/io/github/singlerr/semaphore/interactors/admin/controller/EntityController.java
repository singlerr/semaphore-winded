package io.github.singlerr.semaphore.interactors.admin.controller;

import io.github.singlerr.semaphore.interactors.admin.controller.data.EntityQuery;

public interface EntityController {

  void getEntity(EntityQuery.GetEntity query);

  void createEntity(EntityQuery.CreateEntity query);

  void createEntity(EntityQuery.CreateEntityWithState query);

  void deleteEntity(EntityQuery.DeleteEntity query);

  void updateEntity(EntityQuery.UpdateEntity query);

  void getAllEntities(EntityQuery.GetAllEntities query);

}
