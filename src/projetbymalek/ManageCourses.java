package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import dao.CrudCouseAndScores;
import metier.course;

import java.awt.Toolkit;
import java.util.List;

public class ManageCourses extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldID;
	private JTextField textFieldNomDcours;
	private JTable table;
	private ModelCours cm; 
	private JSpinner spinnerHeures ;
	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextFieldID() {
		return textFieldID;
	}

	public JTextField getTextFieldNomDcours() {
		return textFieldNomDcours;
	}

	public JTable getTable() {
		return table;
	}

	public ModelCours getCm() {
		return cm;
	}

	public void setCm(ModelCours cm) {
		this.cm = cm;
	}

	public JSpinner getSpinnerHeures() {
		return spinnerHeures;
	}

	public void setSpinnerHeures(JSpinner spinnerHeures) {
		this.spinnerHeures = spinnerHeures;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageCourses frame = new ManageCourses();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManageCourses() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\document-edit.png"));
		setTitle("Gerer les cours");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//by malek :ooo
		setBounds(100, 100, 813, 393);
		this.setResizable(false);
		this.setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gerer les cours");
		lblNewLabel.setBounds(150, 11, 190, 26);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setBounds(10, 91, 119, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom de course :");
		lblNewLabel_2.setBounds(10, 134, 119, 26);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Heures :");
		lblNewLabel_3.setBounds(10, 183, 119, 26);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		textFieldID = new JTextField();
		textFieldID.setBounds(139, 85, 152, 26);
		textFieldID.setEditable(false);
		contentPane.add(textFieldID);
		textFieldID.setColumns(10);
		
		textFieldNomDcours = new JTextField();
		textFieldNomDcours.setBounds(139, 134, 152, 26);
		contentPane.add(textFieldNomDcours);
		textFieldNomDcours.setColumns(10);
		
		 spinnerHeures = new JSpinner();
		spinnerHeures.setBounds(139, 185, 60, 26);
		spinnerHeures.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		contentPane.add(spinnerHeures);
		EvenDeleteCourse edc=new EvenDeleteCourse(this);
		JButton SupprimerButton = new JButton("Supprimer");
		SupprimerButton.addActionListener(edc);
		SupprimerButton.setBounds(39, 268, 132, 33);
		SupprimerButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\Delete.png"));
		contentPane.add(SupprimerButton);
		EvenUpdateCours euc=new EvenUpdateCours(this);
		JButton ModifierButton = new JButton("Modifier");
		ModifierButton.addActionListener(euc);
		ModifierButton.setBounds(181, 268, 132, 33);
		ModifierButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\edit.png"));
		contentPane.add(ModifierButton);
		EvenRetourManangeCours ermc =new EvenRetourManangeCours(this);
		JButton RetourButton = new JButton("Retour");
		RetourButton.addActionListener(ermc);
		RetourButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\retour.png"));
		RetourButton.setBounds(643, 25, 132, 33);
		contentPane.add(RetourButton);
		cm=new ModelCours();
		table = new JTable(cm);
		CrudCouseAndScores cc=new CrudCouseAndScores();
		List<course> courz=cc.getAllCourses();
		cm.loadData(courz);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(344, 85, 443, 216);
		contentPane.add(scrollPane);
		EvenTableCourse etc =new EvenTableCourse(this);
		table.addMouseListener(etc);
		scrollPane.setViewportView(table); 
		
	}
}
