package PetAdoption;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdoptionProcessing extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private String username;
    private JLabel lblUsername;
    private JLabel lblFirstname;
    private JLabel lblSurname;
    private JLabel lblAddress;
    private JLabel lblBirthday;
    private JButton btnApprove;
    private JButton btnDecline;
    private Connection connection;
    private JLabel lblOccupation;
    private JLabel lblPetPreference;
    private JLabel lblSelectedPet;
    private JLabel lblPetDisability;
    private JLabel lblResidence;
    private JLabel lblPermission;
    private JLabel lblOtherpet;
    private JLabel lblLifestyle;
    private JLabel lblActiveness;
    private JLabel lblOwnedPet;
    private JLabel lblBehavior;
    private JLabel lblVolunteer;
    private JLabel lblResponsibility;
    private JLabel lblFinancially;
    private JLabel lblInvest;
    private JLabel lblEmail;
    private JLabel lblPhoneNumber;
    private JPanel panel_1;
    private JLabel lblNewLabel;
    private JPanel panel_2;
    private JLabel lblNewLabel_1;
    private JPanel panel_3;
    private JLabel lblNewLabel_2;
    private JPanel panel_4;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JLabel lblNewLabel_8;


    public AdoptionProcessing() {
    	setTitle("Happy Paws Pet Adoption Center - Client Response");
    	setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 839, 821);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(153, 204, 204));
        contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        
        btnApprove = new JButton("APPROVE");
        btnApprove.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
        btnApprove.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		ClientInfo next = new ClientInfo();
        		next.setVisible(true);
        		dispose();
        	}
        });
        btnApprove.setBounds(253, 737, 107, 25);
        contentPane.add(btnApprove);

        btnDecline = new JButton("DECLINE");
        btnDecline.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
        btnDecline.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		ClientInfo next = new ClientInfo();
        		next.setVisible(true);
        		dispose();

        	}
        });
        btnDecline.setBounds(438, 737, 107, 25);
        contentPane.add(btnDecline);
        
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.setBackground(Color.WHITE);
        panel.setForeground(new Color(0, 0, 0));
        panel.setBounds(86, 60, 644, 136);
        contentPane.add(panel);
                panel.setLayout(null);
        
                lblUsername = new JLabel("Username: ");
                lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
                lblUsername.setBounds(20, 21, 194, 15);
                panel.add(lblUsername);
                
                        lblFirstname = new JLabel("Firstname: ");
                        lblFirstname.setBounds(226, 21, 202, 15);
                        panel.add(lblFirstname);
                        lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        
                        lblEmail = new JLabel("Email:");
                        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        lblEmail.setBounds(187, 101, 241, 15);
                        panel.add(lblEmail);
                        
                        lblPhoneNumber = new JLabel("Phone Number:");
                        lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        lblPhoneNumber.setBounds(438, 101, 196, 15);
                        panel.add(lblPhoneNumber);
                        
                        lblSurname = new JLabel("Surname: ");
                        lblSurname.setBounds(438, 21, 196, 15);
                        panel.add(lblSurname);
                        lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                        lblAddress = new JLabel("Address: ");
                        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        lblAddress.setBounds(226, 62, 220, 15);
                                        panel.add(lblAddress);
                                        
                                        lblBirthday = new JLabel("Birthday:");
                                        lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        lblBirthday.setBounds(20, 62, 202, 15);
                                        panel.add(lblBirthday);
                                        
                                        lblOccupation = new JLabel("Occupation:");
                                        lblOccupation.setBounds(20, 101, 157, 15);
                                        panel.add(lblOccupation);
                                        lblOccupation.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        panel_1 = new JPanel();
                                        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
                                        panel_1.setBackground(Color.WHITE);
                                        panel_1.setBounds(27, 206, 776, 182);
                                        contentPane.add(panel_1);
                                        panel_1.setLayout(null);
                                        
                                        lblPetPreference = new JLabel("What Type of pet are you interested in adopting? (Dog, Cat, Bird or Rabbit):");
                                        lblPetPreference.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        lblPetPreference.setBounds(10, 33, 756, 15);
                                        panel_1.add(lblPetPreference);
                                        
                                        lblSelectedPet = new JLabel("Who do you want to adopt? (type the specific name of pet):");
                                        lblSelectedPet.setBounds(10, 58, 759, 15);
                                        panel_1.add(lblSelectedPet);
                                        lblSelectedPet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblPetDisability = new JLabel("Are you open to adopting a special needs pet(eg. medical conditions, disabilities)?:");
                                        lblPetDisability.setBounds(10, 83, 756, 15);
                                        panel_1.add(lblPetDisability);
                                        lblPetDisability.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblResidence = new JLabel("Do you own or rent your current residence? (Own or Rent):");
                                        lblResidence.setBounds(10, 108, 756, 15);
                                        panel_1.add(lblResidence);
                                        lblResidence.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblPermission = new JLabel("If you rent,  do you have permission from you landlord to have a pet?:");
                                        lblPermission.setBounds(10, 133, 756, 15);
                                        panel_1.add(lblPermission);
                                        lblPermission.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblOtherpet = new JLabel("Do you have any other pets at home? If yes please provide details:");
                                        lblOtherpet.setBounds(10, 158, 544, 15);
                                        panel_1.add(lblOtherpet);
                                        lblOtherpet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblNewLabel = new JLabel("PET PREFERENCE");
                                        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
                                        lblNewLabel.setBounds(10, 10, 241, 13);
                                        panel_1.add(lblNewLabel);
                                        
                                        panel_2 = new JPanel();
                                        panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
                                        panel_2.setBackground(Color.WHITE);
                                        panel_2.setBounds(27, 399, 776, 84);
                                        contentPane.add(panel_2);
                                        panel_2.setLayout(null);
                                        
                                        lblNewLabel_1 = new JLabel("LIFESTYLE");
                                        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
                                        lblNewLabel_1.setBounds(10, 10, 177, 15);
                                        panel_2.add(lblNewLabel_1);
                                        
                                        lblLifestyle = new JLabel("How active is your life style:");
                                        lblLifestyle.setBounds(10, 35, 544, 15);
                                        panel_2.add(lblLifestyle);
                                        lblLifestyle.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblActiveness = new JLabel("How much time can you dedicate to caring for a pet on a daily basis?:");
                                        lblActiveness.setBounds(10, 60, 544, 15);
                                        panel_2.add(lblActiveness);
                                        lblActiveness.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        panel_3 = new JPanel();
                                        panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
                                        panel_3.setBackground(Color.WHITE);
                                        panel_3.setBounds(27, 493, 776, 108);
                                        contentPane.add(panel_3);
                                        panel_3.setLayout(null);
                                        
                                        lblNewLabel_2 = new JLabel("PREVIOUS EXPERIENCE");
                                        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
                                        lblNewLabel_2.setBounds(10, 10, 306, 15);
                                        panel_3.add(lblNewLabel_2);
                                        
                                        lblOwnedPet = new JLabel("Have you owned a pet before?:");
                                        lblOwnedPet.setBounds(10, 35, 544, 15);
                                        panel_3.add(lblOwnedPet);
                                        lblOwnedPet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblBehavior = new JLabel("Have you ever dealt with behavioral issues in pets before?:");
                                        lblBehavior.setBounds(10, 60, 544, 15);
                                        panel_3.add(lblBehavior);
                                        lblBehavior.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblVolunteer = new JLabel("Have you volunteered or worked in animal shelters, rescue organizations, or veterinary clinics?:");
                                        lblVolunteer.setBounds(10, 85, 756, 15);
                                        panel_3.add(lblVolunteer);
                                        lblVolunteer.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        panel_4 = new JPanel();
                                        panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
                                        panel_4.setBackground(Color.WHITE);
                                        panel_4.setBounds(27, 611, 776, 108);
                                        contentPane.add(panel_4);
                                        panel_4.setLayout(null);
                                        
                                        lblNewLabel_3 = new JLabel("COMMITMENT & CARE");
                                        lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
                                        lblNewLabel_3.setBounds(10, 10, 391, 15);
                                        panel_4.add(lblNewLabel_3);
                                        
                                        lblResponsibility = new JLabel("Are you willing to commit to the responsibilities of pet ownership, including feeding, grooming, exercise, and veterinary care?:");
                                        lblResponsibility.setBounds(10, 35, 872, 15);
                                        panel_4.add(lblResponsibility);
                                        lblResponsibility.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblFinancially = new JLabel("Are you financially prepared to cover the costs of pet ownership, including food, supplies, and medical expenses?:");
                                        lblFinancially.setBounds(10, 60, 872, 15);
                                        panel_4.add(lblFinancially);
                                        lblFinancially.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblInvest = new JLabel("Are you willing to invest time and effort into training your pet and addressing any behavioral issues that may arise?:");
                                        lblInvest.setBounds(10, 85, 872, 15);
                                        panel_4.add(lblInvest);
                                        lblInvest.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblNewLabel_4 = new JLabel("PET ADOPTION FORM (CLIENT'S RESPONSE)");
                                        lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
                                        lblNewLabel_4.setBounds(191, 19, 447, 31);
                                        contentPane.add(lblNewLabel_4);
                                        
                                        lblNewLabel_8 = new JLabel("");
                                        lblNewLabel_8.addMouseListener(new MouseAdapter() {
                                        	@Override
                                        	public void mouseClicked(MouseEvent e) {
                                        		ClientInfo next = new ClientInfo();
                            					next.setVisible(true);
                            					dispose();
                                        	}
                                        });
                                        lblNewLabel_8.setIcon(new ImageIcon("C:\\Pet Adopt Pics\\DESIGN AND LOGO\\backbuttonlegitlegit.png"));
                                        lblNewLabel_8.setBounds(765, 10, 50, 40);
                                        contentPane.add(lblNewLabel_8);
    }

    public AdoptionProcessing(Connection connection, String username, String firstname, String surname, String address, String birthday, String occupation, String petpreference, String selectedpet, String petdisability, String residence, String permission, String otherpet, String lifestyle, String activeness, String ownedpet, String behavior, String volunteer, String responsibility, String financially, String invest, String email, String number) {
        this();
        this.connection = connection;
        this.username = username;

        lblUsername.setText("Username: " + username);
        lblFirstname.setText("Firstname: " + firstname);
        lblSurname.setText("Surname: " + surname);
        lblAddress.setText("Address: " + address);
        lblBirthday.setText("Birthday: " + birthday);
        lblOccupation.setText("Occupation: " + occupation);
        lblPetPreference.setText("What Type of pet are you interested in adopting? (Dog, Cat, Bird or Rabbit): " + petpreference);
        lblSelectedPet.setText("Who do you want to adopt? (type the specific name of pet): " + selectedpet);
        lblPetDisability.setText("Are you open to adopting a special needs pet(eg. medical conditions, disabilities)?: " + petdisability);
        lblResidence.setText("Do you own or rent your current residence? (Own or Rent): " +residence);
        lblPermission.setText("If you rent,  do you have permission from you landlord to have a pet?: " +permission);
        lblOtherpet.setText("Do you have any other pets at home? If yes please provide details: " +otherpet);
        lblLifestyle.setText("How active is your life style?: " +lifestyle);
        lblActiveness.setText("How much time can you dedicate to caring for a pet on a daily basis?: " +activeness);
        lblOwnedPet.setText("Have you owned a pet before?: " +ownedpet);
        lblBehavior.setText("Have you ever dealt with behavioral issues in pets before?: " +behavior);
        lblVolunteer.setText("Have you volunteered or worked in animal shelters, rescue organizations, or veterinary clinics?: " +volunteer);
        lblResponsibility.setText("Are you willing to commit to the responsibilities of pet ownership, including feeding, grooming, exercise, and veterinary care?: " +responsibility);
        lblFinancially.setText("Are you financially prepared to cover the costs of pet ownership, including food, supplies, and medical expenses?: " +financially);
        lblInvest.setText("Are you willing to invest time and effort into training your pet and addressing any behavioral issues that may arise?: " +invest);
        lblEmail.setText("Email: " + email);
        lblPhoneNumber.setText("Phone Number: " + number); 

        btnApprove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAdoptionStatus("APPROVED", username);
            }
        });

        btnDecline.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAdoptionStatus("DECLINED", username);
            }
        });
    }

    public void displayData(String username, String firstname, String surname, String address, String birthday, String occupation, String petpreference, String selectedpet, String petdisability, String residence, String permission, String otherpet, String lifestyle, String activeness, String ownedpet, String behavior, String volunteer, String responsibility, String financially, String invest, String email, String number) {
        lblUsername.setText("Username: " + username);
        lblFirstname.setText("Firstname: " + firstname);
        lblSurname.setText("Surname: " + surname);
        lblAddress.setText("Address: " + address);
        lblBirthday.setText("Birthday: " + birthday);
        lblOccupation.setText("Occupation: " + occupation);
        lblPetPreference.setText("What Type of pet are you interested in adopting? (Dog, Cat, Bird or Rabbit): " + petpreference);
        lblSelectedPet.setText("Who do you want to adopt? (type the specific name of pet): " + selectedpet);
        lblPetDisability.setText("Are you open to adopting a special needs pet(eg. medical conditions, disabilities)?: " + petdisability);
        lblResidence.setText("Do you own or rent your current residence? (Own or Rent): " +residence);
        lblPermission.setText("If you rent,  do you have permission from you landlord to have a pet?: " +permission);
        lblOtherpet.setText("Do you have any other pets at home? If yes please provide details: " +otherpet);
        lblLifestyle.setText("How active is your life style? " +lifestyle);
        lblActiveness.setText("How much time can you dedicate to caring for a pet on a daily basis?: " +activeness);
        lblOwnedPet.setText("Have you owned a pet before?: " +ownedpet);
        lblBehavior.setText("Have you ever dealt with behavioral issues in pets before?: " +behavior);
        lblVolunteer.setText("Have you volunteered or worked in animal shelters, rescue organizations, or veterinary clinics?: " +volunteer);
        lblResponsibility.setText("Are you willing to commit to the responsibilities of pet ownership, including feeding, grooming, exercise, and veterinary care?: " +responsibility);
        lblFinancially.setText("Are you financially prepared to cover the costs of pet ownership, including food, supplies, and medical expenses?: " +financially);
        lblInvest.setText("Are you willing to invest time and effort into training your pet and addressing any behavioral issues that may arise?: " +invest);
        lblEmail.setText("Email: " + email);
        lblPhoneNumber.setText("Phone Number: " + number); 

    }

    private void updateAdoptionStatus(String status, String username) {
        try {
            String query = "INSERT INTO " + status + " (clientUsername) VALUES (?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();

            // Optional: Remove the record from the 'PENDING' table if needed
            if (status.equals("APPROVED") || status.equals("DECLINED")) {
                removeFromPending(username);
            }

//            JOptionPane.showMessageDialog(null, "Adoption " + status.toLowerCase() + " for " + username);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating adoption status");
        }
    }

    private void removeFromPending(String username) {
        try {
            String query = "DELETE FROM PENDING WHERE clientUsername = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error removing record from PENDING table");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdoptionProcessing frame = new AdoptionProcessing();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}