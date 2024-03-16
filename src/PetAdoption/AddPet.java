package PetAdoption;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;


public class AddPet extends JFrame {
	private JTextField nameField;
    private JTextField ageField;
    private JTextField birthdayField;
    private JTextField breedField;
    private JTextField colorField;
    private JTable productTable;
    private DefaultTableModel tableModel;
    private JLabel imageLabel;
    private String selectedImagePath;
    private String saveFolderPath = "C:\\PetAdoption\\PetAvail";
    private File productDataFile = new File(saveFolderPath, "PetsAdded.txt");
    protected String folderPath;
    private static final int IMAGE_SIZE = 200; // Size of the square area to display the image
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField genderField;
	private JTextField statusField;
	private JTextField weightField;
	private JTextField imagePathField;
	private JTextField historyField;
	private JTextField healthstatusField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddPet frame = new AddPet();
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
	public AddPet() {
		setTitle("Admin-AddPet");
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setBounds(100, 100, 836, 571);
	     contentPane = new JPanel();
	     contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	     setLocationRelativeTo(null);
	     
	     setContentPane(contentPane);
	     contentPane.setLayout(null);
	     
		JPanel panel = new JPanel();
        panel.setBackground(new Color(153, 204, 204));
        getContentPane().add(panel);
        panel.setBounds(0,0,812, 551);

        // Labels
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel birthdayLabel = new JLabel("Birthday:");
        birthdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel breedLabel = new JLabel("Breed:");
        breedLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel colorLabel = new JLabel("Color:");
        colorLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel statusLabel = new JLabel("Status:");
        statusLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        JLabel weightLabel = new JLabel("Weight:");
        weightLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        // Text Fields
        nameField = new JTextField();
        ageField = new JTextField();
        birthdayField = new JTextField();
        breedField = new JTextField();
        colorField = new JTextField();
        genderField = new JTextField();
        statusField = new JTextField();
        weightField = new JTextField();


        // Buttons
        JButton addPetButton = new JButton("Add Pet");
        addPetButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
     
        JButton addImageButton = new JButton("Add Image");
        addImageButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        

        // Image Label
        imageLabel = new JLabel();

        // Set layout and add components to the panel
        panel.setLayout(null);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(birthdayLabel);
        panel.add(birthdayField);
        panel.add(breedLabel);
        panel.add(breedField);
        panel.add(colorLabel);
        panel.add(colorField);
        panel.add(genderLabel);
        panel.add(genderField);
        panel.add(statusLabel);
        panel.add(statusField);
        
        panel.add(weightField);
        panel.add(weightLabel);
        
  
        panel.add(addPetButton);
        panel.add(addImageButton);
        panel.add(backButton);
        panel.add(imageLabel);

        // Set bounds for the components
        nameLabel.setBounds(10, 42, 100, 20);
        nameField.setBounds(120, 40, 200, 20);
        ageLabel.setBounds(10, 72, 100, 20);
        ageField.setBounds(120, 70, 200, 20);
        birthdayLabel.setBounds(10, 102, 100, 20);
        birthdayField.setBounds(120, 100, 200, 20);
        breedLabel.setBounds(10, 132, 100, 20);
        breedField.setBounds(120, 130, 200, 20);
        colorLabel.setBounds(10, 162, 100, 20);
        colorField.setBounds(120, 160, 200, 20);
        genderLabel.setBounds(10, 192, 100, 20);
        genderField.setBounds(120, 190, 200, 20);
        statusLabel.setBounds(10, 222, 100, 20);
        statusField.setBounds(120, 220, 200, 20);
        weightLabel.setBounds(10, 252, 100, 20);
        weightField.setBounds(120, 250, 200, 20);
        
        addPetButton.setBounds(331, 354, 87, 20);
        addImageButton.setBounds(678, 254, 113, 20);
        backButton.setBounds(10, 10, 87, 20);
        imageLabel.setBounds(500, 23, IMAGE_SIZE, IMAGE_SIZE);

        // Add action listeners to the buttons
        //TABLE
        addPetButton.addActionListener(e -> {
            String name = nameField.getText();
            String age = ageField.getText();
            String birthday = birthdayField.getText();
            String breed = breedField.getText();
            String color = colorField.getText();
            String gender = genderField.getText();
            String status = statusField.getText();
            String weight = weightField.getText();
            String healthstatus = healthstatusField.getText();
            String history = historyField.getText();
//
            

            Object[] rowData = {name, age, birthday, breed, color, gender, status, weight, healthstatus, history, selectedImagePath};
            tableModel.addRow(rowData);

            saveProductData();
            imageLabel.setIcon(null);
            selectedImagePath = null;
        });
        
        //SQL
        addPetButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		String enteredpetname = nameField.getText();
                String enteredpetage = ageField.getText();
                String enteredpetbreed = breedField.getText();
                String enteredpetweight = weightField.getText();
                String enteredpetcolor = colorField.getText();
                String enteredpetgender = genderField.getText();
                String enteredpetbirthday = birthdayField.getText();
                String enteredhealthstatus = healthstatusField.getText();
                String enteredhistory = historyField.getText();
                String enteredstatus = statusField.getText();
                String enteredpetimagepath = imagePathField.getText();

                if (isEmptyOrBlank(enteredpetname) || isEmptyOrBlank(enteredpetage) || isEmptyOrBlank(enteredpetbreed) || isEmptyOrBlank(enteredpetweight) || isEmptyOrBlank(enteredpetcolor) || isEmptyOrBlank(enteredpetgender) || isEmptyOrBlank(enteredpetbirthday) || isEmptyOrBlank(enteredhealthstatus) || isEmptyOrBlank(enteredhistory) || isEmptyOrBlank(enteredstatus) || isEmptyOrBlank(enteredpetimagepath)) {
                    JOptionPane.showMessageDialog(AddPet.this, "Please Fill All Fields!");
                } else {
                    // Proceed with adding the pet
                    	boolean registrationStatus = addPetFunction(enteredpetname, enteredpetage, enteredpetbreed, enteredpetweight, enteredpetcolor, enteredpetgender, enteredpetbirthday, enteredhealthstatus, enteredhistory, enteredstatus,  enteredpetimagepath);
                    if (registrationStatus) {
                        JOptionPane.showMessageDialog(AddPet.this, "Registration Successful!");                        
    					AllPetsAdmin next = new AllPetsAdmin();
    					next.setVisible(true);
    					AddPet.this.dispose(); // Close the current frame
                    } else {
                        JOptionPane.showMessageDialog(AddPet.this, "Registration Failed!");
                    }
                }
 	
        	}
        	
        });

        addImageButton.addActionListener(e -> {
            selectedImagePath = "C:\\PetAdoption\\PetAvail";

            File selectedFolder = new File(selectedImagePath);
            File[] files = selectedFolder.listFiles();

            if (files == null || files.length == 0) {
                JOptionPane.showMessageDialog(AddPet.this,
                        "No images found in the selected folder.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            JFileChooser fileChooser = new JFileChooser(selectedImagePath);
            fileChooser.setDialogTitle("Select Image File");
            fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files (*.jpg, *.png, *.gif)", "jpg", "png", "gif"));

            int userSelection = fileChooser.showOpenDialog(AddPet.this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                selectedImagePath = selectedFile.getAbsolutePath();
                ImageIcon imageIcon = new ImageIcon(selectedImagePath);
                Image image = imageIcon.getImage().getScaledInstance(IMAGE_SIZE, IMAGE_SIZE, Image.SCALE_DEFAULT);
                ImageIcon resizedIcon = new ImageIcon(image);
                imageLabel.setIcon(resizedIcon);
                imagePathField.setText(selectedImagePath);
            }
        });

        backButton.addActionListener(e -> {
            // Code to dispose current frame
            dispose();
            
            // Code to navigate back to the PET frame
            // Replace "PETFrame" with the actual name of your PET frame class
            AllPetsAdmin frame = new AllPetsAdmin();
            frame.setVisible(true); // Assuming PETFrame extends JFrame
        });

        
        
        // Create the table model
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Name");
        tableModel.addColumn("Age");
        tableModel.addColumn("Birthday");
        tableModel.addColumn("Breed");
        tableModel.addColumn("Color");
        tableModel.addColumn("Gender");
        tableModel.addColumn("Status");
        tableModel.addColumn("Weight");
        tableModel.addColumn("Health Status");
        tableModel.addColumn("History");
        tableModel.addColumn("Image Path");
        
        
       ;


        // Create the product table and add it to a scroll pane
        
       productTable = new JTable(tableModel);
       productTable.setOpaque(false);
        JScrollPane scrollPane = new JScrollPane(productTable);
        scrollPane.setBounds(0, 384, 802, 157);
        panel.add(scrollPane);
        
        imagePathField = new JTextField();
        imagePathField.setEditable(false);
        imagePathField.setBounds(470, 253, 200, 20);
        panel.add(imagePathField);
        
        JLabel imagePathLabel = new JLabel("Image Path:");
        imagePathLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        imagePathLabel.setBounds(360, 253, 100, 20);
        panel.add(imagePathLabel);
        
        historyField = new JTextField();
        historyField.setBounds(121, 310, 200, 64);
        panel.add(historyField);
        
        healthstatusField = new JTextField();
        healthstatusField.setText("");
        healthstatusField.setColumns(10);
        healthstatusField.setBounds(120, 280, 200, 19);
        panel.add(healthstatusField);
        
        JLabel labelStatus = new JLabel("Health Status:");
        labelStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
        labelStatus.setBounds(10, 282, 100, 25);
        panel.add(labelStatus);
        
        JLabel labelHistory = new JLabel("History:");
        labelHistory.setFont(new Font("Tahoma", Font.PLAIN, 15));
        labelHistory.setBounds(10, 311, 87, 25);
        panel.add(labelHistory);

        productTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = productTable.getSelectedRow();
                if (selectedRow != -1) {
                    String imagePath = tableModel.getValueAt(selectedRow, 10).toString();
                    if (imagePath != null && !imagePath.isEmpty()) {
                        ImageIcon imageIcon = new ImageIcon(imagePath);
                        Image image = imageIcon.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
                        ImageIcon resizedIcon = new ImageIcon(image);
                        JOptionPane.showMessageDialog(AddPet.this,
                                "Name: " + tableModel.getValueAt(selectedRow, 0) +
                                        "\nAge: " + tableModel.getValueAt(selectedRow, 1) +
                                        "\nBirthday: " + tableModel.getValueAt(selectedRow, 2) +
                                        "\nBreed: " + tableModel.getValueAt(selectedRow, 3) +
                                        "\nColor: " + tableModel.getValueAt(selectedRow, 4) +
                                        "\nGender: " + tableModel.getValueAt(selectedRow, 5) +
                                        "\nStatus: " + tableModel.getValueAt(selectedRow, 6) +
                                        "\nWeight: " + tableModel.getValueAt(selectedRow, 7) +
                                        "\nHealthStatus: " + tableModel.getValueAt(selectedRow, 8) +
                                        "\nHistory: " + tableModel.getValueAt(selectedRow, 9),
                                        
                                      
                                        

                                "Pet Details", JOptionPane.INFORMATION_MESSAGE, resizedIcon);
                    } else {
                        JOptionPane.showMessageDialog(AddPet.this,
                        		"Name: " + tableModel.getValueAt(selectedRow, 0) +
                                "\nAge: " + tableModel.getValueAt(selectedRow, 1) +
                                "\nBirthday: " + tableModel.getValueAt(selectedRow, 2) +
                                "\nBreed: " + tableModel.getValueAt(selectedRow, 3) +
                                "\nColor: " + tableModel.getValueAt(selectedRow, 4) +
                                "\nGender: " + tableModel.getValueAt(selectedRow, 5) +
                                "\nStatus: " + tableModel.getValueAt(selectedRow, 6) +
                                "\nWeight: " + tableModel.getValueAt(selectedRow, 7) +
                                "\nHealthStatus: " + tableModel.getValueAt(selectedRow, 8) +
                                "\nHistory: " + tableModel.getValueAt(selectedRow, 9),
                                
                                "Pet Details", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        });

        // Set up the initial size and visibility of the frame
        loadProductData();
        setSize(816, 578);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void saveProductData() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(productDataFile))) {
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < tableModel.getColumnCount(); j++) {
                    sb.append(tableModel.getValueAt(i, j));
                    if (j < tableModel.getColumnCount() - 1) {
                        sb.append(",");
                    }
                }
                writer.println(sb.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadProductData() {
        if (productDataFile.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(productDataFile))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] rowData = line.split(",");
                    tableModel.addRow(rowData);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
  
    private boolean addPetFunction(String petName, String petAge, String petBreed, String petWeight, String petColor, String petGender, String petBirthday, String petHealthStatus, String petHistory, String petStatus, String petImagePath) {
        try {
            if (isEmptyOrBlank(nameField.getText()) || isEmptyOrBlank(ageField.getText()) || isEmptyOrBlank(breedField.getText())
                    || isEmptyOrBlank(weightField.getText()) || isEmptyOrBlank(colorField.getText()) || isEmptyOrBlank(genderField.getText()) || isEmptyOrBlank(birthdayField.getText()) || isEmptyOrBlank(healthstatusField.getText()) || isEmptyOrBlank(historyField.getText()) || isEmptyOrBlank(statusField.getText()) || isEmptyOrBlank(imagePathField.getText()) ) {
                // If any field is empty or blank, return false indicating failure
                return false;
            }
            String url = "jdbc:sqlserver://ANDI;databasename=PeTAdoption;integratedSecurity=true;encrypt=false;"; 
            Connection conn = DriverManager.getConnection(url);

            // Insert the new record without checking for existing usernames
            String insertQuery = "INSERT INTO AddPet (petName, petAge, petBreed, petWeight, petColor, petGender, petBirthday, petHealthStatus, petHistory, petStatus, petImagePath) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                insertStmt.setString(1, petName);
                insertStmt.setString(2, petAge);
                insertStmt.setString(3, petBreed);
                insertStmt.setString(4, petWeight);
                insertStmt.setString(5, petColor);
                insertStmt.setString(6, petGender);
                insertStmt.setString(7, petBirthday);
                insertStmt.setString(8, petHealthStatus);
                insertStmt.setString(9, petHistory);
                insertStmt.setString(10, petStatus);
                insertStmt.setString(11, petImagePath);



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
    private void clearFields() {
        nameField.setText("");
        ageField.setText("");
        birthdayField.setText("");
        breedField.setText("");
        colorField.setText("");
        genderField.setText("");
        statusField.setText("");
        weightField.setText("");
        statusField.setText("");
        healthstatusField.setText("");
        historyField.setText("");
        imagePathField.setText("");
    }
}