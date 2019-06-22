package mmo.event.capcha;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import mmo.base.BaseMouseEvent;
import mmo.base.BaseView;
import mmo.capcha.ImageToCapcha;
import mmo.common.DatasSource;
import mmo.view.HomeView;

public final class GetCapchaAction extends BaseMouseEvent {

    private final HomeView homeView;

    public GetCapchaAction(BaseView baseView) {
        super(baseView);
        this.homeView = (HomeView) baseView;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (DatasSource.CAPCHA_PATH == null) {
            JOptionPane
                    .showMessageDialog(homeView, "Chưa có hình ảnh !!!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JProgressBar progressBar = homeView.getProgessConvertCapcha();
        Thread pro = new Thread(new Runnable() {
            @Override
            public void run() {
                progressBar.setValue(0);
                try {
                    for (int i = 1; i < 101; i++) {
                        progressBar.setValue(i);
                        Thread.sleep(4);
                    }
                } catch (InterruptedException ex) {
                }
            }
        });
        Thread getCapcha = new Thread(new Runnable() {
            @Override
            public void run() {
                String capcha = new ImageToCapcha().toText(DatasSource.CAPCHA_PATH);
                if (capcha == null) {
                    homeView.getTxtCapcha().setForeground(Color.RED);
                    homeView.getTxtCapcha().setText("Error");
                    return;
                }
                homeView.getTxtCapcha().setForeground(Color.BLUE);
                homeView.getTxtCapcha().setText(capcha);
                DatasSource.CAPCHA_PATH = null;
                homeView.getTxtPathStatus().setForeground(Color.ORANGE);
                homeView.getTxtPathStatus().setText("Clear");
            }
        });
        pro.start();
        getCapcha.start();
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnGetCapcha().setBackground(Color.ORANGE);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnGetCapcha().setBackground(new Color(51, 51, 51));
    }

}
