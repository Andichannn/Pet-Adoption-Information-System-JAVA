package PetAdoption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AdminRegister{
    JFrame frame;
    JPanel panel;
    JLabel title;
    JTextField Firstname;
    JTextField Surname;
    JTextField Address;
    JTextField Username;
    JTextField referralCode;
    JButton buttonAdminRegister;
    private JPasswordField Password;
    private JLabel lblNewLabel_5;
    private JButton btnNewButton;
    private JLabel lblNewLabel_6;
   
       public AdminRegister(){
            frame = new JFrame();
            frame.setSize(800,624);
    		frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.getContentPane().setLayout(null);
            frame.getContentPane().setBackground(new Color(153, 204, 204));
            frame.setLocationRelativeTo(null);
            
            
            panel = new JPanel();
            panel.setBackground(new Color(255, 255, 255));
            panel.setBounds(200,0,400,600);
            panel.setLayout(null);
            
            title = new JLabel("ADMIN REGISTRATION");
            title.setBounds(60,95,294,50);
            title.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 24));
            title.setForeground(new Color(0, 0, 0));
            
            Firstname = new JTextField("");
            Firstname.setToolTipText("Firstname");
            Firstname.setBounds(100,186,200,20);
            
            Surname = new JTextField("");
            Surname.setToolTipText("Surname");
            Surname.setBounds(100,239,200,20);
            
            Address = new JTextField("");
            Address.setToolTipText("Address");
            Address.setBounds(100,292,200,20);
            
            Username = new JTextField("");
            Username.setToolTipText("Username");
            Username.setBounds(100,345,200,20);
            
            referralCode = new JTextField("");
            referralCode.setToolTipText("Referral Code");
            referralCode.setBounds(100,458,200,20);
            
            buttonAdminRegister = new JButton("Register Now");
            buttonAdminRegister.addActionListener(new ActionListener() {
            	
            	public void actionPerformed(ActionEvent e) {
            		 String inputedText = referralCode.getText();
            	        String[] acceptedNumbers = {"P9Q2R4S", "N2P4Q6R", "F3G7H9J", "S8T1U3V", "X3Y7Z9A"}; 

            	        boolean isValidReferralCode = false;
            	        for (String acceptedNumber : acceptedNumbers) {
            	            if (inputedText.equals(acceptedNumber)) {
            	                isValidReferralCode = true;           	                           	           
            	                
            	            }
            	        }

            	        if (!isValidReferralCode) {
            	            JOptionPane.showMessageDialog(frame, "Invalid referral code!", null, JOptionPane.INFORMATION_MESSAGE);
            	        } else {
 
            	        }
            	    }
            	});
            buttonAdminRegister.addMouseListener(new MouseAdapter() {
            	@Override
            	public void mouseClicked(MouseEvent e) {
            		
            		String enteredfirstname = Firstname.getText();
                    String enteredsurname = Surname.getText();
                    String enteredaddress = Address.getText();
                    String enteredusername = Username.getText();
                    String enteredreferralcode = referralCode.getText();
                    String enteredpassword = new String(Password.getPassword());

                    if (isEmptyOrBlank(enteredfirstname) || isEmptyOrBlank(enteredsurname) || isEmptyOrBlank(enteredaddress) || isEmptyOrBlank(enteredusername) || isEmptyOrBlank(enteredpassword) || isEmptyOrBlank(enteredreferralcode)) {
                        JOptionPane.showMessageDialog(frame, "Please Fill All Fields!");
                    } else {
                        boolean registrationStatus = AdminRegisterAcc(enteredfirstname, enteredsurname, enteredaddress, enteredusername, enteredpassword, enteredreferralcode);
                        if (registrationStatus) {
                            JOptionPane.showMessageDialog(frame, "Registration Successful!", null, JOptionPane.INFORMATION_MESSAGE);                        
        					MainActivity next = new MainActivity();
        					next.setVisible(true);
        					frame.dispose(); // Close the current frame
                        } else {
                            JOptionPane.showMessageDialog(frame, "Registration Failed!", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            });
            buttonAdminRegister.setBounds(140,505,120,20);
            buttonAdminRegister.setBackground(new Color(153, 204, 204));
            buttonAdminRegister.setForeground(Color.white);
            buttonAdminRegister.setFocusable(false);
            panel.add(buttonAdminRegister);
            panel.add(referralCode);
            panel.add(Username);
            panel.add(Address);
            panel.add(Surname);
            panel.add(Firstname);
            panel.add(title);
            frame.getContentPane().add(panel);
            
            JLabel lblNewLabel = new JLabel("Firstname:");
            lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
            lblNewLabel.setBounds(100, 163, 77, 13);
            panel.add(lblNewLabel);
            
            JLabel lblNewLabel_1 = new JLabel("Surname:");
            lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
            lblNewLabel_1.setBounds(100, 216, 65, 13);
            panel.add(lblNewLabel_1);
            
            JLabel lblNewLabel_2 = new JLabel("Address:");
            lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
            lblNewLabel_2.setBounds(100, 269, 65, 13);
            panel.add(lblNewLabel_2);
            
            JLabel lblNewLabel_3 = new JLabel("Username:");
            lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
            lblNewLabel_3.setBounds(100, 322, 65, 13);
            panel.add(lblNewLabel_3);
            
            JLabel lblNewLabel_4 = new JLabel("Password:");
            lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
            lblNewLabel_4.setBounds(100, 375, 77, 13);
            panel.add(lblNewLabel_4);
            
            Password = new JPasswordField();
            Password.setToolTipText("Password");
            Password.setBounds(100, 398, 200, 20);
            panel.add(Password);
            
            lblNewLabel_5 = new JLabel("Referral Code:");
            lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
            lblNewLabel_5.setBounds(100, 435, 77, 13);
            panel.add(lblNewLabel_5);
            
            //
            btnNewButton = new JButton("Already have an account?");
            btnNewButton.setBackground(Color.WHITE);
    		btnNewButton.setForeground(new Color(0, 0, 255));
            btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
            btnNewButton.setBounds(115, 545, 173, 21);
    		btnNewButton.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
    		btnNewButton.setContentAreaFilled(false);
            btnNewButton.addActionListener(new ActionListener() {
            
            	public void actionPerformed(ActionEvent e) {
            		MainActivity asd = new MainActivity();
    				asd.setVisible(true);
    				frame.dispose();
            	}
            });
            panel.add(btnNewButton);

            //
            JButton rfrshButton = new JButton("");
            rfrshButton.setIcon(new ImageIcon("C:\\PetAdoption\\DESIGN ANG LOGO\\refresh2.png"));
            rfrshButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		Firstname.setText("");
                    Surname.setText("");
                    Address.setText("");
                    Username.setText("");
                    Password.setText("");
                    referralCode.setText("");
                
            	}
            });
            rfrshButton.setBounds(276, 155, 24, 21);
            panel.add(rfrshButton);
            
            lblNewLabel_6 = new JLabel("");
            lblNewLabel_6.setIcon(new ImageIcon("C:\\PetAdoption\\DESIGN ANG LOGO\\HAPPYsmall.png"));
            lblNewLabel_6.setBounds(100, 20, 200, 75);
            panel.add(lblNewLabel_6);
            frame.setVisible(true);
        }
    
    protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	public static void main(String args[]){
        AdminRegister ar = new AdminRegister();
    }
    
	private boolean AdminRegisterAcc(String adminFirstname, String adminSurname, String adminAddress, String adminUsername, String adminPassword, String adminReferralCode) {
        if (isEmptyOrBlank(adminFirstname) || isEmptyOrBlank(adminSurname) || isEmptyOrBlank(adminAddress) || isEmptyOrBlank(adminUsername) || isEmptyOrBlank(adminPassword) || isEmptyOrBlank(adminReferralCode))  {
            // If any field is empty or blank, return false indicating failure
            return false;
        }
      
        try {
            String url = "jdbc:sqlserver://ANDI;databasename=PetAdoption;integratedSecurity=true;encrypt=false;";
            Connection conn = DriverManager.getConnection(url);
            
         // Check if the username already exists
            String checkQuery = "SELECT COUNT(*) AS count FROM AdminRegisterAcc WHERE adminUsername = ?";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
                checkStmt.setString(1, adminUsername);
                ResultSet resultSet = checkStmt.executeQuery();
                resultSet.next();
                int count = resultSet.getInt("count");
                if (count > 0) {
                    // Username already exists
                    JOptionPane.showMessageDialog(frame, "Username already exists. Please choose a different username.");
                    return false;
                }
            }
          
            
         // Insert the new record since the username is unique
            String insertQuery = "INSERT INTO AdminRegisterAcc (adminFirstname, adminSurname, adminAddress, adminUsername, adminPassword, adminReferralCode) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                insertStmt.setString(1, adminFirstname);
                insertStmt.setString(2, adminSurname);
                insertStmt.setString(3, adminAddress);
                insertStmt.setString(4, adminUsername);
                insertStmt.setString(5, adminPassword);
                insertStmt.setString(6, adminReferralCode);

                int rowsAffected = insertStmt.executeUpdate();
              
                if (rowsAffected > 0) {
                    ResultSet generatedKeys = insertStmt.getGeneratedKeys();
                    if (generatedKeys.next()) {
                        int generatedId = generatedKeys.getInt(1);
                    }
                } else {
                    System.out.println("No rows affected");
                }

                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

      private boolean isEmptyOrBlank(String str) {
      return str == null || str.trim().isEmpty();
  }

	public void setVisible1(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
	