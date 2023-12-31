/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;


import javax.swing.ImageIcon;
import model.*;

/**
 *
 * @author hotra
 */
public class disReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form disReportJPanel
     */
    Person person;
    Address address;
    Patient patient;
    Doctor doctor;
    Insurance insurance;
    Driver driver;
    VehicleRegistration vehicle;
    public disReportJPanel(Person person,  Address address, Patient patient, Doctor doctor, Insurance insurance, Driver driver, VehicleRegistration vehicle) {
        initComponents();
        this.person = person;
        this.address = address;
        this.patient = patient;
        this.doctor = doctor;
        this.insurance = insurance;
        this.driver = driver;
        this.vehicle = vehicle;
        displayReport();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblProfilePic = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblPatientAddress = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientEmail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPatientGender = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblPatientWeight = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblPatientMaritalStatus = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPatientMedicationStatus = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPatientDrinks = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPatientLastVisitDate = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblPatientSmokes = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblPatientAllergies = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPatientId = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        lblInsurancePremium = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblInsuranceDeductable = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblInsuranceCompany = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblInsuranceId = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblInsuranceBenifits = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        lblDoctorOfficeAddress = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblDoctorContactInfo = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblAppointmentDate = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblDoctorLicenseInfo = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 0));
        jLabel1.setText("General Medical History");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        lblProfilePic.setIcon(new javax.swing.ImageIcon("C:\\Users\\hotra\\OneDrive\\Pictures\\Camera Roll\\WIN_20210919_12_27_45_Pro.jpg")); // NOI18N
        lblProfilePic.setDoubleBuffered(true);
        jPanel1.add(lblProfilePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 130, 140));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 540, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 0));
        jLabel4.setText("Birth Date");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setFocusCycleRoot(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Patient Information");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lblPatientAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientAddress.setText("Address");
        lblPatientAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblPatientAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        lblDOB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDOB.setText("dob");
        lblDOB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDOB.setFocusCycleRoot(true);
        jPanel1.add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        lblPatientName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientName.setText("Name");
        lblPatientName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblPatientEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientEmail.setText("Email");
        lblPatientEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblPatientEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("Gender");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel7.setFocusCycleRoot(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        lblPatientGender.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientGender.setText("Male");
        lblPatientGender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPatientGender.setFocusCycleRoot(true);
        jPanel1.add(lblPatientGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("Weight");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel8.setFocusCycleRoot(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, -1));

        lblPatientWeight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientWeight.setText("Male");
        lblPatientWeight.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPatientWeight.setFocusCycleRoot(true);
        jPanel1.add(lblPatientWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 0));
        jLabel10.setText("Marital Status");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.setFocusCycleRoot(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        lblPatientMaritalStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientMaritalStatus.setText("Married");
        lblPatientMaritalStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPatientMaritalStatus.setFocusCycleRoot(true);
        jPanel1.add(lblPatientMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Patient Report");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("On Medication?");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setFocusCycleRoot(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        lblPatientMedicationStatus.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientMedicationStatus.setText("dob");
        lblPatientMedicationStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPatientMedicationStatus.setFocusCycleRoot(true);
        jPanel1.add(lblPatientMedicationStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 0));
        jLabel11.setText("Drinking:");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel11.setFocusCycleRoot(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        lblPatientDrinks.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientDrinks.setText("Male");
        lblPatientDrinks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPatientDrinks.setFocusCycleRoot(true);
        jPanel1.add(lblPatientDrinks, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 0));
        jLabel13.setText("Last Visit Date:");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel13.setFocusCycleRoot(true);
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lblPatientLastVisitDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientLastVisitDate.setText("dob");
        lblPatientLastVisitDate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPatientLastVisitDate.setFocusCycleRoot(true);
        jPanel1.add(lblPatientLastVisitDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 0));
        jLabel14.setText("Smoking:");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel14.setFocusCycleRoot(true);
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        lblPatientSmokes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientSmokes.setText("Male");
        lblPatientSmokes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPatientSmokes.setFocusCycleRoot(true);
        jPanel1.add(lblPatientSmokes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 153, 0));
        jLabel15.setText("Any Allergies?");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel15.setFocusCycleRoot(true);
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, -1, -1));

        lblPatientAllergies.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientAllergies.setText("Male");
        lblPatientAllergies.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblPatientAllergies.setFocusCycleRoot(true);
        jPanel1.add(lblPatientAllergies, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 0));
        jLabel12.setText("Patient Id");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        lblPatientId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPatientId.setText("Id Number");
        lblPatientId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(lblPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 153, 0));
        jLabel16.setText("Medical Insurance Details");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 540, 10));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 153, 0));
        jLabel17.setText("Annual Premium:");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel17.setFocusCycleRoot(true);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

        lblInsurancePremium.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInsurancePremium.setText("dob");
        lblInsurancePremium.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInsurancePremium.setFocusCycleRoot(true);
        jPanel1.add(lblInsurancePremium, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 153, 0));
        jLabel18.setText("Deductables:");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel18.setFocusCycleRoot(true);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, -1, -1));

        lblInsuranceDeductable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInsuranceDeductable.setText("Male");
        lblInsuranceDeductable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInsuranceDeductable.setFocusCycleRoot(true);
        jPanel1.add(lblInsuranceDeductable, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 153, 0));
        jLabel19.setText("Name of Insurance Company");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel19.setFocusCycleRoot(true);
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        lblInsuranceCompany.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInsuranceCompany.setText("dob");
        lblInsuranceCompany.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInsuranceCompany.setFocusCycleRoot(true);
        jPanel1.add(lblInsuranceCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 153, 0));
        jLabel20.setText("Policy Number:");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel20.setFocusCycleRoot(true);
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        lblInsuranceId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInsuranceId.setText("Male");
        lblInsuranceId.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInsuranceId.setFocusCycleRoot(true);
        jPanel1.add(lblInsuranceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 153, 0));
        jLabel21.setText("Any Additional Benifits?");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel21.setFocusCycleRoot(true);
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, -1, -1));

        lblInsuranceBenifits.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblInsuranceBenifits.setText("Male");
        lblInsuranceBenifits.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblInsuranceBenifits.setFocusCycleRoot(true);
        jPanel1.add(lblInsuranceBenifits, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 153, 0));
        jLabel22.setText("Upcoming Appointment");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 710, -1, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 540, 10));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 153, 0));
        jLabel23.setText("Office Address");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel23.setFocusCycleRoot(true);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 760, -1, 40));

        lblDoctorOfficeAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDoctorOfficeAddress.setText("dob");
        lblDoctorOfficeAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDoctorOfficeAddress.setFocusCycleRoot(true);
        jPanel1.add(lblDoctorOfficeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 790, -1, 40));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 153, 0));
        jLabel24.setText("Doctor Contact Info:");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel24.setFocusCycleRoot(true);
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 820, -1, 40));

        lblDoctorContactInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDoctorContactInfo.setText("Male");
        lblDoctorContactInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDoctorContactInfo.setFocusCycleRoot(true);
        jPanel1.add(lblDoctorContactInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 850, -1, 40));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 153, 0));
        jLabel25.setText("Appointment Date");
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel25.setFocusCycleRoot(true);
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, -1, 40));

        lblAppointmentDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAppointmentDate.setText("dob");
        lblAppointmentDate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAppointmentDate.setFocusCycleRoot(true);
        jPanel1.add(lblAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, -1, 40));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 153, 0));
        jLabel26.setText("Doctor Name:");
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel26.setFocusCycleRoot(true);
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 820, -1, 40));

        lblDoctorName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDoctorName.setText("Male");
        lblDoctorName.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDoctorName.setFocusCycleRoot(true);
        jPanel1.add(lblDoctorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 850, -1, 40));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 153, 0));
        jLabel27.setText("Doctor License No:");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel27.setFocusCycleRoot(true);
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 880, -1, 40));

        lblDoctorLicenseInfo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDoctorLicenseInfo.setText("Male");
        lblDoctorLicenseInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDoctorLicenseInfo.setFocusCycleRoot(true);
        jPanel1.add(lblDoctorLicenseInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 910, -1, 40));

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAppointmentDate;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDoctorContactInfo;
    private javax.swing.JLabel lblDoctorLicenseInfo;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblDoctorOfficeAddress;
    private javax.swing.JLabel lblInsuranceBenifits;
    private javax.swing.JLabel lblInsuranceCompany;
    private javax.swing.JLabel lblInsuranceDeductable;
    private javax.swing.JLabel lblInsuranceId;
    private javax.swing.JLabel lblInsurancePremium;
    private javax.swing.JLabel lblPatientAddress;
    private javax.swing.JLabel lblPatientAllergies;
    private javax.swing.JLabel lblPatientDrinks;
    private javax.swing.JLabel lblPatientEmail;
    private javax.swing.JLabel lblPatientGender;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPatientLastVisitDate;
    private javax.swing.JLabel lblPatientMaritalStatus;
    private javax.swing.JLabel lblPatientMedicationStatus;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientSmokes;
    private javax.swing.JLabel lblPatientWeight;
    private javax.swing.JLabel lblProfilePic;
    // End of variables declaration//GEN-END:variables

    private void displayReport() {
        //Swing form report
        lblAppointmentDate.setText(patient.getNextVisitDate());
        lblDOB.setText(person.getDob());
        lblDoctorContactInfo.setText(doctor.getContactInfo());
        lblDoctorLicenseInfo.setText(doctor.getLicenseNo());
        lblDoctorName.setText(doctor.getName());
        lblDoctorOfficeAddress.setText(doctor.getOfficeAddress());
        lblInsuranceBenifits.setText(patient.getInsurance().getAddlBenefits());
        lblInsuranceCompany.setText(patient.getInsurance().getInsuredBy());
        lblInsuranceDeductable.setText(patient.getInsurance().getDeductable());
        lblInsuranceId.setText(patient.getInsurance().getIdentificationNumber());
        lblInsurancePremium.setText(patient.getInsurance().getPremiumYearly());
        lblPatientAddress.setText(address.getCity()+", "+address.getState()+", "+address.getCountry());
        lblPatientAllergies.setText(patient.getAllergies().toString());
        lblPatientDrinks.setText(patient.getDrinking().toString());
        lblPatientGender.setText(person.getGender());
        lblPatientId.setText(patient.getId());
        lblPatientLastVisitDate.setText(patient.getLastVisitDate());
        lblPatientMaritalStatus.setText(person.getMaritalStatus());
        lblPatientMedicationStatus.setText(patient.getOnMedication().toString());
        lblPatientName.setText(person.getFirstName()+ " "+ person.getLastName());
        lblPatientEmail.setText(person.getEmail());
        lblPatientSmokes.setText(patient.getSmoking().toString());
        lblPatientWeight.setText(patient.getWeight());
        lblProfilePic.setIcon(new ImageIcon(person.getProfilePicPath()));
        
        //netbeans console output
        /*
        for (Method m : person.getClass().getMethods()) {
            if (m.getName().startsWith("get") && m.getParameterTypes().length == 0) {
                System.out.print(m.getName());
                try {
                    System.out.println(m.invoke(person));
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                    Logger.getLogger(disReportJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        */
        String title = "Personal Information";
        System.out.println("*".repeat(title.length()));
        System.out.println(title);
        System.out.println("*".repeat(title.length()));
        
    
        System.out.println("First Name: "+ person.getFirstName());
        System.out.println("Last Name: "+ person.getLastName());
        System.out.println("Ssn: "+ person.getSsn());
        System.out.println("Web Url: "+ person.getWebUrl());
        System.out.println("Email: "+ person.getEmail());
        System.out.println("Gender: "+ person.getGender());
        System.out.println("Dob: "+ person.getDob());
        System.out.println("Weight: "+ person.getWeight());
        System.out.println("Profile Pic Path: "+ person.getProfilePicPath());
        System.out.println("Marital Status: "+ person.getMaritalStatus());

        title = "Address Information";
        System.out.println("*".repeat(title.length()));
        System.out.println(title);
        System.out.println("*".repeat(title.length()));


        System.out.println("Gps Location: "+ address.getGpsLocation());
        System.out.println("City: "+ address.getCity());
        System.out.println("State: "+ address.getState());
        System.out.println("Country: "+ address.getCountry());

        title = "Patient Information";
        System.out.println("*".repeat(title.length()));
        System.out.println(title);
        System.out.println("*".repeat(title.length()));

        System.out.println("Id: "+ patient.getId());
        System.out.println("Primary Doctor: "+ patient.getPrimaryDoctor());
        System.out.println("Last Visit Date: "+ patient.getLastVisitDate());
        System.out.println("Next Visit Date: "+ patient.getNextVisitDate());
        System.out.println("Allergies: "+ patient.getAllergies().toString());
        System.out.println("On Medication: "+ patient.getOnMedication().toString());
        System.out.println("Smoking: "+ patient.getSmoking().toString());
        System.out.println("Drinking: "+ patient.getDrinking().toString());
        
        title = "Inurance Information";
        System.out.println("*".repeat(title.length()));
        System.out.println(title);
        System.out.println("*".repeat(title.length()));

        System.out.println("Insured By: "+ insurance.getInsuredBy());
        System.out.println("Identification Number: "+ insurance.getIdentificationNumber());
        System.out.println("Premium Yearly: "+ insurance.getPremiumYearly());
        System.out.println("Deductable: "+ insurance.getDeductable());
        System.out.println("Addl Benefits: "+ insurance.getAddlBenefits());


        title = "Doctor Information";
        System.out.println("*".repeat(title.length()));
        System.out.println(title);
        System.out.println("*".repeat(title.length()));

        System.out.println("Name: "+ doctor.getName());
        System.out.println("Office Address: "+ doctor.getOfficeAddress());
        System.out.println("License No: "+ doctor.getLicenseNo());
        System.out.println("Specialty: "+ doctor.getSpecialty());
        System.out.println("Experience: "+ doctor.getExperience());
        System.out.println("Certified Board: "+ doctor.getCertifiedBoard());
        System.out.println("Contact Info: "+ doctor.getContactInfo());
                
        
        title = "Driver Information";
        System.out.println("*".repeat(title.length()));
        System.out.println(title);
        System.out.println("*".repeat(title.length()));
        
        System.out.println("Driver License: "+ driver.getDriverLicense());


        title = "Vehicle Information";
        System.out.println("*".repeat(title.length()));
        System.out.println(title);
        System.out.println("*".repeat(title.length()));
        
        System.out.println("Model: "+ vehicle.getModel());
        System.out.println("Serial: "+ vehicle.getSerial());
        System.out.println("Colour: "+ vehicle.getColour());

    }
    
}
