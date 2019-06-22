package mmo.event.common;

import java.awt.Color;
import java.awt.event.MouseEvent;
import mmo.base.BaseMouseEvent;
import mmo.base.BaseView;
import mmo.view.AboutMeView;
import mmo.view.HomeView;

public final class ContactMeAction extends BaseMouseEvent {

    private final HomeView homeView;

    public ContactMeAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        new AboutMeView(homeView, true).setVisible(true);
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnContact().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnContact().setBackground(new Color(51, 63, 80));
    }

}
