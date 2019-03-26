package mmo.base;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public abstract class BaseChangeEvent implements ChangeListener {

    private final BaseView baseView;

    public BaseChangeEvent(BaseView baseView) {
        this.baseView = baseView;
    }

    @Override
    public abstract void stateChanged(ChangeEvent ce);

}
