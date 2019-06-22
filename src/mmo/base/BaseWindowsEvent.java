package mmo.base;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public abstract class BaseWindowsEvent implements WindowListener {

    protected final BaseView baseView;

    public BaseWindowsEvent(BaseView baseView) {
        this.baseView = baseView;
    }

    @Override
    public void windowOpened(WindowEvent we) {

    }

    @Override
    public abstract void windowClosing(WindowEvent we);

    @Override
    public void windowClosed(WindowEvent we) {
    }

    @Override
    public void windowIconified(WindowEvent we) {

    }

    @Override
    public void windowDeiconified(WindowEvent we) {

    }

    @Override
    public void windowActivated(WindowEvent we) {

    }

    @Override
    public void windowDeactivated(WindowEvent we) {

    }

}
