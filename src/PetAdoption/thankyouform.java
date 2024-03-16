package PetAdoption;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class thankyouform extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					thankyouform frame = new thankyouform();
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
	public thankyouform() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 223);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPetAdoption = new JPanel();
		panelPetAdoption.setBorder(null);
		panelPetAdoption.setBackground(SystemColor.window);
		panelPetAdoption.setBounds(67, 10, 484, 127);
		contentPane.add(panelPetAdoption);
		panelPetAdoption.setLayout(null);
		
		JTextArea txtrPetAdoptinForm = new JTextArea();
		txtrPetAdoptinForm.setEditable(false);
		txtrPetAdoptinForm.setFont(new Font("Calibri Light", Font.BOLD, 30));
		txtrPetAdoptinForm.setText("Pet Adoption Form");
		txtrPetAdoptinForm.setBounds(99, 10, 277, 33);
		panelPetAdoption.add(txtrPetAdoptinForm);
		
		JTextArea txtThankyou = new JTextArea();
		txtThankyou.setBounds(10, 44, 464, 64);
		panelPetAdoption.add(txtThankyou);
		txtThankyou.setText("Thank you for taking the time to complete this survey! Your responses will help us ensure a successful pet adoption experience. If you have any questions or concerns, please feel free to reach out to us.");
		txtThankyou.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtThankyou.setEditable(false);
		txtThankyou.setLineWrap(true);
		txtThankyou.setWrapStyleWord(true);
		
		JButton btnNewButton = new JButton("Check Adoption Status");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ClientStatus next = new ClientStatus();
				next.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(211, 147, 176, 29);
		contentPane.add(btnNewButton);
		
	}
}