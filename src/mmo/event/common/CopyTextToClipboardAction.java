package mmo.event.common;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JToolTip;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import mmo.base.BaseMouseEvent;
import mmo.base.BaseView;
import mmo.common.AddTextToClipBoard;
import mmo.view.HomeView;

public final class CopyTextToClipboardAction extends BaseMouseEvent {

    private final HomeView homeView;
    private final JTextField txt;

    public CopyTextToClipboardAction(BaseView homeView, JTextField txt) {
        super(homeView);
        this.txt = txt;
        this.homeView = (HomeView) homeView;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        Popup popUpToolTip;
        txt.setToolTipText("Copy thành công");
        JToolTip toolTip = txt.createToolTip();
        toolTip.setTipText(txt.getToolTipText());
        Point point = txt.getLocationOnScreen();
        popUpToolTip
                = PopupFactory.getSharedInstance()
                        .getPopup(txt, toolTip, point.x + 2, point.y - 16);
        if (txt.getText().trim().isEmpty()) {
            txt.setToolTipText("Dữ liệu trống");
            toolTip.setTipText(txt.getToolTipText());
        } else {
            AddTextToClipBoard.addText(txt.getText());
        }
        popUpToolTip.show();
        javax.swing.SwingUtilities.invokeLater(() -> {
            try {
                Thread.sleep(250);
                popUpToolTip.hide();
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        });
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        txt.setBackground(new Color(51, 63, 80));
        txt.setForeground(Color.WHITE);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        txt.setBackground(Color.WHITE);
        txt.setForeground(Color.BLACK);
    }

}
