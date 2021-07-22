package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;

public class ContactParForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactParForm frame = new ContactParForm();
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
	public ContactParForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\584856bce0bb315b0f7675ad.png"));
		setTitle("Contacter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 353);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Contacter par");
		menuBar.add(mnNewMenu);
		EvenMenuFB emb=new EvenMenuFB(this);
		JMenuItem FBNewMenuItem = new JMenuItem("Facebook");
		FBNewMenuItem.addActionListener(emb);
		FBNewMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\rsz_fb.png"));
		mnNewMenu.add(FBNewMenuItem);
		EvenMenuINSTA inst=new EvenMenuINSTA(this);
		JMenuItem INSTANewMenuItem = new JMenuItem("Instagram");
		INSTANewMenuItem.addActionListener(inst);
		INSTANewMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\rsz_instagramm.png"));
		mnNewMenu.add(INSTANewMenuItem);
		EvenMenuEMAIL eml=new EvenMenuEMAIL(this);
		JMenuItem EMAILNewMenuItem = new JMenuItem("Email");
		EMAILNewMenuItem.addActionListener(eml);
		EMAILNewMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\email.png"));
		mnNewMenu.add(EMAILNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
