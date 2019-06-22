package mmo.event.open_saved_account;

import mmo.base.BaseChangeSelectedIndex;
import java.awt.Color;
import java.awt.event.MouseEvent;
import mmo.base.BaseView;
import mmo.common.DatasSource;
import mmo.view.HomeView;

public final class MoveNextAccountAction extends BaseChangeSelectedIndex {

    private final HomeView homeView;

    public MoveNextAccountAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnMoveNextAccount().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnMoveNextAccount().setBackground(Color.WHITE);
    }

    @Override
    public void setIndex(int selectedIndex, int max) {
        if (selectedIndex >= max - 1) {
            homeView.displayMessage("Đã copy hết danh sách !!!");
            return;
        }
        DatasSource.LAST_RUN
                = (DatasSource.LAST_RUN < max - 1)
                        ? ++DatasSource.LAST_RUN : DatasSource.LAST_RUN;
        homeView.getListAccountLogin().setSelectedIndex(++selectedIndex);
        homeView.getLblCurrentAccount().setText("" + (DatasSource.LAST_RUN ));
        DatasSource.NEW_RUN = DatasSource.LAST_RUN;
        homeView.getListAccountLogin()
                .setSelectedIndex(DatasSource.LAST_RUN);
        // auto scroll to bottom
        homeView.getListAccountLogin()
                .ensureIndexIsVisible(this.homeView.getListAccountLogin().getSelectedIndex());
    }

}
