package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.CrudCouseAndScores;
import dao.CrudStudent;
import metier.student;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import java.util.List;

public class addScoreForm extends JFrame {
	private CrudCouseAndScores cc =new CrudCouseAndScores(this);
	private JPanel contentPane;
	private JTextField textFieldETDID;
	private JTextField textFieldNote;
	private JTextField textFieldDescription;
	private JTable table;
	private AddScoreModel cm;
	private JComboBox comboBoxNomCours;
	private JButton AjouterNoteButton;
	private JButton RetourNoteButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addScoreForm frame = new addScoreForm();
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
	public addScoreForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\line_add.png"));
		setTitle("Ajouter Note");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 444);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajouter un note");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(237, 11, 237, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Etudiant(e) ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 93, 118, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom de cours :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 147, 118, 42);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Note :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 209, 118, 17);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("La description :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 255, 118, 35);
		contentPane.add(lblNewLabel_4);
		
		textFieldETDID = new JTextField();
		textFieldETDID.setEditable(false);
		textFieldETDID.setBounds(138, 105, 150, 26);
		contentPane.add(textFieldETDID);
		textFieldETDID.setColumns(10);
		
		 comboBoxNomCours = new JComboBox();
		 cc.loadNomdeCours();
		comboBoxNomCours.setBounds(139, 159, 149, 22);
		contentPane.add(comboBoxNomCours);
		
		textFieldNote = new JTextField();
		textFieldNote.setBounds(140, 206, 76, 26);
		contentPane.add(textFieldNote);
		textFieldNote.setColumns(10);
		
		textFieldDescription = new JTextField();
		textFieldDescription.setBounds(138, 261, 150, 26);
		contentPane.add(textFieldDescription);
		textFieldDescription.setColumns(10);
		
		 AjouterNoteButton = new JButton("Ajouter");
		EvenAddScore eds=new EvenAddScore(this);
		AjouterNoteButton.addActionListener(eds);
		AjouterNoteButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		AjouterNoteButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\add.png"));
		AjouterNoteButton.setBounds(205, 334, 115, 35);
		contentPane.add(AjouterNoteButton);
		
		 RetourNoteButton = new JButton("Retour");
		 RetourNoteButton.addActionListener(eds);
		RetourNoteButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\retour.png"));
		RetourNoteButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		RetourNoteButton.setBounds(47, 334, 115, 35);
		contentPane.add(RetourNoteButton);
		cm=new AddScoreModel();
		table = new JTable(cm);
		CrudStudent cs=new CrudStudent();
		List<student> stds=cs.getStudents();
		cm.loadData(stds);
		
		JScrollPane scrollPane = new JScrollPane(table);
		EvenAddScoreTable et=new EvenAddScoreTable(this);
		table.addMouseListener(et);
		scrollPane.setBounds(360, 93, 334, 275);
		contentPane.add(scrollPane);
		
		//table = new JTable();
		scrollPane.setViewportView(table);
	}

	public JTextField getTextFieldETDID() {
		return textFieldETDID;
	}

	public void setTextFieldETDID(JTextField textFieldETDID) {
		this.textFieldETDID = textFieldETDID;
	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JComboBox getComboBoxNomCours() {
		return comboBoxNomCours;
	}

	public void setComboBoxNomCours(JComboBox comboBoxNomCours) {
		this.comboBoxNomCours = comboBoxNomCours;
	}

	public JTextField getTextFieldNote() {
		return textFieldNote;
	}

	public void setTextFieldNote(JTextField textFieldNote) {
		this.textFieldNote = textFieldNote;
	}

	public JTextField getTextFieldDescription() {
		return textFieldDescription;
	}

	public void setTextFieldDescription(JTextField textFieldDescription) {
		this.textFieldDescription = textFieldDescription;
	}

	public JButton getAjouterNoteButton() {
		return AjouterNoteButton;
	}

	public JButton getRetourNoteButton() {
		return RetourNoteButton;
	}
	
	
}
