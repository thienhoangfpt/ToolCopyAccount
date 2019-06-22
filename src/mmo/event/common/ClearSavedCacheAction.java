package mmo.event.common;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JOptionPane;
import mmo.base.BaseMouseEvent;
import mmo.base.BaseView;
import mmo.common.Common;
import mmo.view.HomeView;

public final class ClearSavedCacheAction extends BaseMouseEvent {

    private final HomeView homeView;

    public ClearSavedCacheAction(BaseView baseView) {
        super(baseView);
        this.homeView = (HomeView) baseView;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        File fp = new File(Common.SAVE_POINT);
        if (fp.exists()) {
            boolean delete
                    = JOptionPane.showConfirmDialog(homeView,
                            "Xóa sạch dữ liệu lưu trữ lần cuối đăng nhập?",
                            "Xác nhận",
                            JOptionPane.YES_NO_OPTION) == 0;
            if (delete) {
                fp.delete();
                homeView.displayMessage("Xóa thành công");
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnClearCache().setBackground(Color.RED);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnClearCache().setBackground(Color.WHITE);
    }

}
