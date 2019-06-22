package mmo.base;

import java.awt.event.MouseEvent;
import mmo.base.BaseMouseEvent;
import mmo.base.BaseView;
import mmo.view.HomeView;

public abstract class BaseChangeSelectedIndex extends BaseMouseEvent {

    public BaseChangeSelectedIndex(BaseView baseView) {
        super(baseView);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        HomeView homeView = (HomeView) baseView;
        int selectedIndex = homeView.getListAccountLogin().getSelectedIndex();
        int max = homeView.getListModelAccountOpen().size();
        if (max == 0) {
            homeView.displayMessage("Không có dữ liệu cần xử lý!!!");
            return;
        }
        setIndex(selectedIndex, max);
    }

    public abstract void setIndex(int selectedIndex, int max);
}
