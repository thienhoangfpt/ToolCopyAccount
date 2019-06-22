package mmo.event.generate_account;

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
import mmo.base.BaseView;
import mmo.common.Common;
import mmo.common.GenerateAccountHandle;
import mmo.common.SavePoint;
import mmo.file_io.AccountIO;
import mmo.file_io.SavePointIO;
import mmo.file_io.type.ProcessAccountTextIO;
import mmo.model.AccountModel;
import mmo.model.SavePointModel;
import mmo.view.HomeView;

public final class GenerateLargeAccountsAction extends BaseMouseEvent {

    private final HomeView homeView;

    public GenerateLargeAccountsAction(BaseView baseView) {
        super(baseView);
        this.homeView = (HomeView) baseView;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filterTxt
                = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        // set filter text file
        fileChooser.setFileFilter(filterTxt);
        fileChooser.showSaveDialog(homeView);
        File filePath = fileChooser.getSelectedFile();
        if (filePath == null) {
            JOptionPane.showMessageDialog(homeView,
                    "Bạn chưa chọn đường dẫn,không thể thực hiện",
                    "Lỗi đường dẫn",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean isAppend = false;
        boolean isExisted = filePath.exists();
        String fileSave = fileChooser.getSelectedFile().toString().concat(".txt");
        if (isExisted) {
            isAppend = JOptionPane.showConfirmDialog(homeView,
                    "Đã tồn tại file này bạn có muốn ghi thêm dữ liệu hay tạo mới file?",
                    "File đã tồn tại",
                    JOptionPane.YES_NO_OPTION) == 0;
            fileSave = fileSave.substring(0, fileSave.lastIndexOf(".txt"));
        }

        BaseFileIO accountTextIO = new AccountIO();
        accountTextIO.setTypeIO(new ProcessAccountTextIO());
        // get number of accounts user want to generate
        int number = homeView.getSliderNumberOfAccounts().getValue();
        List<AccountModel> accountModels
                = GenerateAccountHandle.getListAccountRandom(number);
        boolean saveResult = accountTextIO.writeList(fileSave,
                accountModels, isAppend);
        if (saveResult) {
            homeView.displayMessage("Lưu thành công");
        }
        SavePoint.addSavePoint(filePath);
    }

    

    @Override
    public void mouseEntered(MouseEvent me) {
        this.homeView.getBtnGenerateLargeAccounts().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        this.homeView.getBtnGenerateLargeAccounts().setBackground(Color.WHITE);
    }

}
