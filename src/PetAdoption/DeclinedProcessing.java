package PetAdoption;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.sql.Connection;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DeclinedProcessing extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private String username;
    private JLabel lblUsername;
    private JLabel lblFirstname;
    private JLabel lblSurname;
    private JLabel lblAddress;
    private Connection connection;
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
    private JLabel lblNewLabel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JLabel lblLifestyle_1;
    private JPanel panel_3;
    private JLabel lblLifestyle_2;
    private JPanel panel_4;
    private JLabel lblLifestyle_3;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_5;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DeclinedProcessing frame = new DeclinedProcessing();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DeclinedProcessing() {
    	setTitle("Happy Paws Pet Adoption - Declined");
    	setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 824, 800);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(153, 204, 204));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        
        
        panel = new JPanel();
        panel.setBounds(77, 48, 632, 140);
        panel.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
        panel.setLayout(null);
        
                lblUsername = new JLabel("Username: ");
                lblUsername.setBounds(24, 20, 177, 15);
                panel.add(lblUsername);
                lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                        lblFirstname = new JLabel("Firstname: ");
                        lblFirstname.setBounds(203, 20, 198, 15);
                        panel.add(lblFirstname);
                        lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 13));
                        
                                lblSurname = new JLabel("Surname: ");
                                lblSurname.setBounds(416, 20, 198, 15);
                                panel.add(lblSurname);
                                lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                lblBirthday = new JLabel("Birthday:");
                                lblBirthday.setBounds(24, 66, 172, 15);
                                panel.add(lblBirthday);
                                lblBirthday.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                
                                        lblAddress = new JLabel("Address: ");
                                        lblAddress.setBounds(203, 66, 221, 15);
                                        panel.add(lblAddress);
                                        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblOccupation = new JLabel("Occupation:");
                                        lblOccupation.setBounds(24, 110, 169, 15);
                                        panel.add(lblOccupation);
                                        lblOccupation.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblEmail = new JLabel("Email:");
                                        lblEmail.setBounds(188, 110, 244, 15);
                                        panel.add(lblEmail);
                                        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
                                        
                                        lblPhoneNumber = new JLabel("Phone Number:");
                                        lblPhoneNumber.setBounds(435, 110, 187, 15);
                                        panel.add(lblPhoneNumber);
                                        lblPhoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                panel_1 = new JPanel();
                panel_1.setBounds(20, 198, 766, 191);
                panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
                panel_1.setBackground(Color.WHITE);
                contentPane.add(panel_1);
                panel_1.setLayout(null);
                
                lblNewLabel = new JLabel("PET PREFERENCE");
                lblNewLabel.setBounds(10, 10, 217, 15);
                panel_1.add(lblNewLabel);
                lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
                
                lblPetPreference = new JLabel("What Type of pet are you interested in adopting? (Dog, Cat, Bird or Rabbit):");
                lblPetPreference.setBounds(10, 35, 677, 15);
                panel_1.add(lblPetPreference);
                lblPetPreference.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblSelectedPet = new JLabel("Who do you want to adopt? (type the specific name of pet):");
                lblSelectedPet.setBounds(10, 60, 641, 15);
                panel_1.add(lblSelectedPet);
                lblSelectedPet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblPetDisability = new JLabel("Are you open to adopting a special needs pet(eg. medical conditions, disabilities)?:");
                lblPetDisability.setBounds(10, 85, 641, 15);
                panel_1.add(lblPetDisability);
                lblPetDisability.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblResidence = new JLabel("Do you own or rent your current residence? (Own or Rent):");
                lblResidence.setBounds(10, 110, 641, 15);
                panel_1.add(lblResidence);
                lblResidence.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblPermission = new JLabel("If you rent,  do you have permission from you landlord to have a pet?:");
                lblPermission.setBounds(10, 135, 641, 15);
                panel_1.add(lblPermission);
                lblPermission.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblOtherpet = new JLabel("Do you have any other pets at home? If yes please provide details:");
                lblOtherpet.setBounds(10, 160, 641, 15);
                panel_1.add(lblOtherpet);
                lblOtherpet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                panel_2 = new JPanel();
                panel_2.setBounds(20, 399, 766, 88);
                panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
                panel_2.setBackground(Color.WHITE);
                contentPane.add(panel_2);
                panel_2.setLayout(null);
                
                lblLifestyle_1 = new JLabel("LIFESTYLE");
                lblLifestyle_1.setFont(new Font("Tahoma", Font.BOLD, 13));
                lblLifestyle_1.setBounds(10, 10, 217, 15);
                panel_2.add(lblLifestyle_1);
                
                lblLifestyle = new JLabel("How active is your life style?:");
                lblLifestyle.setBounds(10, 35, 641, 15);
                panel_2.add(lblLifestyle);
                lblLifestyle.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblActiveness = new JLabel("How much time can you dedicate to caring for a pet on a daily basis?:");
                lblActiveness.setBounds(10, 60, 641, 15);
                panel_2.add(lblActiveness);
                lblActiveness.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                panel_3 = new JPanel();
                panel_3.setBounds(20, 497, 766, 115);
                panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
                panel_3.setBackground(Color.WHITE);
                contentPane.add(panel_3);
                panel_3.setLayout(null);
                
                lblLifestyle_2 = new JLabel("PREVIOUS EXPERIENCE");
                lblLifestyle_2.setFont(new Font("Tahoma", Font.BOLD, 13));
                lblLifestyle_2.setBounds(10, 10, 217, 15);
                panel_3.add(lblLifestyle_2);
                
                lblOwnedPet = new JLabel("Have you owned a pet before?:");
                lblOwnedPet.setBounds(10, 35, 641, 15);
                panel_3.add(lblOwnedPet);
                lblOwnedPet.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblBehavior = new JLabel("Have you ever dealt with behavioral issues in pets before?:");
                lblBehavior.setBounds(10, 60, 641, 15);
                panel_3.add(lblBehavior);
                lblBehavior.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblVolunteer = new JLabel("Have you volunteered or worked in animal shelters, rescue organizations, or veterinary clinics?:");
                lblVolunteer.setBounds(10, 85, 641, 15);
                panel_3.add(lblVolunteer);
                lblVolunteer.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                panel_4 = new JPanel();
                panel_4.setBounds(20, 622, 766, 115);
                panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
                panel_4.setBackground(Color.WHITE);
                contentPane.add(panel_4);
                panel_4.setLayout(null);
                
                lblLifestyle_3 = new JLabel("COMMITMENT & CARE");
                lblLifestyle_3.setFont(new Font("Tahoma", Font.BOLD, 13));
                lblLifestyle_3.setBounds(10, 10, 217, 15);
                panel_4.add(lblLifestyle_3);
                
                lblResponsibility = new JLabel("Are you willing to commit to the responsibilities of pet ownership, including feeding, grooming, exercise, and veterinary care?:");
                lblResponsibility.setBounds(10, 35, 868, 15);
                panel_4.add(lblResponsibility);
                lblResponsibility.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblFinancially = new JLabel("Are you financially prepared to cover the costs of pet ownership, including food, supplies, and medical expenses?:");
                lblFinancially.setBounds(10, 60, 868, 15);
                panel_4.add(lblFinancially);
                lblFinancially.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblInvest = new JLabel("Are you willing to invest time and effort into training your pet and addressing any behavioral issues that may arise?:");
                lblInvest.setBounds(10, 85, 868, 15);
                panel_4.add(lblInvest);
                lblInvest.setFont(new Font("Tahoma", Font.PLAIN, 13));
                
                lblNewLabel_1 = new JLabel("PET ADOPTION FORM (CLIENT'S RESPONSE)");
                lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
                lblNewLabel_1.setBounds(149, 10, 489, 28);
                contentPane.add(lblNewLabel_1);
                
                lblNewLabel_5 = new JLabel("");
                lblNewLabel_5.addMouseListener(new MouseAdapter() {
                	@Override
                	public void mouseClicked(MouseEvent e) {
                		ClientInfo next = new ClientInfo();
    					next.setVisible(true);
    					dispose();
                	}
                	
                });
                lblNewLabel_5.setIcon(new ImageIcon("C:\\Pet Adopt Pics\\DESIGN AND LOGO\\backbuttonlegitlegit.png"));
                lblNewLabel_5.setBounds(755, 3, 78, 40);
                contentPane.add(lblNewLabel_5);
    }

    // kailangan nasa constructor yung variable
    public DeclinedProcessing(Connection connection, String username, String firstname, String surname, String address, String birthday, String occupation, String petpreference, String selectedpet, String petdisability, String residence, String permission, String otherpet, String lifestyle, String activeness, String ownedpet, String behavior, String volunteer, String responsibility, String financially, String invest, String email, String number) {
        this();
        this.connection = connection;
        this.username = username;
        displayData(username, firstname, surname, address, birthday, occupation, petpreference, selectedpet, petdisability, residence, permission, otherpet, lifestyle, activeness, ownedpet, behavior, volunteer, responsibility, financially, invest, email, number);
    }

    // ito pang display sa frame yung nasa plus
    public void displayData(String username, String firstname, String surname, String address, String birthday, String occupation, String petpreference, String selectedpet, String petdisability, String residence, String permission, String otherpet, String lifestyle, String activeness, String ownedpet, String behavior, String volunteer, String responsiblity, String financially, String invest, String email, String number) {
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
        lblResponsibility.setText("Are you willing to commit to the responsibilities of pet ownership, including feeding, grooming, exercise, and veterinary care?: " +responsiblity);
        lblFinancially.setText("Are you financially prepared to cover the costs of pet ownership, including food, supplies, and medical expenses?: " +financially);
        lblInvest.setText("Are you willing to invest time and effort into training your pet and addressing any behavioral issues that may arise?: " +invest);
        lblEmail.setText("Email: " + email);
        lblPhoneNumber.setText("Phone Number: " + number);
        
    }
}