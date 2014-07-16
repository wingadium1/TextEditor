/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package texteditor;

import com.aspose.words.FileFormatInfo;
import com.aspose.words.FileFormatUtil;
import com.aspose.words.LoadFormat;
import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.rtf.RTFEditorKit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 *
 * @author mk
 */
public class MainEditor extends javax.swing.JFrame {

    RTFEditorKit kit=new RTFEditorKit();
    
    public UndoAction undoAction=new UndoAction();
    public RedoAction redoAction=new RedoAction();
    public UndoManager undo=new UndoManager();
	
    String[] fontStyleStrings = GraphicsEnvironment.
            getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    String[] fontSizeStrings={"8","9","10","11","12","14","16","18",
            "20","24","30","36","48","54","72"};
    String[] fontColorStrings={"black","blue","cyan","dark gray","gray",
            "light gray","green","orange","magenta","pink","red","yellow","white"};
    final String DEFAULT_FILE ="Untitled Document";
    String filename;
    FileFormatInfo info;
    /**
     * Creates new form MainEditor
     */
    public MainEditor() {
        initComponents();
        
        setBIUActions();
        Undo.setAction(undoAction);
        Undo.setAccelerator(javax.swing.KeyStroke.
                getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        
        Redo.setAction(redoAction);
        Redo.setAccelerator(javax.swing.KeyStroke.
                getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        
        this.setLocation(200, 50);
        jTextPane1.getDocument().addUndoableEditListener(undo);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        ControlPanel = new javax.swing.JPanel();
        Save = new javax.swing.JButton();
        New = new javax.swing.JButton();
        Open = new javax.swing.JButton();
        cb_font = new javax.swing.JComboBox();
        cb_size = new javax.swing.JComboBox();
        cb_color = new javax.swing.JComboBox();
        Bold = new javax.swing.JButton();
        Italics = new javax.swing.JButton();
        Underline = new javax.swing.JButton();
        btn_undo = new javax.swing.JButton();
        btn_redo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        newMenuItem = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        quitMenuItem = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        Undo = new javax.swing.JMenuItem();
        Redo = new javax.swing.JMenuItem();
        Cut = new javax.swing.JMenuItem();
        Copy = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        Delete = new javax.swing.JMenuItem();
        Select_all = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/save.png"))); // NOI18N
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        New.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/new_page.png"))); // NOI18N
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });

        Open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/open.png"))); // NOI18N
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });

        cb_font.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aharoni", "Andalus", "Angsana New", "AngsanaUPC", "Aparajita", "Arabic Typesetting", "Arial", "Arial Black", "Arial Narrow", "Arial Unicode MS", "Batang", "BatangChe", "Book Antiqua", "Bookman Old Style", "Bookshelf Symbol 7", "Browallia New", "BrowalliaUPC", "Calibri", "Cambria", "Cambria Math", "Candara", "Century", "Century Gothic", "Comic Sans MS", "Consolas", "Constantia", "Corbel", "Cordia New", "CordiaUPC", "Courier New", "DaunPenh", "David", "DFKai-SB", "Dialog", "DialogInput", "DilleniaUPC", "DokChampa", "Dotum", "DotumChe", "Ebrima", "Estrangelo Edessa", "EucrosiaUPC", "Euphemia", "FangSong", "Franklin Gothic Medium", "FrankRuehl", "FreesiaUPC", "Gabriola", "Garamond", "Gautami", "Georgia", "Gisha", "Gulim", "GulimChe", "Gungsuh", "GungsuhChe", "Impact", "IrisUPC", "Iskoola Pota", "JasmineUPC", "KaiTi", "Kalinga", "Kartika", "Khmer UI", "KodchiangUPC", "Kokila", "Lao UI", "Latha", "Leelawadee", "Levenim MT", "LilyUPC", "Lucida Bright", "Lucida Console", "Lucida Sans", "Lucida Sans Typewriter", "Lucida Sans Unicode", "Malgun Gothic", "Mangal", "Marlett", "Meiryo", "Meiryo UI", "Microsoft Himalaya", "Microsoft JhengHei", "Microsoft New Tai Lue", "Microsoft PhagsPa", "Microsoft Sans Serif", "Microsoft Tai Le", "Microsoft Uighur", "Microsoft YaHei", "Microsoft Yi Baiti", "MingLiU", "MingLiU-ExtB", "MingLiU_HKSCS", "MingLiU_HKSCS-ExtB", "Miriam", "Miriam Fixed", "Mongolian Baiti", "Monospaced", "Monotype Corsiva", "MoolBoran", "MS Gothic", "MS Mincho", "MS PGothic", "MS PMincho", "MS Reference Sans Serif", "MS Reference Specialty", "MS UI Gothic", "MT Extra", "MV Boli", "Narkisim", "NSimSun", "Nyala", "Palatino Linotype", "Plantagenet Cherokee", "PMingLiU", "PMingLiU-ExtB", "Raavi", "Rod", "Sakkal Majalla", "SansSerif", "Segoe Print", "Segoe Script", "Segoe UI", "Segoe UI Light", "Segoe UI Semibold", "Segoe UI Symbol", "Serif", "Shonar Bangla", "Shruti", "SimHei", "Simplified Arabic", "Simplified Arabic Fixed", "SimSun", "SimSun-ExtB", "Sylfaen", "Symbol", "Tahoma", "Times New Roman", "Traditional Arabic", "Trebuchet MS", "Tunga", "Utsaah", "Vani", "Verdana", "Vijaya", "Vrinda", "Webdings", "Wingdings", "Wingdings 2", "Wingdings 3" }));
        cb_font.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_fontActionPerformed(evt);
            }
        });

        cb_size.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "8", "9", "10", "11", "12", "14", "16", "18", "20", "24", "30", "36", "48", "54", "72" }));
        cb_size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_sizeActionPerformed(evt);
            }
        });

        cb_color.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "black", "blue", "cyan", "dark gray", "gray", "light gray", "green", "orange", "magenta", "pink", "red", "yellow", "white" }));
        cb_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_colorActionPerformed(evt);
            }
        });

        Bold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/bold.png"))); // NOI18N
        Bold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoldActionPerformed(evt);
            }
        });

        Italics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/italic.png"))); // NOI18N

        Underline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/underline.png"))); // NOI18N

        btn_undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/undo.png"))); // NOI18N
        btn_undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_undoActionPerformed(evt);
            }
        });

        btn_redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/redo.png"))); // NOI18N
        btn_redo.setToolTipText("");
        btn_redo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_redoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Open)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(New)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_undo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_redo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_font, 0, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_color, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bold)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Italics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Underline)
                .addContainerGap())
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Open, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(New, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_size, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_font, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_undo)
                        .addComponent(btn_redo))
                    .addComponent(Italics)
                    .addComponent(Underline)
                    .addComponent(Bold))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jTextPane1);

        File.setMnemonic('F');
        File.setText("File");

        newMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/new_page.png"))); // NOI18N
        newMenuItem.setMnemonic('N');
        newMenuItem.setText("New");
        newMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMenuItemActionPerformed(evt);
            }
        });
        File.add(newMenuItem);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/open.png"))); // NOI18N
        open.setMnemonic('O');
        open.setText("Open");
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        File.add(open);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/save.png"))); // NOI18N
        saveMenuItem.setMnemonic('S');
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        File.add(saveMenuItem);

        saveAsMenuItem.setText("Save As");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        File.add(saveAsMenuItem);

        quitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        quitMenuItem.setMnemonic('Q');
        quitMenuItem.setText("Quit");
        quitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitMenuItemActionPerformed(evt);
            }
        });
        File.add(quitMenuItem);

        jMenuBar1.add(File);

        Edit.setMnemonic('E');
        Edit.setText("Edit");

        Undo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        Undo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/undo.png"))); // NOI18N
        Undo.setText("Undo");
        Undo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoActionPerformed(evt);
            }
        });
        Edit.add(Undo);

        Redo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        Redo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/redo.png"))); // NOI18N
        Redo.setText("Redo");
        Edit.add(Redo);

        Cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        Cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/cut.png"))); // NOI18N
        Cut.setText("Cut");
        Edit.add(Cut);

        Copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Copy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/copy.png"))); // NOI18N
        Copy.setText("Copy");
        Copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyActionPerformed(evt);
            }
        });
        Edit.add(Copy);

        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        Paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/paste.png"))); // NOI18N
        Paste.setText("Paste");
        Edit.add(Paste);

        Delete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/texteditor/delete.png"))); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        Edit.add(Delete);

        Select_all.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        Select_all.setText("Select all");
        Select_all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_allActionPerformed(evt);
            }
        });
        Edit.add(Select_all);

        jMenuBar1.add(Edit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(ControlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setBIUActions(){
        UAction();
        IAction();
        BAction();
    }
                
    private void UAction(){   
        javax.swing.Action underlineAction=new StyledEditorKit.UnderlineAction();
        underlineAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control U"));
        Underline.getActionMap().put("", underlineAction);
        ImageIcon Underlineic = new ImageIcon((getClass().
                getClassLoader().getResource("texteditor/underline.png")));
        Underline.setIcon(Underlineic);
        Underline.setText(null);
        
        Underline.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) underlineAction.getValue(Action.ACCELERATOR_KEY), "");
    }    
    private void IAction(){    
        javax.swing.Action italicAction=new StyledEditorKit.ItalicAction();
        italicAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control I"));
        Italics.getActionMap().put("", italicAction);
        ImageIcon Italicic= new ImageIcon((getClass().getClassLoader().
                getResource("texteditor/italic.png")));
        Italics.setIcon(Italicic);
        Italics.setText(null);
        
        Italics.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) italicAction.getValue(Action.ACCELERATOR_KEY), "");
    }
    
    private void BAction(){
        javax.swing.Action boldAction=new StyledEditorKit.BoldAction();
        boldAction.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke("control B"));
        Bold.getActionMap().put("", boldAction);
        ImageIcon boldic;boldic = new ImageIcon((getClass().
                getClassLoader().getResource("texteditor/bold.png")));
        Bold.setIcon(boldic);
        Bold.setText(null);
        Bold.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) boldAction.getValue(Action.ACCELERATOR_KEY), "");
    }
    
    private void saveAs(){
        JFileChooser fileChooser=new JFileChooser();
        int returnValue=fileChooser.showSaveDialog(null);
        if(returnValue==JFileChooser.APPROVE_OPTION){
            try {
                
                File file=fileChooser.getSelectedFile();
                FileOutputStream fo=null;
                        fo = new FileOutputStream(file);
                switch (info.getLoadFormat()){
                    case (LoadFormat.RTF):
                        
                        kit.write(fo,jTextPane1.getDocument(),0,jTextPane1.getDocument().getLength());
                    default:
                        new StyledEditorKit().write(fo,jTextPane1.getDocument(),
                                0,jTextPane1.getDocument().getLength());
                        
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainEditor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException | BadLocationException ex) {
                Logger.getLogger(MainEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
        
               
                    
            
                
        
    
    private void open(){
        FileInputStream fi = null;
        
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
        try {
            jTextPane1.setText("");
            java.io.File file = fileChooser.getSelectedFile();
            filename = file.getPath();
            info = FileFormatUtil.detectFileFormat(filename);
            fi=new FileInputStream(file);
                       
            switch (info.getLoadFormat())
            {
                case LoadFormat.RTF:
                    /*
                    file là RTF
                    */
                    jTextPane1.setEditorKit(kit);
                    kit.read(fi,jTextPane1.getDocument(),0);
                    fi.close();
                    this.setTitle(file.getName()+"-Rich Text Editor");
                    break;
                default:
                    /*
                        Trường hợp còn lại không phải là PTF
                        */
                    String s;
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        StyledDocument doc = jTextPane1.getStyledDocument();
                        while ((s = reader.readLine())!=null){
                            doc.insertString(doc.getLength(),s+"\n", null);
                        }
                        reader.close();
                }
            } catch (Exception ex) {
                Logger.getLogger(MainEditor.class.getName()).log(Level.SEVERE, null, ex);
            }
                
                
            }
        
        
        
    }
    
    private void newpage(){
        
        new MainEditor().setVisible(true);
        this.setVisible(false);
        this.dispose();
    }
    
    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
        // TODO add your handling code here:
        open();
    }//GEN-LAST:event_openActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void quitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quitMenuItemActionPerformed

    private void UndoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UndoActionPerformed

    private void CopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CopyActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed

    private void Select_allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_allActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Select_allActionPerformed

    private void cb_fontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_fontActionPerformed
        // TODO add your handling code here:
        for (String fontStyleString : fontStyleStrings) {
            if (fontStyleStrings[cb_font.getSelectedIndex()].equals(fontStyleString)) {
                javax.swing.Action action = new StyledEditorKit.
                        FontFamilyAction(fontStyleString, fontStyleString);
                action.actionPerformed(null);
                break;
            }
        }
    }//GEN-LAST:event_cb_fontActionPerformed

    private void cb_sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_sizeActionPerformed
        // TODO add your handling code here:
        for (String fontSizeString : fontSizeStrings) {
            if (fontSizeStrings[cb_size.getSelectedIndex()].equals(fontSizeString)) {
                String size = fontSizeString;
                int value = Integer.valueOf(fontSizeString);
                javax.swing.Action action=new StyledEditorKit.FontSizeAction(size,value);
                action.actionPerformed(null);
                break;
            }
        }
    }//GEN-LAST:event_cb_sizeActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        // TODO add your handling code here:
        saveAs();
    }//GEN-LAST:event_SaveActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        // TODO add your handling code here:
        open();
    }//GEN-LAST:event_OpenActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        // TODO add your handling code here:
        saveAs();
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        // TODO add your handling code here:]
        newpage();
    }//GEN-LAST:event_NewActionPerformed

    private void newMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMenuItemActionPerformed
        // TODO add your handling code here:
        newpage();
    }//GEN-LAST:event_newMenuItemActionPerformed

    private void cb_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_colorActionPerformed
        // TODO add your handling code here:
        switch (fontColorStrings[cb_color.getSelectedIndex()]) {
            case "black":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("black",Color.black);
                    action.actionPerformed(null);
                    break;
                }
            case "blue":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("blue",Color.blue);
                    action.actionPerformed(null);
                    break;
                }
            case "cyan":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("cyan",Color.cyan);
                    action.actionPerformed(null);
                    break;
                }
            case "dark gray":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("dark gray",Color.darkGray);
                    action.actionPerformed(null);
                    break;
                }
            case "gray":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("gray",Color.gray);
                    action.actionPerformed(null);
                    break;
                }
            case "light gray":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("light gray",Color.lightGray);
                    action.actionPerformed(null);
                    break;
                }
            case "green":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("green",Color.green);
                    action.actionPerformed(null);
                    break;
                }
            case "orange":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("orange",Color.orange);
                    action.actionPerformed(null);
                    break;
                }
            case "magenta":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("magenta",Color.magenta);
                    action.actionPerformed(null);
                    break;
                }
            case "pink":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("pink",Color.pink);
                    action.actionPerformed(null);
                    break;
                }
            case "red":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("red",Color.red);
                    action.actionPerformed(null);
                    break;
                }
            case "yellow":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("yellow",Color.yellow);
                    action.actionPerformed(null);
                    break;
                }
            case "white":
                {
                    javax.swing.Action action=new StyledEditorKit.ForegroundAction("white",Color.white);
                    action.actionPerformed(null);
                    break;
                }
        }
    }//GEN-LAST:event_cb_colorActionPerformed

    private void BoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BoldActionPerformed

    private void btn_undoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_undoActionPerformed
        // TODO add your handling code here:
        undo.undo();
    }//GEN-LAST:event_btn_undoActionPerformed

    private void btn_redoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_redoActionPerformed
        // TODO add your handling code here:
        undo.redo();
    }//GEN-LAST:event_btn_redoActionPerformed

    class UndoAction extends AbstractAction{
        public UndoAction(){
            super("Undo");
            setEnabled(true);
        }

        @Override
        public void actionPerformed(ActionEvent ae){
            try{
                undo.undo();
            }catch(CannotUndoException e){
                System.out.println("Unable to Undo"+ e);
            }
            updateUndoState();
            redoAction.updateRedoState();
            }

            protected void updateUndoState(){
                putValue(Action.NAME,undo.getUndoPresentationName());
            }
    }

    class RedoAction extends AbstractAction{
        public RedoAction(){
            super("Redo");
            setEnabled(true);
        }

        @Override
        public void actionPerformed(ActionEvent ae){
            try{
                undo.redo();
            }catch(CannotRedoException e){
                System.out.println("Unable to Redo"+ e);
            }
            undoAction.updateUndoState();
            updateRedoState();
         }

        protected void updateRedoState(){
            putValue(Action.NAME,undo.getRedoPresentationName());
        }
    }
    
    protected class UndoListener implements UndoableEditListener{
        @Override
        public void undoableEditHappened(UndoableEditEvent e){
            undo.addEdit(e.getEdit());
            undoAction.updateUndoState();
            redoAction.updateRedoState();
        }
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainEditor().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bold;
    private javax.swing.JPanel ControlPanel;
    private javax.swing.JMenuItem Copy;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem Delete;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenu File;
    private javax.swing.JButton Italics;
    private javax.swing.JButton New;
    private javax.swing.JButton Open;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JMenuItem Redo;
    private javax.swing.JButton Save;
    private javax.swing.JMenuItem Select_all;
    private javax.swing.JButton Underline;
    private javax.swing.JMenuItem Undo;
    private javax.swing.JButton btn_redo;
    private javax.swing.JButton btn_undo;
    private javax.swing.JComboBox cb_color;
    private javax.swing.JComboBox cb_font;
    private javax.swing.JComboBox cb_size;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JMenuItem newMenuItem;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem quitMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables
}
