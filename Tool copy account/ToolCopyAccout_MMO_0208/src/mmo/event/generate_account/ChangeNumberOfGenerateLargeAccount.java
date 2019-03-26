package mmo.event.generate_account;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import mmo.base.BaseChangeEvent;
import mmo.view.HomeView;

public final class ChangeNumberOfGenerateLargeAccount extends BaseChangeEvent {

    private final HomeView homeView;

    public ChangeNumberOfGenerateLargeAccount(HomeView baseView) {
        super(baseView);
        this.homeView = (HomeView) baseView;
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        JSlider slider = homeView.getSliderNumberOfAccounts();
        homeView.getLblNumberGenAccounts()
                .setText((slider.getValue()) + " tài khoản");
    }

}
