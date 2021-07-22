package projetbymalek;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class FacebookJForm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FacebookJForm frame = new FacebookJForm();
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
	public FacebookJForm() {
		setFrameIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\rsz_fb.png"));
		setTitle("FB");
		getContentPane().setBackground(Color.BLUE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FACEBOOK");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(138, 32, 154, 43);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WWW.FACEBOOK.COM/PROJECTBYMALEK");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel_1.setBounds(73, 109, 297, 33);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(246, 161, -50, 56);
		getContentPane().add(lblNewLabel_2);
		setClosable(true);
		setBounds(100, 100, 450, 353);

	}
}
