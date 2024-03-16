package PetAdoption;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class ClientStatus extends JFrame {
    private Connection connection;
    private JComboBox<String> idComboBox;
    JComboBox<String> approvedBox = new JComboBox<>();
    JComboBox<String> declinedBox = new JComboBox<>();

    public ClientStatus() {
        super("ClientStatus");
        setTitle("");
        getContentPane().setBackground(new Color(153, 204, 204));
        setSize(565, 563);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);


        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBorder(null);
        panel.setBounds(89, 10, 372, 500);
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("ADOPTION STATUS");
        lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 23));
        lblNewLabel.setBounds(76, 156, 226, 21);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_1_1_1 = new JLabel("DECLINED");
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_1_1_1.setBounds(60, 406, 116, 40);
        panel.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_2 = new JLabel("HAPPY PAW'S");
        lblNewLabel_2.setFont(new Font("Bell MT", Font.BOLD, 25));
        lblNewLabel_2.setBounds(100, 98, 187, 21);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("Pet Adoption Center");
        lblNewLabel_3.setFont(new Font("Bell MT", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(122, 119, 137, 13);
        panel.add(lblNewLabel_3);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\PetAdoption\\DESIGN ANG LOGO\\HAPPYsmall.png"));
        lblNewLabel_4.setBounds(90, 10, 151, 78);
        panel.add(lblNewLabel_4);
        
        JLabel lblNewLabel_5 = new JLabel("You can check your Adoption Status here.");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNewLabel_5.setBounds(70, 187, 251, 13);
        panel.add(lblNewLabel_5);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(SystemColor.text);
        panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel_1.setBounds(42, 221, 297, 47);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
                JLabel lblNewLabel_1 = new JLabel("PENDING");
                lblNewLabel_1.setBounds(10, 10, 116, 40);
                panel_1.add(lblNewLabel_1);
                lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                
                        idComboBox = new JComboBox<>();
                        idComboBox.setBounds(141, 24, 146, 21);
                        panel_1.add(idComboBox);
                        idComboBox.setEditable(false);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(SystemColor.text);
        panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel_2.setBounds(42, 295, 299, 100);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
                JLabel lblNewLabel_1_1 = new JLabel("APPROVED");
                lblNewLabel_1_1.setBounds(10, -4, 124, 40);
                panel_2.add(lblNewLabel_1_1);
                lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                
                        approvedBox = new JComboBox<>();
                        approvedBox.setBounds(143, 10, 146, 21);
                        panel_2.add(approvedBox);
                        
                        
                                JButton approvedBTN = new JButton("View");
                                approvedBTN.setBounds(120, 63, 67, 27);
                                panel_2.add(approvedBTN);
                                approvedBTN.setFont(new Font("Tahoma", Font.PLAIN, 14));
                                
                                        approvedBTN.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                String selectedUsername = approvedBox.getSelectedItem().toString();
                                                displayData1(selectedUsername);
                                                String firstname = retrieveName(selectedUsername);
                                                String surname = retrievePetAge(selectedUsername);
                                                String address = retrievePetBreed(selectedUsername);
                                
                                                ApprovedView next = new ApprovedView(connection, selectedUsername, firstname, surname, address);
                                                next.setVisible(true);
                                                dispose();
                                            }
                                        });
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(SystemColor.text);
        panel_3.setBorder(null);
        panel_3.setBounds(42, 405, 297, 47);
        panel.add(panel_3);
        panel_3.setLayout(null);
        declinedBox.setBounds(151, 10, 146, 21);
        panel_3.add(declinedBox);
        
        JLabel lblNewLabel_5_1 = new JLabel("Back");
        lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        });
        lblNewLabel_5_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
        lblNewLabel_5_1.setBounds(10, 10, 45, 13);
        panel.add(lblNewLabel_5_1);


        try {
            connection = DriverManager.getConnection("jdbc:sqlserver://ANDI;databasename=PetAdoption;integratedSecurity=true;encrypt=false");
            if (connection != null) {
                loadComboBoxData();
                displayDeclinedUsers(declinedBox);
                displayApprovedUsers(approvedBox);
            } else {
                System.err.println("Failed to establish the database connection.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //pet name
    private String retrieveName(String username) {
        try {
            String query = "SELECT clientPetYouWant FROM PetAdoptionFillForm WHERE clientUsername = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("clientPetYouWant"); // column name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //pet age
    private String retrievePetAge(String username) {
        try {
            String query = "SELECT petAge FROM AddPet WHERE petName = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if (resultSet.next()) {
                return resultSet.getString("petAge"); // column name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //pet breed
    private String retrievePetBreed(String username) {
        try {
            String query = "SELECT petBreed FROM AddPet WHERE petName = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("petBreed"); // Corrected column name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //=======================
    private void loadComboBoxData() {
        try {
            String query = "SELECT clientUsername FROM PetAdoptionFillForm WHERE clientUsername NOT IN (SELECT clientUsername FROM APPROVED UNION SELECT clientUsername FROM DECLINED)";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String username = resultSet.getString("clientUsername");
                idComboBox.addItem(username);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// DO NOT TOUCH
    private void displayData1(String username) {
        try {
            String query = "SELECT clientSurname FROM PetAdoptionFillForm WHERE clientUsername = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            StringBuilder dataBuilder = new StringBuilder();
            while (resultSet.next()) {
                String surname = resultSet.getString("clientSurname"); // Corrected column name
                dataBuilder.append("Surname: ").append(surname).append("\n");
            }

            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void displayApprovedUsers(JComboBox<String> approvedBox) {
        approvedBox.removeAllItems(); // Clear previous items

        try {
            String query = "SELECT clientUsername FROM APPROVED"; // Corrected column name
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String username = resultSet.getString("clientUsername"); // Corrected column name
                approvedBox.addItem(username);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void displayDeclinedUsers(JComboBox<String> declinedBox) {
        declinedBox.removeAllItems(); // Clear previous items

        try {
            String query = "SELECT clientUsername FROM DECLINED"; // Corrected column name
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String username = resultSet.getString("clientUsername"); // Corrected column name
                declinedBox.addItem(username);
            }

            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ClientStatus().setVisible(true);
            }
        });
    }
}
