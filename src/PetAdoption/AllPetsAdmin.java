package PetAdoption;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class AllPetsAdmin extends JFrame implements ActionListener {
    private JButton logoutButton, previousButton, nextButton;
    private AddPet mainFrame;
    private JPanel panel_0, imagePanel;
    private List<String> imagePaths;
    private int currentImageIndex;
    private JLabel lblNewLabel;
    private JPanel contentPane;
    private JButton btnAddPet;
    private JButton btnBack;
    
    private static final long serialVersionUID = 1L;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private JLabel dataLabel;
    private int currentRowIndex = 0;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;

//    public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AllPetsAdmin frame = new AllPetsAdmin();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//

    
    public AllPetsAdmin() {
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setBounds(100, 100, 836, 571);
	     contentPane = new JPanel();
	     contentPane.setBackground(new Color(153, 204, 204));
	     contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	     setLocationRelativeTo(null);
	     
	     setContentPane(contentPane);
        contentPane.setLayout(null);

      //  ImageIcon logoIcon = new ImageIcon("JAVAChip.png");
   
//        Image logoImage = logoIcon.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH);
//        logoIcon = new ImageIcon(logoImage);
//        lblNewLabel.setIcon(logoIcon);


        // Big Square
        panel_0 = new JPanel();
        panel_0.setBounds(269, 10, 510, 275);
        panel_0.setBackground(new Color(241, 241, 241));
        getContentPane().add(panel_0);
        panel_0.setLayout(null);

        imagePanel = new JPanel();
        imagePanel.setBounds(-22, 10, 542, 282);
        imagePanel.setBackground(new Color(241, 241, 241));
        panel_0.add(imagePanel);
        
                // Previous and Next Buttons
                previousButton = new JButton("Previous");
                previousButton.setBounds(269, 494, 85, 30);
                contentPane.add(previousButton);
                
                        nextButton = new JButton("Next");
                        nextButton.setBounds(694, 494, 85, 30);
                        contentPane.add(nextButton);
                        nextButton.addActionListener(this);
                previousButton.addActionListener(this);
                
             // Create the JLabel to display data
                dataLabel = new JLabel();
                dataLabel.setBounds(269, 295, 510, 189);
                getContentPane().add(dataLabel);
                
                        logoutButton = new JButton("Logout");
                        logoutButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        logoutButton.setBounds(33, 414, 183, 30);
                        contentPane.add(logoutButton);
                        logoutButton.addMouseListener(new MouseAdapter() {
                        	@Override
                        	public void mouseClicked(MouseEvent e) {
                        		MainActivity allpets = new MainActivity();
                            	allpets.setVisible(true);
                            	dispose();
                        	}
                        });
                        logoutButton.setBackground(SystemColor.text);
                        logoutButton.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
                        
                        btnAddPet = new JButton("Add Pet");
                        btnAddPet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        btnAddPet.setBounds(33, 374, 183, 30);
                        contentPane.add(btnAddPet);
                        btnAddPet.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent e) {
                        	AddPet allpets = new AddPet();
                        	allpets.setVisible(true);
                        	dispose();
                        	}
                        });
                        btnAddPet.setBackground(SystemColor.text);
                        btnAddPet.setBorder(new EmptyBorder(0, 0, 0, 0));
                        
                        btnBack = new JButton("Back");
                        btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        btnBack.setBounds(31, 330, 185, 30);
                        contentPane.add(btnBack);
                        btnBack.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent e) {
                        	AfterLogInAdmin AfterLogInAdmin = new AfterLogInAdmin();
                        	AfterLogInAdmin.setVisible(true);
                            dispose();
                        	}
                        });
                        btnBack.setBorder(new EmptyBorder(0, 0, 0, 0));
                        btnBack.setBackground(SystemColor.text);
                        
                        lblNewLabel_1 = new JLabel("HAPPY PAW'S");
                        lblNewLabel_1.setFont(new Font("Bell MT", Font.BOLD, 25));
                        lblNewLabel_1.setBounds(45, 64, 226, 28);
                        contentPane.add(lblNewLabel_1);
                        
                        lblNewLabel_2 = new JLabel("Pet Adoption Center");
                        lblNewLabel_2.setFont(new Font("Bell MT", Font.PLAIN, 15));
                        lblNewLabel_2.setBounds(68, 90, 214, 18);
                        contentPane.add(lblNewLabel_2);
                        
                        lblNewLabel_3 = new JLabel("");
                        lblNewLabel_3.setIcon(new ImageIcon("C:\\PetAdoption\\DESIGN ANG LOGO\\HAPPYsmall.png"));
                        lblNewLabel_3.setBounds(33, 102, 148, 126);
                        contentPane.add(lblNewLabel_3);
                        logoutButton.addActionListener(this);

             // Connect to the database and retrieve data
                try {
                    String url = "jdbc:sqlserver://ANDI;databasename=PetAdoption;integratedSecurity=true;encrypt=false;";
                    connection = DriverManager.getConnection(url);
                    statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    resultSet = statement.executeQuery("SELECT * FROM AddPet"); // Replace with your table name

                    // Display data for the first row initially
                    displayNextRow();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

        loadImagesFromProductData();
        displayImage(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == previousButton) {
            // Decrease the current image index to go to the previous image
            displayImage(-1);
        } else if (e.getSource() == nextButton) {
            // Increase the current image index to go to the next image
            displayImage(1);
        }
        if (e.getSource() == nextButton) {
            try {
                displayNextRow();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        } else if (e.getSource() == previousButton) {
            try {
                displayPreviousRow();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
    private void loadImagesFromProductData() {
        imagePaths = new ArrayList<>();
        String productFilePath = "C:\\PetAdoption\\PetAvail\\PetsAdded.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(productFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] productData = line.split(",");
                String imagePath = productData[10];
                imagePaths.add(imagePath);
            }
        } catch (IOException e) {
        }}
    private void displayImage(int index) {
        if (imagePaths.isEmpty())
            return;

        int newIndex = currentImageIndex + index;

        // Check if the new index is within bounds
        if (newIndex < 0 || newIndex >= imagePaths.size()) {
            // If the new index is out of bounds, do nothing
            return;
        }

        // Update the currentImageIndex
        currentImageIndex = newIndex;

        // Retrieve the image path based on the updated index
        String imagePath = imagePaths.get(currentImageIndex);
        ImageIcon imageIcon = new ImageIcon(imagePath);
        Image image = imageIcon.getImage().getScaledInstance(imagePanel.getWidth(), imagePanel.getHeight(), Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);


        // Create a new JLabel to display the image
        JLabel imageLabel = new JLabel(imageIcon);
        imageLabel.setBounds(36, 10, 481, 242);

        // Add the new JLabel to the imagePanel
        imagePanel.removeAll();
        imagePanel.setLayout(null);
        imagePanel.add(imageLabel);
        imagePanel.revalidate();
        imagePanel.repaint();
    }
    private void displayNextRow() throws SQLException {
        if (resultSet.next()) {
            StringBuilder rowData = new StringBuilder();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                // Skip the columns petID and petImagePath
                if (columnName.equalsIgnoreCase("petID") || columnName.equalsIgnoreCase("petImagePath")) {
                    continue;
                }
                String columnValue = resultSet.getString(i);
                rowData.append(columnName).append(": ").append(columnValue).append("<br>");
            }
            dataLabel.setText("<html>" + rowData.toString() + "</html>");
            
            // Enable/disable the next and previous buttons based on the current position
            previousButton.setEnabled(true);
            if (resultSet.isFirst()) {
            	previousButton.setEnabled(false);
            } else {
            	previousButton.setEnabled(true);
            } 
// updated 
            
            
            if (resultSet.isLast()) {
                nextButton.setEnabled(false);
            } else {
                nextButton.setEnabled(true);
            }
        } else {
            dataLabel.setText("No more rows");
            nextButton.setEnabled(false);
        }

    }

    
    private void displayPreviousRow() throws SQLException {
        if (resultSet.previous()) {
            StringBuilder rowData = new StringBuilder();
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = metaData.getColumnName(i);
                // Skip the columns petID and petImagePath
                if (columnName.equalsIgnoreCase("petID") || columnName.equalsIgnoreCase("petImagePath")) {
                    continue;
                }
                String columnValue = resultSet.getString(i);
                rowData.append(columnName).append(": ").append(columnValue).append("<br>");
            }
            dataLabel.setText("<html>" + rowData.toString() + "</html>");
            
            // Enable/disable the next and previous buttons based on the current position
            nextButton.setEnabled(true);
            if (resultSet.isFirst()) {
                previousButton.setEnabled(false);
            } else {
                previousButton.setEnabled(true);
            }
        } else {
            dataLabel.setText("No more rows");
            previousButton.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AllPetsAdmin().setVisible(true));
    }

   
}