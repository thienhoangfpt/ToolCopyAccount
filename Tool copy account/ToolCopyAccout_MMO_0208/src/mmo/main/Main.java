package mmo.main;

import java.io.File;
import mmo.event.common.AddHomeEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mmo.common.DatasSource;
import mmo.view.HomeView;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

public final class Main {

    public static void main(String[] args)
            throws ClassNotFoundException,
            InstantiationException,
            IllegalAccessException,
            UnsupportedLookAndFeelException,
            IOException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        HomeView homeView = new HomeView();
        AddHomeEvent homeAction = new AddHomeEvent(homeView);
        homeAction.addEvents();
        DatasSource dataSources = DatasSource.getInstance();
        dataSources.loadData();
        homeView.setVisible(true);
    }
}
