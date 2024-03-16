package PetAdoption;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pet extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton_5;
	private JButton btnNewButton_15;
    private String saveFolderPath = "C:\\Users\\imand\\OneDrive\\Desktop\\OSappNew\\JAVAChipOnlineShoopingApplication\\ProductAddedFile";
    private File productDataFile = new File(saveFolderPath, "productdata.txt");
    protected String folderPath;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	Pet frame = new Pet();
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
	 private JButton btnNewButton;
	    private JPanel panelPage1;
	    private JPanel panelDogs;
	    private JPanel panelCats;
	    private JPanel panelBirds;
	    private JPanel panelRabbits;
	    private JPanel panelAllDogs;
	    private JPanel panelAllCats;
	    private JPanel panelAllBirds;
	    private JPanel panelAllRabbits;
	    private JLabel lblBevvie_1;
	    private JButton btnNewButton_1;
	    private JPanel Pet1_1;
	    private JLabel lblBevvie_2;
	    private JButton btnNewButton_2;
	    private JPanel panelBevvie_1;
	    private JPanel Pet1_2;
	    private JLabel lblBevvie_3;
	    private JButton btnNewButton_3;
	    private JPanel panelBevvie_2;
	    private JPanel Pet1_3;
	    private JLabel lblBevvie_4;
	    private JButton btnNewButton_4;
	    private JPanel panelBevvie_3;
	    private JPanel Pet1_4;
	    private JLabel lblBevvie_5;
	    private JButton btnNewButton_6;
	    private JPanel panelBevvie_4;
	    private JPanel Pet1_5;
	    private JLabel lblBevvie_6;
	    private JButton btnNewButton_7;
	    private JPanel panelBevvie_5;
	    private JPanel Pet1_6;
	    private JLabel lblBevvie_7;
	    private JButton btnNewButton_8;
	    private JPanel panelBevvie_6;
	    private JPanel Pet1_7;
	    private JLabel lblBevvie_8;
	    private JButton btnNewButton_9;
	    private JPanel panelBevvie_7;
	    private JPanel Pet1_8;
	    private JLabel lblBevvie_9;
	    private JButton btnNewButton_10;
	    private JPanel panelBevvie_8;
	    private JPanel Pet1_9;
	    private JLabel lblBevvie_10;
	    private JButton btnNewButton_11;
	    private JPanel panelBevvie_9;
	    private JSeparator separator;
	    private JLabel imageLabel;
	    private JButton AddPet;
	    private JButton AddButton;
	    
	    public Pet(){
	    	setTitle("Admin - Add Pets");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 804, 608);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		
		contentPane.setLayout(null);
		JPanel panelPage1 = new JPanel();
		panelPage1.setBackground(SystemColor.menu);
		panelPage1.setBounds(32, 41, 623, 1247);
		contentPane.add(panelPage1);

		//Panel for view all dogs
	    	panelDogs = new JPanel();
	        panelDogs.setBackground(SystemColor.menu);
	        panelDogs.setBounds(221, 62, 85, 21);
		panelPage1.setLayout(null);
        
        panelCats = new JPanel();
        panelCats.setBackground(SystemColor.menu);
        panelCats.setBounds(28, 10, 733, 1765);
		
		JPanel Bevvie = new JPanel();
		Bevvie.setBackground(SystemColor.menu);
		Bevvie.setBounds(221, 115, 173, 177);
		panelPage1.add(Bevvie);
		Bevvie.setLayout(null);
		
		JLabel lblBevvie = new JLabel("");
		lblBevvie.setBounds(0, 0, 173, 150);
		Bevvie.add(lblBevvie);
		
		btnNewButton_5 = new JButton("Pet 2");
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(SystemColor.menu);
		btnNewButton_5.setBounds(47, 150, 85, 21);
		Bevvie.add(btnNewButton_5);
		
		
		panelAllDogs = new JPanel();
		panelAllDogs.setBounds(93, 62, 86, 21);
		panelPage1.add(panelAllDogs);
		panelAllDogs.setLayout(null);
		JButton allDogs = new JButton("Dogs");
		allDogs.setBounds(0, 0, 85, 21);
		panelAllDogs.add(allDogs);
		
		allDogs.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		        // showDogsPanel();
		     }
		 });
		 
		 //Button Cats
        panelAllCats = new JPanel();
        panelAllCats.setLayout(null);
        panelAllCats.setBounds(221, 62, 86, 21);
        panelPage1.add(panelAllCats);
        
	      
		JButton allCats = new JButton("Cats");
		allCats.setBounds(0, 0, 85, 21);
		panelAllCats.add(allCats);
		
		allCats.addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		              //  showCatsPanel();
		            }
		        });
        
        //Button Birds
        panelAllBirds = new JPanel();
        panelAllBirds.setLayout(null);
        panelAllBirds.setBounds(333, 62, 86, 21);
        panelPage1.add(panelAllBirds);
		
		JButton allBirds = new JButton("Birds");
		allBirds.setBounds(0, 0, 85, 21);
		panelAllBirds.add(allBirds);
		
		allBirds.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
          //      showBirdsPanel();
			}
		});
		
		
		//Button Rabbits
        panelAllRabbits = new JPanel();
        panelAllRabbits.setLayout(null);
        panelAllRabbits.setBounds(461, 62, 86, 21);
        panelPage1.add(panelAllRabbits);
        
        JButton allRabbits = new JButton("Rabbits");
        allRabbits.setBounds(0, 0, 85, 21);
        panelAllRabbits.add(allRabbits);
        
        allRabbits.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
             //   showRabbitsPanel();
			}
		});
        
        Pet1_1 = new JPanel();
        Pet1_1.setLayout(null);
        Pet1_1.setBackground(SystemColor.menu);
        Pet1_1.setBounds(420, 115, 173, 177);
        panelPage1.add(Pet1_1);
        
        lblBevvie_2 = new JLabel("");
        lblBevvie_2.setBounds(0, 0, 173, 150);
        Pet1_1.add(lblBevvie_2);
        
        btnNewButton_2 = new JButton("Pet 3");
        btnNewButton_2.setBorder(null);
        btnNewButton_2.setBackground(SystemColor.menu);
        btnNewButton_2.setBounds(47, 150, 85, 21);
        Pet1_1.add(btnNewButton_2);
        
        panelBevvie_1 = new JPanel();
        panelBevvie_1.setBounds(47, 150, 85, 21);
        Pet1_1.add(panelBevvie_1);
        
        Pet1_2 = new JPanel();
        Pet1_2.setLayout(null);
        Pet1_2.setBackground(SystemColor.menu);
        Pet1_2.setBounds(20, 331, 173, 177);
        panelPage1.add(Pet1_2);
        
        lblBevvie_3 = new JLabel("");
        lblBevvie_3.setBounds(0, 0, 173, 150);
        Pet1_2.add(lblBevvie_3);
        
        btnNewButton_3 = new JButton("Pet 4");
        btnNewButton_3.setBorder(null);
        btnNewButton_3.setBackground(SystemColor.menu);
        btnNewButton_3.setBounds(47, 150, 85, 21);
        Pet1_2.add(btnNewButton_3);
        
        panelBevvie_2 = new JPanel();
        panelBevvie_2.setBounds(47, 150, 85, 21);
        Pet1_2.add(panelBevvie_2);
        
        Pet1_3 = new JPanel();
        Pet1_3.setLayout(null);
        Pet1_3.setBackground(SystemColor.menu);
        Pet1_3.setBounds(221, 339, 173, 177);
        panelPage1.add(Pet1_3);
        
        lblBevvie_4 = new JLabel("");
        lblBevvie_4.setBounds(0, 0, 173, 150);
        Pet1_3.add(lblBevvie_4);
        
        btnNewButton_4 = new JButton("Pet 5");
        btnNewButton_4.setBorder(null);
        btnNewButton_4.setBackground(SystemColor.menu);
        btnNewButton_4.setBounds(47, 150, 85, 21);
        Pet1_3.add(btnNewButton_4);
        
        panelBevvie_3 = new JPanel();
        panelBevvie_3.setBounds(47, 150, 85, 21);
        Pet1_3.add(panelBevvie_3);
        
        Pet1_4 = new JPanel();
        Pet1_4.setLayout(null);
        Pet1_4.setBackground(SystemColor.menu);
        Pet1_4.setBounds(420, 339, 173, 177);
        panelPage1.add(Pet1_4);
        
        lblBevvie_5 = new JLabel("");
        lblBevvie_5.setBounds(0, 0, 173, 150);
        Pet1_4.add(lblBevvie_5);
        
        btnNewButton_6 = new JButton("Pet 6");
        btnNewButton_6.setBorder(null);
        btnNewButton_6.setBackground(SystemColor.menu);
        btnNewButton_6.setBounds(47, 150, 85, 21);
        Pet1_4.add(btnNewButton_6);
        
        panelBevvie_4 = new JPanel();
        panelBevvie_4.setBounds(47, 150, 85, 21);
        Pet1_4.add(panelBevvie_4);
        
        Pet1_5 = new JPanel();
        Pet1_5.setLayout(null);
        Pet1_5.setBackground(SystemColor.menu);
        Pet1_5.setBounds(20, 570, 173, 177);
        panelPage1.add(Pet1_5);
        
        lblBevvie_6 = new JLabel("");
        lblBevvie_6.setBounds(0, 0, 173, 150);
        Pet1_5.add(lblBevvie_6);
        
        btnNewButton_7 = new JButton("Pet 7");
        btnNewButton_7.setBorder(null);
        btnNewButton_7.setBackground(SystemColor.menu);
        btnNewButton_7.setBounds(47, 150, 85, 21);
        Pet1_5.add(btnNewButton_7);
        
        panelBevvie_5 = new JPanel();
        panelBevvie_5.setBounds(47, 150, 85, 21);
        Pet1_5.add(panelBevvie_5);
        
        Pet1_6 = new JPanel();
        Pet1_6.setLayout(null);
        Pet1_6.setBackground(SystemColor.menu);
        Pet1_6.setBounds(221, 574, 173, 177);
        panelPage1.add(Pet1_6);
        
        lblBevvie_7 = new JLabel("");
        lblBevvie_7.setBounds(0, 0, 173, 150);
        Pet1_6.add(lblBevvie_7);
        
        btnNewButton_8 = new JButton("Pet 8");
        btnNewButton_8.setBorder(null);
        btnNewButton_8.setBackground(SystemColor.menu);
        btnNewButton_8.setBounds(47, 150, 85, 21);
        Pet1_6.add(btnNewButton_8);
        
        panelBevvie_6 = new JPanel();
        panelBevvie_6.setBounds(47, 150, 85, 21);
        Pet1_6.add(panelBevvie_6);
        
        Pet1_7 = new JPanel();
        Pet1_7.setLayout(null);
        Pet1_7.setBackground(SystemColor.menu);
        Pet1_7.setBounds(420, 574, 173, 177);
        panelPage1.add(Pet1_7);
        
        lblBevvie_8 = new JLabel("");
        lblBevvie_8.setBounds(0, 0, 173, 150);
        Pet1_7.add(lblBevvie_8);
        
        btnNewButton_9 = new JButton("Pet 9");
        btnNewButton_9.setBorder(null);
        btnNewButton_9.setBackground(SystemColor.menu);
        btnNewButton_9.setBounds(47, 150, 85, 21);
        Pet1_7.add(btnNewButton_9);
        
        panelBevvie_7 = new JPanel();
        panelBevvie_7.setBounds(47, 150, 85, 21);
        Pet1_7.add(panelBevvie_7);
        
        Pet1_8 = new JPanel();
        Pet1_8.setLayout(null);
        Pet1_8.setBackground(SystemColor.menu);
        Pet1_8.setBounds(149, 805, 173, 177);
        panelPage1.add(Pet1_8);
        
        lblBevvie_9 = new JLabel("");
        lblBevvie_9.setBounds(0, 0, 173, 150);
        Pet1_8.add(lblBevvie_9);
        
        btnNewButton_10 = new JButton("Pet 10");
        btnNewButton_10.setBorder(null);
        btnNewButton_10.setBackground(SystemColor.menu);
        btnNewButton_10.setBounds(47, 150, 85, 21);
        Pet1_8.add(btnNewButton_10);
        
        panelBevvie_8 = new JPanel();
        panelBevvie_8.setBounds(47, 150, 85, 21);
        Pet1_8.add(panelBevvie_8);
        
        Pet1_9 = new JPanel();
        Pet1_9.setLayout(null);
        Pet1_9.setBackground(SystemColor.menu);
        Pet1_9.setBounds(420, 805, 173, 177);
        panelPage1.add(Pet1_9);
        
        lblBevvie_10 = new JLabel("");
        lblBevvie_10.setBounds(0, 0, 173, 150);
        Pet1_9.add(lblBevvie_10);
        
        btnNewButton_11 = new JButton("Pet 11");
        btnNewButton_11.setBorder(null);
        btnNewButton_11.setBackground(SystemColor.menu);
        btnNewButton_11.setBounds(47, 150, 85, 21);
        Pet1_9.add(btnNewButton_11);
        
        panelBevvie_9 = new JPanel();
        panelBevvie_9.setBounds(47, 150, 85, 21);
        Pet1_9.add(panelBevvie_9);
        
        JButton btnNewButton_12 = new JButton("ADD PET");
        btnNewButton_12.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
  
		        AddPet AddPet = new AddPet();
		        AddPet.setVisible(true);
		        dispose();
 		    }
        });
        
        btnNewButton_12.setBounds(505, 0, 108, 21);
        panelPage1.add(btnNewButton_12);
        
        btnNewButton_1 = new JButton("Pet 1");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				adminBonnie next = new adminBonnie();
				next.setVisible(true);	
				dispose();
				}
		
        });
        btnNewButton_1.setBounds(62, 271, 85, 21);
        panelPage1.add(btnNewButton_1);
        btnNewButton_1.setBackground(SystemColor.menu);
        btnNewButton_1.setBorder(null);
        
  
        lblBevvie_1 = new JLabel("");
        lblBevvie_1.setBounds(20, 115, 173, 150);
        panelPage1.add(lblBevvie_1);
        JLabel imageLabel = new JLabel();
        lblBevvie_1.add(imageLabel);

        setVisible(true);
    
        
        
		JScrollPane scrollPane = new JScrollPane(contentPane);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		contentPane.setPreferredSize(new Dimension(200, 1500));
		getContentPane().add(scrollPane, BorderLayout.CENTER);

        imageLabel = new JLabel();
        imageLabel.setBounds(521, 23, 173, 150);
        contentPane.add(imageLabel);
        
	    }
	    //Dog Panel
	    private void showDogsPanel() {
	        // Switch to the dogs panel
	    setContentPane(panelDogs);
	    revalidate();
	    repaint(); 
	    }
	 
	    private JPanel createPetPanel(String[] petInfo) {
	        JPanel petPanel = new JPanel();
	        petPanel.setLayout(null); // Set layout as per your requirement

	        // Create JLabels, JButtons, etc., and set their properties based on petInfo
	        // Example:
	        JLabel petNameLabel = new JLabel(petInfo[0]);
	        petNameLabel.setBounds(10, 10, 100, 20); // Set bounds as per your requirement
	        petPanel.add(petNameLabel);
	        
	        return petPanel;
	    }
	
	private void setTextField(String string) {
		// TODO Auto-generated method stub
		
	}
	private void clearTextFields() {
		// TODO Auto-generated method stub
	
	}
        }
	    