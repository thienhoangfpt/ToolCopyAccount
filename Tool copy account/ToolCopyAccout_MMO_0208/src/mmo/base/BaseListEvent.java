package mmo.base;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public abstract class BaseListEvent implements ListSelectionListener {

    protected final BaseView baseView;

    public BaseListEvent(BaseView baseView) {
        this.baseView = baseView;
    }

    @Override
    public abstract void valueChanged(ListSelectionEvent lse);

}
