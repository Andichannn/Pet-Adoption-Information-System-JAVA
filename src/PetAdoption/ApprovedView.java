	package PetAdoption;
	
import java.awt.EventQueue;
import java.sql.Connection;
import java.time.LocalDate;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
	
	public class ApprovedView extends JFrame implements ActionListener {
	
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private String username; // 
	    private JLabel lblName;
	    private JLabel lblAge;
	    private JLabel lblBreed;
	    private JLabel lblAddress;
	    private Connection connection;
	    
	    private JLabel currentDateLabel;
	    private JLabel addedThreeDaysField;
//	    private JTextField addedThreeDaysField;

	    private JButton addThreeDaysButton;
	    private JLabel lblNewLabel_2;
	    
	  
	
		/**
		 * Create the frame.
		 */
		public ApprovedView() {
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setBounds(100, 100, 612, 507);
		    contentPane = new JPanel();
		    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		    setContentPane(contentPane);
		    contentPane.setLayout(null);

		    lblName = new JLabel("Pet Name: ");
		    lblName.setBounds(10, 10, 294, 42);
		    lblName.setFont(new Font("Trebuchet MS", Font.PLAIN, 26));
		    contentPane.add(lblName);

		    lblAge = new JLabel("Age: ");
		    lblAge.setBounds(397, 10, 138, 13);
		    contentPane.add(lblAge);

		    lblBreed = new JLabel("Breed: ");
		    lblBreed.setBounds(396, 31, 139, 13);
		    contentPane.add(lblBreed);

		    lblAddress = new JLabel("Address: ");
		    lblAddress.setBounds(396, 54, 139, 13);
		    contentPane.add(lblAddress);
		    
		    JLabel lblNewLabel = new JLabel("get the date here to pick up your pet");
		    lblNewLabel.setBounds(10, 294, 223, 28);
		    contentPane.add(lblNewLabel);
		    
		    JButton btnNewButton = new JButton("click to view all pet information");
		    btnNewButton.setBounds(316, 392, 237, 57);
		    btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		    btnNewButton.setForeground(new Color(0, 0, 255));
		    contentPane.add(btnNewButton);
		    
		    JLabel label_1 = new JLabel("Date after 3 Days: ");
		    label_1.setBounds(0, 0, 0, 0);
		    getContentPane().add(label_1);
		     
		    JLabel lblNewLabel_1 = new JLabel("DATE TODAY: ");
	        lblNewLabel_1.setBounds(10, 73, 92, 22);
	        contentPane.add(lblNewLabel_1);

		    currentDateLabel = new JLabel();
		    currentDateLabel.setBounds(94, 70, 138, 28);
		    currentDateLabel.setText("date:");
		    contentPane.add(currentDateLabel);
	   
	        JLabel label = new JLabel("Current Date: ");
	        label.setBounds(0, 0, 0, 0);
	        getContentPane().add(label);
	        getContentPane().add(currentDateLabel);

	        
	        addThreeDaysButton = new JButton("click to get the date");
	        addThreeDaysButton.setBounds(34, 355, 152, 28);

	      
	        getContentPane().add(new JLabel("Date after 3 Days: "));
	        getContentPane().add(addThreeDaysButton);
	        
	        lblNewLabel_2 = new JLabel("DATE TO GET: ");
	        lblNewLabel_2.setBounds(10, 316, 93, 32);
	        contentPane.add(lblNewLabel_2);
	        
	        //
	        addedThreeDaysField = new JLabel();
	        addedThreeDaysField.setBounds(100, 319, 81, 28);
	        contentPane.add(addedThreeDaysField);
	        addedThreeDaysField.setText("********");
	        //set bounds
		    
	        addThreeDaysButton.addActionListener(this);
		}

		
		   // kailangan nasa constructor yung variable
		public ApprovedView(Connection connection, String username, String clientPetYouWant, String petAge, String petBreed) {
		    // Call the default constructor to initialize the frame
		    this(); 
		    this.connection = connection; // Add this line
		    this.username = username;
		    
		    // Initialize labels with default text
		    lblName.setText("Username: " + username);
		    lblAge.setText("Pet Name: " + clientPetYouWant);
		    lblBreed.setText("Pet Age: " + petAge);
		    lblAddress.setText("Pet Breed: " + petBreed);
		    LocalDate currentDate = LocalDate.now();
		    currentDateLabel.setText(currentDate.toString());
		    
		    
		    displayData1(username, clientPetYouWant, petAge, petBreed);
		}

	
	    // ito pang display sa frame yung nasa plus 
	    public void displayData1(String username, String clientPetYouWant, String petAge, String petBreed) {
	        lblName.setText("congrats, " + username + "!");
	        lblAge.setText("Pet Name: " + clientPetYouWant);
	        lblBreed.setText("Pet Age: " + petAge);
	        lblAddress.setText("Pet Breed: " + petBreed);
	    }
	
	
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == currentDateLabel) {
	            LocalDate currentDate = LocalDate.now();
	            currentDateLabel.setText(currentDate.toString());
	        } else if (e.getSource() == addThreeDaysButton) {
	            String inputDate = currentDateLabel.getText();
	            try {
	                LocalDate date = LocalDate.parse(inputDate);
	                LocalDate newDate = date.plusDays(3);
	                addedThreeDaysField.setText(newDate.toString());
	            } catch (Exception ex) {
	                addedThreeDaysField.setText("Invalid Date");
	            }
	        }
	    }

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ApprovedView gui = new ApprovedView();
            gui.setVisible(true);
        });
    }
}