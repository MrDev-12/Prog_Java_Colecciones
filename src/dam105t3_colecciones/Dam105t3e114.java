package dam105t3_colecciones;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.DefaultListModel;

public class Dam105t3e114 extends javax.swing.JFrame {

    DefaultListModel modeloPais;

    TreeMap<String, String> paises = new TreeMap<>();

    public Dam105t3e114() {

        initComponents();
        

        // Config Ventana
        setLocationRelativeTo(null);
        

        // Config Lista
        modeloPais = new DefaultListModel();

        listaPais.setModel(modeloPais);
        

        // Mostrar Paises
        
        tratFichero();
        
        for(String nom_pais : paises.keySet()) {
            
            modeloPais.addElement(nom_pais);
            
        }
        
    }

    private void tratFichero() {

        String linea = "";
        
        try (
            
            FileInputStream fis = new FileInputStream("ficheros/paises2019.csv");
                
            InputStreamReader isr = new InputStreamReader(fis, "ISO-8859-1");
            
            Scanner sc = new Scanner(isr);
            
            ) {
            
                while (sc.hasNextLine()) {

                    linea = sc.nextLine();

                    Scanner scLinea = new Scanner(linea);

                    //Indicamos cual es el caracter utilizado para saparar los campos
                    scLinea.useDelimiter(";");

                    //Preguntamos por si no viene bien formado o sin datos
                    if (scLinea.hasNext()) {

                        String pais = scLinea.next();

                        String capital = scLinea.next();

                        String poblacion = scLinea.next();
                        
                        paises.put(pais, (capital.concat(" ")).concat(poblacion));

                    }
                }
            
        } catch (IOException ex) {
            
            System.err.printf("%nError:%s", ex.getMessage());
            
        }

    }

    // NO MODIFICAR!
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        listaPais_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPais = new javax.swing.JList<>();
        Capital_label = new javax.swing.JLabel();
        Capital = new javax.swing.JTextField();
        Poblacion_label = new javax.swing.JLabel();
        Poblacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaPais_label.setText("Elige un país de la lista:");

        listaPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPaisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaPais);

        Capital_label.setText("Capital:");

        Poblacion_label.setText("Población (datos de 2019)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Poblacion_label)
                    .addComponent(listaPais_label)
                    .addComponent(Capital_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(Capital)
                    .addComponent(Poblacion))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(listaPais_label)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Capital_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Capital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(Poblacion_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Poblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPaisMouseClicked
        
        String nom_pais = listaPais.getSelectedValue();
        
        String capital = paises.get(nom_pais).substring(0, paises.get(nom_pais).indexOf(" "));
        
        String poblacion = paises.get(nom_pais).substring(paises.get(nom_pais).indexOf(" ") + 1);
        
        Capital.setText(capital);
        
        Poblacion.setText(poblacion);
        
    }//GEN-LAST:event_listaPaisMouseClicked

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
            java.util.logging.Logger.getLogger(Dam105t3e114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dam105t3e114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dam105t3e114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dam105t3e114.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dam105t3e114().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Capital;
    private javax.swing.JLabel Capital_label;
    private javax.swing.JTextField Poblacion;
    private javax.swing.JLabel Poblacion_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaPais;
    private javax.swing.JLabel listaPais_label;
    // End of variables declaration//GEN-END:variables
}
