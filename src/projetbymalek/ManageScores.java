package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import dao.CrudCouseAndScores;
import metier.score;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class ManageScores extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEtudianteID;
	private JTextField textFieldIDCours;
	private JTextField textFieldNote;
	private JTextField textFieldDescription;
	private JTable table;
	private ModelManageScores cm;
	private JButton RetourButton;
	private JButton SupprimerButton;
	private JButton ModifierButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageScores frame = new ManageScores();
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
	public ManageScores() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\edit.png"));
		setTitle("Grer les notes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 444);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Supprimer / Modifier Les Notes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(136, 11, 423, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Etudiante(e) ID :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 90, 126, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID de cours :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 148, 126, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Note :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 207, 132, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("La description :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 264, 132, 35);
		contentPane.add(lblNewLabel_4);
		EvenManageScore ems=new EvenManageScore(this);
		 RetourButton = new JButton("Retour");
		 RetourButton.addActionListener(ems);
		RetourButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		RetourButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\retour.png"));
		RetourButton.setBounds(10, 359, 116, 35);
		contentPane.add(RetourButton);
		
		 SupprimerButton = new JButton("Supprimer");
		 SupprimerButton.addActionListener(ems);
		SupprimerButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		SupprimerButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\Delete.png"));
		SupprimerButton.setBounds(136, 359, 137, 35);
		contentPane.add(SupprimerButton);
		
		 ModifierButton = new JButton("Modifer");
		 ModifierButton.addActionListener(ems);
		ModifierButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		ModifierButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\edit.png"));
		ModifierButton.setBounds(283, 359, 132, 35);
		contentPane.add(ModifierButton);
		
		textFieldEtudianteID = new JTextField();
		textFieldEtudianteID.setEditable(false);
		textFieldEtudianteID.setBounds(160, 89, 145, 29);
		contentPane.add(textFieldEtudianteID);
		textFieldEtudianteID.setColumns(10);
		
		textFieldIDCours = new JTextField();
		textFieldIDCours.setEditable(false);
		textFieldIDCours.setBounds(160, 153, 145, 29);
		contentPane.add(textFieldIDCours);
		textFieldIDCours.setColumns(10);
		
		textFieldNote = new JTextField();
		textFieldNote.setBounds(160, 210, 73, 26);
		contentPane.add(textFieldNote);
		textFieldNote.setColumns(10);
		
		textFieldDescription = new JTextField();
		textFieldDescription.setBounds(160, 269, 153, 29);
		contentPane.add(textFieldDescription);
		textFieldDescription.setColumns(10);
		EvenTableManageScore etms=new EvenTableManageScore(this);
		cm=new ModelManageScores();
		table = new JTable(cm);
		table.addMouseListener(etms);
		CrudCouseAndScores cc=new CrudCouseAndScores();
		List<score> notes=cc.getAllscores();
		cm.loadData(notes);
		JScrollPane scrollPane = new JScrollPane(table);
		//JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(332, 77, 362, 271);
		contentPane.add(scrollPane);
		
		//table = new JTable();
		scrollPane.setViewportView(table);
	}

	public JTextField getTextFieldEtudianteID() {
		return textFieldEtudianteID;
	}

	public void setTextFieldEtudianteID(JTextField textFieldEtudianteID) {
		this.textFieldEtudianteID = textFieldEtudianteID;
	}

	public JTextField getTextFieldIDCours() {
		return textFieldIDCours;
	}

	public void setTextFieldIDCours(JTextField textFieldIDCours) {
		this.textFieldIDCours = textFieldIDCours;
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

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getRetourButton() {
		return RetourButton;
	}

	public JButton getSupprimerButton() {
		return SupprimerButton;
	}

	public JButton getModifierButton() {
		return ModifierButton;
	}

	public ModelManageScores getCm() {
		return cm;
	}

	public void setCm(ModelManageScores cm) {
		this.cm = cm;
	}
	

}
