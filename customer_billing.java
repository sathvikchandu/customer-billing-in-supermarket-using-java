package projectfinal;
import javax.swing.*;



import java.util.*;




import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.text.*;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Projectfinal extends JFrame {
	//private Object jtxtReceipt;

	private JPanel contentPane;
	private JTextField txtI;
	private JTextField txtI_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_42;
	private JFrame frame;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	String itax,itot;
	double itemcost[] = new double[60];
	double itotal=0;
	int rand;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Projectfinal frame = new Projectfinal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Projectfinal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 127));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setBounds(10, 11, 65, 32);
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(946, 11, 363, 635);
		contentPane.add(textArea);
		
		txtI = new JTextField();
		txtI.setBounds(74, 11, 121, 30);
		contentPane.add(txtI);
		txtI.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ph. no");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(10, 54, 65, 20);
		contentPane.add(lblNewLabel_1);
		
		txtI_1 = new JTextField();
		txtI_1.setBounds(74, 48, 121, 30);
		contentPane.add(txtI_1);
		txtI_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tea and coffee");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2.setBounds(59, 103, 148, 32);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Final Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemcost[0] = Double.parseDouble(textField_2.getText())*190;
				itemcost[1] = Double.parseDouble(textField_3.getText())*375;
				itemcost[2] = Double.parseDouble(textField_4.getText())*303;
				itemcost[3] = Double.parseDouble(textField_5.getText())*340;
				itemcost[4] = Double.parseDouble(textField_6.getText())*165;
				itemcost[5] = Double.parseDouble(textField_7.getText())*236;
				itemcost[6] = Double.parseDouble(textField_8.getText())*240;
				itemcost[7] = Double.parseDouble(textField_9.getText())*139;
				itemcost[8] = Double.parseDouble(textField_10.getText())*154;
				itemcost[9] = Double.parseDouble(textField_11.getText())*115;
				itemcost[10] = Double.parseDouble(textField_12.getText())*100;
				itemcost[11] = Double.parseDouble(textField_13.getText())*199;
				itemcost[12] = Double.parseDouble(textField_14.getText())*61;
				itemcost[13] = Double.parseDouble(textField_15.getText())*95;
				itemcost[14] = Double.parseDouble(textField_16.getText())*70;
				itemcost[15] = Double.parseDouble(textField_17.getText())*92;
				itemcost[16] = Double.parseDouble(textField_18.getText())*209;
				itemcost[17] = Double.parseDouble(textField_19.getText())*266;
				itemcost[18] = Double.parseDouble(textField_20.getText())*200;
				itemcost[19] = Double.parseDouble(textField_21.getText())*485;
				itemcost[20] = Double.parseDouble(textField_22.getText())*505;
				itemcost[21] = Double.parseDouble(textField_23.getText())*275;
				itemcost[22] = Double.parseDouble(textField_24.getText())*465;
				itemcost[23] = Double.parseDouble(textField_25.getText())*599;
				itemcost[24] = Double.parseDouble(textField_26.getText())*355;
				itemcost[25] = Double.parseDouble(textField_27.getText())*245;
				itemcost[26] = Double.parseDouble(textField_28.getText())*270;
				itemcost[27] = Double.parseDouble(textField_29.getText())*330;
				itemcost[28] = Double.parseDouble(textField_30.getText())*54;
				itemcost[29] = Double.parseDouble(textField_31.getText())*107;
				itemcost[30] = Double.parseDouble(textField_32.getText())*50;
				itemcost[31] = Double.parseDouble(textField_33.getText())*31;
				itemcost[32] = Double.parseDouble(textField_34.getText())*84;
				itemcost[33] = Double.parseDouble(textField_35.getText())*165;
				itemcost[34] = Double.parseDouble(textField_36.getText())*109;
				itemcost[35] = Double.parseDouble(textField_37.getText())*153;
				itemcost[36] = Double.parseDouble(textField_38.getText())*90;
				itemcost[37] = Double.parseDouble(textField_39.getText())*64;
				itemcost[38] = Double.parseDouble(textField_43.getText())*399;
				itemcost[39] = Double.parseDouble(textField_44.getText())*113;
				itemcost[40] = Double.parseDouble(textField_45.getText())*139;
				itemcost[41] = Double.parseDouble(textField_46.getText())*192;
				itemcost[42] = Double.parseDouble(textField_47.getText())*62;
				itemcost[43] = Double.parseDouble(textField_48.getText())*60;
				itemcost[44] = Double.parseDouble(textField_49.getText())*59;
				itemcost[45] = Double.parseDouble(textField_50.getText())*26;
				itemcost[46] = Double.parseDouble(textField_51.getText())*45;
				itemcost[47] = Double.parseDouble(textField_52.getText())*15;
				itemcost[48] = Double.parseDouble(textField_53.getText())*48;
				itemcost[49] = Double.parseDouble(textField_54.getText())*77;
				Random random = new Random();
				
				for(int i=0;i<50;i++) {
					itotal = itotal+itemcost[i];
				}
				
				
				
				
				rand = random.nextInt(5);
				switch(rand) {
				case 1: double oh = 0.04*itotal;
						itotal = itotal-oh;
						JOptionPane.showMessageDialog(null, "Congrats, you have won four percent discount on your final bill!!");
						JOptionPane.showMessageDialog(null, "Your entire savings today was rs" + oh);
						break;
				case 2 : double ik = 0.06*itotal;
						 itotal = itotal-ik;
						 JOptionPane.showMessageDialog(null, "Congrats, you have won six percent discount on your final bill!!");
						 JOptionPane.showMessageDialog(null, "Your entire savings today was rs" + ik);
						 break;
				case 3 : JOptionPane.showMessageDialog(null, "Oops!!!, you haven't received any offers, Better luck next time");
						 
						 break;
				case 4 : double opo = 0.09*itotal;
						 itotal = itotal-opo;
						 JOptionPane.showMessageDialog(null, "Congrats, you have won nine percent discount on your final bill!!");
						 JOptionPane.showMessageDialog(null, "Your entire savings today was rs" + opo);
						 
						 break;
			    case 5 : double viv = 0.1*itotal;
						 itotal = itotal-viv;
						 
						 JOptionPane.showMessageDialog(null, "Congrats, you have won ten percent discount on your final bill!!");
						 JOptionPane.showMessageDialog(null, "Your entire savings today was rs" + viv);
						 break;
				}
				itax = String.format("%.2f", itotal);
				itot = String.valueOf(itax);
				textField_42.setText(itax);
				
				
				textArea.setEnabled(true);
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat ttime = new SimpleDateFormat("HH:mm:ss");
				ttime.format(timer.getTime());
				SimpleDateFormat tdate = new SimpleDateFormat("dd-MMM-yyyy");
				tdate.format(timer.getTime());
				
				textArea.append("\tCUSTOMER PARADISE BILLING"+"\n"+"name : "+txtI.getText()+"\n"+ "ph.no :"+txtI_1.getText()+"\n\nTetley green tea :\t" +textField_2.getText()+"units\t"+itemcost[0]+"\nLipton honey lemon green     :\t"+textField_3.getText()+"units\t"+itemcost[1]+"\nTaj mahal Tea 500g :     \t"+ textField_4.getText()+"units\t"+itemcost[2]+"\nBrooke bond 3 roses  : \t"+textField_5.getText()+
						" units\t"+itemcost[3]+"\nNestea lemon iced tea :  \t"+textField_6.getText()+"units\t"+itemcost[4]+"\nNescafe coffe :     \t"+textField_7.getText()+"units\t"+itemcost[5]+"\nBru coffe         \t\t"+textField_8.getText()+"units\t"+itemcost[6]+"\nBru filter coffe : \t\t"+textField_9.getText()+"units\t"+itemcost[7]+"\nB natural pomegranate   :\t"+textField_10.getText()+"units\t"+itemcost[8]+ "\nB natural pomegranate:\t"+textField_11.getText()+"units\t"+itemcost[9]+"\nCoca Cola soft drink\t"+textField_13.getText()
						+"units\t"+itemcost[10]+"\nThums up drink     \t"+textField_14.getText()+"units\t"+itemcost[11]+"\nMaaza drink       \t\t"+textField_16.getText()+"units\t"+itemcost[12]+"\nCadbury kids drink\t"+textField_18.getText()+"units\t"+itemcost[13]+"\nKids complan\t\t"+textField_19.getText()+"units\t"+itemcost[14]+"\nHorlicks kids drink\t"+textField_20.getText()+"units\t"+itemcost[15]+"\nEnsure vanilla drink   \t"+textField_22.getText()+"units\t"+itemcost[16]+"\nWomen bournvita \t"+textField_23.getText()+"units\t"+itemcost[17]+"\nProtinex choclate drink \t"+textField_24.getText()+"units\t"+itemcost[18]+
						"\nFortune atta    \t\t"+textField_26.getText()+"units\t"+itemcost[19]+"\nPulisbury multi garin atta  \t"+textField_27.getText()+"units\t"+itemcost[20]+"\n24 mantra raagi flour \t"+textField_30.getText()+"units\t"+itemcost[21]+"\nVedaka maida\t\t"+textField_32.getText()+"units\t"+itemcost[23]+"\nVedaka raw peanuts\t"+textField_35.getText()+"units\t"+itemcost[24]+"\nTata moong dal \t"+textField_37.getText()+"units\t"+itemcost[25]+"\nVedaka soya chunks \t"+textField_39.getText()+"units\t"+itemcost[26]+"\nMother dairy cow ghee  \t" +textField_43.getText()+"units\t"+itemcost[27]+"\nFortune refined sunflower oil \t"+textField_44.getText()+"units\t"+itemcost[28]+"\nDhara groundnut oil\t"+textField_46.getText()+"units\t"+itemcost[29]
						+"\nVedaka black pepper corn  \t"+textField_48.getText()+"units\t"+itemcost[30]+"\nTata garam masala   \t"+textField_49.getText()+"units\t"+itemcost[31]+"\nDabur Ginger garlic paste \t"+textField_51.getText()+"units\t"+itemcost[32]+"\n\n"+"FINAL\t\t\t"+itax + "\ndate:  "+tdate.format(timer.getTime())+"\t"+"time :"+ttime.format(timer.getTime()));
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(134, 661, 136, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Print");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try 
				{
					textArea.print();
				}
				catch(java.awt.print.PrinterException e){
					System.err.format("No printer found", e.getMessage());
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(19, 661, 105, 36);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(" Tetley green tea 50 packs");
		chckbxNewCheckBox.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox.setBounds(10, 142, 159, 23);
		contentPane.add(chckbxNewCheckBox);
		
		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setBounds(173, 142, 86, 23);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Lipton honey lemon 100pcs.");
		chckbxNewCheckBox_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_1.setBounds(10, 175, 159, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxTajMahalTea = new JCheckBox("Taj Mahal Tea powder 500g");
		chckbxTajMahalTea.setBackground(new Color(0, 255, 127));
		chckbxTajMahalTea.setBounds(10, 207, 159, 23);
		contentPane.add(chckbxTajMahalTea);
		
		JCheckBox chckbxRosesDust = new JCheckBox("3 Roses dust tea 500g");
		chckbxRosesDust.setBackground(new Color(0, 255, 127));
		chckbxRosesDust.setBounds(10, 238, 159, 23);
		contentPane.add(chckbxRosesDust);
		
		JCheckBox chckbxNesteaIcedTea = new JCheckBox("  Nestea Iced Tea 400g");
		chckbxNesteaIcedTea.setBackground(new Color(0, 255, 127));
		chckbxNesteaIcedTea.setBounds(10, 268, 159, 23);
		contentPane.add(chckbxNesteaIcedTea);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setText("0");
		textField_3.setColumns(10);
		textField_3.setBounds(173, 176, 86, 23);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		textField_4.setBounds(173, 208, 86, 23);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setColumns(10);
		textField_5.setBounds(173, 239, 86, 23);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setColumns(10);
		textField_6.setBounds(173, 269, 86, 23);
		contentPane.add(textField_6);
		
		JCheckBox chckbxNescafeClassicCoffee = new JCheckBox("Nescafe ClassicCoffee100g");
		chckbxNescafeClassicCoffee.setBackground(new Color(0, 255, 127));
		chckbxNescafeClassicCoffee.setBounds(10, 299, 159, 23);
		contentPane.add(chckbxNescafeClassicCoffee);
		
		JCheckBox chckbxBruCoffeeg = new JCheckBox("Bru Coffee 100g");
		chckbxBruCoffeeg.setBackground(new Color(0, 255, 127));
		chckbxBruCoffeeg.setBounds(10, 329, 159, 23);
		contentPane.add(chckbxBruCoffeeg);
		
		JCheckBox chckbxBruGreenLabel = new JCheckBox(" Bru Green Label Filter Coffee");
		chckbxBruGreenLabel.setBackground(new Color(0, 255, 127));
		chckbxBruGreenLabel.setBounds(10, 357, 159, 23);
		contentPane.add(chckbxBruGreenLabel);
		
		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setColumns(10);
		textField_7.setBounds(173, 300, 86, 23);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setColumns(10);
		textField_8.setBounds(173, 330, 86, 23);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("0");
		textField_9.setColumns(10);
		textField_9.setBounds(173, 358, 86, 23);
		contentPane.add(textField_9);
		
		JLabel lblNewLabel_3 = new JLabel("Fruit juices and soft drinks");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 392, 279, 32);
		contentPane.add(lblNewLabel_3);
		
		JCheckBox chckbxBNaturalOrange = new JCheckBox("B Natural Orange juice 1L");
		chckbxBNaturalOrange.setBackground(new Color(0, 255, 127));
		chckbxBNaturalOrange.setBounds(10, 431, 159, 23);
		contentPane.add(chckbxBNaturalOrange);
		
		JCheckBox chckbxRealFruitPower = new JCheckBox("Real Fruit Power Pomegranate 1L");
		chckbxRealFruitPower.setBackground(new Color(0, 255, 127));
		chckbxRealFruitPower.setBounds(10, 457, 159, 23);
		contentPane.add(chckbxRealFruitPower);
		
		JCheckBox chckbxRealFruitPower_1 = new JCheckBox("Real Fruit Power Guava 1L");
		chckbxRealFruitPower_1.setBackground(new Color(0, 255, 127));
		chckbxRealFruitPower_1.setBounds(10, 483, 159, 23);
		contentPane.add(chckbxRealFruitPower_1);
		
		JCheckBox chckbxCocaColaSoft = new JCheckBox("Coca Cola Soft Drink 300ml");
		chckbxCocaColaSoft.setBackground(new Color(0, 255, 127));
		chckbxCocaColaSoft.setBounds(10, 509, 159, 23);
		contentPane.add(chckbxCocaColaSoft);
		
		JCheckBox chckbxThumsUpSoda = new JCheckBox("Thums Up Soda 1.25L ");
		chckbxThumsUpSoda.setBackground(new Color(0, 255, 127));
		chckbxThumsUpSoda.setBounds(10, 535, 159, 23);
		contentPane.add(chckbxThumsUpSoda);
		
		JCheckBox chckbxMonsterEnergy = new JCheckBox("Monster drink 350 ml ");
		chckbxMonsterEnergy.setBackground(new Color(0, 255, 127));
		chckbxMonsterEnergy.setBounds(10, 561, 159, 23);
		contentPane.add(chckbxMonsterEnergy);
		
		JCheckBox chckbxMaazaFlavouredSoft = new JCheckBox("Maaza 1.25 L");
		chckbxMaazaFlavouredSoft.setBackground(new Color(0, 255, 127));
		chckbxMaazaFlavouredSoft.setBounds(10, 585, 159, 23);
		contentPane.add(chckbxMaazaFlavouredSoft);
		
		JCheckBox chckbxGluconD = new JCheckBox(" Glucon D 450g");
		chckbxGluconD.setBackground(new Color(0, 255, 127));
		chckbxGluconD.setBounds(10, 612, 159, 23);
		contentPane.add(chckbxGluconD);
		
		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setColumns(10);
		textField_10.setBounds(173, 431, 86, 23);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("0");
		textField_11.setColumns(10);
		textField_11.setBounds(173, 458, 86, 23);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setText("0");
		textField_12.setColumns(10);
		textField_12.setBounds(173, 484, 86, 23);
		contentPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setColumns(10);
		textField_13.setBounds(173, 509, 86, 23);
		contentPane.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBounds(173, 536, 86, 23);
		contentPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBounds(173, 562, 86, 23);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("0");
		textField_16.setColumns(10);
		textField_16.setBounds(173, 586, 86, 23);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBounds(173, 613, 86, 23);
		contentPane.add(textField_17);
		
		JLabel lblNewLabel_2_1 = new JLabel("Health Drinks");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1.setBounds(390, 48, 148, 32);
		contentPane.add(lblNewLabel_2_1);
		
		JCheckBox chckbxEnsureBalancedAdult = new JCheckBox(" Ensure Balanced Adult 400g");
		chckbxEnsureBalancedAdult.setBackground(new Color(0, 255, 127));
		chckbxEnsureBalancedAdult.setBounds(321, 261, 189, 23);
		contentPane.add(chckbxEnsureBalancedAdult);
		
		JCheckBox chckbxCadburyBournivitaHealth = new JCheckBox("Cadbury Bournivita health Drink 500g");
		chckbxCadburyBournivitaHealth.setBackground(new Color(0, 255, 127));
		chckbxCadburyBournivitaHealth.setBounds(321, 123, 189, 23);
		contentPane.add(chckbxCadburyBournivitaHealth);
		
		JCheckBox chckbxComplanRoyaleChocolate = new JCheckBox("Complan Royale chocolate 500g");
		chckbxComplanRoyaleChocolate.setBackground(new Color(0, 255, 127));
		chckbxComplanRoyaleChocolate.setBounds(321, 149, 189, 23);
		contentPane.add(chckbxComplanRoyaleChocolate);
		
		JCheckBox chckbxHorlicksHealthDrink = new JCheckBox(" Horlicks Health drink 500g");
		chckbxHorlicksHealthDrink.setBackground(new Color(0, 255, 127));
		chckbxHorlicksHealthDrink.setBounds(321, 175, 189, 23);
		contentPane.add(chckbxHorlicksHealthDrink);
		
		JCheckBox chckbxPediasureNutritionDrink = new JCheckBox(" PediaSure nutrition drink 400g");
		chckbxPediasureNutritionDrink.setBackground(new Color(0, 255, 127));
		chckbxPediasureNutritionDrink.setBounds(321, 199, 189, 23);
		contentPane.add(chckbxPediasureNutritionDrink);
		
		JLabel lblKidsGrowth = new JLabel("Kids Growth");
		lblKidsGrowth.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblKidsGrowth.setBounds(321, 84, 121, 32);
		contentPane.add(lblKidsGrowth);
		
		textField_18 = new JTextField();
		textField_18.setText("0");
		textField_18.setColumns(10);
		textField_18.setBounds(516, 123, 86, 23);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("0");
		textField_19.setColumns(10);
		textField_19.setBounds(516, 149, 86, 23);
		contentPane.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("0");
		textField_20.setColumns(10);
		textField_20.setBounds(516, 175, 86, 23);
		contentPane.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("0");
		textField_21.setColumns(10);
		textField_21.setBounds(516, 199, 86, 23);
		contentPane.add(textField_21);
		
		JLabel lblAdult = new JLabel("Adult Nutrition");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAdult.setBounds(321, 229, 159, 32);
		contentPane.add(lblAdult);
		
		JCheckBox chckbxNewCheckBox_2_1 = new JCheckBox("Cadbury Bournvita For women");
		chckbxNewCheckBox_2_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_1.setBounds(321, 287, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_1);
		
		JCheckBox chckbxNewCheckBox_2_2 = new JCheckBox("Protinex 400g (Chocolate)");
		chckbxNewCheckBox_2_2.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_2.setBounds(321, 321, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_2);
		
		JCheckBox chckbxNewCheckBox_2_3 = new JCheckBox("Protinex Mama 400g  (Vanilla)");
		chckbxNewCheckBox_2_3.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3.setBounds(321, 349, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3);
		
		textField_22 = new JTextField();
		textField_22.setText("0");
		textField_22.setColumns(10);
		textField_22.setBounds(516, 261, 86, 23);
		contentPane.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("0");
		textField_23.setColumns(10);
		textField_23.setBounds(516, 287, 86, 23);
		contentPane.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("0");
		textField_24.setColumns(10);
		textField_24.setBounds(516, 321, 86, 23);
		contentPane.add(textField_24);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Cooking Essentials");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_2_1_1.setBounds(364, 378, 261, 32);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblAttaFlour = new JLabel("Atta & Flour");
		lblAttaFlour.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAttaFlour.setBounds(331, 404, 121, 32);
		contentPane.add(lblAttaFlour);
		
		JCheckBox chckbxNewCheckBox_2_3_1 = new JCheckBox("Fortune Chakki Fresh Atta 10kg");
		chckbxNewCheckBox_2_3_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1.setBounds(321, 443, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1);
		
		JCheckBox chckbxNewCheckBox_2_3_2 = new JCheckBox("PillsBury Multigrain Atta  5kg");
		chckbxNewCheckBox_2_3_2.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_2.setBounds(321, 469, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_2);
		
		JCheckBox chckbxNewCheckBox_2_3_3 = new JCheckBox("Aashirvaad Superior MP Atta  5kg");
		chckbxNewCheckBox_2_3_3.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_3.setBounds(321, 495, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_3);
		
		JCheckBox chckbxNewCheckBox_2_3_4 = new JCheckBox("Aashirvaad Sugarcontrolaata 5kg");
		chckbxNewCheckBox_2_3_4.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_4.setBounds(321, 517, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_4);
		
		JCheckBox chckbxNewCheckBox_2_3_5 = new JCheckBox("24 Mantra OrganicRagiFlour 500g");
		chckbxNewCheckBox_2_3_5.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_5.setBounds(321, 543, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_5);
		
		JCheckBox chckbxNewCheckBox_2_3_6 = new JCheckBox("Tata Sampann Besan  1Kg  ");
		chckbxNewCheckBox_2_3_6.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_6.setBounds(321, 569, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_6);
		
		JCheckBox chckbxNewCheckBox_2_3_7 = new JCheckBox("Vedaka Refined Maida1kg");
		chckbxNewCheckBox_2_3_7.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_7.setBounds(321, 595, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_7);
		
		JCheckBox chckbxNewCheckBox_2_3_8 = new JCheckBox("Vedaka  Sooji  500g");
		chckbxNewCheckBox_2_3_8.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_8.setBounds(321, 621, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_8);
		
		textField_25 = new JTextField();
		textField_25.setText("0");
		textField_25.setColumns(10);
		textField_25.setBounds(516, 349, 86, 23);
		contentPane.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setText("0");
		textField_26.setColumns(10);
		textField_26.setBounds(516, 443, 86, 23);
		contentPane.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setText("0");
		textField_27.setColumns(10);
		textField_27.setBounds(516, 469, 86, 23);
		contentPane.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setText("0");
		textField_28.setColumns(10);
		textField_28.setBounds(516, 495, 86, 23);
		contentPane.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setText("0");
		textField_29.setColumns(10);
		textField_29.setBounds(516, 517, 86, 23);
		contentPane.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setText("0");
		textField_30.setColumns(10);
		textField_30.setBounds(516, 543, 86, 23);
		contentPane.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setText("0");
		textField_31.setColumns(10);
		textField_31.setBounds(516, 569, 86, 23);
		contentPane.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setText("0");
		textField_32.setColumns(10);
		textField_32.setBounds(516, 596, 86, 23);
		contentPane.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setText("0");
		textField_33.setColumns(10);
		textField_33.setBounds(516, 621, 86, 23);
		contentPane.add(textField_33);
		
		JCheckBox chckbxNewCheckBox_2_3_8_1 = new JCheckBox("Vedaka Gram Flour  1kg ");
		chckbxNewCheckBox_2_3_8_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_8_1.setBounds(321, 653, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_8_1);
		
		textField_34 = new JTextField();
		textField_34.setText("0");
		textField_34.setColumns(10);
		textField_34.setBounds(516, 653, 86, 23);
		contentPane.add(textField_34);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1 = new JCheckBox("Vedaka Raw Peanuts 1kg");
		chckbxNewCheckBox_2_3_1_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1.setBounds(626, 48, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1);
		
		JLabel lblDalAndPulses = new JLabel("Dal and Pulses");
		lblDalAndPulses.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDalAndPulses.setBounds(705, 12, 159, 32);
		contentPane.add(lblDalAndPulses);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1 = new JCheckBox("Vedaka Popular Kabuli Chana 1kg");
		chckbxNewCheckBox_2_3_1_1_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1.setBounds(626, 74, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_1 = new JCheckBox("Tata SampannMoongDalSplit 1kg");
		chckbxNewCheckBox_2_3_1_1_1_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_1.setBounds(626, 103, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_1);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_2 = new JCheckBox("Vedaka Popular Black Chana 1kg");
		chckbxNewCheckBox_2_3_1_1_1_2.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_2.setBounds(626, 123, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_2);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_3 = new JCheckBox("Vedaka Soya Chunks 500g");
		chckbxNewCheckBox_2_3_1_1_1_3.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_3.setBounds(626, 149, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_3);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4 = new JCheckBox("Mother Dairy Cow Ghee, 1L");
		chckbxNewCheckBox_2_3_1_1_1_4.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4.setBounds(626, 220, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4);
		
		textField_35 = new JTextField();
		textField_35.setText("0");
		textField_35.setColumns(10);
		textField_35.setBounds(827, 48, 86, 23);
		contentPane.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText("0");
		textField_36.setColumns(10);
		textField_36.setBounds(827, 75, 86, 23);
		contentPane.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setText("0");
		textField_37.setColumns(10);
		textField_37.setBounds(827, 101, 86, 23);
		contentPane.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setText("0");
		textField_38.setColumns(10);
		textField_38.setBounds(827, 127, 86, 23);
		contentPane.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setText("0");
		textField_39.setColumns(10);
		textField_39.setBounds(827, 149, 86, 23);
		contentPane.add(textField_39);
		
		JLabel lblOilsAndGhee = new JLabel("Oils and Ghee");
		lblOilsAndGhee.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblOilsAndGhee.setBounds(705, 179, 159, 32);
		contentPane.add(lblOilsAndGhee);
		
		JLabel lblAttaFlour_1_2 = new JLabel("Final Bill");
		lblAttaFlour_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAttaFlour_1_2.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblAttaFlour_1_2.setBounds(640, 617, 135, 59);
		contentPane.add(lblAttaFlour_1_2);
		
		textField_42 = new JTextField();
		textField_42.setText("0");
		textField_42.setColumns(10);
		textField_42.setBounds(763, 621, 121, 43);
		contentPane.add(textField_42);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Customer billing",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
					
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(1171, 657, 136, 36);
		contentPane.add(btnExit);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_1 = new JCheckBox("Fortune Sunlite Sunflower Oil 1L");
		chckbxNewCheckBox_2_3_1_1_1_4_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_1.setBounds(626, 246, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_1);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_2 = new JCheckBox("Fortune Mustard Oil 1L");
		chckbxNewCheckBox_2_3_1_1_1_4_2.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_2.setBounds(626, 272, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_2);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_3 = new JCheckBox("Dhara Groundnut Oil , 1L");
		chckbxNewCheckBox_2_3_1_1_1_4_3.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_3.setBounds(626, 299, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_3);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_4 = new JCheckBox("Vedaka Black Peppercorn 100g");
		chckbxNewCheckBox_2_3_1_1_1_4_4.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_4.setBounds(626, 411, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_4);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_5 = new JCheckBox("Vedaka Cumin Seeds(Jeera) 200g");
		chckbxNewCheckBox_2_3_1_1_1_4_5.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_5.setBounds(626, 383, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_5);
		
		textField_43 = new JTextField();
		textField_43.setText("0");
		textField_43.setColumns(10);
		textField_43.setBounds(827, 220, 86, 23);
		contentPane.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setText("0");
		textField_44.setColumns(10);
		textField_44.setBounds(827, 247, 86, 23);
		contentPane.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setText("0");
		textField_45.setColumns(10);
		textField_45.setBounds(827, 273, 86, 23);
		contentPane.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setText("0");
		textField_46.setColumns(10);
		textField_46.setBounds(827, 300, 86, 23);
		contentPane.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setText("0");
		textField_47.setColumns(10);
		textField_47.setBounds(827, 406, 86, 23);
		contentPane.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setText("0");
		textField_48.setColumns(10);
		textField_48.setBounds(827, 378, 86, 23);
		contentPane.add(textField_48);
		
		JLabel lblSpicessaltAndSugar = new JLabel("Spices, Salt and Sugar");
		lblSpicessaltAndSugar.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblSpicessaltAndSugar.setBounds(680, 349, 255, 32);
		contentPane.add(lblSpicessaltAndSugar);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_4_1 = new JCheckBox("Tata SampannGaramMasala 100g");
		chckbxNewCheckBox_2_3_1_1_1_4_4_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_4_1.setBounds(626, 437, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_4_1);
		
		textField_49 = new JTextField();
		textField_49.setText("0");
		textField_49.setColumns(10);
		textField_49.setBounds(827, 433, 86, 23);
		contentPane.add(textField_49);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_5_1 = new JCheckBox("Vedaka Mustard seeds 200g");
		chckbxNewCheckBox_2_3_1_1_1_4_5_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_5_1.setBounds(626, 465, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_5_1);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_5_2 = new JCheckBox("Dabur Ginger Garlic paste 200g");
		chckbxNewCheckBox_2_3_1_1_1_4_5_2.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_5_2.setBounds(626, 491, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_5_2);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_5_3 = new JCheckBox("Aashirvaad Salt Iodised  1kg");
		chckbxNewCheckBox_2_3_1_1_1_4_5_3.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_5_3.setBounds(626, 517, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_5_3);
		
		textField_50 = new JTextField();
		textField_50.setText("0");
		textField_50.setColumns(10);
		textField_50.setBounds(827, 462, 86, 23);
		contentPane.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setText("0");
		textField_51.setColumns(10);
		textField_51.setBounds(827, 490, 86, 23);
		contentPane.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setText("0");
		textField_52.setColumns(10);
		textField_52.setBounds(827, 516, 86, 23);
		contentPane.add(textField_52);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_5_3_1 = new JCheckBox("Vedaka Popular sugar 1kg");
		chckbxNewCheckBox_2_3_1_1_1_4_5_3_1.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_5_3_1.setBounds(626, 543, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_5_3_1);
		
		JCheckBox chckbxNewCheckBox_2_3_1_1_1_4_5_3_2 = new JCheckBox("Trust Premium Brown Sugar 1kg ");
		chckbxNewCheckBox_2_3_1_1_1_4_5_3_2.setBackground(new Color(0, 255, 127));
		chckbxNewCheckBox_2_3_1_1_1_4_5_3_2.setBounds(626, 569, 189, 23);
		contentPane.add(chckbxNewCheckBox_2_3_1_1_1_4_5_3_2);
		
		textField_53 = new JTextField();
		textField_53.setText("0");
		textField_53.setColumns(10);
		textField_53.setBounds(827, 539, 86, 23);
		contentPane.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setText("0");
		textField_54.setColumns(10);
		textField_54.setBounds(827, 564, 86, 23);
		contentPane.add(textField_54);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("CUSTOMER PARADISE");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2_1_2.setBounds(244, 11, 381, 32);
		contentPane.add(lblNewLabel_2_1_2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtI_1.setText("0");
				txtI.setText("0");
				textField_2.setText("0");
				textField_3.setText("0");
				textField_4.setText("0");
				textField_5.setText("0");
				textField_6.setText("0");
				textField_7.setText("0");
				textField_8.setText("0");
				textField_9.setText("0");
				textField_10.setText("0");
				textField_11.setText("0");
				textField_12.setText("0");
				textField_13.setText("0");
				textField_14.setText("0");
				textField_15.setText("0");
				textField_16.setText("0");
				textField_17.setText("0");
				textField_18.setText("0");
				textField_19.setText("0");
				textField_20.setText("0");
				textField_21.setText("0");
				textField_22.setText("0");
				textField_23.setText("0");
				textField_24.setText("0");
				textField_25.setText("0");
				textField_26.setText("0");
				textField_27.setText("0");
				textField_28.setText("0");
				textField_29.setText("0");
				textField_30.setText("0");
				textField_31.setText("0");
				textField_32.setText("0");
				textField_33.setText("0");
				textField_34.setText("0");
				textField_35.setText("0");
				textField_36.setText("0");
				textField_37.setText("0");
				textField_38.setText("0");
				textField_39.setText("0");
				textField_43.setText("0");
				textField_44.setText("0");
				textField_45.setText("0");
				textField_46.setText("0");
				textField_47.setText("0");
				textField_48.setText("0");
				textField_49.setText("0");
				textField_50.setText("0");
				textField_51.setText("0");
				textField_52.setText("0");
				textField_53.setText("0");
				textField_54.setText("0");
				textField_42.setText("0");
				textArea.setText("0");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReset.setBounds(946, 657, 136, 36);
		contentPane.add(btnReset);
		
		
	}
}
