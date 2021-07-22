package projetbymalek;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

import dao.CrudCouseAndScores;

public class MauvaisNoteForm extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewScoreForm frame = new ViewScoreForm();
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
	public MauvaisNoteForm() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Hp Pavilion\\Pictures\\images\\Arrow_Up_Circle.png"));
		setTitle("Afficher les Mauvaises notes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 520);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Afficher Mauvais notes ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setBounds(143, 11, 279, 37);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 80, 541, 390);
		contentPane.add(scrollPane);
		CrudCouseAndScores cc=new CrudCouseAndScores();
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Etudiant ID", "Prenom", "Nom", "Cour", "Note"
			}
		));
		cc.ShowBADScores(table);
		scrollPane.setViewportView(table);
	}

}
