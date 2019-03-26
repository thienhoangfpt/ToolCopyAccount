package mmo.view;

import mmo.base.BaseView;
import mmo.model.BaseModel;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

public final class HomeView extends BaseView {

    private final DefaultListModel<BaseModel> listModelAccountGenerate
            = new DefaultListModel<>();
    private final DefaultListModel<BaseModel> listModelAccountOpen
            = new DefaultListModel<>();

    public HomeView() {
        initComponents();
        // set model for jlist account generate
        listAccount.setModel(listModelAccountGenerate);
        // set model for jlist account open from saved file text
        listAccountLogin.setModel(listModelAccountOpen);
    }

    public JLabel getLblImagePreview() {
        return lblImagePreview;
    }

    public JLabel getTxtPathStatus() {
        return txtPathStatus;
    }

    public JProgressBar getProgessConvertCapcha() {
        return progessConvertCapcha;
    }

    public JTextField getTxtCapcha() {
        return txtCapcha;
    }

    public JPanel getBtnGetCapcha() {
        return btnGetCapcha;
    }

    public JPanel btnGetFPath() {
        return btnGetPath;
    }

    public JLabel getBtnClearCache() {
        return btnClearCache;
    }

    public JSlider getSliderNumberOfAccounts() {
        return sliderNumberOfAccounts;
    }

    public JPanel getBtnGenerateLargeAccounts() {
        return btnGenerateLargeAccounts;
    }

    public JLabel getLabelCopyRight() {
        return labelCopyRight;
    }

    public JLabel getLblCurrentAccount() {
        return lblCurrentAccount;
    }

    public JLabel getLblNumberCreatedAccountTitle() {
        return lblNumberCreatedAccountTitle;
    }

    public JLabel getLblTotalAccountOpened() {
        return lblTotalAccountOpened;
    }

    public JLabel getBtnMovePrevAccount() {
        return btnMovePrevAccount;
    }

    public JLabel getBtnOpenFile() {
        return btnOpenFile;
    }

    public DefaultListModel<BaseModel> getListModelAccountGenerate() {
        return listModelAccountGenerate;
    }

    public DefaultListModel<BaseModel> getListModelAccountOpen() {
        return listModelAccountOpen;
    }

    public JList<BaseModel> getListAccountLogin() {
        return listAccountLogin;
    }

    public JLabel getBtnMoveNextAccount() {
        return btnMoveNextAccount;
    }

    public JTextField getTxtOpenID() {
        return txtOpenID;
    }

    public JTextField getTxtOpenPassword() {
        return txtOpenPassword;
    }

    public JTextField getTxtOpenPhoneNumber() {
        return txtOpenPhoneNumber;
    }

    public JTextField getTxtOpenUsername() {
        return txtOpenUsername;
    }

    public JLabel getLblNumerGeneratedAccount() {
        return lblNumerGeneratedAccount;
    }

    public JLabel getBtnSave() {
        return btnSave;
    }

    public JLabel getBtnGuide() {
        return btnGuide;
    }

    public JLabel getBtnGenerateAccount() {
        return btnGenerateAccount;
    }

    public JLabel getBtnContact() {
        return btnContact;
    }

    public JList<BaseModel> getListAccount() {
        return listAccount;
    }

    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }

    public JLabel getBtnGeneratorNew() {
        return btnGenerateAccount;
    }

    public void changeColor(JPanel btn, Color color) {
        btn.setBackground(color);
    }

    public JTextField getTxtID() {
        return txtID;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public JTextField getTxtPhoneNumber() {
        return txtPhoneNumber;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public JLabel getLblNumberGenAccounts() {
        return lblNumberGenAccounts;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        txtID = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAccount = new javax.swing.JList<>();
        btnGenerateAccount = new javax.swing.JLabel();
        btnSave = new javax.swing.JLabel();
        lblNumberCreatedAccountTitle = new javax.swing.JLabel();
        lblNumerGeneratedAccount = new javax.swing.JLabel();
        btnClearCache = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtOpenID = new javax.swing.JTextField();
        txtOpenUsername = new javax.swing.JTextField();
        txtOpenPassword = new javax.swing.JTextField();
        txtOpenPhoneNumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAccountLogin = new javax.swing.JList<>();
        btnMovePrevAccount = new javax.swing.JLabel();
        btnOpenFile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCurrentAccount = new javax.swing.JLabel();
        btnMoveNextAccount = new javax.swing.JLabel();
        lblTotalAccountOpened = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnGenerateLargeAccounts = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sliderNumberOfAccounts = new javax.swing.JSlider();
        lblNumberGenAccounts = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        bgCapcha = new javax.swing.JPanel();
        btnGetPath = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGetCapcha = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCapcha = new javax.swing.JTextField();
        progessConvertCapcha = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        txtPathStatus = new javax.swing.JLabel();
        lblImagePreview = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnContact = new javax.swing.JLabel();
        btnGuide = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        labelCopyRight = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Lấy capcha");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("MMO-0208 1.0.0"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("false"), this, org.jdesktop.beansbinding.BeanProperty.create("resizable"));
        bindingGroup.addBinding(binding);

        jTabbedPane2.setBackground(new java.awt.Color(51, 63, 80));
        jTabbedPane2.setForeground(java.awt.Color.blue);
        jTabbedPane2.setToolTipText("Toop hỗ trợ cheat");
        jTabbedPane2.setFocusable(false);
        jTabbedPane2.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 255, 255));
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setToolTipText("Bấm để copy");
        txtID.setAutoscrolls(false);
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        txtID.setFocusable(false);
        txtID.setRequestFocusEnabled(false);

        txtUsername.setEditable(false);
        txtUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setToolTipText("Bấm để copy");
        txtUsername.setAutoscrolls(false);
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        txtUsername.setFocusable(false);
        txtUsername.setRequestFocusEnabled(false);

        txtPassword.setEditable(false);
        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setToolTipText("Bấm để copy");
        txtPassword.setAutoscrolls(false);
        txtPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        txtPassword.setFocusable(false);
        txtPassword.setRequestFocusEnabled(false);

        txtPhoneNumber.setEditable(false);
        txtPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPhoneNumber.setToolTipText("Bấm để copy");
        txtPhoneNumber.setAutoscrolls(false);
        txtPhoneNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        txtPhoneNumber.setFocusable(false);
        txtPhoneNumber.setRequestFocusEnabled(false);

        listAccount.setBackground(new java.awt.Color(0, 0, 0));
        listAccount.setForeground(new java.awt.Color(255, 255, 255));
        listAccount.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listAccount.setToolTipText("Danh sách các tài khoản");
        listAccount.setAutoscrolls(false);
        listAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listAccount.setFocusable(false);
        listAccount.setSelectedIndex(0);
        listAccount.setSelectionBackground(new java.awt.Color(0, 141, 159));
        listAccount.setVisibleRowCount(10);
        jScrollPane1.setViewportView(listAccount);

        btnGenerateAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerateAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_generator_25.png"))); // NOI18N
        btnGenerateAccount.setText("Tạo tài khoản");
        btnGenerateAccount.setToolTipText("");
        btnGenerateAccount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_save_25.png"))); // NOI18N
        btnSave.setText("Lưu danh sách");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNumberCreatedAccountTitle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumberCreatedAccountTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblNumberCreatedAccountTitle.setText("Đã tạo:");

        lblNumerGeneratedAccount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumerGeneratedAccount.setForeground(new java.awt.Color(51, 153, 255));
        lblNumerGeneratedAccount.setText("0 ");

        btnClearCache.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnClearCache.setForeground(new java.awt.Color(255, 255, 255));
        btnClearCache.setText("Xóa bộ đệm");
        btnClearCache.setToolTipText("Xóa bộ đệm lưu trữ lần cuối đăng nhập");
        btnClearCache.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClearCache.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID)
                    .addComponent(txtPassword)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhoneNumber)
                    .addComponent(btnGenerateAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnClearCache)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNumberCreatedAccountTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNumerGeneratedAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumberCreatedAccountTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumerGeneratedAccount)
                            .addComponent(btnClearCache)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnGenerateAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)))
                .addGap(0, 0, 0))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtID, txtPassword, txtPhoneNumber, txtUsername});

        jTabbedPane2.addTab("Tạo mới", jPanel2);

        jPanel3.setBackground(new java.awt.Color(51, 63, 80));

        txtOpenID.setEditable(false);
        txtOpenID.setBackground(new java.awt.Color(255, 255, 255));
        txtOpenID.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        txtOpenUsername.setEditable(false);
        txtOpenUsername.setBackground(new java.awt.Color(255, 255, 255));
        txtOpenUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        txtOpenPassword.setEditable(false);
        txtOpenPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtOpenPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        txtOpenPhoneNumber.setEditable(false);
        txtOpenPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtOpenPhoneNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        listAccountLogin.setBackground(new java.awt.Color(0, 0, 0));
        listAccountLogin.setForeground(new java.awt.Color(255, 255, 255));
        listAccountLogin.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listAccountLogin.setToolTipText("Danh sách tài khoản đã lưu");
        jScrollPane2.setViewportView(listAccountLogin);

        btnMovePrevAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMovePrevAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnMovePrevAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_move_prev_25.png"))); // NOI18N
        btnMovePrevAccount.setText("Tài khoản trước");
        btnMovePrevAccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnOpenFile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnOpenFile.setForeground(new java.awt.Color(255, 255, 255));
        btnOpenFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_open_file_25.png"))); // NOI18N
        btnOpenFile.setText("Mở File Text");
        btnOpenFile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tiến độ:");

        lblCurrentAccount.setBackground(new java.awt.Color(255, 255, 255));
        lblCurrentAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCurrentAccount.setForeground(new java.awt.Color(255, 255, 0));
        lblCurrentAccount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCurrentAccount.setText("0");

        btnMoveNextAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMoveNextAccount.setForeground(new java.awt.Color(255, 255, 255));
        btnMoveNextAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_move_next_25.png"))); // NOI18N
        btnMoveNextAccount.setText("Tài khoản kế tiếp");
        btnMoveNextAccount.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTotalAccountOpened.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotalAccountOpened.setForeground(new java.awt.Color(51, 153, 255));
        lblTotalAccountOpened.setText("/1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOpenFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMovePrevAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCurrentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotalAccountOpened))
                            .addComponent(btnMoveNextAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtOpenID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOpenPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOpenPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOpenUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane2)))
                .addGap(5, 5, 5))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtOpenID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtOpenUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtOpenPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(txtOpenPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMovePrevAccount)
                    .addComponent(btnMoveNextAccount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpenFile)
                    .addComponent(jLabel1)
                    .addComponent(lblCurrentAccount)
                    .addComponent(lblTotalAccountOpened))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtOpenID, txtOpenPassword, txtOpenPhoneNumber, txtOpenUsername});

        jTabbedPane2.addTab("Đăng Nhập", jPanel3);

        jPanel4.setBackground(new java.awt.Color(51, 63, 80));

        btnGenerateLargeAccounts.setBackground(new java.awt.Color(255, 255, 255));
        btnGenerateLargeAccounts.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerateLargeAccounts.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerateLargeAccounts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_generate_large_75.png"))); // NOI18N
        jLabel2.setText("Tạo hàng loạt");

        javax.swing.GroupLayout btnGenerateLargeAccountsLayout = new javax.swing.GroupLayout(btnGenerateLargeAccounts);
        btnGenerateLargeAccounts.setLayout(btnGenerateLargeAccountsLayout);
        btnGenerateLargeAccountsLayout.setHorizontalGroup(
            btnGenerateLargeAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGenerateLargeAccountsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnGenerateLargeAccountsLayout.setVerticalGroup(
            btnGenerateLargeAccountsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGenerateLargeAccountsLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel2)
                .addGap(5, 5, 5))
        );

        sliderNumberOfAccounts.setBackground(new java.awt.Color(51, 63, 80));
        sliderNumberOfAccounts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sliderNumberOfAccounts.setMajorTickSpacing(10);
        sliderNumberOfAccounts.setMinimum(10);
        sliderNumberOfAccounts.setMinorTickSpacing(10);
        sliderNumberOfAccounts.setPaintTicks(true);
        sliderNumberOfAccounts.setSnapToTicks(true);
        sliderNumberOfAccounts.setToolTipText("Số lượng tài khoản cần tạo");
        sliderNumberOfAccounts.setValue(15);
        sliderNumberOfAccounts.setDoubleBuffered(true);
        sliderNumberOfAccounts.setFocusable(false);
        sliderNumberOfAccounts.setValueIsAdjusting(true);

        lblNumberGenAccounts.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        lblNumberGenAccounts.setForeground(new java.awt.Color(255, 255, 255));
        lblNumberGenAccounts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumberGenAccounts.setText("10 tài khoản");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sliderNumberOfAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerateLargeAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumberGenAccounts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btnGenerateLargeAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNumberGenAccounts)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sliderNumberOfAccounts, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tạo hàng loạt", jPanel4);

        bgCapcha.setBackground(new java.awt.Color(51, 63, 80));

        btnGetPath.setBackground(new java.awt.Color(51, 51, 51));
        btnGetPath.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGetPath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Đường dẫn");

        javax.swing.GroupLayout btnGetPathLayout = new javax.swing.GroupLayout(btnGetPath);
        btnGetPath.setLayout(btnGetPathLayout);
        btnGetPathLayout.setHorizontalGroup(
            btnGetPathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGetPathLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        btnGetPathLayout.setVerticalGroup(
            btnGetPathLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mã Capcha:");

        btnGetCapcha.setBackground(new java.awt.Color(51, 51, 51));
        btnGetCapcha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGetCapcha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGetCapcha.setDoubleBuffered(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lấy capcha");

        javax.swing.GroupLayout btnGetCapchaLayout = new javax.swing.GroupLayout(btnGetCapcha);
        btnGetCapcha.setLayout(btnGetCapchaLayout);
        btnGetCapchaLayout.setHorizontalGroup(
            btnGetCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGetCapchaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(25, 25, 25))
        );
        btnGetCapchaLayout.setVerticalGroup(
            btnGetCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        txtCapcha.setEditable(false);
        txtCapcha.setBackground(new java.awt.Color(255, 255, 255));
        txtCapcha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCapcha.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        progessConvertCapcha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        progessConvertCapcha.setForeground(new java.awt.Color(0, 204, 204));
        progessConvertCapcha.setToolTipText("Tiến trình convert");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Đường dẫn:");

        txtPathStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPathStatus.setForeground(java.awt.Color.red);
        txtPathStatus.setText("Not OK");

        lblImagePreview.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblImagePreview.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout bgCapchaLayout = new javax.swing.GroupLayout(bgCapcha);
        bgCapcha.setLayout(bgCapchaLayout);
        bgCapchaLayout.setHorizontalGroup(
            bgCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCapchaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgCapchaLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgCapchaLayout.createSequentialGroup()
                        .addGroup(bgCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblImagePreview, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgCapchaLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPathStatus)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgCapchaLayout.createSequentialGroup()
                                .addComponent(btnGetPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnGetCapcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(progessConvertCapcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        bgCapchaLayout.setVerticalGroup(
            bgCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgCapchaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgCapchaLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagePreview, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progessConvertCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bgCapchaLayout.createSequentialGroup()
                        .addGroup(bgCapchaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPathStatus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGetPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGetCapcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCapcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgCapcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Capcha", jPanel8);

        jPanel1.setBackground(new java.awt.Color(51, 63, 80));

        btnContact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnContact.setForeground(new java.awt.Color(255, 255, 255));
        btnContact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_support_50.png"))); // NOI18N
        btnContact.setText("Thông tin liên hệ");
        btnContact.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnContact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnGuide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuide.setForeground(new java.awt.Color(255, 255, 255));
        btnGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_guide_75.png"))); // NOI18N
        btnGuide.setText("Hướng dẫn sử dụng");
        btnGuide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnContact, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnContact, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuide, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnContact, btnGuide});

        jTabbedPane2.addTab("Hỗ trợ", jPanel1);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        labelCopyRight.setForeground(new java.awt.Color(255, 255, 255));
        labelCopyRight.setText("© COPYRIGHT 2019 MMO0208");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCopyRight)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(labelCopyRight))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("capcha");

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgCapcha;
    private javax.swing.JLabel btnClearCache;
    private javax.swing.JLabel btnContact;
    private javax.swing.JLabel btnGenerateAccount;
    private javax.swing.JPanel btnGenerateLargeAccounts;
    private javax.swing.JPanel btnGetCapcha;
    private javax.swing.JPanel btnGetPath;
    private javax.swing.JLabel btnGuide;
    private javax.swing.JLabel btnMoveNextAccount;
    private javax.swing.JLabel btnMovePrevAccount;
    private javax.swing.JLabel btnOpenFile;
    private javax.swing.JLabel btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelCopyRight;
    private javax.swing.JLabel lblCurrentAccount;
    private javax.swing.JLabel lblImagePreview;
    private javax.swing.JLabel lblNumberCreatedAccountTitle;
    private javax.swing.JLabel lblNumberGenAccounts;
    private javax.swing.JLabel lblNumerGeneratedAccount;
    private javax.swing.JLabel lblTotalAccountOpened;
    private javax.swing.JList<BaseModel> listAccount;
    private javax.swing.JList<BaseModel> listAccountLogin;
    private javax.swing.JProgressBar progessConvertCapcha;
    private javax.swing.JSlider sliderNumberOfAccounts;
    private javax.swing.JTextField txtCapcha;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtOpenID;
    private javax.swing.JTextField txtOpenPassword;
    private javax.swing.JTextField txtOpenPhoneNumber;
    private javax.swing.JTextField txtOpenUsername;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JLabel txtPathStatus;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
