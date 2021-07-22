package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUser;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\log.png"));
		setTitle("CONNEXION");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 320);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new java.awt.Color(204, 255, 204));
		JLabel lblNewLabel = new JLabel("Connexion");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(68, 11, 256, 43);
		contentPane.add(lblNewLabel);
		JLabel jLabel1 = new javax.swing.JLabel();
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Login Form");
		contentPane.add(jLabel1);
		
		JLabel lblusername = new JLabel("Username :");
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblusername.setBounds(29, 75, 85, 36);
		contentPane.add(lblusername);
		
		JLabel lblpass = new JLabel("Password :");
		lblpass.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblpass.setBounds(29, 143, 85, 36);
		contentPane.add(lblpass);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(139, 85, 156, 26);
		contentPane.add(textFieldUser);
		textFieldUser.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("*");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(305, 91, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("*");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(305, 156, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		 btnNewButton = new JButton("Annuler");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\Delete.png"));
		btnNewButton.setBounds(106, 213, 119, 37);
		contentPane.add(btnNewButton);
		
		 btnNewButton_1 = new JButton("Entrer");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\login.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(235, 213, 116, 37);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setBounds(139, 147, 156, 26);
		contentPane.add(passwordField);
		LoginFormAction nc=new LoginFormAction(this);
		btnNewButton.addActionListener(nc);
		btnNewButton_1.addActionListener(nc);
		
	}

	public JTextField getTextFieldUser() {
		return textFieldUser;
	}


	

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}
}
