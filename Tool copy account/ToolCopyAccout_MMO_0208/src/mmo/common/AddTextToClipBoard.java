package mmo.common;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public final class AddTextToClipBoard {

    public AddTextToClipBoard() {
    }

    public static boolean addText(String data) {
        StringSelection stringSelection = new StringSelection(data);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        return clipboard.getContents(stringSelection) != null;
    }
}
