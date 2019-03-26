package mmo.event.generate_account;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import mmo.base.BaseMouseEvent;
import mmo.common.DatasSource;
import mmo.model.AccountModel;
import mmo.base.BaseView;
import mmo.common.GenerateAccountHandle;
import mmo.view.HomeView;

public final class GenerateAccountAction extends BaseMouseEvent {

    private final HomeView homeView;

    public GenerateAccountAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        homeView.getBtnGeneratorNew().setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent me) {
        homeView.getBtnGeneratorNew().setBackground(Color.WHITE);
    }

    @Override
    public void mouseClicked(MouseEvent me) {

        AccountModel account = GenerateAccountHandle.getAccountRandom();
        homeView.getLblNumerGeneratedAccount()
                .setText("" + (++DatasSource.TOTAL_ACCOUNT));
        DefaultListModel model = homeView.getListModelAccountGenerate();
        model.addElement(account);
        DatasSource.SAVED_ACCOUNTS.add(account);
        final JList list = homeView.getListAccount();
        // set selected index is latest item
        list.setSelectedIndex(model.getSize() - 1);
        // auto scroll to bottom
        list.ensureIndexIsVisible(this.homeView.getListAccount().getSelectedIndex());
    }

}
