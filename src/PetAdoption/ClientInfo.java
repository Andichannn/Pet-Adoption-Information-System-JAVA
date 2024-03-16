package PetAdoption;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;

public class ClientInfo extends JFrame {
    private Connection connection;
    private JComboBox<String> idComboBox;
    private JButton viewButton;
    JComboBox<String> approvedBox = new JComboBox<>();
    JComboBox<String> declinedBox = new JComboBox<>();

    public ClientInfo() {
        super("SQL Data Viewer");
        setTitle("");
        getContentPane().setBackground(new Color(153, 204, 204));
        setSize(727, 653);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);

        
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.text);
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(102, 8, 510, 589);
        getContentPane().add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("CLIENT'S STATUS & INFORMATION");
        lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 23));
        lblNewLabel.setBounds(53, 156, 405, 30);
        panel.add(lblNewLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(null);
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(39, 196, 431, 95);
        panel.add(panel_1);
                panel_1.setLayout(null);
        
        JLabel label = new JLabel("Select Username:");
        label.setBounds(30, 51, 131, 26);
        panel_1.add(label);
        label.setFont(new Font("Tahoma", Font.PLAIN, 17));
                
        JLabel lblNewLabel_1 = new JLabel("PENDING CLIENTS");
        lblNewLabel_1.setBounds(29, 8, 191, 40);
        panel_1.add(lblNewLabel_1);
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                        
        idComboBox = new JComboBox<>();
        idComboBox.setBounds(170, 55, 146, 21);
        panel_1.add(idComboBox);
        idComboBox.setEditable(false);
                                
        viewButton = new JButton("View");
        viewButton.setBounds(345, 50, 67, 28);
        panel_1.add(viewButton);
        viewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
                                        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(null);
        panel_2.setBackground(Color.WHITE);
        panel_2.setBounds(39, 336, 431, 97);
        panel.add(panel_2);
        panel_2.setLayout(null);
                                        
        JLabel lblNewLabel_1_1 = new JLabel("APPROVED CLIENTS");
        lblNewLabel_1_1.setBounds(32, 9, 216, 40);
        panel_2.add(lblNewLabel_1_1);
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                                                
        JLabel label_1 = new JLabel("Select Username:");
        label_1.setBounds(33, 44, 134, 40);
        panel_2.add(label_1);
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
                                                        
        approvedBox = new JComboBox<>();
        approvedBox.setBounds(172, 57, 147, 21);
        panel_2.add(approvedBox);
                                                                
        JButton approvedBTN = new JButton("View");
        approvedBTN.setBounds(349, 50, 67, 27);
        panel_2.add(approvedBTN);
        approvedBTN.setFont(new Font("Tahoma", Font.PLAIN, 14));
                                                                        
        JPanel panel_3 = new JPanel();
        panel_3.setBorder(null);
        panel_3.setBackground(Color.WHITE);
        panel_3.setBounds(39, 475, 431, 88);
        panel.add(panel_3);
        panel_3.setLayout(null);
                                                                        
        JLabel lblNewLabel_1_1_1 = new JLabel("DECLINED CLIENTS");
        lblNewLabel_1_1_1.setBounds(23, 8, 202, 31);
        panel_3.add(lblNewLabel_1_1_1);
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                                                                                
        JLabel label_1_1 = new JLabel("Select Username:");
        label_1_1.setBounds(23, 44, 138, 33);
        panel_3.add(label_1_1);
        label_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        declinedBox.setBounds(165, 50, 148, 21);
        panel_3.add(declinedBox);
                                                                                        
        JButton declinedBTN = new JButton("View");
        declinedBTN.setBounds(344, 45, 68, 26);
        panel_3.add(declinedBTN);
        declinedBTN.setFont(new Font("Tahoma", Font.PLAIN, 14));
                                                                                                
        JLabel lblNewLabel_2 = new JLabel("HAPPY PAW'S");
        lblNewLabel_2.setFont(new Font("Bell MT", Font.BOLD, 25));
        lblNewLabel_2.setBounds(171, 98, 182, 30);
        panel.add(lblNewLabel_2);
                                                                                                
        JLabel lblNewLabel_3 = new JLabel("Pet Adoption Center");
        lblNewLabel_3.setFont(new Font("Bell MT", Font.PLAIN, 15));
        lblNewLabel_3.setBounds(196, 127, 130, 13);
        panel.add(lblNewLabel_3);
                                                                                                
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\PetAdoption\\DESIGN ANG LOGO\\HAPPYsmall.png"));
        lblNewLabel_4.setBounds(158, -22, 206, 143);
        panel.add(lblNewLabel_4);
        
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
        
        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		AfterLogInAdmin next = new AfterLogInAdmin();
				next.setVisible(true);
				dispose();
        	}
        });
        lblNewLabel_6.setIcon(new ImageIcon("C:\\Pet Adopt Pics\\DESIGN AND LOGO\\backbuttonlegitlegit.png"));
        lblNewLabel_6.setBounds(10, 10, 55, 36);
        panel.add(lblNewLabel_6);
                                                                                                
        declinedBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String selectedUsername = declinedBox.getSelectedItem().toString();
                 displayData(selectedUsername);
                 String firstname = retrieveFirstname(selectedUsername);
                 String surname = retrieveSurname(selectedUsername);
                 String address = retrieveAddress(selectedUsername);
                 String birthday = retrieveBirthday(selectedUsername);
                 String occupation = retrieveOccupation(selectedUsername);
                 String petpreference = retrievePetPreference(selectedUsername);
                 String selectedpet = retrieveSelectedPet(selectedUsername);
                 String petdisability = retrievePetDisability(selectedUsername);
                 String residence = retrieveResidence(selectedUsername);
                 String permission = retrievePermission(selectedUsername);
                 String otherpet = retrieveOtherpet(selectedUsername);
                 String lifestyle = retrieveLifestyle(selectedUsername);
                 String activeness = retrieveActiveness(selectedUsername);
                 String ownedpet = retrieveOwnedPet(selectedUsername);
                 String behavior = retrieveBehavior(selectedUsername);
                 String volunteer = retrieveVolunteer(selectedUsername);
                 String responsibility = retrieveResponsibility(selectedUsername);
                 String financially = retrieveFinancially(selectedUsername);
                 String invest = retrieveInvest(selectedUsername);
                 String email = retrieveEmail(selectedUsername);
                 String number = retrieveNumber(selectedUsername);
                                                                                                
                 DeclinedProcessing next = new DeclinedProcessing(connection, selectedUsername, firstname, surname, address, birthday, occupation, petpreference, selectedpet, petdisability, residence, permission, otherpet, lifestyle, activeness, ownedpet, behavior, volunteer, responsibility, financially, invest, email, number);
                 next.setVisible(true);
                 dispose();
               }
           });
                                                                        
          approvedBTN.addActionListener(new ActionListener() {
             @Override
              public void actionPerformed(ActionEvent e) {
                  String selectedUsername = approvedBox.getSelectedItem().toString();
                  displayData(selectedUsername);
                  String firstname = retrieveFirstname(selectedUsername);
                  String surname = retrieveSurname(selectedUsername);
                  String address = retrieveAddress(selectedUsername);
                  String birthday = retrieveBirthday(selectedUsername);
                  String occupation = retrieveOccupation(selectedUsername);
                  String petpreference = retrievePetPreference(selectedUsername);
                  String selectedpet = retrieveSelectedPet(selectedUsername);
                  String petdisability = retrievePetDisability(selectedUsername);
                  String residence = retrieveResidence(selectedUsername);
                  String permission = retrievePermission(selectedUsername);
                  String otherpet = retrieveOtherpet(selectedUsername);
                  String lifestyle = retrieveLifestyle(selectedUsername);
                  String activeness = retrieveActiveness(selectedUsername);
                  String ownedpet = retrieveOwnedPet(selectedUsername);
                  String behavior = retrieveBehavior(selectedUsername);
                  String volunteer = retrieveVolunteer(selectedUsername);
                  String responsibility = retrieveResponsibility(selectedUsername);
                  String financially = retrieveFinancially(selectedUsername);
                  String invest = retrieveInvest(selectedUsername);
                  String email = retrieveEmail(selectedUsername);
                  String number = retrieveNumber(selectedUsername);
                                                                        
                                                                        
           ApprovedProcessing next = new ApprovedProcessing(connection, selectedUsername, firstname, surname, address, birthday, occupation, petpreference, selectedpet, petdisability, residence, permission, otherpet, lifestyle, activeness, ownedpet, behavior, volunteer, responsibility, financially, invest, email, number);
                 next.setVisible(true);
                 dispose();
               }
         });
                                        
          viewButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                  String selectedUsername = idComboBox.getSelectedItem().toString();
                  displayData(selectedUsername);
                  String firstname = retrieveFirstname(selectedUsername);
                  String surname = retrieveSurname(selectedUsername);
                  String address = retrieveAddress(selectedUsername);
                  String birthday = retrieveBirthday(selectedUsername);
                  String occupation = retrieveOccupation(selectedUsername);
                  String petpreference = retrievePetPreference(selectedUsername);
                  String selectedpet = retrieveSelectedPet(selectedUsername);
                  String petdisability = retrievePetDisability(selectedUsername);
                  String residence = retrieveResidence(selectedUsername);
                  String permission = retrievePermission(selectedUsername);
                  String otherpet = retrieveOtherpet(selectedUsername);
                  String lifestyle = retrieveLifestyle(selectedUsername);
                  String activeness = retrieveActiveness(selectedUsername);
                  String ownedpet = retrieveOwnedPet(selectedUsername);
                  String behavior = retrieveBehavior(selectedUsername);
                  String volunteer = retrieveVolunteer(selectedUsername);
                  String responsibility = retrieveResponsibility(selectedUsername);
                  String financially = retrieveFinancially(selectedUsername);
                  String invest = retrieveInvest(selectedUsername);
                  String email = retrieveEmail(selectedUsername);
                  String number = retrieveNumber(selectedUsername);
                                        
                  AdoptionProcessing next = new AdoptionProcessing(connection, selectedUsername, firstname, surname, address, birthday, occupation, petpreference, selectedpet, petdisability, residence, permission, otherpet, lifestyle,activeness, ownedpet, behavior, volunteer, responsibility, financially, invest, email, number);
                       next.setVisible(true);
                       dispose();
                 }
           });

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

    private String retrieveFirstname(String username) {
        try {
            String query = "SELECT clientFirstname FROM PetAdoptionFillForm WHERE clientUsername = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("clientFirstname"); // Corrected column name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String retrieveSurname(String username) {
        try {
            String query = "SELECT clientSurname FROM PetAdoptionFillForm WHERE clientUsername = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();
// correct
            if (resultSet.next()) {
                return resultSet.getString("clientSurname"); // Corrected column name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String retrieveAddress(String username) {
        try {
            String query = "SELECT clientAddress FROM PetAdoptionFillForm WHERE clientUsername = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString("clientAddress"); // Corrected column name
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

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
        
        private String retrieveOccupation(String username) {
            try {
                String query = "SELECT clientOccupation FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientOccupation"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveBirthday(String username) {
            try {
                String query = "SELECT clientBirthday FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientBirthday"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrievePetPreference(String username) {
            try {
                String query = "SELECT clientPetpreference FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientPetpreference"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveSelectedPet(String username) {
            try {
                String query = "SELECT clientPetYouWant FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientPetYouWant"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrievePetDisability(String username) {
            try {
                String query = "SELECT clientPetdisability FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientPetdisability"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveResidence(String username) {
            try {
                String query = "SELECT clientResidence FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientResidence"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }

        private String retrievePermission (String username) {
            try {
                String query = "SELECT clientPermission FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientPermission"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveOtherpet (String username) {
            try {
                String query = "SELECT clientOtherPetsOwned FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientOtherPetsOwned"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveLifestyle (String username) {
            try {
                String query = "SELECT clientActiveLifeStyle FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientActiveLifeStyle"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveActiveness (String username) {
            try {
                String query = "SELECT clientActiveness FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientActiveness"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveOwnedPet (String username) {
            try {
                String query = "SELECT clientPreviousExperience FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientPreviousExperience"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        
        private String retrieveVolunteer (String username) {
            try {
                String query = "SELECT clientVolunteer FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientVolunteer"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveResponsibility (String username) {
            try {
                String query = "SELECT clientResponsibility FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientResponsibility"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveFinancially (String username) {
            try {
                String query = "SELECT clientFinancially FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientFinancially"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }

        private String retrieveBehavior (String username) {
            try {
                String query = "SELECT clientBehavior FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientBehavior"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        private String retrieveInvest (String username) {
            try {
                String query = "SELECT clientInvest FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientInvest"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }

        private String retrieveEmail (String username) {
            try {
                String query = "SELECT clientEmail FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientEmail"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }
        
        private String retrieveNumber (String username) {
            try {
                String query = "SELECT clientNumber FROM PetAdoptionFillForm WHERE clientUsername = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, username);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    return resultSet.getString("clientNumber"); // Corrected column name
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
    }

    private void displayData(String username) {
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
                new ClientInfo().setVisible(true);
            }
        });
    }
}