package mmo.event.common;

import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Map;
import mmo.base.BaseFileIO;
import mmo.base.BaseWindowsEvent;
import mmo.common.Common;
import mmo.common.DatasSource;
import mmo.file_io.AccountIO;
import mmo.file_io.SavePointIO;
import mmo.file_io.type.ProcessAccountTextIO;
import mmo.model.AccountModel;
import mmo.model.SavePointModel;
import mmo.view.HomeView;

public final class MainFormClosedAction extends BaseWindowsEvent {

    public MainFormClosedAction(HomeView homeView) {
        super(homeView);
    }

    @Override
    public void windowClosing(WindowEvent we) {
        if (DatasSource.CURRENT_FILE == null || DatasSource.CURRENT_FILE.trim().isEmpty()) {
            System.exit(0);
        }
        BaseFileIO accountModelIO = new AccountIO();
        accountModelIO.setTypeIO(new ProcessAccountTextIO());
        List<AccountModel> accountModels = accountModelIO.readList(DatasSource.CURRENT_FILE);
        accountModelIO.writeList(DatasSource.CURRENT_FILE, accountModels, false);
        SavePointIO savePointIO = new SavePointIO();
        Map<String, SavePointModel> map = savePointIO.readMap(Common.SAVE_POINT);
        String path = DatasSource.CURRENT_FILE;
        String name = path.substring(path.lastIndexOf("\\") + 1);
        map.put(name, new SavePointModel(name, path, DatasSource.NEW_RUN));
        savePointIO.writeMap(map, Common.SAVE_POINT);
        System.exit(0);
    }

}
