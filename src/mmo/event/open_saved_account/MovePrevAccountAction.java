package mmo.event.open_saved_account;

import mmo.base.BaseChangeSelectedIndex;
import java.awt.Color;
import java.awt.event.MouseEvent;
import mmo.base.BaseView;
import mmo.common.DatasSource;
import mmo.view.HomeView;

public final class MovePrevAccountAction extends BaseChangeSelectedIndex {

    private final HomeView homeView;

    public MovePrevAccountAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnMovePrevAccount().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnMovePrevAccount().setBackground(Color.WHITE);
    }

    @Override
    public void setIndex(int selectedIndex, int max) {
        if (selectedIndex == 0) {
            homeView.displayMessage("Đã ở đầu danh sách!!!");
            return;
        }
        DatasSource.LAST_RUN
                = (DatasSource.LAST_RUN > -1)
                        ? --DatasSource.LAST_RUN : DatasSource.LAST_RUN;
        homeView.getListAccountLogin().setSelectedIndex(--selectedIndex);
        homeView.getLblCurrentAccount().setText("" + DatasSource.LAST_RUN);
        DatasSource.NEW_RUN = DatasSource.LAST_RUN;
         homeView.getListAccountLogin()
                .setSelectedIndex(DatasSource.LAST_RUN);
        // auto scroll to bottom
        homeView.getListAccountLogin()
                .ensureIndexIsVisible(this.homeView.getListAccountLogin().getSelectedIndex());
    }
}
