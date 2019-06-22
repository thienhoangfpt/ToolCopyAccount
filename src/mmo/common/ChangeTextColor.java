package mmo.common;

import java.awt.Color;
import javax.swing.JLabel;

public final class ChangeTextColor implements Runnable {

    private final JLabel label;

    public ChangeTextColor(JLabel label) {
        this.label = label;
    }

    @Override
    public void run() {
        changeColor();
    }

    public void changeColor() {
        try {
            while (true) {
                for (Color COLORS : Common.COLORS) {
                    label.setForeground(COLORS);
                    Thread.sleep(99);
                }
            }
        } catch (InterruptedException ex) {
            System.err.println(ex);
        }
    }

}
