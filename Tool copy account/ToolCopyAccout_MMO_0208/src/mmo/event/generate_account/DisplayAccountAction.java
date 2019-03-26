package mmo.event.generate_account;

import javax.swing.event.ListSelectionEvent;
import mmo.base.BaseListEvent;
import mmo.model.AccountModel;
import mmo.base.BaseView;
import mmo.view.HomeView;

public final class DisplayAccountAction extends BaseListEvent {

    private final HomeView homeView;

    public DisplayAccountAction(BaseView baseView) {
        super(baseView);
        homeView = (HomeView) baseView;
    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        AccountModel accountModel
                = (AccountModel) homeView.getListAccount().getSelectedValue();
        if (accountModel != null) {
            homeView.getTxtID().setText(String.valueOf(accountModel.getId()));
            homeView.getTxtUsername().setText(accountModel.getUsername());
            homeView.getTxtPassword().setText(accountModel.getPassword());
            homeView.getTxtPhoneNumber().setText(accountModel.getPhoneNumber());
        }
    }

}
