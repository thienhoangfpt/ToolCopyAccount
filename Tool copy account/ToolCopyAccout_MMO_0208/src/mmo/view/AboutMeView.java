package mmo.view;

import mmo.common.Common;
import java.awt.Color;
import java.util.Calendar;
import mmo.base.BaseDialog;
import mmo.common.ChangeTextColor;
import mmo.common.OpenBrowse;

public final class AboutMeView extends BaseDialog {

    public AboutMeView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        changeTitleColor();
        lblSuperTitle.setText("Tool hỗ trợ cheat game "
                + Calendar.getInstance().get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblSuperTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        iconYoutube = new javax.swing.JLabel();
        iconFB = new javax.swing.JLabel();
        iconSupport = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Thông tin liên hệ"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jPanel1.setBackground(java.awt.Color.white);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        lblSuperTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSuperTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSuperTitle.setText("Tool hỗ trợ cheat game 2019");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSuperTitle)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSuperTitle)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 63, 80));

        iconYoutube.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        iconYoutube.setForeground(new java.awt.Color(255, 255, 255));
        iconYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_youtube_25.png"))); // NOI18N
        iconYoutube.setText("Link hỗ trợ Youtube");
        iconYoutube.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconYoutube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconYoutube.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconYoutubeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconYoutubeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconYoutubeMouseExited(evt);
            }
        });

        iconFB.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        iconFB.setForeground(new java.awt.Color(255, 255, 255));
        iconFB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_facebook_25.png"))); // NOI18N
        iconFB.setText("Link hỗ trợ Facebook");
        iconFB.setToolTipText("");
        iconFB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        iconFB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconFB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconFBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconFBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconFBMouseExited(evt);
            }
        });

        iconSupport.setBackground(new java.awt.Color(255, 255, 255));
        iconSupport.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        iconSupport.setForeground(new java.awt.Color(255, 255, 255));
        iconSupport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmo/images/icon_logo_50.jpg"))); // NOI18N
        iconSupport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iconSupport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconSupportMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phiên bản: 1.0.0");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phát triển bởi: Lê Lê channel");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Số điện thoại: 0787X5555X ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iconFB)
                            .addComponent(iconYoutube, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(iconSupport))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(iconSupport))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(11, 11, 11)
                        .addComponent(iconYoutube)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iconFB)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeTitleColor() {
        ChangeTextColor changeTextColor = new ChangeTextColor(this.lblSuperTitle);
        Thread t = new Thread(changeTextColor);
        t.start();
    }

    private void iconYoutubeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconYoutubeMouseClicked
        OpenBrowse.Connect(Common.LINK_YOUTUBE);
    }//GEN-LAST:event_iconYoutubeMouseClicked

    private void iconFBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFBMouseClicked
        OpenBrowse.Connect(Common.LINK_FACEBOOK);
    }//GEN-LAST:event_iconFBMouseClicked

    private void iconSupportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconSupportMouseClicked
        OpenBrowse.Connect(Common.LINK_YOUTUBE);
    }//GEN-LAST:event_iconSupportMouseClicked

    private void iconYoutubeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconYoutubeMouseExited
        iconYoutube.setBackground(Color.WHITE);
    }//GEN-LAST:event_iconYoutubeMouseExited

    private void iconFBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFBMouseEntered
        iconFB.setBackground(Color.GREEN);
    }//GEN-LAST:event_iconFBMouseEntered

    private void iconFBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconFBMouseExited
        iconFB.setBackground(Color.WHITE);
    }//GEN-LAST:event_iconFBMouseExited

    private void iconYoutubeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconYoutubeMouseEntered
        iconYoutube.setBackground(Color.GREEN);
    }//GEN-LAST:event_iconYoutubeMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconFB;
    private javax.swing.JLabel iconSupport;
    private javax.swing.JLabel iconYoutube;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblSuperTitle;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
