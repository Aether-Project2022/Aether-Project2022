
package br.com.AetherVoyages.view;


public class RegisterEmployee extends javax.swing.JInternalFrame {

   
    public RegisterEmployee() {
        initComponents();
        
        jpBackgroundBnt.setVisible(false);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollEmployee = new javax.swing.JScrollPane();
        jpBackgroundEmployee = new javax.swing.JPanel();
        jpConsultEmployees = new javax.swing.JPanel();
        lblWarningEmployees = new javax.swing.JLabel();
        lblSearchName = new javax.swing.JLabel();
        txtNameConsultE = new javax.swing.JTextField();
        btnSearchE = new javax.swing.JButton();
        bntClearSearchE = new javax.swing.JButton();
        jpTableEmployees = new javax.swing.JPanel();
        tableEmployees = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jpBackgroundBnt = new javax.swing.JPanel();
        bntEditE = new javax.swing.JButton();
        bntDeleteE = new javax.swing.JButton();
        lblSelect = new javax.swing.JLabel();
        jpPersonalData = new javax.swing.JPanel();
        jpPhotograph = new javax.swing.JPanel();
        imgPhotograph = new javax.swing.JLabel();
        lblNameE = new javax.swing.JLabel();
        txtNameData = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        lblRG = new javax.swing.JLabel();
        txtRG = new javax.swing.JFormattedTextField();
        jCBSex = new javax.swing.JComboBox<>();
        lblSex = new javax.swing.JLabel();
        lblYearBirth = new javax.swing.JLabel();
        txtYearBirth = new javax.swing.JFormattedTextField();
        lblOffice = new javax.swing.JLabel();
        txtOffice = new javax.swing.JTextField();
        jpAddress = new javax.swing.JPanel();
        lblRoad = new javax.swing.JLabel();
        txtRoad = new javax.swing.JTextField();
        lblBurgh = new javax.swing.JLabel();
        txtBurgh = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        txtNumber = new javax.swing.JFormattedTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jpContacts = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCell = new javax.swing.JLabel();
        txtCell = new javax.swing.JFormattedTextField();
        jpButtons = new javax.swing.JPanel();
        bntNew = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("Aether Voyages - Register Employees");

        jScrollEmployee.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpConsultEmployees.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consult", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblWarningEmployees.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblWarningEmployees.setForeground(new java.awt.Color(0, 0, 0));
        lblWarningEmployees.setText("*Before making a new registration, check that the person is not already registered!");

        lblSearchName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSearchName.setForeground(new java.awt.Color(0, 0, 0));
        lblSearchName.setText("Search by name:");

        txtNameConsultE.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSearchE.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnSearchE.setForeground(new java.awt.Color(0, 0, 0));
        btnSearchE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/search_find_lupa_21889.png"))); // NOI18N
        btnSearchE.setText("Search");
        btnSearchE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEActionPerformed(evt);
            }
        });

        bntClearSearchE.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bntClearSearchE.setForeground(new java.awt.Color(0, 0, 0));
        bntClearSearchE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/logo_orange_ccleaner_clean_icon_134365 (1).png"))); // NOI18N
        bntClearSearchE.setText("Clear Search");
        bntClearSearchE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntClearSearchEActionPerformed(evt);
            }
        });

        jpTableEmployees.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "CPF", "Office"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEmployees.setViewportView(jTable1);

        javax.swing.GroupLayout jpTableEmployeesLayout = new javax.swing.GroupLayout(jpTableEmployees);
        jpTableEmployees.setLayout(jpTableEmployeesLayout);
        jpTableEmployeesLayout.setHorizontalGroup(
            jpTableEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jpTableEmployeesLayout.setVerticalGroup(
            jpTableEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );

        jpBackgroundBnt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bntEditE.setText("Edit");

        bntDeleteE.setText("Delete");

        lblSelect.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblSelect.setForeground(new java.awt.Color(0, 0, 0));
        lblSelect.setText("*To edit or delete a record, simply select from the table and click on the desired button");

        javax.swing.GroupLayout jpBackgroundBntLayout = new javax.swing.GroupLayout(jpBackgroundBnt);
        jpBackgroundBnt.setLayout(jpBackgroundBntLayout);
        jpBackgroundBntLayout.setHorizontalGroup(
            jpBackgroundBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBackgroundBntLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntDeleteE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntEditE)
                .addGap(16, 16, 16))
        );
        jpBackgroundBntLayout.setVerticalGroup(
            jpBackgroundBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundBntLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBackgroundBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntEditE)
                    .addComponent(bntDeleteE))
                .addContainerGap(12, Short.MAX_VALUE))
            .addComponent(lblSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpConsultEmployeesLayout = new javax.swing.GroupLayout(jpConsultEmployees);
        jpConsultEmployees.setLayout(jpConsultEmployeesLayout);
        jpConsultEmployeesLayout.setHorizontalGroup(
            jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultEmployeesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jpTableEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                .addGroup(jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(lblWarningEmployees))
                    .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jpBackgroundBnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                                .addComponent(lblSearchName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNameConsultE, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bntClearSearchE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jpConsultEmployeesLayout.setVerticalGroup(
            jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultEmployeesLayout.createSequentialGroup()
                .addComponent(lblWarningEmployees)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearchName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpConsultEmployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSearchE)
                        .addComponent(bntClearSearchE)
                        .addComponent(txtNameConsultE, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpTableEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBackgroundBnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpPersonalData.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jpPhotograph.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Photograph", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        imgPhotograph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/folderyellowphoto_93332.png"))); // NOI18N

        javax.swing.GroupLayout jpPhotographLayout = new javax.swing.GroupLayout(jpPhotograph);
        jpPhotograph.setLayout(jpPhotographLayout);
        jpPhotographLayout.setHorizontalGroup(
            jpPhotographLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPhotographLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imgPhotograph)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPhotographLayout.setVerticalGroup(
            jpPhotographLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPhotographLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(imgPhotograph, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        lblNameE.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNameE.setForeground(new java.awt.Color(0, 0, 0));
        lblNameE.setText("Name:");

        lblCPF.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 0, 0));
        lblCPF.setText("CPF:");

        lblLastName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(0, 0, 0));
        lblLastName.setText("Last Name:");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblRG.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblRG.setForeground(new java.awt.Color(0, 0, 0));
        lblRG.setText("RG:");

        try {
            txtRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jCBSex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select:", "Male", "Feminino" }));

        lblSex.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblSex.setForeground(new java.awt.Color(0, 0, 0));
        lblSex.setText("Sex:");

        lblYearBirth.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblYearBirth.setForeground(new java.awt.Color(0, 0, 0));
        lblYearBirth.setText("Year or Birth:");

        try {
            txtYearBirth.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("   ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblOffice.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblOffice.setForeground(new java.awt.Color(0, 0, 0));
        lblOffice.setText("Office:");

        javax.swing.GroupLayout jpPersonalDataLayout = new javax.swing.GroupLayout(jpPersonalData);
        jpPersonalData.setLayout(jpPersonalDataLayout);
        jpPersonalDataLayout.setHorizontalGroup(
            jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPhotograph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpPersonalDataLayout.createSequentialGroup()
                        .addComponent(lblNameE)
                        .addGap(177, 177, 177)
                        .addComponent(lblLastName))
                    .addGroup(jpPersonalDataLayout.createSequentialGroup()
                        .addComponent(txtNameData, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpPersonalDataLayout.createSequentialGroup()
                        .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                                .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addGap(125, 125, 125)
                                .addComponent(lblRG)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSex)
                            .addComponent(jCBSex, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblYearBirth)
                    .addComponent(txtYearBirth)
                    .addComponent(lblOffice)
                    .addComponent(txtOffice, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpPersonalDataLayout.setVerticalGroup(
            jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpPhotograph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpPersonalDataLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNameE)
                    .addComponent(lblLastName)
                    .addComponent(lblYearBirth))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYearBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(lblRG)
                    .addComponent(lblSex)
                    .addComponent(lblOffice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpPersonalDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBSex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpAddress.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblRoad.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblRoad.setForeground(new java.awt.Color(0, 0, 0));
        lblRoad.setText("Road:");

        lblBurgh.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBurgh.setForeground(new java.awt.Color(0, 0, 0));
        lblBurgh.setText("Neighborhood:");

        lblNumber.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(0, 0, 0));
        lblNumber.setText("Number:");

        try {
            txtNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter(" ######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCity.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(0, 0, 0));
        lblCity.setText("City:");

        lblCep.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCep.setForeground(new java.awt.Color(0, 0, 0));
        lblCep.setText("CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpAddressLayout = new javax.swing.GroupLayout(jpAddress);
        jpAddress.setLayout(jpAddressLayout);
        jpAddressLayout.setHorizontalGroup(
            jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBurgh)
                    .addComponent(txtBurgh)
                    .addComponent(lblCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpAddressLayout.createSequentialGroup()
                        .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRoad, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRoad))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumber)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAddressLayout.setVerticalGroup(
            jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAddressLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoad)
                    .addComponent(lblNumber)
                    .addComponent(lblCep))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBurgh)
                    .addComponent(lblCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBurgh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jpContacts.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contacts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblEmail.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(0, 0, 0));
        lblEmail.setText("E-mail:");

        lblCell.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCell.setForeground(new java.awt.Color(0, 0, 0));
        lblCell.setText("Cell:");

        try {
            txtCell.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  (##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpContactsLayout = new javax.swing.GroupLayout(jpContacts);
        jpContacts.setLayout(jpContactsLayout);
        jpContactsLayout.setHorizontalGroup(
            jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContactsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCell)
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
        );
        jpContactsLayout.setVerticalGroup(
            jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpContactsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblCell))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpContactsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jpButtons.setBackground(new java.awt.Color(0, 102, 102));
        jpButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntNew.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNew.setForeground(new java.awt.Color(0, 0, 0));
        bntNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/business_application_addmale_useradd_insert_add_user_client_2312 (1).png"))); // NOI18N
        bntNew.setText("New");

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/delete_delete_deleteusers_delete_male_user_maleclient_2348.png"))); // NOI18N
        jButton2.setText("Delete");

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Save_37110.png"))); // NOI18N
        jButton3.setText("Save");

        javax.swing.GroupLayout jpButtonsLayout = new javax.swing.GroupLayout(jpButtons);
        jpButtons.setLayout(jpButtonsLayout);
        jpButtonsLayout.setHorizontalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpButtonsLayout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(bntNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jpButtonsLayout.setVerticalGroup(
            jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpButtonsLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNew)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpBackgroundEmployeeLayout = new javax.swing.GroupLayout(jpBackgroundEmployee);
        jpBackgroundEmployee.setLayout(jpBackgroundEmployeeLayout);
        jpBackgroundEmployeeLayout.setHorizontalGroup(
            jpBackgroundEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBackgroundEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpConsultEmployees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpPersonalData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpContacts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpBackgroundEmployeeLayout.createSequentialGroup()
                .addComponent(jpButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 628, Short.MAX_VALUE))
        );
        jpBackgroundEmployeeLayout.setVerticalGroup(
            jpBackgroundEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpConsultEmployees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPersonalData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContacts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jpButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollEmployee.setViewportView(jpBackgroundEmployee);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEActionPerformed
        // TODO add your handling code here:  
        jpBackgroundBnt.setVisible(true);
        btnSearchE.setVisible(true);
    }//GEN-LAST:event_btnSearchEActionPerformed

    private void bntClearSearchEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntClearSearchEActionPerformed
        // TODO add your handling code here:
        
        jpBackgroundBnt.setVisible(false);
        btnSearchE.setVisible(true);
        txtNameConsultE.setText(" ");
        
    }//GEN-LAST:event_bntClearSearchEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntClearSearchE;
    public javax.swing.JButton bntDeleteE;
    public javax.swing.JButton bntEditE;
    public javax.swing.JButton bntNew;
    public javax.swing.JButton btnSearchE;
    private javax.swing.JLabel imgPhotograph;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JComboBox<String> jCBSex;
    private javax.swing.JScrollPane jScrollEmployee;
    public javax.swing.JTable jTable1;
    public javax.swing.JPanel jpAddress;
    private javax.swing.JPanel jpBackgroundBnt;
    private javax.swing.JPanel jpBackgroundEmployee;
    private javax.swing.JPanel jpButtons;
    private javax.swing.JPanel jpConsultEmployees;
    public javax.swing.JPanel jpContacts;
    private javax.swing.JPanel jpPersonalData;
    private javax.swing.JPanel jpPhotograph;
    private javax.swing.JPanel jpTableEmployees;
    private javax.swing.JLabel lblBurgh;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCell;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblNameE;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblOffice;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRoad;
    private javax.swing.JLabel lblSearchName;
    private javax.swing.JLabel lblSelect;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblWarningEmployees;
    private javax.swing.JLabel lblYearBirth;
    private javax.swing.JScrollPane tableEmployees;
    public javax.swing.JTextField txtBurgh;
    public javax.swing.JFormattedTextField txtCPF;
    public javax.swing.JFormattedTextField txtCell;
    private javax.swing.JFormattedTextField txtCep;
    public javax.swing.JTextField txtCity;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtLastName;
    public javax.swing.JTextField txtNameConsultE;
    public javax.swing.JTextField txtNameData;
    public javax.swing.JFormattedTextField txtNumber;
    public javax.swing.JTextField txtOffice;
    public javax.swing.JFormattedTextField txtRG;
    public javax.swing.JTextField txtRoad;
    public javax.swing.JFormattedTextField txtYearBirth;
    // End of variables declaration//GEN-END:variables
}
