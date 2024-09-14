
package tp4_labprog.vistas;

import java.util.HashSet;
import tp4_labprog.Alumno;
import tp4_labprog.Materias;


public class Menu extends javax.swing.JFrame {

    public static HashSet<Alumno> alumno = new HashSet<>();
    public static HashSet<Materias> materia = new HashSet<>();
    
    public Menu(HashSet<Alumno> a, HashSet<Materias> m) {
        initComponents();
        alumno.addAll(a);
        materia.addAll(m);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inscripcion_btn = new javax.swing.JPanel();
        inscripcion_text = new javax.swing.JLabel();
        altaAlumnos_btn = new javax.swing.JPanel();
        alumnos_text = new javax.swing.JLabel();
        altaMaterias_btn = new javax.swing.JPanel();
        materias_text = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        user_img = new javax.swing.JLabel();
        sideBar_bg = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        alumno_menu = new javax.swing.JMenu();
        agregarAlumno_item = new javax.swing.JMenuItem();
        materias_menu = new javax.swing.JMenu();
        agregarMateria_item = new javax.swing.JMenuItem();
        registro_menu = new javax.swing.JMenu();
        inscribir_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inscripcion_btn.setBackground(new java.awt.Color(133, 189, 252));
        inscripcion_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inscripcion_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inscripcion_btnMouseClicked(evt);
            }
        });

        inscripcion_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inscripcion_text.setForeground(new java.awt.Color(255, 255, 255));
        inscripcion_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inscripcion_text.setText("INSCRIPCIÓN");

        javax.swing.GroupLayout inscripcion_btnLayout = new javax.swing.GroupLayout(inscripcion_btn);
        inscripcion_btn.setLayout(inscripcion_btnLayout);
        inscripcion_btnLayout.setHorizontalGroup(
            inscripcion_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inscripcion_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        inscripcion_btnLayout.setVerticalGroup(
            inscripcion_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inscripcion_btnLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(inscripcion_text)
                .addGap(33, 33, 33))
        );

        getContentPane().add(inscripcion_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 290, -1));

        altaAlumnos_btn.setBackground(new java.awt.Color(144, 197, 252));
        altaAlumnos_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        altaAlumnos_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                altaAlumnos_btnMouseClicked(evt);
            }
        });

        alumnos_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        alumnos_text.setForeground(new java.awt.Color(255, 255, 255));
        alumnos_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        alumnos_text.setText("ALTA ALUMNOS");

        javax.swing.GroupLayout altaAlumnos_btnLayout = new javax.swing.GroupLayout(altaAlumnos_btn);
        altaAlumnos_btn.setLayout(altaAlumnos_btnLayout);
        altaAlumnos_btnLayout.setHorizontalGroup(
            altaAlumnos_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaAlumnos_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(alumnos_text, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
        );
        altaAlumnos_btnLayout.setVerticalGroup(
            altaAlumnos_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaAlumnos_btnLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(alumnos_text)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(altaAlumnos_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 350, 300, -1));

        altaMaterias_btn.setBackground(new java.awt.Color(164, 200, 252));
        altaMaterias_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        altaMaterias_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                altaMaterias_btnMouseClicked(evt);
            }
        });

        materias_text.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        materias_text.setForeground(new java.awt.Color(255, 255, 255));
        materias_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materias_text.setText("ALTA MATERIAS");

        javax.swing.GroupLayout altaMaterias_btnLayout = new javax.swing.GroupLayout(altaMaterias_btn);
        altaMaterias_btn.setLayout(altaMaterias_btnLayout);
        altaMaterias_btnLayout.setHorizontalGroup(
            altaMaterias_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(materias_text, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        altaMaterias_btnLayout.setVerticalGroup(
            altaMaterias_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaMaterias_btnLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(materias_text)
                .addGap(33, 33, 33))
        );

        getContentPane().add(altaMaterias_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 290, -1));

        user_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user_name.setForeground(new java.awt.Color(255, 255, 255));
        user_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/button.png"))); // NOI18N
        user_name.setText("user");
        getContentPane().add(user_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 290, -1));

        user_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user1 (2).png"))); // NOI18N
        getContentPane().add(user_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 290, 130));

        sideBar_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/DeepBlue.png"))); // NOI18N
        sideBar_bg.setText("jLabel2");
        getContentPane().add(sideBar_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 300, 630));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 840, 630));

        alumno_menu.setText("Alumnos");

        agregarAlumno_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        agregarAlumno_item.setText("Agregar alumno");
        agregarAlumno_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarAlumno_itemActionPerformed(evt);
            }
        });
        alumno_menu.add(agregarAlumno_item);

        jMenuBar1.add(alumno_menu);

        materias_menu.setText("Materias");

        agregarMateria_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        agregarMateria_item.setText("Agregar materia");
        agregarMateria_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarMateria_itemActionPerformed(evt);
            }
        });
        materias_menu.add(agregarMateria_item);

        jMenuBar1.add(materias_menu);

        registro_menu.setText("Registro");

        inscribir_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        inscribir_item.setText("Inscribir alumno");
        inscribir_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inscribir_itemActionPerformed(evt);
            }
        });
        registro_menu.add(inscribir_item);

        jMenuBar1.add(registro_menu);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void altaMaterias_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altaMaterias_btnMouseClicked
         
        for (javax.swing.JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
        
        Alta_materias internal_frame = new Alta_materias(materia);
        escritorio.add(internal_frame);
        internal_frame.setVisible(true);
    }//GEN-LAST:event_altaMaterias_btnMouseClicked

    private void altaAlumnos_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_altaAlumnos_btnMouseClicked
        for (javax.swing.JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
        
        Alta_alumnos internal_frame = new Alta_alumnos(alumno);
        escritorio.add(internal_frame);
        internal_frame.setVisible(true);
    }//GEN-LAST:event_altaAlumnos_btnMouseClicked

    private void inscripcion_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inscripcion_btnMouseClicked
        for (javax.swing.JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
        
        Formulario_Inscripcion internal_frame = new Formulario_Inscripcion(materia, alumno);
        escritorio.add(internal_frame);
        internal_frame.setVisible(true);
    }//GEN-LAST:event_inscripcion_btnMouseClicked

    private void agregarAlumno_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarAlumno_itemActionPerformed
        for (javax.swing.JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
        
        Alta_alumnos internal_frame = new Alta_alumnos(alumno);
        escritorio.add(internal_frame);
        internal_frame.setVisible(true);
        
    }//GEN-LAST:event_agregarAlumno_itemActionPerformed

    private void agregarMateria_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarMateria_itemActionPerformed
        for (javax.swing.JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
        
        Alta_materias internal_frame = new Alta_materias(materia);
        escritorio.add(internal_frame);
        internal_frame.setVisible(true);
    }//GEN-LAST:event_agregarMateria_itemActionPerformed

    private void inscribir_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inscribir_itemActionPerformed
        for (javax.swing.JInternalFrame frame : escritorio.getAllFrames()) {
            frame.dispose();
        }
        
        Formulario_Inscripcion internal_frame = new Formulario_Inscripcion(materia, alumno);
        escritorio.add(internal_frame);
        internal_frame.setVisible(true);
    }//GEN-LAST:event_inscribir_itemActionPerformed

    
    public HashSet<Alumno> getAlumnos() {
        return alumno;
    }

    public HashSet<Materias> getMaterias() {
        return materia;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarAlumno_item;
    private javax.swing.JMenuItem agregarMateria_item;
    private javax.swing.JPanel altaAlumnos_btn;
    private javax.swing.JPanel altaMaterias_btn;
    private javax.swing.JMenu alumno_menu;
    private javax.swing.JLabel alumnos_text;
    private javax.swing.JPanel bg;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem inscribir_item;
    private javax.swing.JPanel inscripcion_btn;
    private javax.swing.JLabel inscripcion_text;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu materias_menu;
    private javax.swing.JLabel materias_text;
    private javax.swing.JMenu registro_menu;
    private javax.swing.JLabel sideBar_bg;
    private javax.swing.JLabel user_img;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
