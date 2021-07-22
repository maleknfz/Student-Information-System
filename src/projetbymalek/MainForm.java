package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.SingletonConnection;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
public class MainForm extends JFrame {
	private LoginFormAction ag;
	private JPanel contentPane;
	private JLabel LabdelAdminName;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
///////////////////////////////////////////////////////////////////////////////////////////////////	
	
	//methode static pour calculer nb etds et cours
	
///////////////////////////////////////////////////////////////////////////////////////////////
    public static int countData(String tableName)
    {
    	SingletonConnection c = null;
        int total = 0;
        Connection con = c.getConnexion();
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT COUNT(*) AS 'total' FROM "+tableName);
            while(rs.next()){
                total = rs.getInt(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        
        return total;
    }
    
    public JLabel getLabdelAdminName() {
		return LabdelAdminName;
	}

	public void setLabdelAdminName(JLabel labdelAdminName) {
		LabdelAdminName = labdelAdminName;
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public MainForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\co.png"));
		setTitle("Page d'accueil :)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 474);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu EtdMenu = new JMenu("Etudiants");
		EtdMenu.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\manage_student.png"));
		menuBar.add(EtdMenu);
		EvenAddEtdItem eae=new EvenAddEtdItem (this);
		JMenuItem NvEtdMenuItem = new JMenuItem("Ajouter Etudiant");
		NvEtdMenuItem.addActionListener(eae);
		NvEtdMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\add_std2.png"));
		NvEtdMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
	//	MainItemAction evts=new MainItemAction(this);
	//	NvEtdMenuItem.handleEvent(evts);
		EtdMenu.add(NvEtdMenuItem);
		EvenGererEtdItem ege=new EvenGererEtdItem (this);
		JMenuItem GererEtudiantMenuItem = new JMenuItem("G\u00E9rer Etudiant");
		GererEtudiantMenuItem.addActionListener(ege);
		GererEtudiantMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\student-group.png"));
		GererEtudiantMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_MASK));
		EtdMenu.add(GererEtudiantMenuItem);
		
		JMenu CoursNewMenu = new JMenu("Cours");
		CoursNewMenu.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\courses.png"));
		menuBar.add(CoursNewMenu);
		EvenAddCourItem eac=new EvenAddCourItem (this);
		JMenuItem AjouterCourMenuItem = new JMenuItem("Ajouter");
		AjouterCourMenuItem.addActionListener(eac);
		AjouterCourMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\line_add.png"));
		CoursNewMenu.add(AjouterCourMenuItem);
		EvenGererCoursItem egcs=new EvenGererCoursItem(this);
		JMenuItem GererCoursMenuItem = new JMenuItem("Gerer");
		GererCoursMenuItem.addActionListener(egcs);
		GererCoursMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\document-edit.png"));
		CoursNewMenu.add(GererCoursMenuItem);
		
		JMenu ScoreNewMenu = new JMenu("Notes");
		ScoreNewMenu.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\results.png"));
		menuBar.add(ScoreNewMenu);
		EvenAddScoreItem eass=new EvenAddScoreItem(this);
		JMenuItem AjoutScoreMenuItem = new JMenuItem("Ajouter");
		AjoutScoreMenuItem.addActionListener(eass);
		AjoutScoreMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\line_add.png"));
		ScoreNewMenu.add(AjoutScoreMenuItem);
		EvenModSupItem ems=new EvenModSupItem(this);
		JMenuItem ModSuppScoreMenuItem = new JMenuItem("Modifier/Supprimer");
		ModSuppScoreMenuItem.addActionListener(ems);
		ModSuppScoreMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\edit.png"));
		ScoreNewMenu.add(ModSuppScoreMenuItem);
		EvenAffScoresItem easi=new EvenAffScoresItem(this);
		JMenuItem afficherlesscoresMenuItem = new JMenuItem("Afficher Tous Notes");
		afficherlesscoresMenuItem.addActionListener(easi);
		afficherlesscoresMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\Arrow_Up_Circle.png"));
		ScoreNewMenu.add(afficherlesscoresMenuItem);
		EvenAffBonNotesItem bn=new EvenAffBonNotesItem(this);
		JMenuItem AfficherExllentMenuItem = new JMenuItem("Afficher Exllent Notes");
		AfficherExllentMenuItem.addActionListener(bn);
		AfficherExllentMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\Arrow_Up_Circle.png"));
		ScoreNewMenu.add(AfficherExllentMenuItem);
		EvenAffMauvaisesNotesItem mnotes=new EvenAffMauvaisesNotesItem(this);
		JMenuItem MavaisNotesMenuItem = new JMenuItem("Afficher Mauvaises Notes");
		MavaisNotesMenuItem.addActionListener(mnotes);
		MavaisNotesMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\Arrow_Up_Circle.png"));
		ScoreNewMenu.add(MavaisNotesMenuItem);
		
		JMenu mnNewMenu = new JMenu("Aider");
		mnNewMenu.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\x3.png"));
		menuBar.add(mnNewMenu);
		EvenhelpMenuItem helps=new EvenhelpMenuItem(this);
		JMenuItem helpMenuItem = new JMenuItem("Contacter");
		helpMenuItem.addActionListener(helps);
		helpMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\email.png"));
		mnNewMenu.add(helpMenuItem);
		
		JMenuItem AproposMenuItem = new JMenuItem("\u00E0 Propos");
		AproposMenuItem.setIcon(new ImageIcon("C:\\Users\\Hp Pavilion\\Pictures\\images\\about.png"));
		mnNewMenu.add(AproposMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 27, 497, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenue Monsieur :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 11, 224, 37);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		 LabdelAdminName = new JLabel(ag.getAdmin());
		LabdelAdminName.setForeground(Color.GREEN);
		LabdelAdminName.setFont(new Font("Tahoma", Font.BOLD, 18));
		LabdelAdminName.setBounds(234, 11, 153, 37);
		panel.add(LabdelAdminName);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(10, 253, 273, 105);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombres D'Etudiants =");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 35, 161, 42);
		panel_1.add(lblNewLabel_1);
		
		JLabel NbEtudiantsLabl = new JLabel(Integer.toString(countData("student")));
		NbEtudiantsLabl.setForeground(Color.WHITE);
		NbEtudiantsLabl.setFont(new Font("Tahoma", Font.BOLD, 13));
		NbEtudiantsLabl.setBounds(171, 35, 61, 42);
		panel_1.add(NbEtudiantsLabl);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(328, 253, 273, 105);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel DefaultLabelNbCors = new JLabel("Nombre Des Cours Dispo =");
		DefaultLabelNbCors.setFont(new Font("Tahoma", Font.BOLD, 13));
		DefaultLabelNbCors.setForeground(Color.WHITE);
		DefaultLabelNbCors.setBounds(10, 47, 189, 16);
		panel_2.add(DefaultLabelNbCors);
		
		JLabel NbrCoursesLabel = new JLabel(Integer.toString(countData("course")));
		NbrCoursesLabel.setForeground(Color.WHITE);
		NbrCoursesLabel.setFont(new Font("Tahoma", Font.ITALIC, 13));
		NbrCoursesLabel.setBounds(194, 38, 46, 34);
		panel_2.add(NbrCoursesLabel);
	}
}
