package mmo.base;

import java.awt.Frame;
import javax.swing.ImageIcon;
import javax.swing.JDialog;

public abstract class BaseDialog extends JDialog {

    public BaseDialog(Frame frame, boolean bln) {
        super(frame, bln);
        ImageIcon icon = new ImageIcon("src/icon/icon_logo_50.jpg");
        super.setIconImage(icon.getImage());
        super.setLocation(520, 220);
        super.setResizable(false);
    }

}
