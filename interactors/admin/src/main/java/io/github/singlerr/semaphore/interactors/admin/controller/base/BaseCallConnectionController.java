package io.github.singlerr.semaphore.interactors.admin.controller.base;

import io.github.singlerr.semaphore.interactors.admin.controller.data.CallConnectionQuery;
import io.github.singlerr.semaphore.interactors.admin.AdminInteractor;
import io.github.singlerr.semaphore.interactors.admin.controller.CallConnectionController;
import io.github.singlerr.semaphore.interactors.admin.manager.CallConnectionManager;
import io.github.singlerr.semaphore.interactors.admin.manager.data.ConnectionState;
import io.github.singlerr.semaphore.interactors.admin.presenter.CallConnectionPresenter;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.ErrorEntity;
import io.github.singlerr.semaphore.interactors.admin.presenter.data.PresentableCallConnection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseCallConnectionController implements CallConnectionController {

    private final Map<Integer, InternalCallConnection> connections;
    private final AtomicInteger idTracker;

    protected final CallConnectionManager manager;
    protected final CallConnectionPresenter connectionPresenter;

    protected BaseCallConnectionController(AdminInteractor manager){
        this.manager = manager.getConnectionManager();
        this.connectionPresenter = manager.getConnectionPresenter();
        this.connections = new HashMap<>();
        this.idTracker = new AtomicInteger(0);
    }

    @Override
    public void openConnection(CallConnectionQuery.OpenConnection query) {
        ConnectionState state = manager.open(query.callerId(), query.calleeId());
        int id = idTracker.getAndIncrement();
        connections.put(id, new InternalCallConnection(state, id, query.callerId(), query.calleeId()));
    }

    @Override
    public void closeConnection(CallConnectionQuery.CloseConnection query) {
        connections.remove(query.id());
        manager.close(query.id());
    }

    @Override
    public void getConnection(CallConnectionQuery.GetConnection query) {
        InternalCallConnection connection = connections.get(query.id());

        if(connection == null){
            connectionPresenter.presentError(new ErrorEntity("해당 연결을 확인할 수 없습니다."));
            return;
        }

        connectionPresenter.present(new PresentableCallConnection(connection.id(), connection.callerId(), connection.callerId(), connection.connectionState() == ConnectionState.ALIVE));
    }
}
