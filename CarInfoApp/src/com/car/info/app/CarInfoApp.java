/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.car.info.app;

import javax.swing.DefaultListModel;

/**
 *
 * @author f15
 */
public class CarInfoApp extends javax.swing.JFrame {

    /**
     * Creates new form CarInfoApp
     */
    public CarInfoApp() {
        initComponents();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpAppMainPanel = new javax.swing.JPanel();
        jpCarOwnerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaCarOwner = new javax.swing.JTextArea();
        jbPrintOwner = new javax.swing.JButton();
        jbClearOwner = new javax.swing.JButton();
        jlOwnerOfTheCar = new javax.swing.JLabel();
        jpDescriptionPanel = new javax.swing.JPanel();
        jlDescritptionOfTheCar = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaCarDescription = new javax.swing.JTextArea();
        jlPriceOfTheCar = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtaCarPrice = new javax.swing.JTextArea();
        jcbExcise = new javax.swing.JCheckBox();
        jcbCarBrand = new javax.swing.JComboBox<>();
        jlBrandOfTheCar = new javax.swing.JLabel();
        jlFuelOfTheCar = new javax.swing.JLabel();
        jrbPetrol = new javax.swing.JRadioButton();
        jrbDiesel = new javax.swing.JRadioButton();
        jrbGas = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jpListPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CarListMain = new javax.swing.JList<>();
        jbAddToList = new javax.swing.JButton();
        jbPrintList = new javax.swing.JButton();
        jbClearList = new javax.swing.JButton();
        jlListOfCars = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpCarOwnerPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtaCarOwner.setColumns(20);
        jtaCarOwner.setRows(5);
        jScrollPane1.setViewportView(jtaCarOwner);

        jbPrintOwner.setText("PRINT");
        jbPrintOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrintOwnerActionPerformed(evt);
            }
        });

        jbClearOwner.setText("CLEAR");
        jbClearOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearOwnerActionPerformed(evt);
            }
        });

        jlOwnerOfTheCar.setText("CAR OWNER");

        javax.swing.GroupLayout jpCarOwnerPanelLayout = new javax.swing.GroupLayout(jpCarOwnerPanel);
        jpCarOwnerPanel.setLayout(jpCarOwnerPanelLayout);
        jpCarOwnerPanelLayout.setHorizontalGroup(
            jpCarOwnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCarOwnerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCarOwnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlOwnerOfTheCar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpCarOwnerPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbPrintOwner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbClearOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpCarOwnerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbClearOwner, jbPrintOwner});

        jpCarOwnerPanelLayout.setVerticalGroup(
            jpCarOwnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCarOwnerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlOwnerOfTheCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCarOwnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCarOwnerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbPrintOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbClearOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jpCarOwnerPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jbClearOwner, jbPrintOwner});

        jpDescriptionPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlDescritptionOfTheCar.setText("DESCRIPTION");

        jtaCarDescription.setColumns(20);
        jtaCarDescription.setRows(5);
        jScrollPane3.setViewportView(jtaCarDescription);

        jlPriceOfTheCar.setText("PRICE");

        jtaCarPrice.setColumns(20);
        jtaCarPrice.setRows(5);
        jScrollPane4.setViewportView(jtaCarPrice);

        jcbExcise.setText("EXCISE (3%)");

        jcbCarBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUDI", "BMW", "FIAT", "OPEL", "VW", "OTHER" }));

        jlBrandOfTheCar.setText("THE CAR BRAND");

        jlFuelOfTheCar.setText("FUEL");

        buttonGroup1.add(jrbPetrol);
        jrbPetrol.setSelected(true);
        jrbPetrol.setText("PETROL");

        buttonGroup1.add(jrbDiesel);
        jrbDiesel.setText("DIESEL");

        buttonGroup1.add(jrbGas);
        jrbGas.setText("GAS");

        jButton1.setText("DESCRIPTION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpDescriptionPanelLayout = new javax.swing.GroupLayout(jpDescriptionPanel);
        jpDescriptionPanel.setLayout(jpDescriptionPanelLayout);
        jpDescriptionPanelLayout.setHorizontalGroup(
            jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlDescritptionOfTheCar)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpDescriptionPanelLayout.createSequentialGroup()
                        .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPriceOfTheCar)
                            .addComponent(jcbExcise))
                        .addGap(18, 18, 18)
                        .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcbCarBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                            .addComponent(jlBrandOfTheCar))
                        .addGap(18, 18, 18)
                        .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlFuelOfTheCar)
                            .addComponent(jrbPetrol)
                            .addComponent(jrbDiesel)
                            .addComponent(jrbGas))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDescriptionPanelLayout.setVerticalGroup(
            jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDescriptionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlDescritptionOfTheCar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPriceOfTheCar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlBrandOfTheCar)
                    .addComponent(jlFuelOfTheCar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDescriptionPanelLayout.createSequentialGroup()
                        .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbCarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpDescriptionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbExcise)
                            .addComponent(jButton1)))
                    .addGroup(jpDescriptionPanelLayout.createSequentialGroup()
                        .addComponent(jrbPetrol)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbDiesel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbGas)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jpListPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CarListMain.setModel(listModel);
        jScrollPane2.setViewportView(CarListMain);

        jbAddToList.setText("ADD TO LIST");
        jbAddToList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddToListActionPerformed(evt);
            }
        });

        jbPrintList.setText("PRINT LIST");
        jbPrintList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrintListActionPerformed(evt);
            }
        });

        jbClearList.setText("CLEAR LIST");
        jbClearList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearListActionPerformed(evt);
            }
        });

        jlListOfCars.setText("CAR LIST");

        javax.swing.GroupLayout jpListPanelLayout = new javax.swing.GroupLayout(jpListPanel);
        jpListPanel.setLayout(jpListPanelLayout);
        jpListPanelLayout.setHorizontalGroup(
            jpListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpListPanelLayout.createSequentialGroup()
                        .addComponent(jbAddToList, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbPrintList)
                        .addGap(18, 18, 18)
                        .addComponent(jbClearList))
                    .addComponent(jlListOfCars, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpListPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbAddToList, jbClearList, jbPrintList});

        jpListPanelLayout.setVerticalGroup(
            jpListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAddToList)
                    .addComponent(jbPrintList)
                    .addComponent(jbClearList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlListOfCars)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpAppMainPanelLayout = new javax.swing.GroupLayout(jpAppMainPanel);
        jpAppMainPanel.setLayout(jpAppMainPanelLayout);
        jpAppMainPanelLayout.setHorizontalGroup(
            jpAppMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCarOwnerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpDescriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpAppMainPanelLayout.setVerticalGroup(
            jpAppMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAppMainPanelLayout.createSequentialGroup()
                .addComponent(jpCarOwnerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpDescriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jpListPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpAppMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpAppMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPrintOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrintOwnerActionPerformed
        String carOwner = jtaCarOwner.getText();
        System.out.println("car owner is "+carOwner);
    }//GEN-LAST:event_jbPrintOwnerActionPerformed

    private void jbClearOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearOwnerActionPerformed
        jtaCarOwner.setText(null);
    }//GEN-LAST:event_jbClearOwnerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int carPrice = Integer.parseInt(jtaCarPrice.getText());
        if (jcbExcise.isSelected() == true)
            carPrice *= 1.03;
        
        String carBrand = jcbCarBrand.getSelectedItem().toString();
        
        String carFuel = new String();
        if (jrbDiesel.isSelected() == true)
            carFuel = jrbDiesel.getText();
        else if (jrbPetrol.isSelected() == true)
            carFuel = jrbPetrol.getText();
        else if (jrbGas.isSelected() == true)
            carFuel = jrbGas.getText();
        
        String carDescription = "Brand: " + carBrand + ", price: " + carPrice + " pln, fuel type: " + carFuel;
        jtaCarDescription.setText(carDescription);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbAddToListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddToListActionPerformed
        listModel.addElement(jtaCarDescription.getText());
    }//GEN-LAST:event_jbAddToListActionPerformed

    private void jbPrintListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrintListActionPerformed
        int listSize = listModel.getSize();
        System.out.println("My list contains " + listSize + " elements");
        
        for (int i = 0; i < listSize; i++)
            System.out.println("-> " + listModel.getElementAt(i));
    }//GEN-LAST:event_jbPrintListActionPerformed

    private void jbClearListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearListActionPerformed
        listModel.removeAllElements();
    }//GEN-LAST:event_jbClearListActionPerformed
    
    DefaultListModel listModel = new DefaultListModel();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CarInfoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarInfoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarInfoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarInfoApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarInfoApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> CarListMain;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbAddToList;
    private javax.swing.JButton jbClearList;
    private javax.swing.JButton jbClearOwner;
    private javax.swing.JButton jbPrintList;
    private javax.swing.JButton jbPrintOwner;
    private javax.swing.JComboBox<String> jcbCarBrand;
    private javax.swing.JCheckBox jcbExcise;
    private javax.swing.JLabel jlBrandOfTheCar;
    private javax.swing.JLabel jlDescritptionOfTheCar;
    private javax.swing.JLabel jlFuelOfTheCar;
    private javax.swing.JLabel jlListOfCars;
    private javax.swing.JLabel jlOwnerOfTheCar;
    private javax.swing.JLabel jlPriceOfTheCar;
    private javax.swing.JPanel jpAppMainPanel;
    private javax.swing.JPanel jpCarOwnerPanel;
    private javax.swing.JPanel jpDescriptionPanel;
    private javax.swing.JPanel jpListPanel;
    private javax.swing.JRadioButton jrbDiesel;
    private javax.swing.JRadioButton jrbGas;
    private javax.swing.JRadioButton jrbPetrol;
    private javax.swing.JTextArea jtaCarDescription;
    private javax.swing.JTextArea jtaCarOwner;
    private javax.swing.JTextArea jtaCarPrice;
    // End of variables declaration//GEN-END:variables
}