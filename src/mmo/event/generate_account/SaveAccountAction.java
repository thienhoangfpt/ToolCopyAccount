package mmo.event.generate_account;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import mmo.base.BaseFileIO;
import mmo.base.BaseMouseEvent;
import mmo.base.BaseView;
import mmo.common.DatasSource;
import mmo.common.SavePoint;
import mmo.file_io.AccountIO;
import mmo.file_io.type.ProcessAccountTextIO;
import mmo.view.HomeView;

public final class SaveAccountAction extends BaseMouseEvent {

    private final HomeView homeView;

    public SaveAccountAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if (DatasSource.SAVED_ACCOUNTS.isEmpty()) {
            homeView.displayMessage("Không có dữ liệu để lưu!!!");
            return;
        }
        JFileChooser fileChooser = new JFileChooser();
        // create filter only accecpt file text
        FileNameExtensionFilter filterTxt
                = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        // set filter text file
        fileChooser.setFileFilter(filterTxt);
        // show file choose windows
        fileChooser.showSaveDialog(homeView);
        // get user selected file path
        File filePath = fileChooser.getSelectedFile();
        // check user is choose file or type new file
        if (filePath == null) {
            return;
        }
        BaseFileIO accountTextIO = new AccountIO();
        accountTextIO.setTypeIO(new ProcessAccountTextIO());
        String path = filePath.toString().concat(".txt");
        boolean isAppended = false;
        // if file is existed will ask user renew file or append data to last        
        if (filePath.exists()) {
            String message
                    = "Đã tồn tại tệp tin: " + filePath.getName()
                    + " .\n\rLưu dữ liệu mới vào cuối file hay ghi đè?";
            // get user answer
            isAppended = JOptionPane.showConfirmDialog(homeView, message, "Thông báo",
                    JOptionPane.YES_NO_CANCEL_OPTION) == 0;
            path = path.substring(0, path.lastIndexOf(".txt"));
        }
        boolean result
                = accountTextIO.writeList(path, DatasSource.SAVED_ACCOUNTS, isAppended);
        // notify to user file save status
        displayResult(result);
        SavePoint.addSavePoint(filePath);
        clear();
    }

    private void clear() {
        DatasSource.SAVED_ACCOUNTS.clear();
        DatasSource.TOTAL_ACCOUNT = 0;
        homeView.getListModelAccountGenerate().clear();
        homeView.getLblNumerGeneratedAccount().setText("0");
    }

    private void displayResult(boolean result) {
        if (result) {
            homeView.displayMessage("Lưu thành công: " + DatasSource.SAVED_ACCOUNTS.size() + " tài khoản");
        } else {
            JOptionPane.showMessageDialog(homeView,
                    "Lưu thất bại dữ liệu trùng lặp", "Lỗi!!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnSave().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnSave().setBackground(Color.WHITE);
    }

}
