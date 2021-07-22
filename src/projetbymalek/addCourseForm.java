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
import java.awt.Toolkit;

public class addCourseForm extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNomdeCours;
	private JSpinner spinnerHeures;
	private JButton RetourButton;
	private JButton AjouterButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addCourseForm frame = new addCourseForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getTextFieldNomdeCours() {
		return textFieldNomdeCours;
	}

	public JSpinner getSpinnerHeures() {
		return spinnerHeures;
	}

	public JButton getRetourButton() {
		return RetourButton;
	}

	public JButton getAjouterButton() {
		return AjouterButton;
	}

	/**
	 * Create the frame.
	 */
	public addCourseForm() {
		setTitle("Ajouter cours");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\add.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 317);
		this.setResizable(false);
		this.setLocationRelativeTo(this);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewtitle = new JLabel("Ajouter un cours");
		lblNewtitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewtitle.setFont(new Font("Arial Black", Font.BOLD, 18));
		lblNewtitle.setBounds(45, 11, 278, 34);
		contentPane.add(lblNewtitle);
		
		JLabel lblNewLabel = new JLabel("Nom de cours :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 75, 121, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Heures :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 125, 121, 34);
		contentPane.add(lblNewLabel_1);
		
		textFieldNomdeCours = new JTextField();
		textFieldNomdeCours.setBounds(144, 80, 155, 29);
		contentPane.add(textFieldNomdeCours);
		textFieldNomdeCours.setColumns(10);
		
		 spinnerHeures = new JSpinner();
		spinnerHeures.setModel(new SpinnerNumberModel(1, 1, 100, 1));
		spinnerHeures.setBounds(142, 132, 53, 25);
		contentPane.add(spinnerHeures);
		EvenRetourAddCours era=new EvenRetourAddCours(this);
		 RetourButton = new JButton("Retour");
		 RetourButton.addActionListener(era);
		RetourButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\retour.png"));
		RetourButton.setBounds(45, 217, 122, 34);
		contentPane.add(RetourButton);
		EvenAddCourse eac=new EvenAddCourse(this);
	
		 AjouterButton = new JButton("Ajouter");
		 AjouterButton.addActionListener(eac);
		AjouterButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\add.png"));
		AjouterButton.setBounds(186, 217, 113, 34);
		contentPane.add(AjouterButton);
	}
}
