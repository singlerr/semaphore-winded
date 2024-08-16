package io.github.singlerr.semaphore.interactors.admin.presenter.data;

public class ContextAware {

    private Object context;

    public Object getContext() {
        return context;
    }

    public void setContext(Object context) {
        this.context = context;
    }
}
