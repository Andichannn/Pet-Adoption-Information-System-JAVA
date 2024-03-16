package PetAdoption;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AfterLogInAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AfterLogInAdmin frame = new AfterLogInAdmin();
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
	public AfterLogInAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);

		
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(Color.WHITE);
		panel.setBounds(52, 10, 484, 412);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("PETS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AllPetsAdmin next = new AllPetsAdmin();
				next.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(153, 204, 204));
		btnNewButton.setBorder(null);
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		btnNewButton.setBounds(103, 322, 273, 54);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLIENTS");
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(153, 204, 204));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientInfo next = new ClientInfo();
				next.setVisible(true);
				dispose();
				}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		btnNewButton_1.setBounds(103, 246, 273, 52);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("PETS & CLIENTS INFORMATION ");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 23));
		lblNewLabel.setBounds(54, 153, 369, 40);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("HAPPY PAW'S");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 25));
		lblNewLabel_1.setBounds(145, 84, 185, 47);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Pet Adoption Center");
		lblNewLabel_2.setFont(new Font("Bell MT", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(165, 124, 130, 13);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\PetAdoption\\DESIGN ANG LOGO\\HAPPYsmall.png"));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(132, 0, 153, 89);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("In this section admin can edit or view Client or Pet's important information.");
		lblNewLabel_4.setForeground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(21, 191, 441, 21);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Admin can also set the status of the Client.");
		lblNewLabel_4_1.setForeground(Color.GRAY);
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(96, 215, 244, 21);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("Logout");
		lblNewLabel_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MainActivity next = new MainActivity();
				next.setVisible(true);
				dispose();
			}
		});
		lblNewLabel_5.setBounds(10, 10, 45, 13);
		panel.add(lblNewLabel_5);
		
	}
}