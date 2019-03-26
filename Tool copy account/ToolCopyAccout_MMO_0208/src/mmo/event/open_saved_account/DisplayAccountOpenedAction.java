package mmo.event.open_saved_account;

import javax.swing.event.ListSelectionEvent;
import mmo.base.BaseListEvent;
import mmo.model.AccountModel;
import mmo.base.BaseView;
import mmo.view.HomeView;

public final class DisplayAccountOpenedAction extends BaseListEvent {

    private final HomeView homeView;

    public DisplayAccountOpenedAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        AccountModel accountModel
                = (AccountModel) homeView.getListAccountLogin().getSelectedValue();
        if (accountModel == null) {
            return;
        }
        homeView.getTxtOpenID().setText(String.valueOf(accountModel.getId()));
        homeView.getTxtOpenUsername().setText(accountModel.getUsername());
        homeView.getTxtOpenPassword().setText(accountModel.getPassword());
        homeView.getTxtOpenPhoneNumber().setText(accountModel.getPhoneNumber());
        homeView.getLblCurrentAccount()
                .setText("" + homeView.getListAccountLogin().getSelectedIndex());
    }

}
