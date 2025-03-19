/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.User;
import utility.DatabaseConnector;

/**
 *
 * @author okwua
 */
public class FormJPanel extends javax.swing.JPanel {
    
    JPanel bottomPanel;
    ImageIcon photo;

    /**
     * Creates new form FormJPanel
     */
    public FormJPanel() {
        initComponents();
    }
    
    public FormJPanel (JPanel bottomPanel) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registrationTitleLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        collegeLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        collegeComboBox = new javax.swing.JComboBox<>();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hobbiesTextArea = new javax.swing.JTextArea();
        hobbiesLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        registrationTitleLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        registrationTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        registrationTitleLabel.setText("Registration");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name:");

        collegeLabel.setText("College:");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        collegeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "College Of Engineering", "College Of Arts", "College Of Professional Studies" }));
        collegeComboBox.setSelectedIndex(-1);

        ageLabel.setText("Age:");

        hobbiesTextArea.setColumns(20);
        hobbiesTextArea.setRows(5);
        jScrollPane1.setViewportView(hobbiesTextArea);

        hobbiesLabel.setText("Hobbies:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hobbiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(collegeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(ageTextField)
                            .addComponent(collegeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(registrationTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(submitButton)))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(registrationTitleLabel)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(collegeLabel)
                    .addComponent(collegeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hobbiesLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(submitButton)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 46, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed
    
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:

        try{
            User userObject = new User();
      
            userObject.setName(this.nameTextField.getText());
            userObject.setCollege(this.collegeComboBox.getSelectedItem().toString());
            userObject.setAge(Integer.parseInt(this.ageTextField.getText()));
            userObject.setHobby(this.hobbiesTextArea.getText());
            //userObject.setPhoto(this.photo);
            //userObject.setDateOfBirth(this.dateOfBirthSpinner.getValue().toString());
            
            //Printing
            System.out.println(userObject.getName());
            System.out.println(userObject.getCollege());
            System.out.println(userObject.getAge());
            System.out.println(userObject.getHobby());
            System.out.println(userObject);

            
            //add the userObject into the database
            
            //Validate name
            if(userObject.getName().isBlank()) {
                JOptionPane.showMessageDialog(this, "Please enter your name." , "Oops!", HEIGHT);
                return;
            }
            

            //Validate Gender
            if(userObject.getCollege() == null){
                JOptionPane.showMessageDialog(this,"Please select your college.", "Oops!", HEIGHT);
                return;
            }

            //Validate age
            if(userObject.getAge()< 18){
                JOptionPane.showMessageDialog(this,"Age must be 18 or older. ", "Failed", HEIGHT);
                return;
            }

            //Validate Email
            //if(userObject.getEmail().isBlank()){
             //   JOptionPane.showMessageDialog(this,"Please enter your email address.", "Oops!", HEIGHT);
              //  return;
           // }

            //Validate Hobby
            if(userObject.getHobby().isBlank()){
                JOptionPane.showMessageDialog(this,"Please enter your hobbies.", "Oops!", HEIGHT);
                return;
            }

         
            DatabaseConnector.addUser(userObject);
            System.out.println("added user into the database");
            
            //Creating a popup
           JOptionPane.showMessageDialog(this, userObject, "Success! ", HEIGHT);
            ViewJPanel viewJPanelObject = new ViewJPanel(userObject);
            this.bottomPanel.add(viewJPanelObject);
            CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
            layout.next(bottomPanel);

        } catch (NullPointerException ne) {
            JOptionPane.showMessageDialog(this,"Please select your college.", "oops!",HEIGHT);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this,"Please enter a valid age. ", "Failed!",HEIGHT);
            System.out.println(e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Oops something went wrong", "Failed", HEIGHT);
        }

    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JComboBox<String> collegeComboBox;
    private javax.swing.JLabel collegeLabel;
    private javax.swing.JLabel hobbiesLabel;
    private javax.swing.JTextArea hobbiesTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel registrationTitleLabel;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
