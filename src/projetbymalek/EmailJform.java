package projetbymalek;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class EmailJform extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmailJform frame = new EmailJform();
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
	public EmailJform() {
		setClosable(true);
		getContentPane().setBackground(new Color(65, 105, 225));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMAIL/ @");
		lblNewLabel.setForeground(new Color(169, 169, 169));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(120, 22, 202, 39);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("malekprotnx@gmail.com");
		lblNewLabel_1.setForeground(new Color(173, 216, 230));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(73, 79, 184, 39);
		getContentPane().add(lblNewLabel_1);
		setFrameIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\584856bce0bb315b0f7675ad.png"));
		setBounds(100, 100, 450, 300);

	}

}
