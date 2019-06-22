package mmo.event.open_saved_account;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mmo.base.BaseFileIO;
import mmo.base.BaseMouseEvent;
import mmo.common.DatasSource;
import mmo.file_io.AccountIO;
import mmo.model.AccountModel;
import mmo.base.BaseView;
import mmo.common.Common;
import mmo.file_io.SavePointIO;
import mmo.file_io.type.ProcessAccountTextIO;
import mmo.model.SavePointModel;
import mmo.view.HomeView;

public final class LoadAccountAction extends BaseMouseEvent {

    private final HomeView homeView;

    public LoadAccountAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    private void processLoadAccount(String filePath) {
        // correct file 
        BaseFileIO accountModelIO = new AccountIO();
        // read text type
        accountModelIO.setTypeIO(new ProcessAccountTextIO());
        List<AccountModel> accountModels
                = accountModelIO.readList(filePath);
        SavePointIO savePointIO = new SavePointIO();
        // get map save point from file
        Map<String, SavePointModel> savePoint
                = savePointIO.readMap(Common.SAVE_POINT);
        // get file name with extension
        String name = (filePath.substring(filePath.lastIndexOf("\\") + 1));
        // get last use from map
        SavePointModel savePointModel = savePoint.get(name);
        DatasSource.LAST_RUN = (savePointModel != null)
                ? savePointModel.getIndex() : 0;
        if (DatasSource.LAST_RUN > 0) {
            int answer = JOptionPane.showConfirmDialog(homeView,
                    "Lần trước bạn đã chạy tới tài khoản thứ : "
                    + DatasSource.LAST_RUN + "/" + (accountModels.size() - 1) + " bạn có muốn tiếp tục chạy từ vị trí đó?",
                    "Thông báo", JOptionPane.YES_NO_OPTION);
            DatasSource.LAST_RUN = (answer == 0) ? DatasSource.LAST_RUN : 0;
        }
        homeView.getListModelAccountOpen().clear();
        for (int i = 0; i < accountModels.size(); i++) {
            homeView.getListModelAccountOpen().addElement(accountModels.get(i));
        }
        // update text display
        homeView.getLblTotalAccountOpened()
                .setText("/" + (accountModels.size() - 1));
        homeView.getLblCurrentAccount().setText("" + (DatasSource.LAST_RUN));
        // update selected index
        homeView.getListAccountLogin().setSelectedIndex(DatasSource.LAST_RUN);
        DatasSource.CURRENT_FILE = filePath;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filterTxt
                = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        // set filter text file
        fileChooser.setFileFilter(filterTxt);
        fileChooser.showOpenDialog(homeView);
        File filePath = fileChooser.getSelectedFile();
        // check user is choose file or not before open file
        if (filePath == null) {
            return;
        }
        // if use is choose file not equal text
        if (!filePath.getPath().endsWith(".txt")
                && !filePath.getPath().endsWith(".text")) {
            JOptionPane.showMessageDialog(homeView, "Sai định dạng file!!!");
            return;
        }
        processLoadAccount(fileChooser.getSelectedFile().toString());
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnOpenFile().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnOpenFile().setBackground(Color.WHITE);
    }

}
