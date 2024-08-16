package io.github.singlerr.semaphore.interactors.admin.controller;

import io.github.singlerr.semaphore.interactors.admin.controller.data.EntityQuery;

public interface EntityController {

    void getEntity(EntityQuery.GetEntity query);

    void createEntity(EntityQuery.CreateEntity query);

    void deleteEntity(EntityQuery.DeleteEntity query);

    void getAllEntities();

}
