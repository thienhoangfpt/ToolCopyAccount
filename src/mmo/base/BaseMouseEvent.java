package mmo.base;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class BaseMouseEvent implements MouseListener {

    protected final BaseView baseView;

    public BaseMouseEvent(BaseView baseView) {
        this.baseView = baseView;
    }

    @Override
    public abstract void mouseClicked(MouseEvent me);

    @Override
    public void mousePressed(MouseEvent me) {

    }

    @Override
    public void mouseReleased(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {

    }

    @Override
    public void mouseExited(MouseEvent me) {

    }

}
