package mmo.base;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public abstract class BaseView extends JFrame {

    public BaseView() {
        super.setLocation(520, 220);
        ImageIcon icon = new ImageIcon("icon_logo_50.jpg");
        super.setIconImage(icon.getImage());
    }

}
