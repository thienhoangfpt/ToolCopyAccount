package mmo.event.common;

import mmo.event.open_saved_account.MovePrevAccountAction;
import mmo.event.open_saved_account.DisplayAccountOpenedAction;
import mmo.event.open_saved_account.MoveNextAccountAction;
import mmo.event.open_saved_account.LoadAccountAction;
import java.awt.event.MouseEvent;
import mmo.model.AccountModel;
import java.util.HashMap;
import javax.swing.JLabel;
import mmo.base.BaseMouseEvent;
import mmo.event.capcha.GetCapchaAction;
import mmo.event.capcha.GetFilePathAction;
import mmo.event.generate_account.ChangeNumberOfGenerateLargeAccount;
import mmo.event.generate_account.DisplayAccountAction;
import mmo.event.generate_account.GenerateAccountAction;
import mmo.event.generate_account.GenerateLargeAccountsAction;
import mmo.event.generate_account.SaveAccountAction;
import mmo.view.HomeView;
import mmo.view.HowToUseView;

public final class AddHomeEvent {

    private final HashMap<Integer, AccountModel> accounts;
    private final HomeView homeView;

    public AddHomeEvent(HomeView homeView) {
        accounts = new HashMap<>();
        this.homeView = homeView;
    }

    public final void addEvents() {
        // add action for generate account action
        homeView.getBtnGeneratorNew()
                .addMouseListener(new GenerateAccountAction(homeView));
        // add action when press to item in list then display detail in text box
        homeView.getListAccount()
                .addListSelectionListener(new DisplayAccountAction(homeView));
        // add action when click button support
        homeView.getBtnContact()
                .addMouseListener(new ContactMeAction(homeView));
        // add action when click button how to using
        homeView.getBtnGuide()
                .addMouseListener(new GuideClickAction(homeView));
        // add action when click save button
        homeView.getBtnSave()
                .addMouseListener(new SaveAccountAction(homeView));
        // add event for text field
        homeView.getTxtID()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtID()));
        homeView.getTxtPassword()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtPassword()));
        homeView.getTxtPhoneNumber()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtPhoneNumber()));
        homeView.getTxtUsername()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtUsername()));
        homeView.getTxtOpenID()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtOpenID()));
        homeView.getTxtOpenPassword()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtOpenPassword()));
        homeView.getTxtOpenPhoneNumber()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtOpenPhoneNumber()));
        homeView.getTxtOpenUsername()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtOpenUsername()));
        // add action for move next button
        JLabel btnMoveNext = homeView.getBtnMoveNextAccount();
        btnMoveNext.addMouseListener(new MoveNextAccountAction(homeView));
        // add action for move prev button
        JLabel btnMovePrev = homeView.getBtnMovePrevAccount();
        btnMovePrev.addMouseListener(new MovePrevAccountAction(homeView));
        // add action for open file
        JLabel btnOpenFile = homeView.getBtnOpenFile();
        btnOpenFile.addMouseListener(new LoadAccountAction(homeView));
        // add event for list opened account
        homeView.getListAccountLogin()
                .addListSelectionListener(new DisplayAccountOpenedAction(homeView));
        // add event for generate large accounts
        homeView.getBtnGenerateLargeAccounts()
                .addMouseListener(new GenerateLargeAccountsAction(homeView));
        // auto save account copy when closing app
        homeView.addWindowListener(new MainFormClosedAction(homeView));
        // add event for slider control number of account generate large
        homeView.getSliderNumberOfAccounts()
                .addChangeListener(new ChangeNumberOfGenerateLargeAccount(homeView));
        // add event for how to use button
        homeView.getBtnGuide().addMouseListener(new BaseMouseEvent(homeView) {
            @Override
            public void mouseClicked(MouseEvent me) {
                new HowToUseView(baseView, true).setVisible(true);
            }
        });
        // add clear saved cache action
        homeView.getBtnClearCache()
                .addMouseListener(new ClearSavedCacheAction(homeView));
        homeView.btnGetFPath()
                .addMouseListener(new GetFilePathAction(homeView));
        // add event for button get CAPCHA
        homeView.getBtnGetCapcha()
                .addMouseListener(new GetCapchaAction(homeView));
        homeView.getTxtCapcha()
                .addMouseListener(new CopyTextToClipboardAction(homeView, homeView.getTxtCapcha()));
    }

}
