package projetbymalek;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class InstagramJForm extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InstagramJForm frame = new InstagramJForm();
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
	public InstagramJForm() {
		setTitle("Instagram");
		getContentPane().setBackground(new Color(255, 0, 255));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INSTAGRAM");
		lblNewLabel.setForeground(new Color(218, 165, 32));
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(78, 28, 244, 33);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@PROJECTBYMALEK");
		lblNewLabel_1.setForeground(new Color(220, 20, 60));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(110, 89, 166, 28);
		getContentPane().add(lblNewLabel_1);
		setFrameIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\rsz_instagramm.png"));
		setClosable(true);
		setBounds(100, 100, 450, 353);

	}

}
