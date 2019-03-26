package mmo.capcha;

import java.io.File;
import javax.swing.JOptionPane;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public final class ImageToCapcha {

    static ITesseract INSTANCE = new Tesseract();

    static {
        INSTANCE.setDatapath("/tessdata");
    }

    public String toText(String path) {
        File imageFile = new File(path);
        try {
            return INSTANCE.doOCR(imageFile);
        } catch (TesseractException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
