package PetAdoption;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import java.time.Year;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
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

public class PetAdoptionForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField firstname;
	private JTextField occupation;
	private JTextField username;
	private JTextField surname;
	private JTextField otherpets;
	private JTextField petname;
	private JTextField birthday;
	private JTextField petPreference;
	private JTextField petdisability;
	private JTextField residence;
	private JTextField permission;
	private JTextField lifestyle;
	private JTextField activeness;
	private JTextField previousexperience;
	private JTextField behavior;
	private JTextField volunteer;
	private JTextField responsibility;
	private JTextField financially;
	private JTextField invest;
	private JTextField email;
	private JTextField number;
	private JTextField address;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetAdoptionForm frame = new PetAdoptionForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Frame
	public PetAdoptionForm() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 674);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		JPanel panelPage1 = new JPanel();
		panelPage1.setBounds(145, 10, 484, 3200);
		panelPage1.setBackground(new Color(153, 204, 204));
		contentPane.add(panelPage1);
		
		JScrollPane scrollPane = new JScrollPane(contentPane);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.setPreferredSize(new Dimension(800, 3200)); // Adjust the height as needed
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		panelPage1.setLayout(null);

		
		JPanel panelPetAdoption = new JPanel();
		panelPetAdoption.setBounds(0, 0, 484, 336);
		panelPetAdoption.setLayout(null);
		panelPetAdoption.setBackground(SystemColor.text);
		panelPage1.add(panelPetAdoption);
		
		JTextArea txtrPetAdoptinForm = new JTextArea();
		txtrPetAdoptinForm.setEditable(false);
		txtrPetAdoptinForm.setFont(new Font("Calibri Light", Font.BOLD, 30));
		txtrPetAdoptinForm.setText("Pet Adoption Form");
		txtrPetAdoptinForm.setBounds(99, 10, 277, 33);
		panelPetAdoption.add(txtrPetAdoptinForm);
		
				
		JTextArea txt_1 = new JTextArea();
		txt_1.setBounds(10, 40, 464, 84);
		panelPetAdoption.add(txt_1);
		txt_1.setText("At Happy Paw Pet Adoption Center , we are committed to finding forever homes for pets and connecting potential adopters with their perfect companions. We understand that adopting a pet is a significant decision, and we are here to support you every step of the way.");
		txt_1.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txt_1.setEditable(false);
		txt_1.setLineWrap(true);
		txt_1.setWrapStyleWord(true);
		
		JTextArea txt_2 = new JTextArea();
		txt_2.setWrapStyleWord(true);
		txt_2.setText("We kindly ask you to take a few moments to complete the survey thoughtfully and honestly. Your feedback is invaluable and will guide us in making the most suitable matches possible.");
		txt_2.setLineWrap(true);
		txt_2.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txt_2.setEditable(false);
		txt_2.setBounds(10, 134, 464, 64);
		panelPetAdoption.add(txt_2);
		
		JTextArea txt3 = new JTextArea();
		txt3.setWrapStyleWord(true);
		txt3.setText("Thank you for considering pet adoption and entrusting Happy Paw Pet Adoption Center with this important decision. We are excited to assist you in finding your newest family member!");
		txt3.setLineWrap(true);
		txt3.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txt3.setEditable(false);
		txt3.setBounds(10, 208, 464, 64);
		panelPetAdoption.add(txt3);
		
		JTextArea txt4 = new JTextArea();
		txt4.setWrapStyleWord(true);
		txt4.setText("Warm regards,");
		txt4.setLineWrap(true);
		txt4.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txt4.setEditable(false);
		txt4.setBounds(10, 282, 98, 24);
		panelPetAdoption.add(txt4);
		
		JTextArea txtPersonalInfo = new JTextArea();
		txtPersonalInfo.setWrapStyleWord(true);
		txtPersonalInfo.setText("Happy Paw Pet Adoption Center Management");
		txtPersonalInfo.setLineWrap(true);
		txtPersonalInfo.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtPersonalInfo.setEditable(false);
		txtPersonalInfo.setBounds(10, 303, 353, 33);
		panelPetAdoption.add(txtPersonalInfo);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 346, 484, 36);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(SystemColor.text);
		panelPage1.add(panel_1_1);
		
		JTextArea txtrPetInfo = new JTextArea();
		txtrPetInfo.setText("Personal Information");
		txtrPetInfo.setFont(new Font("Calibri Light", Font.BOLD, 20));
		txtrPetInfo.setEditable(false);
		txtrPetInfo.setBounds(10, 10, 188, 24);
		panel_1_1.add(txtrPetInfo);
	
		JPanel panelFirstname = new JPanel();
		panelFirstname.setBounds(0, 392, 484, 72);
		panelFirstname.setLayout(null);
		panelFirstname.setBackground(SystemColor.text);
		panelPage1.add(panelFirstname);
		
		JTextArea txtrPetAdoptinForm_1_1 = new JTextArea();
		txtrPetAdoptinForm_1_1.setText("Firstname");
		txtrPetAdoptinForm_1_1.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrPetAdoptinForm_1_1.setEditable(false);
		txtrPetAdoptinForm_1_1.setBounds(10, 10, 176, 24);
		panelFirstname.add(txtrPetAdoptinForm_1_1);
		
		firstname = new JTextField();
		firstname.setBounds(10, 38, 230, 24);
		panelFirstname.add(firstname);
		firstname.setColumns(10);
		
		JPanel panelSurname = new JPanel();
		panelSurname.setBounds(0, 474, 484, 72);
		panelSurname.setLayout(null);
		panelSurname.setBackground(SystemColor.text);
		panelPage1.add(panelSurname);
		
		JTextArea txtrPetAdoptinForm_1_1_1 = new JTextArea();
		txtrPetAdoptinForm_1_1_1.setText("Surname");
		txtrPetAdoptinForm_1_1_1.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrPetAdoptinForm_1_1_1.setEditable(false);
		txtrPetAdoptinForm_1_1_1.setBounds(10, 10, 176, 24);
		panelSurname.add(txtrPetAdoptinForm_1_1_1);
		
		surname = new JTextField();
		surname.setColumns(10);
		surname.setBounds(10, 38, 230, 24);
		panelSurname.add(surname);
		
		JPanel panelBirthday = new JPanel();
		panelBirthday.setBounds(0, 555, 484, 72);
		panelBirthday.setLayout(null);
		panelBirthday.setBackground(SystemColor.text);
		panelPage1.add(panelBirthday);
		
		JTextArea txtrPetAdoptinForm_1_1_1_1_2 = new JTextArea();
		txtrPetAdoptinForm_1_1_1_1_2.setText("(eg. August 7, 2003)");
		txtrPetAdoptinForm_1_1_1_1_2.setFont(new Font("Calibri Light", Font.PLAIN, 17));
		txtrPetAdoptinForm_1_1_1_1_2.setEditable(false);
		txtrPetAdoptinForm_1_1_1_1_2.setBounds(80, 10, 176, 24);
		panelBirthday.add(txtrPetAdoptinForm_1_1_1_1_2);
		
		JTextArea txtrPetAdoptinForm_1_1_1_1 = new JTextArea();
		txtrPetAdoptinForm_1_1_1_1.setText("Birthday");
		txtrPetAdoptinForm_1_1_1_1.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrPetAdoptinForm_1_1_1_1.setEditable(false);
		txtrPetAdoptinForm_1_1_1_1.setBounds(10, 10, 176, 24);
		panelBirthday.add(txtrPetAdoptinForm_1_1_1_1);
		
		birthday = new JTextField();
		birthday.setColumns(10);
		birthday.setBounds(10, 38, 230, 24);
		panelBirthday.add(birthday);
		
		JLabel label = new JLabel("New label");
		label.setBounds(98, 17, 45, 13);
		panelBirthday.add(label);
		
		JPanel panelOccupation = new JPanel();
		panelOccupation.setBounds(0, 637, 484, 72);
		panelOccupation.setLayout(null);
		panelOccupation.setBackground(SystemColor.text);
		panelPage1.add(panelOccupation);
		
		JTextArea txtrPetAdoptinForm_1_1_1_1_1 = new JTextArea();
		txtrPetAdoptinForm_1_1_1_1_1.setText("Occupation");
		txtrPetAdoptinForm_1_1_1_1_1.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrPetAdoptinForm_1_1_1_1_1.setEditable(false);
		txtrPetAdoptinForm_1_1_1_1_1.setBounds(10, 10, 176, 24);
		panelOccupation.add(txtrPetAdoptinForm_1_1_1_1_1);
		
		occupation = new JTextField();
		occupation.setColumns(10);
		occupation.setBounds(10, 38, 230, 24);
		panelOccupation.add(occupation);
		
		JPanel panelUsername = new JPanel();
		panelUsername.setBounds(0, 719, 484, 72);
		panelUsername.setLayout(null);
		panelUsername.setBackground(SystemColor.text);
		panelPage1.add(panelUsername);
		
		JTextArea txtrPetAdoptinForm_1_1_1_1_1_1 = new JTextArea();
		txtrPetAdoptinForm_1_1_1_1_1_1.setText("Username");
		txtrPetAdoptinForm_1_1_1_1_1_1.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrPetAdoptinForm_1_1_1_1_1_1.setEditable(false);
		txtrPetAdoptinForm_1_1_1_1_1_1.setBounds(10, 10, 176, 24);
		panelUsername.add(txtrPetAdoptinForm_1_1_1_1_1_1);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(10, 38, 230, 24);
		panelUsername.add(username);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(0, 801, 484, 36);
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBackground(SystemColor.text);
		panelPage1.add(panel_1_1_2);
		
		JTextArea txtrPetPreference = new JTextArea();
		txtrPetPreference.setText("Pet Preference");
		txtrPetPreference.setFont(new Font("Calibri Light", Font.BOLD, 20));
		txtrPetPreference.setEditable(false);
		txtrPetPreference.setBounds(10, 10, 188, 24);
		panel_1_1_2.add(txtrPetPreference);
		
		JPanel panelPettype = new JPanel();
		panelPettype.setBounds(0, 847, 484, 110);
		panelPettype.setBackground(SystemColor.text);
		panelPage1.add(panelPettype);
		panelPettype.setLayout(null);
		
		JTextArea txtrPetType = new JTextArea();
		txtrPetType.setBounds(10, 10, 400, 24);
		txtrPetType.setText("What Type of pet are you interested in adopting?");
		txtrPetType.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrPetType.setEditable(false);
		panelPettype.add(txtrPetType);
		
		JTextArea txtrdogCatBird = new JTextArea();
		txtrdogCatBird.setBounds(10, 32, 400, 24);
		txtrdogCatBird.setText("(Dog, Cat, Bird or Rabbit)");
		txtrdogCatBird.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrdogCatBird.setEditable(false);
		panelPettype.add(txtrdogCatBird);
		
		petPreference = new JTextField();
		petPreference.setColumns(10);
		petPreference.setBounds(10, 66, 230, 24);
		panelPettype.add(petPreference);
		
		
		JPanel panelPetdisability = new JPanel();
		panelPetdisability.setBounds(0, 1050, 484, 125);
		panelPetdisability.setLayout(null);
		panelPetdisability.setBackground(SystemColor.text);
		panelPage1.add(panelPetdisability);
		
		JTextArea txtrPetDisability = new JTextArea();
		txtrPetDisability.setLineWrap(true);
		txtrPetDisability.setText("Are you open to adopting a special needs pet(eg. medical conditions, disabilities)?");
		txtrPetDisability.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrPetDisability.setEditable(false);
		txtrPetDisability.setBounds(10, 10, 440, 48);
		panelPetdisability.add(txtrPetDisability);
		
		petdisability = new JTextField();
		petdisability.setColumns(10);
		petdisability.setBounds(10, 68, 230, 24);
		panelPetdisability.add(petdisability);
		
		JPanel panelResidence = new JPanel();
		panelResidence.setBounds(0, 1190, 484, 115);
		panelResidence.setLayout(null);
		panelResidence.setBackground(SystemColor.text);
		panelPage1.add(panelResidence);
		
		residence = new JTextField();
		residence.setColumns(10);
		residence.setBounds(10, 68, 230, 24);
		panelResidence.add(residence);
		
		JTextArea txtrownedOrRent = new JTextArea();
		txtrownedOrRent.setText("(Own or Rent)");
		txtrownedOrRent.setLineWrap(true);
		txtrownedOrRent.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrownedOrRent.setEditable(false);
		txtrownedOrRent.setBounds(10, 38, 350, 40);
		panelResidence.add(txtrownedOrRent);
		
		JTextArea txtrResidence = new JTextArea();
		txtrResidence.setText("Do you own or rent your current residence?");
		txtrResidence.setLineWrap(true);
		txtrResidence.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrResidence.setEditable(false);
		txtrResidence.setBounds(10, 10, 350, 40);
		panelResidence.add(txtrResidence);
		
		JPanel panelPermission = new JPanel();
		panelPermission.setBounds(0, 1320, 484, 125);
		panelPermission.setLayout(null);
		panelPermission.setBackground(SystemColor.text);
		panelPage1.add(panelPermission);
		
		JTextArea txtrIfYouDo = new JTextArea();
		txtrIfYouDo.setText("If you rent,  do you have permission from you landlord to have a pet?");
		txtrIfYouDo.setLineWrap(true);
		txtrIfYouDo.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrIfYouDo.setEditable(false);
		txtrIfYouDo.setBounds(10, 10, 440, 48);
		panelPermission.add(txtrIfYouDo);
		
		permission = new JTextField();
		permission.setColumns(10);
		permission.setBounds(10, 68, 230, 24);
		panelPermission.add(permission);
		
		JPanel panelPermission_1 = new JPanel();
		panelPermission_1.setBounds(0, 1460, 484, 100);
		panelPermission_1.setLayout(null);
		panelPermission_1.setBackground(SystemColor.text);
		panelPage1.add(panelPermission_1);
		
		JTextArea txtrOtherPets = new JTextArea();
		txtrOtherPets.setText("Do you have any other pets at home? If yes please provide details.");
		txtrOtherPets.setLineWrap(true);
		txtrOtherPets.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrOtherPets.setEditable(false);
		txtrOtherPets.setBounds(10, 10, 460, 48);
		panelPermission_1.add(txtrOtherPets);
		
		otherpets = new JTextField();
		otherpets.setColumns(10);
		otherpets.setBounds(10, 62, 230, 24);
		panelPermission_1.add(otherpets);
		
		JPanel panel_1_1_2_1 = new JPanel();
		panel_1_1_2_1.setBounds(0, 1575, 484, 36);
		panel_1_1_2_1.setLayout(null);
		panel_1_1_2_1.setBackground(SystemColor.text);
		panelPage1.add(panel_1_1_2_1);
		
		JTextArea txtrLifestyle = new JTextArea();
		txtrLifestyle.setText("Life Style");
		txtrLifestyle.setFont(new Font("Calibri Light", Font.BOLD, 20));
		txtrLifestyle.setEditable(false);
		txtrLifestyle.setBounds(10, 10, 188, 24);
		panel_1_1_2_1.add(txtrLifestyle);
		
		JPanel panelResidence_1 = new JPanel();
		panelResidence_1.setBounds(0, 1625, 484, 150);
		panelResidence_1.setBackground(SystemColor.text);
		panelPage1.add(panelResidence_1);
		panelResidence_1.setLayout(null);
		
		JTextArea txtrHowActiveIs = new JTextArea();
		txtrHowActiveIs.setBounds(10, 10, 350, 25);
		txtrHowActiveIs.setText("How active is your life style?");
		txtrHowActiveIs.setLineWrap(true);
		txtrHowActiveIs.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrHowActiveIs.setEditable(false);
		panelResidence_1.add(txtrHowActiveIs);
		
		JTextArea txtrVeryActive = new JTextArea();
		txtrVeryActive.setBounds(10, 34, 350, 25);
		txtrVeryActive.setText("- Very Active ( frequent exercise, oudor activities)");
		txtrVeryActive.setLineWrap(true);
		txtrVeryActive.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtrVeryActive.setEditable(false);
		panelResidence_1.add(txtrVeryActive);
		
		JTextArea txtrModeratelyRegular = new JTextArea();
		txtrModeratelyRegular.setText("- Moderately ( regular walks, occasional outdoor activities)");
		txtrModeratelyRegular.setLineWrap(true);
		txtrModeratelyRegular.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtrModeratelyRegular.setEditable(false);
		txtrModeratelyRegular.setBounds(10, 56, 350, 25);
		panelResidence_1.add(txtrModeratelyRegular);
		
		JTextArea txtrNotVeryActive = new JTextArea();
		txtrNotVeryActive.setText("- Not Very Active ( limited physical activity)");
		txtrNotVeryActive.setLineWrap(true);
		txtrNotVeryActive.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtrNotVeryActive.setEditable(false);
		txtrNotVeryActive.setBounds(10, 79, 350, 25);
		panelResidence_1.add(txtrNotVeryActive);
		
		lifestyle = new JTextField();
		lifestyle.setColumns(10);
		lifestyle.setBounds(10, 105, 230, 24);
		panelResidence_1.add(lifestyle);
		
		JPanel panelEmail_1 = new JPanel();
		panelEmail_1.setBounds(0, 967, 484, 72);
		panelEmail_1.setLayout(null);
		panelEmail_1.setBackground(SystemColor.text);
		panelPage1.add(panelEmail_1);
		
		JTextArea txtxPetname = new JTextArea();
		txtxPetname.setText("Who do you want to adopt? (type the specific name of pet)");
		txtxPetname.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtxPetname.setEditable(false);
		txtxPetname.setBounds(10, 10, 450, 24);
		panelEmail_1.add(txtxPetname);
		
		petname = new JTextField();
		petname.setColumns(10);
		petname.setBounds(10, 38, 230, 24);
		panelEmail_1.add(petname);
		
		JPanel panelActivesness = new JPanel();
		panelActivesness.setBounds(0, 1790, 484, 195);
		panelActivesness.setBackground(SystemColor.text);
		panelPage1.add(panelActivesness);
		panelActivesness.setLayout(null);
		
		JTextArea txtrActiveness = new JTextArea();
		txtrActiveness.setBounds(10, 10, 440, 45);
		txtrActiveness.setText("How much time can you dedicate to caring for a pet on a daily basis?");
		txtrActiveness.setLineWrap(true);
		txtrActiveness.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrActiveness.setEditable(false);
		panelActivesness.add(txtrActiveness);
		
		JTextArea txtrLessThan = new JTextArea();
		txtrLessThan.setBounds(10, 62, 350, 25);
		txtrLessThan.setText("- Less than an hour");
		txtrLessThan.setLineWrap(true);
		txtrLessThan.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtrLessThan.setEditable(false);
		panelActivesness.add(txtrLessThan);
		
		JTextArea txtrHours = new JTextArea();
		txtrHours.setBounds(10, 84, 350, 25);
		txtrHours.setText("- 1-2 hours");
		txtrHours.setLineWrap(true);
		txtrHours.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtrHours.setEditable(false);
		panelActivesness.add(txtrHours);
		
		JTextArea txtrHours_2 = new JTextArea();
		txtrHours_2.setBounds(10, 107, 350, 25);
		txtrHours_2.setText("- 2-4 hours");
		txtrHours_2.setLineWrap(true);
		txtrHours_2.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtrHours_2.setEditable(false);
		panelActivesness.add(txtrHours_2);
		
		JTextArea txtrHours_2_1 = new JTextArea();
		txtrHours_2_1.setBounds(10, 131, 350, 25);
		txtrHours_2_1.setText("- More than 4 hours");
		txtrHours_2_1.setLineWrap(true);
		txtrHours_2_1.setFont(new Font("Calibri Light", Font.PLAIN, 15));
		txtrHours_2_1.setEditable(false);
		panelActivesness.add(txtrHours_2_1);
		
		activeness = new JTextField();
		activeness.setBounds(10, 161, 230, 24);
		activeness.setColumns(10);
		panelActivesness.add(activeness);
		
		JPanel panelPreviousExperience = new JPanel();
		panelPreviousExperience.setBounds(0, 2000, 484, 36);
		panelPreviousExperience.setLayout(null);
		panelPreviousExperience.setBackground(SystemColor.text);
		panelPage1.add(panelPreviousExperience);
		
		JTextArea txtrPreviousExperience = new JTextArea();
		txtrPreviousExperience.setText("Previous Experience");
		txtrPreviousExperience.setFont(new Font("Calibri Light", Font.BOLD, 20));
		txtrPreviousExperience.setEditable(false);
		txtrPreviousExperience.setBounds(10, 10, 188, 24);
		panelPreviousExperience.add(txtrPreviousExperience);
		
		JPanel panelPetExperience = new JPanel();
		panelPetExperience.setAlignmentX(Component.LEFT_ALIGNMENT);
		panelPetExperience.setBounds(0, 2055, 484, 85);
		panelPetExperience.setLayout(null);
		panelPetExperience.setBackground(SystemColor.text);
		panelPage1.add(panelPetExperience);
		
		JTextArea txtrPetExperience = new JTextArea();
		txtrPetExperience.setAlignmentX(Component.RIGHT_ALIGNMENT);
		txtrPetExperience.setText("Have you owned a pet before?");
		txtrPetExperience.setLineWrap(true);
		txtrPetExperience.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		txtrPetExperience.setEditable(false);
		txtrPetExperience.setBounds(10, 10, 350, 40);
		panelPetExperience.add(txtrPetExperience);
		
		previousexperience = new JTextField();
		previousexperience.setColumns(10);
		previousexperience.setBounds(10, 50, 230, 24);
		panelPetExperience.add(previousexperience);
		
		JPanel panelBehavior = new JPanel();
		panelBehavior.setLayout(null);
		panelBehavior.setBackground(SystemColor.text);
		panelBehavior.setAlignmentX(0.0f);
		panelBehavior.setBounds(0, 2162, 484, 85);
		panelPage1.add(panelBehavior);
		
		JTextArea labelBehavior = new JTextArea();
		labelBehavior.setText("Have you ever dealt with behavioral issues in pets before?");
		labelBehavior.setLineWrap(true);
		labelBehavior.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		labelBehavior.setEditable(false);
		labelBehavior.setAlignmentX(1.0f);
		labelBehavior.setBounds(10, 10, 500, 40);
		panelBehavior.add(labelBehavior);
		
		behavior = new JTextField();
		behavior.setColumns(10);
		behavior.setBounds(10, 50, 230, 24);
		panelBehavior.add(behavior);
		
		JPanel panelVolunteer = new JPanel();
		panelVolunteer.setLayout(null);
		panelVolunteer.setBackground(SystemColor.text);
		panelVolunteer.setAlignmentX(0.0f);
		panelVolunteer.setBounds(0, 2265, 484, 100);
		panelPage1.add(panelVolunteer);
		
		JTextArea textVolunteer = new JTextArea();
		textVolunteer.setText("Have you volunteered or worked in animal shelters, rescue organizations, or veterinary clinics?");
		textVolunteer.setLineWrap(true);
		textVolunteer.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		textVolunteer.setEditable(false);
		textVolunteer.setAlignmentX(1.0f);
		textVolunteer.setBounds(10, 10, 460, 48);
		panelVolunteer.add(textVolunteer);
		
		volunteer = new JTextField();
		volunteer.setColumns(10);
		volunteer.setBounds(10, 66, 230, 24);
		panelVolunteer.add(volunteer);
		
		JPanel panelCommitment = new JPanel();
		panelCommitment.setLayout(null);
		panelCommitment.setBackground(SystemColor.text);
		panelCommitment.setBounds(0, 2380, 484, 36);
		panelPage1.add(panelCommitment);
		
		JTextArea textCommitment = new JTextArea();
		textCommitment.setText("Commitment and Care");
		textCommitment.setFont(new Font("Calibri Light", Font.BOLD, 20));
		textCommitment.setEditable(false);
		textCommitment.setBounds(10, 10, 200, 24);
		panelCommitment.add(textCommitment);
		
		JPanel panelResponsibility = new JPanel();
		panelResponsibility.setLayout(null);
		panelResponsibility.setBackground(SystemColor.text);
		panelResponsibility.setAlignmentX(0.0f);
		panelResponsibility.setBounds(0, 2435, 484, 120);
		panelPage1.add(panelResponsibility);
		
		JTextArea textResponsibility = new JTextArea();
		textResponsibility.setText("Are you willing to commit to the responsibilities of pet ownership, including feeding, grooming, exercise, and veterinary care?");
		textResponsibility.setLineWrap(true);
		textResponsibility.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		textResponsibility.setEditable(false);
		textResponsibility.setAlignmentX(1.0f);
		textResponsibility.setBounds(10, 10, 465, 67);
		panelResponsibility.add(textResponsibility);
		
		responsibility = new JTextField();
		responsibility.setColumns(10);
		responsibility.setBounds(10, 87, 230, 24);
		panelResponsibility.add(responsibility);
		
		JPanel panelFinancially = new JPanel();
		panelFinancially.setLayout(null);
		panelFinancially.setBackground(SystemColor.text);
		panelFinancially.setAlignmentX(0.0f);
		panelFinancially.setBounds(0, 2575, 484, 100);
		panelPage1.add(panelFinancially);
		
		JTextArea textFinancially = new JTextArea();
		textFinancially.setText("Are you financially prepared to cover the costs of pet ownership, including food, supplies, and medical expenses?");
		textFinancially.setLineWrap(true);
		textFinancially.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		textFinancially.setEditable(false);
		textFinancially.setAlignmentX(1.0f);
		textFinancially.setBounds(10, 10, 465, 55);
		panelFinancially.add(textFinancially);
		
		financially = new JTextField();
		financially.setColumns(10);
		financially.setBounds(10, 66, 230, 24);
		panelFinancially.add(financially);
		
		JPanel panelInvest = new JPanel();
		panelInvest.setLayout(null);
		panelInvest.setBackground(SystemColor.text);
		panelInvest.setAlignmentX(0.0f);
		panelInvest.setBounds(0, 2697, 484, 100);
		panelPage1.add(panelInvest);
		
		JTextArea textInvest = new JTextArea();
		textInvest.setText("Are you willing to invest time and effort into training your pet and addressing any behavioral issues that may arise?");
		textInvest.setLineWrap(true);
		textInvest.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		textInvest.setEditable(false);
		textInvest.setAlignmentX(1.0f);
		textInvest.setBounds(10, 10, 480, 45);
		panelInvest.add(textInvest);
		
		invest = new JTextField();
		invest.setColumns(10);
		invest.setBounds(10, 65, 230, 24);
		panelInvest.add(invest);
		
		JPanel panelCommitment_1 = new JPanel();
		panelCommitment_1.setLayout(null);
		panelCommitment_1.setBackground(SystemColor.text);
		panelCommitment_1.setBounds(0, 2816, 484, 36);
		panelPage1.add(panelCommitment_1);
		
		JTextArea txtrContactDetails = new JTextArea();
		txtrContactDetails.setText("Contact Details");
		txtrContactDetails.setFont(new Font("Calibri Light", Font.BOLD, 20));
		txtrContactDetails.setEditable(false);
		txtrContactDetails.setBounds(10, 10, 200, 24);
		panelCommitment_1.add(txtrContactDetails);
		
		JPanel panelEmail = new JPanel();
		panelEmail.setLayout(null);
		panelEmail.setBackground(SystemColor.text);
		panelEmail.setAlignmentX(0.0f);
		panelEmail.setBounds(0, 2870, 484, 75);
		panelPage1.add(panelEmail);
		
		JTextArea textEmail = new JTextArea();
		textEmail.setText("Email Address");
		textEmail.setLineWrap(true);
		textEmail.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		textEmail.setEditable(false);
		textEmail.setAlignmentX(1.0f);
		textEmail.setBounds(10, 10, 350, 20);
		panelEmail.add(textEmail);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(10, 39, 230, 24);
		panelEmail.add(email);
		
		JPanel panelNumber = new JPanel();
		panelNumber.setLayout(null);
		panelNumber.setBackground(SystemColor.text);
		panelNumber.setAlignmentX(0.0f);
		panelNumber.setBounds(0, 2966, 484, 75);
		panelPage1.add(panelNumber);
		
		JTextArea textNumber = new JTextArea();
		textNumber.setText("Phone Number");
		textNumber.setLineWrap(true);
		textNumber.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		textNumber.setEditable(false);
		textNumber.setAlignmentX(1.0f);
		textNumber.setBounds(10, 10, 350, 20);
		panelNumber.add(textNumber);
		
		number = new JTextField();
		number.setColumns(10);
		number.setBounds(10, 39, 230, 24);
		panelNumber.add(number);
		
		JPanel panelAddress = new JPanel();
		panelAddress.setLayout(null);
		panelAddress.setBackground(SystemColor.text);
		panelAddress.setAlignmentX(0.0f);
		panelAddress.setBounds(0, 3065, 484, 75);
		panelPage1.add(panelAddress);
		
		JTextArea textAddress = new JTextArea();
		textAddress.setText("Address");
		textAddress.setLineWrap(true);
		textAddress.setFont(new Font("Calibri Light", Font.PLAIN, 19));
		textAddress.setEditable(false);
		textAddress.setAlignmentX(1.0f);
		textAddress.setBounds(10, 10, 350, 20);
		panelAddress.add(textAddress);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(10, 39, 230, 24);
		panelAddress.add(address);
		
		JButton SUBMIT = new JButton("Submit");
		SUBMIT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//declaration
				checkPetPreference();
				checkPetName();
				checkDisability();
				checkResidence();
				checkPermission();
				checkLifeStyle();
				checkActiveness();
				checkPreviousExp();
				checkBehavior();
				checkVolunteer();
				checkResponsibility();
				checkFinancially();
				checkInvest();
				
			}
		});
		SUBMIT.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String enteredfirstname = firstname.getText();
                String enteredsurname = surname.getText();
                String enteredbirthday = birthday.getText();
                String enteredusername = username.getText();
                String enteredoccupation = occupation.getText();
                String enteredpetpreference = petPreference.getText();
                String enteredpetyouwant = petname.getText();
                String enteredpetdisability = petdisability.getText();
                String enteredresidence = residence.getText();
                String enteredpermission = permission.getText();
                String enteredotherpet = otherpets.getText();
                String enteredlifestyle = lifestyle.getText();
                String enteredactiveness = activeness.getText();
                String enteredpreviousexperience = previousexperience.getText();
                String enteredbehavior = behavior.getText();
                String enteredvolunteer = volunteer.getText();
                String enteredresponsibility = responsibility.getText();
                String enteredfinancially = financially.getText();
                String enteredinvest = invest.getText();
                String enteredemail = email.getText();
                String enterednumber = number.getText();
                String enteredaddress = address.getText();
                
                
                
                if (isEmptyOrBlank(enteredfirstname) || isEmptyOrBlank(enteredsurname) || isEmptyOrBlank(enteredbirthday) || isEmptyOrBlank(enteredusername) || isEmptyOrBlank(enteredoccupation) || isEmptyOrBlank(enteredpetpreference) || isEmptyOrBlank(enteredpetyouwant) || isEmptyOrBlank(enteredpetdisability) || isEmptyOrBlank(enteredresidence) || isEmptyOrBlank(enteredpermission) || isEmptyOrBlank(enteredotherpet)|| isEmptyOrBlank(enteredlifestyle) || isEmptyOrBlank(enteredactiveness) || isEmptyOrBlank(enteredpreviousexperience) || isEmptyOrBlank(enteredbehavior) || isEmptyOrBlank(enteredvolunteer) || isEmptyOrBlank(enteredresponsibility) || isEmptyOrBlank(enteredfinancially) || isEmptyOrBlank(enteredinvest) || isEmptyOrBlank(enteredemail) || isEmptyOrBlank(enterednumber) || isEmptyOrBlank(enteredaddress)) {
                    JOptionPane.showMessageDialog(panelPetAdoption, "Please Fill All Fields!");
                } else {
                    boolean clientFormStatus = PetAdoptionFillForm(enteredfirstname, enteredsurname, enteredbirthday, enteredusername, enteredoccupation, enteredpetpreference, enteredpetyouwant, enteredpetdisability, enteredresidence, enteredpermission, enteredotherpet, enteredlifestyle, enteredactiveness, enteredpreviousexperience, enteredbehavior, enteredvolunteer, enteredresponsibility, enteredfinancially, enteredinvest, enteredemail, enterednumber, enteredaddress);
                    if (clientFormStatus) {
                        JOptionPane.showMessageDialog(panelPetAdoption, "Registration Successful!");  
                        thankyouform next = new thankyouform();
    					next.setVisible(true);
    					dispose();
                    } else {
                        JOptionPane.showMessageDialog(panelPetAdoption, "Registration Failed!");
                    }
                }
            }
			
			


    	});
		SUBMIT.setBounds(0, 3150, 85, 21);
		panelPage1.add(SUBMIT);
		
		JButton CLEAR = new JButton("Clear");
		CLEAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				//refresh function
				firstname.setText("");
				surname.setText("");
				birthday.setText("");
				username.setText("");
				occupation.setText("");
				petPreference.setText("");
				petname.setText("");
				petdisability.setText("");
				residence.setText("");
				permission.setText("");
				otherpets.setText("");
				lifestyle.setText("");
				activeness.setText("");
				previousexperience.setText("");
				behavior.setText("");
				volunteer.setText("");
				responsibility.setText("");
				financially.setText("");
				invest.setText("");
				email.setText("");
				number.setText("");
				address.setText("");
			}
		});
		CLEAR.setBounds(389, 3150, 85, 21);
		panelPage1.add(CLEAR);
		
		JLabel errorMessageLabel = new JLabel("Invalid Answer!");
		errorMessageLabel.setForeground(Color.RED); // Set the color of the error message

		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.setBounds(150, 2205, 85, 21);
	
    }
	//SQL Function
	private boolean PetAdoptionFillForm(String clientFirstname, String clientSurname, String clientBirthday, String clientUsername, String clientOccupation, String clientPetpreference, String clientPetYouWant, String clientPetdisability, String clientResidence, String clientPermission, String clientOtherPetsOwned, String clientActiveLifestyle, String clientActiveness, String clientPreviousExperience, String clientBehavior, String clientVolunteer, String clientResponsibility, String clientFinancially, String clientInvest, String clientEmail, String clientNumber, String clientAddress) {
        if (isEmptyOrBlank(clientFirstname) || isEmptyOrBlank(clientSurname) || isEmptyOrBlank(clientBirthday) || isEmptyOrBlank(clientEmail) || isEmptyOrBlank(clientOccupation) || isEmptyOrBlank(clientPetpreference) || isEmptyOrBlank(clientPetYouWant)|| isEmptyOrBlank(clientPetdisability)|| isEmptyOrBlank(clientResidence)|| isEmptyOrBlank(clientPermission) || isEmptyOrBlank(clientOtherPetsOwned)|| isEmptyOrBlank(clientOtherPetsOwned) || isEmptyOrBlank(clientActiveLifestyle)|| isEmptyOrBlank(clientActiveness)|| isEmptyOrBlank(clientPreviousExperience) ) {
            // If any field is empty or blank, return false indicating failure
            return false;
        }
      
        try {
            String url = "jdbc:sqlserver://BEVS;databasename=adoption;integratedSecurity=true;encrypt=false;";
            Connection conn = DriverManager.getConnection(url);
         
      
            String insertQuery = "INSERT INTO PetAdoptionFillForm (clientFirstname, clientSurname, clientBirthday, clientUsername, clientOccupation, clientPetpreference, clientPetYouWant, clientPetdisability, clientResidence, clientPermission, clientOtherPetsOwned, clientActiveLifestyle, clientActiveness, clientPreviousExperience, clientBehavior, clientVolunteer, clientResponsibility, clientFinancially, clientInvest, clientEmail, clientNumber, clientAddress) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement insertStmt = conn.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS)) {
                insertStmt.setString(1, clientFirstname);
                insertStmt.setString(2, clientSurname);
                insertStmt.setString(3, clientBirthday);
                insertStmt.setString(4, clientUsername);
                insertStmt.setString(5, clientOccupation);
                insertStmt.setString(6, clientPetpreference);
                insertStmt.setString(7, clientPetYouWant);
                insertStmt.setString(8, clientPetdisability);
                insertStmt.setString(9, clientResidence);
                insertStmt.setString(10, clientPermission);
                insertStmt.setString(11, clientOtherPetsOwned);
                insertStmt.setString(12, clientActiveLifestyle);
                insertStmt.setString(13, clientActiveness);
                insertStmt.setString(14, clientPreviousExperience);
                insertStmt.setString(15, clientBehavior);
                insertStmt.setString(16, clientVolunteer);
                insertStmt.setString(17, clientResponsibility);
                insertStmt.setString(18, clientFinancially);
                insertStmt.setString(19, clientInvest);
                insertStmt.setString(20, clientEmail);
                insertStmt.setString(21, clientNumber);
                insertStmt.setString(22, clientAddress);

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
    //Pet Preference Answer Restrictions
      private void checkPetPreference() {
    	  
    	    String inputedPetPreferenceText = petPreference.getText();
    	    String[] acceptedPreferenceAnswer = {"Dog", "Cat", "Bird", "Rabbit", "dog", "cat", "bird", "rabbit",""}; 

    	    boolean isValidPreferenceInput = false;
    	    for (String acceptedPreference : acceptedPreferenceAnswer) {
    	        if (inputedPetPreferenceText.equals(acceptedPreference)) {
    	            isValidPreferenceInput = true;                                   
    	        }
    	    }

    	    if (!isValidPreferenceInput) {
    	        JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Pet Preference Question #1!");
    	    } else {
    	    
    	    }
      }
      
    //Pet Name Answer Restrictions
      private void checkPetName() {
    	  String inputedPetName = petname.getText();
    	  String[] acceptedPetNameAnswer = {"Marky", "Luis","Raffy", "marky", "luis", "raffy", "Kiki", "Namnam", "Orange", "kiki", "namnam", "orange", "Feathers", "Tiny", "Sky", "feathers", "tiny", "sky", "Bonnie", "Bevvie", "bonnie", "bevvie", ""};
    	  
    	  boolean isValidPetNameInput = false;
    	  for (String acceptedPetName : acceptedPetNameAnswer) {
    		  if(inputedPetName.equals(acceptedPetName)) {
    			  isValidPetNameInput = true;
    		  }
    	  }
    	  if(!isValidPetNameInput) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Pet Preference Question #2!");
    	  }else {
    		  
    	  }
      }
    //Pet Disability Answer Restrictions
      private void checkDisability() {
    	  String inputedDisability = petdisability.getText();
    	  String[] acceptedDisability = {"Yes", "No", "yes", "no",""};
    	  
    	  boolean isValidDisabilityInput = false;
    	  for (String acceptedDisabilityAnswer : acceptedDisability) {
    	        if(inputedDisability.equals(acceptedDisabilityAnswer)) {
    	            isValidDisabilityInput = true;
    	            break;
    		  }
    	  }
    	  if(!isValidDisabilityInput) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Pet Preference Question #3!");
    	  }else {
    		  
    	  }
      }
    //Residence Answer Restrictions
      private void checkResidence() {
    	    String inputedResidence = residence.getText();
    	    String[] acceptedResidence = {"Rent", "Own","rent", "own", ""};
    	    
    	    boolean isValidResidenceInput = false;
    	    for (String acceptedResidenceInput : acceptedResidence) {
    	        if (inputedResidence.equals(acceptedResidenceInput)) {
    	            isValidResidenceInput = true;
    	            break;
    	        }
    	    }
    	    
    	    if (!isValidResidenceInput) {
    	        JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Pet Preference Question #4!");
    	    } else {
    	    }
    	}
    //Permission Answer Restrictions
      private void checkPermission() {
    	  String inputedPermission = permission.getText();
    	  String[] acceptedPermission = {"Yes", "No", "yes", "no", "n/a", "N/A", ""};
    	  
    	  boolean isValidPermissionInput = false;
    	  for(String acceptedPermissionInput : acceptedPermission) {
    		  if(inputedPermission.equals(acceptedPermissionInput)) {
    			  isValidPermissionInput = true;
    		  }
    	  }
    	  if(!isValidPermissionInput) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Pet Preference Question #5!");
    	  }else {
    	  
    	  }
      }
      //Lifestyle Answer Restrictions
      private void checkLifeStyle() {
    	  String inputedLifeStyle = lifestyle.getText();
    	  String[] acceptedLifeStyle = {"Very Active", "Moderately", "Not Very Active", ""};
    	  
    	  boolean isValidLifestyle = false;
    	  for(String acceptedLifeStyleInput : acceptedLifeStyle) {
    		  if(inputedLifeStyle.equals(acceptedLifeStyleInput)) {
    			  isValidLifestyle = true;
    		  }
    	  }
    	  if(!isValidLifestyle) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Lifestyle Question #1!");
    	  }else {
    		  
    	  }
      }
      //Activeness Answer Restrictions
      private void checkActiveness() {
    	  String inputedActiveness = activeness.getText();
    	  String[] acceptedActiveness = {"Less than an hour", "1-2 hours", "2-4 hours", "More than 4 hours", ""};
    	  
    	  boolean isValidActiveness = false;
    	  for(String acceptedActivenessInput : acceptedActiveness) {
    		  if(inputedActiveness.equals(acceptedActivenessInput)) {
    			  isValidActiveness = true;
    		  }
    	  }
    	  if(!isValidActiveness) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Lifestyle Question #2!");
    	  }else {
    		  
    	  }
      }
      //Previous Experience Answer Restrictions
      private void checkPreviousExp() {
    	  String inputedPreviousExp = previousexperience.getText();
    	  String[] acceptedPreviousExp = {"Yes", "No", "yes", "no", ""};
    	  
    	  boolean isValidPreviousExp = false;
    	  for(String acceptedPreviousExpInput : acceptedPreviousExp) {
    		  if(inputedPreviousExp.equals(acceptedPreviousExpInput)) {
    			  isValidPreviousExp = true;
    		  }
    	  }
    	  if(!isValidPreviousExp) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Previous Experience Question #1!");
    	  }else {
    		  
    	  }
      }
      //Behavior Answer Restrictions
      private void checkBehavior() {
    	  String inputedBehavior = behavior.getText();
    	  String[] acceptedBehavior = {"Yes", "No", "yes", "no", ""};
    	  
    	  boolean isValidBehavior = false;
    	  for(String acceptedBehaviorInput : acceptedBehavior) {
    		  if(inputedBehavior.equals(acceptedBehaviorInput)) {
    			  isValidBehavior = true;
    		  }
    	  }
    	  if(!isValidBehavior) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Previous Experience Question #2!");
    	  }
      }
      //Volunteer Answer Restrictions
      private void checkVolunteer() {
    	  String inputedVolunteer = volunteer.getText();
    	  String[] acceptedVolunteer = {"Yes", "No", "yes", "no", ""};
    	  
    	  boolean isValidVolunteer = false;
    	  for(String acceptedVolunteerInput : acceptedVolunteer) {
    		  if(inputedVolunteer.equals(acceptedVolunteerInput)) {
    			  isValidVolunteer = true;
    		  }
    	  }
    	  if(!isValidVolunteer) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Previous Experience Question #3!");
    	  }
      }
      
     //Responsibility Answer Restrictions
      private void checkResponsibility() {
    	  String inputedResponsibility = responsibility.getText();
    	  String[] acceptedResponsibility = {"Yes", "No", "yes", "no", ""};
    	  
    	  boolean isValidResponsibility = false;
    	  for(String acceptedResponsibilityInput : acceptedResponsibility) {
    		  if(inputedResponsibility.equals(acceptedResponsibilityInput)) {
    			  isValidResponsibility = true;
    		  }
    	  }
    	  if(!isValidResponsibility) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Commitment and Care Question #1!");
    	  }
      }
      //Financially Answer Restrictions
      private void checkFinancially() {
    	  String inputedFinancially = financially.getText();
    	  String[] acceptedFinancially = {"Yes", "No", "yes", "no", ""};
    	  
    	  boolean isValidFinancially = false;
    	  for(String acceptedFinanciallyInput : acceptedFinancially) {
    		  if(inputedFinancially.equals(acceptedFinanciallyInput)) {
    			  isValidFinancially = true;
    		  }
    	  }
    	  if(!isValidFinancially) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Commitment and Care Question #2!");
    	  }
      }
      //Invest Answer Restrictions
      private void checkInvest() {
    	  String inputedInvest = invest.getText();
    	  String[] acceptedInvest = {"Yes", "No", "yes", "no", ""};
    	  
    	  boolean isValidInvest = false;
    	  for(String acceptedInvestInput : acceptedInvest) {
    		  if(inputedInvest.equals(acceptedInvestInput)) {
    			  isValidInvest = true;
    		  }
    	  }
    	  if(!isValidInvest) {
    		  JOptionPane.showMessageDialog(contentPane, "Invalid Answer in Commitment and Care Question #3!");
    	  
    	  }
      }
      
}
		