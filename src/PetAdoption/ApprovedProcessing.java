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

public class ApprovedProcessing extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblUsername;
    private JLabel lblFirstname;
    private JLabel lblSurname;
    private JLabel lblAddress;
    private JLabel lblBirthday;
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
    private JPanel panel;
    private JPanel panel_1;
    private JLabel lblNewLabel;
    private JPanel panel_2;
    private JLabel lblNewLabel_1;
    private JPanel panel_3;
    private JLabel lblNewLabel_2;
    private JPanel panel_4;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_7;
    private JLabel lblNewLabel_8;
    
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

 
    public ApprovedProcessing() {
    	setTitle("Happy Paws Pet Adoption Center - Approved");
    	setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 842, 800);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(153, 204, 204));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        
        panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.setBackground(Color.WHITE);
        panel.setBounds(106, 61, 625, 137);
        contentPane.add(panel);
        panel.setLayout(null);
        
                lblUsername = new JLabel("Username: ");
                lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
                lblUsername.setBounds(21, 21, 187, 15);
                panel.add(lblUsername);
                
                        lblFirstname = new JLabel("Firstname: ");
                        lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        lblFirstname.setBounds(210, 21, 183, 15);
                        panel.add(lblFirstname);
                        
                                lblSurname = new JLabel("Surname: ");
                                lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                lblSurname.setBounds(403, 21, 212, 15);
                                panel.add(lblSurname);
                                
                                lblBirthday = new JLabel("Birthday:");
                                lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                lblBirthday.setBounds(21, 64, 179, 15);
                                panel.add(lblBirthday);
                                
                                lblAddress = new JLabel("Address: ");
                                lblAddress.setBounds(210, 64, 219, 15);
                                panel.add(lblAddress);
                                lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblOccupation = new JLabel("Occupation:");
                                lblOccupation.setBounds(21, 101, 154, 15);
                                panel.add(lblOccupation);
                                lblOccupation.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblEmail = new JLabel("Email:");
                                lblEmail.setBounds(173, 101, 234, 15);
                                panel.add(lblEmail);
                                lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblPhoneNumber = new JLabel("Phone Number:");
                                lblPhoneNumber.setBounds(417, 101, 198, 15);
                                panel.add(lblPhoneNumber);
                                lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                panel_1 = new JPanel();
                                panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
                                panel_1.setBackground(Color.WHITE);
                                panel_1.setBounds(26, 208, 780, 190);
                                contentPane.add(panel_1);
                                panel_1.setLayout(null);
                                
                                lblNewLabel = new JLabel("PET PREFERENCE");
                                lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
                                lblNewLabel.setBounds(10, 10, 231, 15);
                                panel_1.add(lblNewLabel);
                                
                                lblPetPreference = new JLabel("What Type of pet are you interested in adopting? (Dog, Cat, Bird or Rabbit):");
                                lblPetPreference.setBounds(10, 35, 760, 15);
                                panel_1.add(lblPetPreference);
                                lblPetPreference.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblSelectedPet = new JLabel("Who do you want to adopt? (type the specific name of pet):");
                                lblSelectedPet.setBounds(10, 60, 650, 15);
                                panel_1.add(lblSelectedPet);
                                lblSelectedPet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblPetDisability = new JLabel("Are you open to adopting a special needs pet(eg. medical conditions, disabilities)?:");
                                lblPetDisability.setBounds(10, 85, 677, 15);
                                panel_1.add(lblPetDisability);
                                lblPetDisability.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblResidence = new JLabel("Do you own or rent your current residence? (Own or Rent):");
                                lblResidence.setBounds(10, 112, 677, 15);
                                panel_1.add(lblResidence);
                                lblResidence.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblPermission = new JLabel("If you rent,  do you have permission from you landlord to have a pet?:");
                                lblPermission.setBounds(10, 137, 677, 15);
                                panel_1.add(lblPermission);
                                lblPermission.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblOtherpet = new JLabel("Do you have any other pets at home? If yes please provide details:");
                                lblOtherpet.setBounds(10, 162, 677, 15);
                                panel_1.add(lblOtherpet);
                                lblOtherpet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                panel_2 = new JPanel();
                                panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
                                panel_2.setBackground(Color.WHITE);
                                panel_2.setBounds(26, 408, 780, 88);
                                contentPane.add(panel_2);
                                panel_2.setLayout(null);
                                
                                lblNewLabel_1 = new JLabel("LIFESTYLE");
                                lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
                                lblNewLabel_1.setBounds(10, 10, 255, 15);
                                panel_2.add(lblNewLabel_1);
                                
                                lblLifestyle = new JLabel("How active is your life style?:");
                                lblLifestyle.setBounds(10, 35, 677, 15);
                                panel_2.add(lblLifestyle);
                                lblLifestyle.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblActiveness = new JLabel("How much time can you dedicate to caring for a pet on a daily basis?:");
                                lblActiveness.setBounds(10, 60, 677, 15);
                                panel_2.add(lblActiveness);
                                lblActiveness.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                panel_3 = new JPanel();
                                panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
                                panel_3.setBackground(Color.WHITE);
                                panel_3.setBounds(26, 506, 780, 112);
                                contentPane.add(panel_3);
                                panel_3.setLayout(null);
                                
                                lblNewLabel_2 = new JLabel("PREVIOUS EXPERIENCE");
                                lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
                                lblNewLabel_2.setBounds(10, 10, 307, 15);
                                panel_3.add(lblNewLabel_2);
                                
                                lblOwnedPet = new JLabel("Have you owned a pet before?:");
                                lblOwnedPet.setBounds(10, 35, 677, 15);
                                panel_3.add(lblOwnedPet);
                                lblOwnedPet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblBehavior = new JLabel("Have you ever dealt with behavioral issues in pets before?:");
                                lblBehavior.setBounds(10, 60, 677, 15);
                                panel_3.add(lblBehavior);
                                lblBehavior.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblVolunteer = new JLabel("Have you volunteered or worked in animal shelters, rescue organizations, or veterinary clinics?:");
                                lblVolunteer.setBounds(10, 85, 677, 15);
                                panel_3.add(lblVolunteer);
                                lblVolunteer.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                panel_4 = new JPanel();
                                panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
                                panel_4.setBackground(Color.WHITE);
                                panel_4.setBounds(26, 628, 780, 112);
                                contentPane.add(panel_4);
                                panel_4.setLayout(null);
                                
                                lblNewLabel_3 = new JLabel("COMMITMENT & CARE");
                                lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
                                lblNewLabel_3.setBounds(10, 10, 364, 15);
                                panel_4.add(lblNewLabel_3);
                                
                                lblResponsibility = new JLabel("Are you willing to commit to the responsibilities of pet ownership, including feeding, grooming, exercise, and veterinary care?:");
                                lblResponsibility.setBounds(10, 35, 871, 15);
                                panel_4.add(lblResponsibility);
                                lblResponsibility.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblFinancially = new JLabel("Are you financially prepared to cover the costs of pet ownership, including food, supplies, and medical expenses?:");
                                lblFinancially.setBounds(10, 60, 871, 15);
                                panel_4.add(lblFinancially);
                                lblFinancially.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblInvest = new JLabel("Are you willing to invest time and effort into training your pet and addressing any behavioral issues that may arise?:");
                                lblInvest.setBounds(10, 85, 871, 15);
                                panel_4.add(lblInvest);
                                lblInvest.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblNewLabel_7 = new JLabel("");
                                lblNewLabel_7.addMouseListener(new MouseAdapter() {
                                	@Override
                                	public void mouseClicked(MouseEvent e) {
                                		ClientInfo next = new ClientInfo();
                    					next.setVisible(true);
                    					dispose();
                                	}
                                });
                                lblNewLabel_7.setIcon(new ImageIcon("C:\\Pet Adopt Pics\\DESIGN AND LOGO\\backbuttonlegitlegit.png"));
                                lblNewLabel_7.setBounds(775, 10, 66, 44);
                                contentPane.add(lblNewLabel_7);
                                
                                lblNewLabel_8 = new JLabel("PET ADOPTION FORM (CLIENT'S RESPONSE)");
                                lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 20));
                                lblNewLabel_8.setBounds(187, 20, 447, 31);
                                contentPane.add(lblNewLabel_8);
    }

    // kailangan nasa constructor yung variable
    public ApprovedProcessing(Connection connection, String username, String firstname, String surname, String address, String birthday, String occupation, String petpreference, String selectedpet, String petdisability, String residence, String permission, String otherpet, String lifestyle, String activeness, String ownedpet, String behavior, String volunteer, String responsibility, String financially, String invest, String email, String number) {
        // Call the default constructor to initialize the frame
        this(); 
        // Initialize labels with default text
        lblUsername.setText("Username: ");
        lblFirstname.setText("Firstname: ");
        lblSurname.setText("Surname: ");
        lblAddress.setText("Address: ");
        lblBirthday.setText("Birthday: ");
        lblOccupation.setText("Occupation: ");
        lblPetPreference.setText("What Type of pet are you interested in adopting? (Dog, Cat, Bird or Rabbit): ");
        lblSelectedPet.setText("Who do you want to adopt? (type the specific name of pet): ");
        lblPetDisability.setText("Are you open to adopting a special needs pet(eg. medical conditions, disabilities)?: ");
        lblResidence.setText("Do you own or rent your current residence? (Own or Rent): ");
        lblPermission.setText("If you rent,  do you have permission from you landlord to have a pet?: ");
        lblOtherpet.setText("Do you have any other pets at home? If yes please provide details: ");
        lblLifestyle.setText("How active is your life style? ");
        lblActiveness.setText("How much time can you dedicate to caring for a pet on a daily basis?: ");
        lblOwnedPet.setText("Have you owned a pet before?: ");
        lblBehavior.setText("Have you ever dealt with behavioral issues in pets before?: ");
        lblVolunteer.setText("Have you volunteered or worked in animal shelters, rescue organizations, or veterinary clinics?: ");
        lblResponsibility.setText("Are you willing to commit to the responsibilities of pet ownership, including feeding, grooming, exercise, and veterinary care?: ");
        lblFinancially.setText("Are you financially prepared to cover the costs of pet ownership, including food, supplies, and medical expenses?: ");
        lblInvest.setText("Are you willing to invest time and effort into training your pet and addressing any behavioral issues that may arise?: ");
        lblEmail.setText("Email: ");
        lblPhoneNumber.setText("Phone Number: "); 
        
        displayData(username, firstname, surname, address, birthday, occupation, petpreference, selectedpet, petdisability, residence, permission, otherpet, lifestyle, activeness, ownedpet, behavior, volunteer, responsibility, financially, invest, email, number);
    }

    // ito pang display sa frame yung nasa plus 
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
        lblPhoneNumber.setText("Phone Number: " +number); 

    }
}