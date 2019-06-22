package mmo.event.common;

import java.awt.Color;
import java.awt.event.MouseEvent;
import mmo.base.BaseMouseEvent;
import mmo.base.BaseView;
import mmo.view.HomeView;

public final class GuideClickAction extends BaseMouseEvent {

    private final HomeView homeView;

    public GuideClickAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    @Override
    public void mouseClicked(MouseEvent me) {

    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnGuide().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnGuide().setBackground(new Color(51, 63, 80));
    }

}
