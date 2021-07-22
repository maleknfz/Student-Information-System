package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;



public class addEtudiantForm extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldPrenom;
	private JTextField textFieldNom;
	private JTextField textFieldAge;
	private JTextField textFieldNumPhone;
	private JTextArea textAreaAdress;
	private JRadioButton HommeRadioButton; 
	private JRadioButton FemmeRadioButton_1;
	private JButton ReourButton;
	private JButton IniNewButton ;
	private JButton btnNewButtoAjouter;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addEtudiantForm frame = new addEtudiantForm();
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
	public addEtudiantForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\add_std2.png"));
		setTitle("Ajouter Nv Etudiant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 410, 540);
		this.setResizable(false);
		this.setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajouter Nouvelle Etudiant(e)");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(54, 11, 273, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Prenom :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 72, 91, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nom :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 129, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sexe :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 178, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Age :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(10, 227, 46, 29);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Tel Numero :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(10, 287, 91, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Adresse :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 360, 91, 29);
		contentPane.add(lblNewLabel_6);
		
		textFieldPrenom = new JTextField();
		textFieldPrenom.setBounds(119, 69, 235, 29);
		contentPane.add(textFieldPrenom);
		textFieldPrenom.setColumns(10);
		
		textFieldNom = new JTextField();
		textFieldNom.setBounds(119, 124, 235, 29);
		contentPane.add(textFieldNom);
		textFieldNom.setColumns(10);
		
		 HommeRadioButton = new JRadioButton("Homme");
		buttonGroup.add(HommeRadioButton);
		HommeRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		HommeRadioButton.setBackground(Color.CYAN);
		HommeRadioButton.setBounds(119, 176, 73, 23);
		contentPane.add(HommeRadioButton);
		
		 FemmeRadioButton_1 = new JRadioButton("Femme");
		buttonGroup.add(FemmeRadioButton_1);
		FemmeRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		FemmeRadioButton_1.setBackground(Color.CYAN);
		FemmeRadioButton_1.setBounds(226, 176, 101, 23);
		contentPane.add(FemmeRadioButton_1);
		
		textFieldAge = new JTextField();
		textFieldAge.setBounds(119, 229, 235, 29);
		contentPane.add(textFieldAge);
		textFieldAge.setColumns(10);
		
		textFieldNumPhone = new JTextField();
		textFieldNumPhone.setBounds(119, 289, 235, 29);
		contentPane.add(textFieldNumPhone);
		textFieldNumPhone.setColumns(10);
		
		 textAreaAdress = new JTextArea();
		textAreaAdress.setBounds(119, 348, 235, 79);
		contentPane.add(textAreaAdress);
		AEFAction ae=new AEFAction(this);
		EvenAddEtd ap=new EvenAddEtd(this);
		 ReourButton = new JButton("Retour");
		 ReourButton.addActionListener(ae);
		ReourButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\retour.png"));
		ReourButton.setBounds(10, 455, 110, 35);
		contentPane.add(ReourButton);
		
		 IniNewButton = new JButton("Initialiser");
		IniNewButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\Delete.png"));
		
		IniNewButton.addActionListener(ae);
		IniNewButton.setBounds(130, 455, 124, 35);
		contentPane.add(IniNewButton);
		
		 btnNewButtoAjouter = new JButton("Ajouter");
		btnNewButtoAjouter.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\add.png"));
		//InsertEtudiant mc=new InsertEtudiant(this);
		btnNewButtoAjouter.addActionListener(ap);
		btnNewButtoAjouter.setBounds(264, 455, 120, 35);
		contentPane.add(btnNewButtoAjouter);
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextFieldPrenom() {
		return textFieldPrenom;
	}

	public JTextField getTextFieldNom() {
		return textFieldNom;
	}

	public JTextField getTextFieldAge() {
		return textFieldAge;
	}

	public JTextField getTextFieldNumPhone() {
		return textFieldNumPhone;
	}

	public JTextArea getTextAreaAdress() {
		return textAreaAdress;
	}

	public JRadioButton getHommeRadioButton() {
		return HommeRadioButton;
	}

	public JRadioButton getFemmeRadioButton_1() {
		return FemmeRadioButton_1;
	}

	public JButton getReourButton() {
		return ReourButton;
	}

	public JButton getIniNewButton() {
		return IniNewButton;
	}

	public JButton getBtnNewButtoAjouter() {
		return btnNewButtoAjouter;
	}

	public ButtonGroup getButtonGroup() {
		return buttonGroup;
	}
}
