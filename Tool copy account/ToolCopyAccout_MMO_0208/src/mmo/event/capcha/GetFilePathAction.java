package mmo.event.capcha;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mmo.base.BaseMouseEvent;
import mmo.base.BaseView;
import mmo.common.DatasSource;
import mmo.view.HomeView;

public final class GetFilePathAction extends BaseMouseEvent {

    private final HomeView homeView;
    public static final int MAX_WIDTH = 200;
    public static final int MAX_HEIGHT = 100;

    public GetFilePathAction(BaseView baseView) {
        super(baseView);
        this.homeView = (HomeView) baseView;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filterTxt
                = new FileNameExtensionFilter("IMAGES FILE", "jpg", "png");
        // set filter text file
        fileChooser.setFileFilter(filterTxt);
        fileChooser.showOpenDialog(homeView);
        File path = fileChooser.getSelectedFile();
        if (path != null && path.exists()) {
            DatasSource.CAPCHA_PATH = path.toString();
            BufferedImage bfImage;
            InputStream is;
            int width = 0;
            int height = 0;
            try {
                is = new FileInputStream(path);
                bfImage = ImageIO.read(is);
                width = bfImage.getWidth();
                height = bfImage.getHeight();
                is.close();
            } catch (IOException ex) {

            }
            if (width <= MAX_WIDTH && height <= MAX_HEIGHT) {
                homeView.getTxtPathStatus().setForeground(Color.GREEN);
                homeView.getTxtPathStatus().setText("OK");
                ImageIcon imageIcon = new ImageIcon(path.toString());
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(260, 105, java.awt.Image.SCALE_SMOOTH);
                imageIcon = new ImageIcon(newimg);
                homeView.getLblImagePreview().setIcon(imageIcon);
            } else {
                homeView.getTxtPathStatus().setForeground(Color.RED);
                homeView.getTxtPathStatus().setText("In-valid SIZE");
                JOptionPane.showMessageDialog(homeView, "Kích cỡ ảnh quá lớn: " + width + "x" + height, "Lỗi kích thuóc", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            homeView.getTxtPathStatus().setForeground(Color.RED);
            homeView.getTxtPathStatus().setText("Không tồn tại");
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.btnGetFPath().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.btnGetFPath().setBackground(new Color(51, 51, 51));
    }

}
