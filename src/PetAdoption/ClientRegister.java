package PetAdoption;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JFormattedTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;

public class ClientRegister extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientRegister frame = new ClientRegister();
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
	public ClientRegister() {
		setRootPaneCheckingEnabled(false);
		setLocationByPlatform(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setLocationRelativeTo(null);

		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 230, 571);
		panel.setBackground(new Color(153, 204, 204));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(564, 0, 230, 571);
		panel_1.setBackground(new Color(153, 204, 204));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		// Labels/Texts Field
		JLabel Registration = new JLabel("REGISTRATION");
		Registration.setBounds(298, 112, 210, 41);
		Registration.setForeground(new Color(0, 0, 0));
		Registration.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		Registration.setBackground(Color.WHITE);
		contentPane.add(Registration);
		
		// Resgistration Information Field
		
		JFormattedTextField Firstname = new JFormattedTextField();
		Firstname.setBounds(294, 206, 222, 24);
		Firstname.setToolTipText("Firstname");
		Firstname.setForeground(Color.BLACK);
		contentPane.add(Firstname);
		
		JFormattedTextField Surname = new JFormattedTextField();
		Surname.setBounds(294, 263, 222, 24);
		Surname.setToolTipText("Surname");
		Surname.setForeground(Color.BLACK);
		contentPane.add(Surname);
		
		JFormattedTextField Address = new JFormattedTextField();
		Address.setBounds(294, 320, 222, 24);
		Address.setForeground(Color.BLACK);
		Address.setToolTipText("Address");
		contentPane.add(Address);
		
		JFormattedTextField Username = new JFormattedTextField();
		Username.setBounds(294, 377, 222, 24);
		Username.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Username.setToolTipText("Username");
		Username.setForeground(Color.BLACK);
		contentPane.add(Username);
		
		
		// Register Button 
		JButton Registerbtn = new JButton("Register Now");
		Registerbtn.setBounds(342, 481, 116, 23);
		Registerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Registerbtn.addMouseListener(new MouseAdapter() {
		
			//user input register to database
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String enteredfirstname = Firstname.getText();
				String enteredsurname = Surname.getText();
				String enteredaddress = Address.getText();
				String enteredusername = Username.getText();
				String enteredpassword = new String(passwordField.getPassword());
				
				
				if (enteredfirstname.isEmpty()|| enteredsurname.isEmpty()|| enteredaddress.isEmpty()|| enteredusername.isEmpty()|| enteredpassword.isEmpty()) {
					JOptionPane.showMessageDialog(contentPane, "Please Fill All Fields!", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					
				}if (ClientRegisterAcc(enteredfirstname, enteredsurname, enteredaddress, enteredusername, enteredpassword)) {
					JOptionPane.showMessageDialog(contentPane, "Registration Successful!", null, JOptionPane.INFORMATION_MESSAGE);
					MainActivity next = new MainActivity();
					next.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(contentPane, "Registration Failed!", null, JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			
			}
		});

		Registerbtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		Registerbtn.setForeground(Color.WHITE);
		Registerbtn.setBackground(new Color(153, 204, 204));
		contentPane.add(Registerbtn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(294, 434, 222, 24);
		passwordField.setToolTipText("Password");
		contentPane.add(passwordField);
		
		JLabel lblNewLabel = new JLabel("Password:");
		lblNewLabel.setBounds(294, 411, 78, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname:");
		lblNewLabel_1.setBounds(294, 183, 62, 13);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Surname:");
		lblNewLabel_2.setBounds(294, 240, 62, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setBounds(294, 297, 78, 13);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Username:");
		lblNewLabel_4.setBounds(294, 354, 78, 13);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		contentPane.add(lblNewLabel_4);
		
        //
		btnNewButton = new JButton("Already have an account?");
		btnNewButton.setBounds(321, 508, 161, 29);
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainActivity wndw = new MainActivity();
				wndw.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton);
		
		//
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\PetAdoption\\DESIGN ANG LOGO\\HAPPYsmall.png"));
		lblNewLabel_5.setBounds(298, 29, 149, 73);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\PetAdoption\\DESIGN ANG LOGO\\refresh2.png"));
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Firstname.setText("");
                Surname.setText("");
                Address.setText("");
                Username.setText("");
                passwordField.setText("");											
			}
		});
		lblNewLabel_6.setBounds(492, 172, 24, 24);
		contentPane.add(lblNewLabel_6);
		
		
	}


	private boolean ClientRegisterAcc(String firstname, String surname, String address, String username, String password) {
	    if (isEmptyOrBlank(firstname) || isEmptyOrBlank(surname) || isEmptyOrBlank(address) || isEmptyOrBlank(username) || isEmptyOrBlank(password)) {
	        // If any field is empty or blank, return false indicating failure
	        return false;
	    }

    
	    try {
	        String url = "jdbc:sqlserver://ANDI;databasename=PetAdoption;integratedSecurity=true;encrypt=false;";
	        Connection conn = DriverManager.getConnection(url);

        
	     // Check if the username already exists
	        String checkQuery = "SELECT COUNT(*) AS count FROM ClientRegisterAcc WHERE username = ?";
	        try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
	            checkStmt.setString(1, username);
	            ResultSet resultSet = checkStmt.executeQuery();
	            resultSet.next();
	            int count = resultSet.getInt("count");
	            if (count > 0) {
	                // Username already exists
	                JOptionPane.showMessageDialog(null, "Username already exists. Please choose a different username.");
	                return false;
	            }
	        }
        
	     // Insert the new record since the username is unique
	        String insertQuery = "INSERT INTO ClientRegisterAcc (firstname, surname, address, username, password) VALUES (?, ?, ?, ?, ?)";
	        try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
	            insertStmt.setString(1, firstname);
	            insertStmt.setString(2, surname);
	            insertStmt.setString(3, address);
	            insertStmt.setString(4, username);
	            insertStmt.setString(5, password);

	            int rowsAffected = insertStmt.executeUpdate();
            
	            if (rowsAffected > 0) {
	                ResultSet generatedKeys = insertStmt.getGeneratedKeys();
	                if (generatedKeys.next()) {
	                    int generatedId = generatedKeys.getInt(1);
	                }
	                return true; // Registration successful
	            } else {
	                System.out.println("No rows affected");
	                return false;
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace(); // Log the exception details or use a logging framework
	        return false;
	    }
	}

    private boolean isEmptyOrBlank(String str) {
    return str == null || str.trim().isEmpty();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}