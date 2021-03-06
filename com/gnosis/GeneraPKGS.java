/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gnosis;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;

/**
 *
 * @author GHCM-T430-01
 */
public class GeneraPKGS extends javax.swing.JFrame {
            String nom_pkg="DEFAULT";
           static ArrayList<String> auxVars = new ArrayList<String>();
           String auxFinalVarspkg="";
           String pkgs ="";
           String[] attsTabla; //guarda los atributos de la tabla dados por el usuario
    
    
    /**
     * Creates new form GeneraPKGS
     */
    public GeneraPKGS() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnGenPkgs = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMainPkg = new javax.swing.JTextPane();
        txtNom_t = new javax.swing.JTextField();
        btnGcpkg = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        txtNomPkg = new javax.swing.JTextField();
        btnSpec = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnVars = new javax.swing.JButton();
        txtNomVar = new javax.swing.JTextField();
        cbbxES = new javax.swing.JComboBox<>();
        cbbxTipo = new javax.swing.JComboBox<>();
        txtFVars = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAttbts = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCopy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Genera pkg y cursor");

        jLabel2.setText("Nombre tabla principal");

        btnGenPkgs.setText("Generar Cursor");
        btnGenPkgs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenPkgsActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtMainPkg);

        btnGcpkg.setText("BODY PKG");
        btnGcpkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGcpkgActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre Pkg: ");

        btnSpec.setText("SPEC PKG");
        btnSpec.setToolTipText("");
        btnSpec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpecActionPerformed(evt);
            }
        });

        jLabel4.setText("Variables PKG:");

        jLabel5.setText("I/O");

        jLabel6.setText("Tipo");

        btnVars.setText("Add...");
        btnVars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVarsActionPerformed(evt);
            }
        });

        cbbxES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IN", "OUT" }));
        cbbxES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbxESActionPerformed(evt);
            }
        });

        cbbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VARCHAR2", "NUMBER", "DATE", "CHAR", "LONG" }));

        jLabel7.setText("Attbts/Alias Tabla (xml)");

        txtAttbts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAttbtsActionPerformed(evt);
            }
        });

        jLabel8.setText("Separados por \" , \"");

        btnCopy.setText("Copiar");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addGap(52, 52, 52))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(124, 124, 124)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(cbbxES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(cbbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnVars)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNom_t, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(122, 122, 122)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAttbts, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomVar, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(txtFVars))
                        .addGap(18, 18, 18)
                        .addComponent(btnGenPkgs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSpec, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnGcpkg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addGap(24, 24, 24)
                        .addComponent(txtNomPkg, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btnCopy, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNomPkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNom_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtAttbts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbxES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVars))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFVars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenPkgs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGcpkg)
                    .addComponent(btnSpec))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCopy, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenPkgsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenPkgsActionPerformed
        // TODO add your handling code here:
        String n_tabla="";
        String params_pkg="";
        String params_cursor="";
        
        String xml="";
        xml=generaXML();
        
        n_tabla=this.txtNom_t.getText().toString().trim();
        pkgs="        " +
                        "         -- definicion de funciones y variables\n" +
                        "         CURSOR get_doc_info \n" +
                        "         IS\n" +
                        "                select * from "+ n_tabla +"\n" +
                        "                where 1=1 \n" +
                        "                and rownum<10;                    /*Eliminar tras la primera ejecución*/\n" +
                        "                \n" +
                        "         doc_info_rec get_doc_info%ROWTYPE;\n" +
                        "        begin\n" +
                        "fnd_file.put_line (fnd_file.LOG,'Ejecucion de Reporte aprobado' ); --ADDED\n"+
				"p_output('<REPORTE>');\n"+
                                "--p_output('<MON_FAC_P>'||NVL(p_mon_fac,'EUR/GBP')||'</MON_FAC_P>');\n"+
                        "                         OPEN get_doc_info();\n" +
                        "                         LOOP\n" +
                        "                         FETCH get_doc_info INTO doc_info_rec;\n" +
                        "                         EXIT WHEN get_doc_info%NOTFOUND;\n" +
                        "                          ---Comienza la escritura de la plantilla\n" +
"							 p_output('<RECORD>');\n" +
                                                         xml+
"							 p_output('</RECORD>');\n" +
"						---Finaliza la escritura de la plantilla"+
                        "                            END LOOP;\n" +
                        "                         CLOSE get_doc_info;\n" +
                        "          p_output('</REPORTE>');\n" +
                        "        END LOOP;\n";
                                
                                this.txtMainPkg.setText(pkgs);
                                
    }//GEN-LAST:event_btnGenPkgsActionPerformed
public String generaCursor(){
     String n_tabla="";
        String params_pkg="";
        String params_cursor="";
        
        String xml="";
        xml=generaXML();
        
        n_tabla=this.txtNom_t.getText().toString().trim();
        pkgs="        " +
                        "         -- definicion de funciones y variables\n" +
                        "         CURSOR get_doc_info \n" +
                        "         IS\n" +
                        "                select * from "+ n_tabla +"\n" +
                        "                where 1=1 \n" +
                        "                and rownum<10;                    /*Eliminar tras la primera ejecución*/\n" +
                        "                \n" +
                        "         doc_info_rec get_doc_info%ROWTYPE;\n" +
                        "        begin\n" +
                        "fnd_file.put_line (fnd_file.LOG,'Ejecucion de Reporte aprobado' ); --ADDED\n"+
				"p_output('<REPORTE>');\n"+
                                "--p_output('<MON_FAC_P>'||NVL(p_mon_fac,'EUR/GBP')||'</MON_FAC_P>');\n"+
                        "                         OPEN get_doc_info();\n" +
                        "                         LOOP\n" +
                        "                         FETCH get_doc_info INTO doc_info_rec;\n" +
                        "                         EXIT WHEN get_doc_info%NOTFOUND;\n" +
                        "                          ---Comienza la escritura de la plantilla\n" +
"							 p_output('<RECORD>');\n" +
                                                         xml+
"							 p_output('</RECORD>');\n" +
"						---Finaliza la escritura de la plantilla"+
                        "                            END LOOP;\n" +
                        "                         CLOSE get_doc_info;\n" +
                        "          p_output('</REPORTE>');\n" +
                        "        END LOOP;\n";
                                
                             //   this.txtMainPkg.setText(pkgs);
    return pkgs;
}
    public String generaXML(){
        String attbtsTabla="";
        attbtsTabla=this.txtAttbts.getText().toString();
        
        String cadenafinalXML="";
        String delimiter = ",";
        String auxAttsTablaFinal="";
        attsTabla = attbtsTabla.split(delimiter);
        for(int i =0; i < attsTabla.length ; i++)
        {
             //p_output('<U_OPER>'|| replace_char_esp(doc_info_rec.UNIDAD_OPERATIVA)||'</U_OPER>');
            String myParamAux="";
            myParamAux=attsTabla[i];
            myParamAux=myParamAux.toUpperCase();
            // p_output('<U_OPER>'|| replace_char_esp(doc_info_rec.UNIDAD_OPERATIVA)||'</U_OPER>');
           //System.out.println("P_OUTPUT('<"+myParamAux+">'|| replace_char_esp(doc_info_rec."+myParamAux+")||'</"+myParamAux+">'\n");
           cadenafinalXML=cadenafinalXML+"\t\tP_OUTPUT('<"+myParamAux+">'|| replace_char_esp(doc_info_rec."+myParamAux+")||'</"+myParamAux+">');\n";
        }
        System.out.println(cadenafinalXML);
        return cadenafinalXML;
    }
    
    
    private void btnGcpkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGcpkgActionPerformed
        // TODO add your handling code here:
        
        nom_pkg=this.txtNomPkg.getText();
        String pkgMain="";
        String attbtsTabla="";
        attbtsTabla=this.txtAttbts.getText().toString();
        
        pkgs=generaCursor();
        String delimiter = ",";
        String auxAttsTablaFinal="";
        attsTabla = attbtsTabla.split(delimiter);
        for(int i =0; i < attsTabla.length ; i++)
        {
           System.out.println(attsTabla[i]+"\n"); 
            String aux1=attsTabla[i];
            int auxcont=attsTabla.length-1;
           if (i!=auxcont){
              
              auxAttsTablaFinal=auxAttsTablaFinal.toUpperCase()+aux1.toUpperCase()+","; 
           }else{
               auxAttsTablaFinal=auxAttsTablaFinal.toUpperCase()+aux1.toUpperCase(); 
           }
        }
        System.out.println(auxAttsTablaFinal);

        
        pkgMain="CREATE OR REPLACE PACKAGE BODY " +nom_pkg+"\n" +
                        "AS\n" +
                        "\n" +
                        "/**_____________________________________________\n" +
                        "Cliente: Aeromexico\n" +
                        "Proveedor: GnosisHCM\n" +
                        "Desarrollador: \n" +
                        "Fecha: \n" +
                        "Email: \n" +
                        "Generado automaticamente por: GeneradorScriptsGnosis\n" +
                        "--\n" +
                        "____________________________________________**/\n" +
                        "\n" +
                        "FUNCTION replace_char_esp(p_cadena IN varchar2)\n" +
                        " RETURN varchar2 IS\n" +
                        " v_cadena varchar2(4000);\n" +
                        " BEGIN\n" +
                        " v_cadena := REPLACE(p_cadena, CHR(38), CHR(38) || 'amp;');\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50081), CHR(38)||'#225;'); /* v_cadena := REPLACE(v_cadena, CHR(50081), 'HR(38)||'acute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50089), CHR(38)||'#233;'); /* v_cadena := REPLACE(v_cadena, CHR(50089), CHR(38)||'acute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50093), CHR(38)||'#237;'); /* v_cadena := REPLACE(v_cadena, CHR(50093), CHR(38)||'iacute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50099), CHR(38)||'#243;'); /* v_cadena := REPLACE(v_cadena, CHR(50099), cHR(38)||'oacute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50106), CHR(38)||'#250;'); /* v_cadena := REPLACE(v_cadena, CHR(50106), CHR(38)||'uacute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50049), CHR(38)||'#193;'); /* v_cadena := REPLACE(v_cadena, CHR(50049), CHR(38)||'Aacute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50057), CHR(38)||'#201;'); /* v_cadena := REPLACE(v_cadena, CHR(50057), CHR(38)||'Eacute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50061), CHR(38)||'#205;'); /* v_cadena := REPLACE(v_cadena, CHR(50061), CHR(38)||'Iacute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50067), CHR(38)||'#211;'); /* v_cadena := REPLACE(v_cadena, CHR(50067), CHR(38)||'Oacute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50074), CHR(38)||'#218;'); /* v_cadena := REPLACE(v_cadena, CHR(50074), CHR(38)||'Uacute;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50065), CHR(38)||'#209;'); /* v_cadena := REPLACE(v_cadena, CHR(50065), CHR(38)||'Ntilde;'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50065), CHR(38)||'#241;'); /* v_cadena := REPLACE(v_cadena, CHR(50097), CHR(38)||'ntilde'); */\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(49844), '');\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50090), '');\n" +
                        " v_cadena := REPLACE(v_cadena, CHR(50056), 'E');\n" +
                        " RETURN v_cadena;\n" +
                        " END replace_char_esp;\n" +
                        "\n" +
                        " PROCEDURE p_output (pls_msg IN varchar2)\n" +
                        " IS\n" +
                        " BEGIN\n" +
                        " /** WRITE TO THE CONCURRENT REQUEST OUTPUT **/\n" +
                        " fnd_file.put_line (fnd_file.output, pls_msg);\n" +
                        " DBMS_OUTPUT.put_line (pls_msg);\n" +
                        " EXCEPTION\n" +
                        " WHEN OTHERS\n" +
                        " THEN\n" +
                        " RETURN;\n" +
                        " END p_output;\n" +
                        "\n" +
                        " PROCEDURE p_log (pls_msg IN varchar2)\n" +
                        " IS\n" +
                        " BEGIN\n" +
                        " /** WRITE TO THE CONCURRENT REQUEST LOG **/\n" +
                        " fnd_file.put_line (fnd_file.LOG, pls_msg);\n" +
                        " DBMS_OUTPUT.put_line (pls_msg);\n" +
                        " EXCEPTION\n" +
                        " WHEN OTHERS\n" +
                        " THEN\n" +
                        " RETURN;\n" +
                        " END p_log;\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        "\n" +
                        " PROCEDURE main (pso_errmsg OUT varchar2,\n" +
                        " pso_errcod OUT varchar2,"+auxFinalVarspkg+"\n" +
                        " ) IS\n" +
                        " ----Cursor que obtiene la informacion del documento\n" +
                        pkgs +" "+ 
                        " EXCEPTION\n" +
                        " WHEN INVALID_CURSOR\n" +
                        " THEN\n" +
                        " pso_errmsg := 'Exception no_data_found: ' || SQLERRM || ',' || SQLCODE;\n" +
                        " pso_errcod := '2';\n" +
                        " fnd_file.put_line(fnd_file.LOG,'No data found: '||SQLERRM);\n" +
                        " WHEN VALUE_ERROR\n" +
                        " THEN\n" +
                        " pso_errmsg := 'Exception no_data_found: ' || SQLERRM || ',' || SQLCODE;\n" +
                        " pso_errcod := '2';\n" +
                        " fnd_file.put_line(fnd_file.LOG,'No data found: '||SQLERRM);\n" +
                        " WHEN TOO_MANY_ROWS\n" +
                        " THEN\n" +
                        " pso_errmsg := 'Exception no_data_found: ' || SQLERRM || ',' || SQLCODE;\n" +
                        " pso_errcod := '2';\n" +
                        " fnd_file.put_line(fnd_file.LOG,'No data found: '||SQLERRM);\n" +
                        " WHEN INVALID_NUMBER\n" +
                        " THEN\n" +
                        " pso_errmsg := 'Exception no_data_found: ' || SQLERRM || ',' || SQLCODE;\n" +
                        " pso_errcod := '2';\n" +
                        " fnd_file.put_line(fnd_file.LOG,'No data found: '||SQLERRM);\n" +
                        " WHEN DUP_VAL_ON_INDEX\n" +
                        " THEN\n" +
                        " pso_errmsg := 'Exception no_data_found: ' || SQLERRM || ',' || SQLCODE;\n" +
                        " pso_errcod := '2';\n" +
                        " fnd_file.put_line(fnd_file.LOG,'No data found: '||SQLERRM);\n" +
                        " WHEN OTHERS\n" +
                        " THEN\n" +
                        " pso_errmsg := 'Exception others: ' || SQLERRM || ',' || SQLCODE;\n" +
                        " pso_errcod := '2';\n" +
                        " fnd_file.put_line(fnd_file.LOG,'Others: '||SQLERRM);\n" +
                        " END main;\n" +
                        "\n" +
                        "END "+nom_pkg+";\n" +
                        "";
        this.txtMainPkg.setText(pkgMain);
                
    }//GEN-LAST:event_btnGcpkgActionPerformed

    private void btnSpecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpecActionPerformed
        // TODO add your handling code here:
        String specPkg="";
         nom_pkg=this.txtNomPkg.getText();
        specPkg="CREATE OR REPLACE PACKAGE "+ nom_pkg +" AS \n" +
                "   /**_____________________________________________\n" +
                "   Cliente: Aeromexico\n" +
                "   Proveedor: GnosisHCM\n" +
                "   Gerado Automaticamente  por GeneradorScriptsGnosis o\n" +
                "   Fecha:_________\n" +
                "   Email: ______________\n" +
                "   ____________________________________________**/\n" +
                "   PROCEDURE main (pso_errmsg        OUT VARCHAR2\n" +
                "                  ,pso_errcod        OUT VARCHAR2\n" +
                "                  ,"+auxFinalVarspkg+" );\n" +
                "\n" +
                "\n" +
                "END "+nom_pkg+";";
        this.txtMainPkg.setText(specPkg);
    }//GEN-LAST:event_btnSpecActionPerformed

    private void btnVarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVarsActionPerformed
        // TODO add your handling code here:
        
        
        String ESvar =this.cbbxES.getSelectedItem().toString();
        String tipoVar=this.cbbxTipo.getSelectedItem().toString();
        String nomVar=this.txtNomVar.getText().toString();
        //System.out.println(nomVar+" "+ESvar+" "+tipoVar);
        auxVars.add(nomVar+" "+ESvar+" "+tipoVar);

        auxFinalVarspkg="";
        for(int x=0;x<auxVars.size();x++) {
                //System.out.print(auxVars.get(x)+",");
                auxFinalVarspkg=auxFinalVarspkg+auxVars.get(x)+", ";
              }
        auxFinalVarspkg=auxFinalVarspkg.trim();
       System.out.println("Recortada: "+ auxFinalVarspkg.substring(0,auxFinalVarspkg.length()-1));
        auxFinalVarspkg = auxFinalVarspkg.substring(0,auxFinalVarspkg.length()-1);
        this.txtNomVar.setText("");
        System.out.println(auxFinalVarspkg);
        this.txtFVars.setText(auxFinalVarspkg);
    }//GEN-LAST:event_btnVarsActionPerformed

    private void cbbxESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbxESActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbxESActionPerformed

    private void txtAttbtsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAttbtsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAttbtsActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        // TODO add your handling code here:
        String papelera= this.txtMainPkg.getText().toString();
        //----------
       
        StringSelection stringSelection = new StringSelection(papelera);       //creamos objeto y ejecutampos metodo le pasamos nuestra var auxiliar
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard(); // comunicacion con el sistema operativo
        clpbrd.setContents(stringSelection, null); // metdo del copiado
        
    }//GEN-LAST:event_btnCopyActionPerformed
                
    
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
            java.util.logging.Logger.getLogger(GeneraPKGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneraPKGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneraPKGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneraPKGS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneraPKGS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopy;
    private javax.swing.JToggleButton btnGcpkg;
    private javax.swing.JButton btnGenPkgs;
    private javax.swing.JButton btnSpec;
    private javax.swing.JButton btnVars;
    private javax.swing.JComboBox<String> cbbxES;
    private javax.swing.JComboBox<String> cbbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAttbts;
    private javax.swing.JTextField txtFVars;
    private javax.swing.JTextPane txtMainPkg;
    private javax.swing.JTextField txtNomPkg;
    private javax.swing.JTextField txtNomVar;
    private javax.swing.JTextField txtNom_t;
    // End of variables declaration//GEN-END:variables
}
