package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import dao.CrudStudent;
import dao.SingletonConnection;
import metier.student;


import java.awt.Toolkit;
public class MaanageEtudiantForm extends JFrame{
	private CrudStudent cc= new CrudStudent();
	private JPanel contentPane;
	private JTable table;
	private JTextField textFieldPrenom;
	private JTextField textFieldNom;
	private JTextField textFieldSExe;
	private JTextField textFieldAge;
	private JTextField textFieldNumTel;
	private JTextField textField_1Valeur;
	private JTextArea textAreaAdrss;
	private SingletonConnection c;
	private JComboBox comboBox;
	private ModelManageEtudiant cm;
	public JComboBox getComboBox() {
		return comboBox;
	}

	/**
	 * Launch the application.
	 */ 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaanageEtudiantForm frame = new MaanageEtudiantForm();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	/**
	 * Create the frame.
	 */
/*	 public void JtableAff(JTable table ,DefaultTableModel model)
	    {
	        Connection con = c.getConnexion();
	        PreparedStatement ps;
	        try {
	            ps = con.prepareStatement("SELECT * FROM `std`");
	            
	            ResultSet rs = ps.executeQuery();
	           // DefaultTableModel model = (DefaultTableModel)table.getModel();
	            
	            Object[] row;
	            
	            while(rs.next()){
	                row = new Object[7];
	                row[0] = rs.getInt(1);
	                row[1] = rs.getString(2);
	                row[2] = rs.getString(3);
	                row[3] = rs.getString(4);
	                row[4] = rs.getString(5);
	                row[5] = rs.getString(6);
	                row[6] = rs.getString(7);
	                
	                model.addRow(row);
	            }
	            
	        } catch (SQLException ex) {
	            ex.getStackTrace();
	        }
	    }
	    
	    
	    */
	    
	public MaanageEtudiantForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\student-group.png"));
		setTitle("Gerer des etudiants");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 875, 552);
		this.setResizable(false);
		this.setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cm=new ModelManageEtudiant();
		table = new JTable(cm);
		CrudStudent cs=new CrudStudent();
		List<student> stds=cs.getAllStudents();
		cm.loadData(stds);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(306, 92, 543, 357);
		contentPane.add(scrollPane);
		
		//table = new JTable();
		/*table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Prenom", "Nom", "Sexe", "Age", "Tel", "Adresse"
			}
		));
		 DefaultTableModel model = (DefaultTableModel)table.getModel(); */
		 /*Object[] row;
		  row = new Object[7];
          row[0] = 11;
          row[1] = "dsdsdsd";
          row[2] = "dsdsdsd";
          row[3] = "dsdsdsd";
          row[4] ="dsdsdsd";
          row[5] = "dsdsdsd";
          row[6] = "dsdsdsd";
          model.addRow(row);*/
		//cc.JtableAff(table, model);
		table.setToolTipText("");
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 79, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 124, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 170, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexe");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 218, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Age");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 260, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tel Num");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 310, 59, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Adresse");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 393, 59, 14);
		contentPane.add(lblNewLabel_6);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setBounds(79, 121, 163, 20);
		contentPane.add(textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(79, 167, 163, 20);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		textFieldSExe = new JTextField();
		textFieldSExe.setBounds(79, 215, 86, 20);
		contentPane.add(textFieldSExe);
		textFieldSExe.setColumns(10);
		
		textFieldAge = new JTextField();
		textFieldAge.setBounds(79, 257, 86, 20);
		contentPane.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		textFieldNumTel = new JTextField();
		textFieldNumTel.setBounds(79, 307, 163, 20);
		contentPane.add(textFieldNumTel);
		textFieldNumTel.setColumns(10);
		
		 textAreaAdrss = new JTextArea();
		textAreaAdrss.setBounds(79, 373, 163, 65);
		contentPane.add(textAreaAdrss);
		
		 comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Selection ID"}));
		
		List <Object> cb=new ArrayList();
		CrudStudent css=new CrudStudent();
		cb=css.loadIds();
		for (Object i:cb)
		{
			comboBox.addItem(i);
		}
		//cc.loadIds();
		comboBox.setBounds(80, 75, 102, 22);
		contentPane.add(comboBox);
		
		JButton AffIDButton = new JButton("Afficher");
		AffIDButton.setForeground(Color.BLUE);
		AffIDButton.setBackground(Color.GREEN);
		EvenRechercheByIDETD mpc=new EvenRechercheByIDETD(this);
		AffIDButton.addActionListener(mpc);
		AffIDButton.setBounds(206, 75, 86, 23);
		contentPane.add(AffIDButton);
		EvenRetourEtd ert=new EvenRetourEtd(this);
		JButton RetourButton = new JButton("Retour");
		RetourButton.addActionListener(ert);
		RetourButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\retour.png"));
		RetourButton.setBounds(10, 463, 129, 39);
		contentPane.add(RetourButton);
		EvenDeleteEtd ede =new EvenDeleteEtd (this);
		JButton SuppButton = new JButton("Supprimer");
		SuppButton.addActionListener(ede);
		SuppButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\Delete.png"));
		SuppButton.setBounds(149, 463, 135, 39);
		contentPane.add(SuppButton);
		EvenUpdateEtd up=new EvenUpdateEtd(this);
		JButton ModifierButton = new JButton("Modifier");
		ModifierButton.addActionListener(up);
		ModifierButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\edit.png"));
		ModifierButton.setBounds(294, 463, 135, 39);
		contentPane.add(ModifierButton);
		
		JLabel lblNewLabel_7 = new JLabel("Entrez la valeur \u00E0 rechercher :");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_7.setBounds(294, 21, 225, 38);
		contentPane.add(lblNewLabel_7);
		
		textField_1Valeur = new JTextField();
		textField_1Valeur.setBounds(529, 27, 206, 28);
		contentPane.add(textField_1Valeur);
		textField_1Valeur.setColumns(10);
	}

	public JTextField getTextFieldPrenom() {
		return textFieldPrenom;
	}

	public JTextField getTextFieldNom() {
		return textFieldNom;
	}

	public JTextField getTextFieldSExe() {
		return textFieldSExe;
	}

	public JTextField getTextFieldAge() {
		return textFieldAge;
	}

	public JTextField getTextFieldNumTel() {
		return textFieldNumTel;
	}

	public JTextField getTextField_1Valeur() {
		return textField_1Valeur;
	}

	public JTextArea getTextAreaAdrss() {
		return textAreaAdrss;
	}

	
	public JComboBox getcomboBox()
	{
	return comboBox;	
	}

	public ModelManageEtudiant getCm() {
		return cm;
	}

	public void setCm(ModelManageEtudiant cm) {
		this.cm = cm;
	}
	
	
}
