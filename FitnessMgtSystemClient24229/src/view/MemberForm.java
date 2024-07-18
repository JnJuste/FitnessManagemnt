
package view;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import model.Member;
import model.Trainer;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.MemberInterfaceService;
import service.TrainerInterfaceService;

/**
 *
 * @author jeanj
 */
public class MemberForm extends javax.swing.JFrame {
    //Global Variables
    DefaultTableModel tableMemberGym = new DefaultTableModel();
    

    /**
     * Creates new form MemberForm
     */
    public MemberForm() {
        initComponents();
        addColumnTable();
        dataFromDBToTablemember();
        loadTrainer();
    }

    private void addColumnTable(){
       tableMemberGym.addColumn("MEMBER ID");
       tableMemberGym.addColumn("NAMES");
       tableMemberGym.addColumn("AGE");
       tableMemberGym.addColumn("ADDRESS");
       tableMemberGym.addColumn("PHONE");
       tableMemberGym.addColumn("GENDER");
       tableMemberGym.addColumn("SUBSCRIPTION");
       tableMemberGym.addColumn("REG DATE");
       tableMemberGym.addColumn("MEMBER TRAINER");
       //Set table model
       memberTable.setModel(tableMemberGym);
    }
      
    private void dataFromDBToTablemember() {
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
            MemberInterfaceService service = (MemberInterfaceService) registry.lookup("member");
            List<Member> members = service.allMembers();
            tableMemberGym.setRowCount(0);
            members.forEach((member) -> {
                 tableMemberGym.addRow(new Object[]{
                    member.getMemberID(),
                    member.getMemberNames(),
                    member.getMemberAge(),
                    member.getMemberAddr(),
                    member.getMemberPhone(),
                    member.getMemberGender(),
                    member.getMemberSubscription(),
                    member.getMemberRegDate(),
                    member.getMemberTrainer(),
                 });
             });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        memberIDTxt = new javax.swing.JTextField();
        memberAddressTxt = new javax.swing.JTextField();
        memberPhoneTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        memberNamesTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        memberGenderTxt = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        memberSubscriptionTxt = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        memberAgeTxt = new javax.swing.JTextField();
        memberTrainerTxt = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        memberRegDateTxt = new com.toedter.calendar.JDateChooser();
        addMemberBtn = new javax.swing.JButton();
        updateMemberBtn = new javax.swing.JButton();
        deleteMemberBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberTable = new javax.swing.JTable();
        memberSearchBtn = new javax.swing.JButton();
        memberSearchIDTxt = new javax.swing.JTextField();
        printBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(0, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_icon/icons8-member-50.png"))); // NOI18N
        jLabel1.setText("MEMBER PAGE ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(785, 785, 785))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("MEMBER NAME");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("MEMBER AGE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("ADDRESS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("MOBILE PHONE");

        memberIDTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        memberIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberIDTxtActionPerformed(evt);
            }
        });

        memberAddressTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        memberPhoneTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("MEMBER ID");

        memberNamesTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("GENDER");

        memberGenderTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        memberGenderTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Not Selected--", "MALE", "FEMALE", "NOT TO SAY" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("SUBSCRIPTION");

        memberSubscriptionTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        memberSubscriptionTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Not Selected--", "Day Pass ($5)", "Monthly ($70)", "Quarterly ($270)", "Annually ($800)" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("TRAINER");

        memberAgeTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        memberTrainerTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("REG DATE");

        memberRegDateTxt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addComponent(memberPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(memberAgeTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(memberNamesTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memberIDTxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(memberAddressTxt)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(memberTrainerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(memberSubscriptionTxt, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                                .addComponent(memberGenderTxt, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(memberRegDateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(memberIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberNamesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(memberAgeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberAddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(memberPhoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memberGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(memberSubscriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(memberRegDateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(memberTrainerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        addMemberBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addMemberBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_icon/icons8-add-user-male-48.png"))); // NOI18N
        addMemberBtn.setText("ADD MEMBER");
        addMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberBtnActionPerformed(evt);
            }
        });

        updateMemberBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        updateMemberBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_icon/icons8-edit-profile-48.png"))); // NOI18N
        updateMemberBtn.setText("UPDATE MEMBER");
        updateMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMemberBtnActionPerformed(evt);
            }
        });

        deleteMemberBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        deleteMemberBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_icon/icons8-remove-user-female-48.png"))); // NOI18N
        deleteMemberBtn.setText("DELETE MEMBER");
        deleteMemberBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMemberBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_icon/icons8-back-arrow-48.png"))); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        memberTable.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        memberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        memberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(memberTable);

        memberSearchBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        memberSearchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_icon/icons8-search-client-48.png"))); // NOI18N
        memberSearchBtn.setText("SEARCH");
        memberSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberSearchBtnActionPerformed(evt);
            }
        });

        memberSearchIDTxt.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        memberSearchIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberSearchIDTxtActionPerformed(evt);
            }
        });

        printBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        printBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java_icon/icons8-print-48.png"))); // NOI18N
        printBtn.setText("PRINT");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMemberBtn)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateMemberBtn)
                        .addGap(75, 75, 75)
                        .addComponent(deleteMemberBtn)
                        .addGap(102, 102, 102)
                        .addComponent(cancelBtn)
                        .addGap(36, 36, 36)
                        .addComponent(printBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(memberSearchIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(memberSearchBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addMemberBtn)
                            .addComponent(cancelBtn)
                            .addComponent(deleteMemberBtn)
                            .addComponent(updateMemberBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(printBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(memberSearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memberSearchIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void memberIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberIDTxtActionPerformed

    public void loadTrainer(){
        try {
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
            TrainerInterfaceService service = (TrainerInterfaceService) registry.lookup("trainer");
            List<Trainer> trainers = service.allTrainers();
            trainers.forEach((trainer) -> {
                  memberTrainerTxt.addItem(trainer.getTrainerNames());
             });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    private void addMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberBtnActionPerformed
        // Surround with Try and Catch
        try{
            //Instantiate the Member MODEL
            Member theMember = new Member();
            
            // Validations
            if(memberIDTxt.getText().trim().isEmpty()
                || memberNamesTxt.getText().trim().isEmpty()
                || memberAgeTxt.getText().trim().isEmpty()
                || memberAddressTxt.getText().trim().isEmpty()
                || memberPhoneTxt.getText().trim().isEmpty()
                || memberGenderTxt.getSelectedItem().toString().isEmpty()
                || memberSubscriptionTxt.getSelectedItem().toString().isEmpty()
                || memberRegDateTxt.getDateFormatString().toString().isEmpty()
                || memberTrainerTxt.getSelectedItem().toString().isEmpty())
            {JOptionPane.showMessageDialog(this, "PROVIDE ALL INFORMATION!","DATA REQUIRED",JOptionPane.WARNING_MESSAGE);
            }else{
                if(memberIDTxt.getText().length() ==5){

                    //Set The Model
                    theMember.setMemberID(memberIDTxt.getText());
                    theMember.setMemberNames(memberNamesTxt.getText());
                    theMember.setMemberAge(memberAgeTxt.getText());
                    theMember.setMemberAddr(memberAddressTxt.getText());
                    theMember.setMemberPhone(memberPhoneTxt.getText());
                    theMember.setMemberGender((String) memberGenderTxt.getSelectedItem());
                    theMember.setMemberSubscription((String) memberSubscriptionTxt.getSelectedItem());
                    // Create a date formatter
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String dateString = sdf.format(memberRegDateTxt.getDate());
                    theMember.setMemberRegDate(dateString);
                   
                    theMember.setMemberTrainer((String) memberTrainerTxt.getSelectedItem());
                    try {
                            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
                            MemberInterfaceService service = (MemberInterfaceService) registry.lookup("member");
                            String feedback = service.registerMember(theMember);
                            JOptionPane.showMessageDialog(this, feedback);
                            MemberForm mem = new MemberForm();
                            mem.setVisible(true);
                            this.dispose();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                }else{
                    JOptionPane.showMessageDialog(this, "MEMBER ID MUST HAVE 5 CHARACTER","ID ERROR",JOptionPane.ERROR_MESSAGE);
                    dataFromDBToTablemember();
                }
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addMemberBtnActionPerformed

    private void updateMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMemberBtnActionPerformed
        // TODO add your handling code here:
        try {
            //Instantiate the Member MODEL
            Member theMember = new Member();
            // Validations
            if (memberNamesTxt.getText().trim().isEmpty()
                || memberAgeTxt.getText().trim().isEmpty()
                || memberAddressTxt.getText().trim().isEmpty()
                || memberPhoneTxt.getText().trim().isEmpty()
                || memberGenderTxt.getSelectedItem().toString().isEmpty()
                || memberSubscriptionTxt.getSelectedItem().toString().isEmpty()
                || memberRegDateTxt.getDateFormatString().toString().isEmpty()
                || memberTrainerTxt.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(this, "PLEASE PROVIDE ALL INFORMATION!", "DATA REQUIRED", JOptionPane.WARNING_MESSAGE);
            } else {
                
                //SET MODEL
                theMember.setMemberNames(memberNamesTxt.getText());
                theMember.setMemberAge(memberAgeTxt.getText());
                theMember.setMemberAddr(memberAddressTxt.getText());
                theMember.setMemberPhone(memberPhoneTxt.getText());
                theMember.setMemberGender((String) memberGenderTxt.getSelectedItem());
                theMember.setMemberSubscription((String) memberSubscriptionTxt.getSelectedItem());
                // Create a date formatter
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); 
                String dateString = sdf.format(memberRegDateTxt.getDate());
                theMember.setMemberRegDate(dateString);
                
                theMember.setMemberTrainer((String) memberTrainerTxt.getSelectedItem());
                theMember.setMemberID(memberIDTxt.getText());
                try {
                            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
                            MemberInterfaceService service = (MemberInterfaceService) registry.lookup("member");
                            String feedback = service.updateMember(theMember);
                            JOptionPane.showMessageDialog(this, feedback);
                            MemberForm Mber = new MemberForm();
                            Mber.setVisible(true);
                            this.dispose();
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updateMemberBtnActionPerformed

    private void deleteMemberBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMemberBtnActionPerformed
        // Surround with Try and Catch
        if (memberNamesTxt.getText().trim().isEmpty()
                || memberAgeTxt.getText().trim().isEmpty()
                || memberAddressTxt.getText().trim().isEmpty()
                || memberPhoneTxt.getText().trim().isEmpty()
                || memberGenderTxt.getSelectedItem().toString().isEmpty()
                || memberSubscriptionTxt.getSelectedItem().toString().isEmpty()
                || memberRegDateTxt.getDateFormatString().toString().isEmpty()
                || memberTrainerTxt.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(this, "SELECT A MEMBER TO DELETE");
        }else{
        try {
                Member theMember = new Member(memberIDTxt.getText());
                Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
                MemberInterfaceService service = (MemberInterfaceService) registry.lookup("member");
                String feedback = service.deleteMember(theMember);
                JOptionPane.showMessageDialog(this, feedback);
                MemberForm Mber = new MemberForm();
                Mber.setVisible(true);
                this.dispose();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_deleteMemberBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        GymAPP app = new GymAPP();
        this.hide();
        app.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void memberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberTableMouseClicked
        // TODO add your handling code here:
        tableMemberGym = (DefaultTableModel)memberTable.getModel();
        int select = memberTable.getSelectedRow();

        memberIDTxt.setText(tableMemberGym.getValueAt(select, 0).toString());
        memberNamesTxt.setText(tableMemberGym.getValueAt(select, 1).toString());
        memberAgeTxt.setText(tableMemberGym.getValueAt(select, 2).toString());
        memberAddressTxt.setText(tableMemberGym.getValueAt(select, 3).toString());
        memberPhoneTxt.setText(tableMemberGym.getValueAt(select, 4).toString());
        memberGenderTxt.setSelectedItem(tableMemberGym.getValueAt(select, 5).toString());
        memberSubscriptionTxt.setSelectedItem(tableMemberGym.getValueAt(select, 6).toString());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date registeredDate;
        try {
            registeredDate = sdf.parse(tableMemberGym.getValueAt(select, 7).toString());
            memberRegDateTxt.setDate(registeredDate);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        memberTrainerTxt.setSelectedItem(tableMemberGym.getValueAt(select, 8).toString());
    }//GEN-LAST:event_memberTableMouseClicked

    private void memberSearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberSearchBtnActionPerformed
        // TODO add your handling code here:
        
        if (memberSearchIDTxt.getText().isEmpty()) {
            dataFromDBToTablemember();
        } else {
            try {
                Member theMember = new Member(memberSearchIDTxt.getText());
                Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
                MemberInterfaceService service = (MemberInterfaceService) registry.lookup("member");
                List<Member> members = service.searchMembers(theMember);
 
                // clear rows
                tableMemberGym.setRowCount(0);
 
                members.forEach((member) -> {
                    tableMemberGym.addRow(new Object[] {
                        member.getMemberID(),
                        member.getMemberNames(),
                        member.getMemberAge(),
                        member.getMemberAddr(),
                        member.getMemberPhone(),
                        member.getMemberGender(),
                        member.getMemberSubscription(),
                        member.getMemberRegDate(),
                        member.getMemberTrainer(),
                    });
                });
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_memberSearchBtnActionPerformed

    private void memberSearchIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberSearchIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberSearchIDTxtActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        // TODO add your handling code here:
        try{
        memberTable.print();
        }catch (Exception ex){
        ex.printStackTrace();
        }
    }//GEN-LAST:event_printBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteMemberBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField memberAddressTxt;
    private javax.swing.JTextField memberAgeTxt;
    private javax.swing.JComboBox<String> memberGenderTxt;
    private javax.swing.JTextField memberIDTxt;
    private javax.swing.JTextField memberNamesTxt;
    private javax.swing.JTextField memberPhoneTxt;
    private com.toedter.calendar.JDateChooser memberRegDateTxt;
    private javax.swing.JButton memberSearchBtn;
    private javax.swing.JTextField memberSearchIDTxt;
    private javax.swing.JComboBox<String> memberSubscriptionTxt;
    private javax.swing.JTable memberTable;
    private javax.swing.JComboBox<String> memberTrainerTxt;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton updateMemberBtn;
    // End of variables declaration//GEN-END:variables
}