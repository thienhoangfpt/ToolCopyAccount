package mmo.common;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public final class OpenBrowse {

    public OpenBrowse() {
    }

    public static void Connect(String url) {
        try {
            Desktop.getDesktop().browse(new URL(url).toURI());
        } catch (IOException | URISyntaxException e) {
            System.err.println(e);
        }
    }

}
