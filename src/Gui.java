

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jxl.write.WriteException;

import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Gui extends JFrame {

	private JPanel contentPane;
	public JFormattedTextField turn1_cash;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	public JTextField textField_4;
	public JTextField textField_5;
	public JTextField textField_6;
	public JTextField textField_7;
	public JTextField textField_8;
	public JTextField textField_9;
	public JTextField textField_10;
	public JTextField textField_11;
	public JTextField turn1_card;
	public JTextField textField_13;
	public JTextField textField_14;
	public JTextField textField_15;
	public JTextField textField_16;
	public JTextField textField_17;
	public JTextField textField_18;
	public JTextField textField_19;
	public JTextField textField_20;
	public JTextField textField_21;
	public JTextField textField_22;
	public JTextField textField_23;
	public JTextField turn1_tip;
	public JTextField textField_25;
	public JTextField textField_26;
	public JTextField textField_27;
	public JTextField textField_28;
	public JTextField textField_29;
	public JTextField textField_30;
	public JTextField textField_31;
	public JTextField textField_32;
	public JTextField textField_33;
	public JTextField textField_34;
	public JTextField textField_35;
	public JTextField ten;
	public JTextField turn;
	public JTextField show_employee_name;
	public JTextField nhanvien_name;
	public JTextField nhanvien_money_ratio;
	public JTextField nhanvien_ratio_cash;
	public JTextField txtNgy;
	public JTextField txtThng;
	public JTextField txtNm;
	public JTextField textField_39;
	public JTextField textField_40;
	public JTextField textField_41;
	public JTextField textField_42;
	public JTextField show_customer_name;
	public JTextField update_customer_name;
	public JTextField update_customer_service;
	public JTextField update_customer_date;
	public JTextField update_customer_payment;
	public JTextField add_customer_name;
	public JTextField add_customer_address;
	public JTextField add_customer_phoneNumber;
	public JTextField add_customer_note;
	public JTextField textField_54;
	public JTextField textField_55;
	public JTextField textField_56;
	public JTextField textField_57;
	public JTextField textField_58;
	public JTextField textField_59;
	public JTextField textField_60;
	
	public JTextField tinh_tien;
	private double result = 0;
	private String lastCommand ="=";
	private boolean start = true;
	private JButton display;

	/**
	 * Launch the application.
	 */
	public static void Gui() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 976, 769);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 27, 934, 682);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Qu\u1EA3n L\u00FD", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblDanhSchNhn = new JLabel("Danh s\u00E1ch nh\u00E2n vi\u00EAn");
		lblDanhSchNhn.setBounds(12, 13, 144, 28);
		panel.add(lblDanhSchNhn);
		
		JLabel lblThmNhnVin = new JLabel("th\u00EAm nh\u00E2n vi\u00EAn");
		lblThmNhnVin.setBounds(22, 490, 105, 16);
		panel.add(lblThmNhnVin);
		
		nhanvien_name = new JTextField();
		nhanvien_name.setBounds(134, 530, 220, 22);
		panel.add(nhanvien_name);
		nhanvien_name.setColumns(10);
		
		
		nhanvien_money_ratio = new JTextField();
		nhanvien_money_ratio.setBounds(134, 566, 220, 22);
		panel.add(nhanvien_money_ratio);
		nhanvien_money_ratio.setColumns(10);
		
		JLabel lblTn = new JLabel("T\u00EAn");
		lblTn.setBounds(28, 535, 56, 16);
		panel.add(lblTn);
		
		JLabel lblTLChia = new JLabel("t\u1EF7 l\u1EC7 chia ti\u1EC1n (%)");
		lblTLChia.setBounds(22, 569, 134, 16);
		panel.add(lblTLChia);
		
		JLabel lblNewLabel = new JLabel("T\u1EF7 l\u1EC7 cash");
		lblNewLabel.setBounds(28, 606, 66, 16);
		panel.add(lblNewLabel);
		
		nhanvien_ratio_cash = new JTextField();
		nhanvien_ratio_cash.setBounds(134, 603, 220, 22);
		panel.add(nhanvien_ratio_cash);
		nhanvien_ratio_cash.setColumns(10);
		
		JLabel lblHinThThu = new JLabel("Hi\u1EC3n th\u1ECB thu nh\u1EADp ti\u1EC7m");
		lblHinThThu.setBackground(Color.WHITE);
		lblHinThThu.setForeground(Color.BLACK);
		lblHinThThu.setBounds(527, 19, 144, 22);
		panel.add(lblHinThThu);
		
		JLabel lblTNgy = new JLabel("t\u1EEB ng\u00E0y");
		lblTNgy.setBounds(410, 70, 56, 16);
		panel.add(lblTNgy);
		
		JLabel lblnNgy = new JLabel("\u0111\u1EBFn ng\u00E0y");
		lblnNgy.setBounds(410, 99, 56, 16);
		panel.add(lblnNgy);
		
		txtNgy = new JTextField();
		txtNgy.setText("Ng\u00E0y(DD)");
		txtNgy.setBounds(523, 68, 66, 22);
		panel.add(txtNgy);
		txtNgy.setColumns(10);
		
		txtThng = new JTextField();
		txtThng.setText("th\u00E1ng(MM)");
		txtThng.setBounds(638, 67, 73, 22);
		panel.add(txtThng);
		txtThng.setColumns(10);
		
		JLabel lblNgy = new JLabel("ng\u00E0y :");
		lblNgy.setBounds(478, 70, 56, 16);
		panel.add(lblNgy);
		
		JLabel lblThng = new JLabel("th\u00E1ng:");
		lblThng.setBounds(591, 70, 56, 16);
		panel.add(lblThng);
		
		JLabel lblNm = new JLabel("n\u0103m:");
		lblNm.setBounds(715, 70, 56, 16);
		panel.add(lblNm);
		
		txtNm = new JTextField();
		txtNm.setText("n\u0103m(yyyy)");
		txtNm.setBounds(754, 67, 73, 22);
		panel.add(txtNm);
		txtNm.setColumns(10);
		
		JLabel label_23 = new JLabel("ng\u00E0y :");
		label_23.setBounds(478, 99, 56, 16);
		panel.add(label_23);
		
		textField_39 = new JTextField();
		textField_39.setText("Ng\u00E0y(DD)");
		textField_39.setColumns(10);
		textField_39.setBounds(523, 96, 66, 22);
		panel.add(textField_39);
		
		JLabel label_24 = new JLabel("th\u00E1ng:");
		label_24.setBounds(591, 99, 56, 16);
		panel.add(label_24);
		
		textField_40 = new JTextField();
		textField_40.setText("th\u00E1ng(MM)");
		textField_40.setColumns(10);
		textField_40.setBounds(638, 96, 73, 22);
		panel.add(textField_40);
		
		JLabel lblNm_1 = new JLabel("n\u0103m:");
		lblNm_1.setBounds(715, 99, 56, 16);
		panel.add(lblNm_1);
		
		textField_41 = new JTextField();
		textField_41.setText("n\u0103m(yyyy)");
		textField_41.setColumns(10);
		textField_41.setBounds(754, 96, 73, 22);
		panel.add(textField_41);
		
		JButton btnHinTh_1 = new JButton("hi\u1EC3n th\u1ECB");
		btnHinTh_1.setBounds(558, 154, 97, 25);
		panel.add(btnHinTh_1);
		
		textField_42 = new JTextField();
		textField_42.setBounds(410, 219, 435, 223);
		panel.add(textField_42);
		textField_42.setColumns(10);
		
		JLabel lblMtTurnL = new JLabel("M\u1ED9t Turn L\u00E0 : ");
		lblMtTurnL.setBounds(420, 514, 124, 16);
		panel.add(lblMtTurnL);
		
		JLabel lblThngTinTurn = new JLabel("Th\u00F4ng Tin Turn");
		lblThngTinTurn.setBounds(420, 466, 144, 35);
		panel.add(lblThngTinTurn);
		
		textField_60 = new JTextField();
		textField_60.setBounds(545, 511, 116, 22);
		panel.add(textField_60);
		textField_60.setColumns(10);
		
		JLabel label_30 = new JLabel("$");
		label_30.setBounds(684, 514, 14, 16);
		panel.add(label_30);
		
		JList<String> showlist_employee = new JList<>();
		
		hienthi_nhanvien hienthi_nhanvien = new hienthi_nhanvien();
				
		DefaultListModel<String> listModel;
		try {
			listModel = hienthi_nhanvien.main();
			showlist_employee.setModel(listModel);
			
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		showlist_employee.setBounds(40, 83, 314, 358);
		panel.add(showlist_employee);
		
		JButton btnThm = new JButton("Th\u00EAm");
		btnThm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					add_nhanvien them_nhanvien = new add_nhanvien();
					try {
						them_nhanvien.main(nhanvien_name,nhanvien_money_ratio,nhanvien_ratio_cash);
						DefaultListModel<String> listModel = hienthi_nhanvien.main();
						showlist_employee.setModel(listModel);
						nhanvien_name.setText("");
						nhanvien_money_ratio.setText("");
						nhanvien_ratio_cash.setText("");
					} catch (WriteException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
			}
		});
		btnThm.setBounds(144, 636, 97, 25);
		panel.add(btnThm);
		
		
		JButton btnXoa = new JButton("X\u00F3a");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					delete_nhanvien xoa_nhanvien = new delete_nhanvien();
					try {
						if(showlist_employee.isSelectionEmpty())
						{
							JOptionPane.showMessageDialog(null, 
									  "Cần chọn tên nhân viên trong mục",
		                              "ALERT MESSAGE", 
		                              JOptionPane.WARNING_MESSAGE);
					    }
						else
						{
							xoa_nhanvien.main(showlist_employee.getSelectedIndex());
							DefaultListModel<String> listModel = hienthi_nhanvien.main();
							showlist_employee.setModel(listModel);
						}
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (WriteException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
			}
		});
		btnXoa.setBounds(144, 452, 97, 25);
		panel.add(btnXoa);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Nh\u00E2n Vi\u00EAn", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblTnNhnVin = new JLabel("T\u00EAn Nh\u00E2n Vi\u00EAn");
		lblTnNhnVin.setBounds(12, 13, 102, 28);
		panel_1.add(lblTnNhnVin);
		
		JLabel lblTurn = new JLabel("Turn");
		lblTurn.setBounds(128, 19, 56, 16);
		panel_1.add(lblTurn);
		
		JLabel lblCast = new JLabel("Cash");
		lblCast.setBounds(196, 19, 56, 16);
		panel_1.add(lblCast);
		
		JLabel lblCredit = new JLabel("Th\u1EBB");
		lblCredit.setBounds(300, 19, 56, 16);
		panel_1.add(lblCredit);
		
		JLabel lblTip = new JLabel("Tip");
		lblTip.setBounds(400, 19, 56, 16);
		panel_1.add(lblTip);
		
		JLabel nhanvien_1 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_1.setBounds(12, 54, 84, 16);
		panel_1.add(nhanvien_1);
		
		JLabel nhanvien_2 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_2.setBounds(12, 94, 84, 16);
		panel_1.add(nhanvien_2);
		
		JLabel nhanvien_3 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_3.setBounds(12, 134, 84, 16);
		panel_1.add(nhanvien_3);
		
		JLabel nhanvien_4 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_4.setBounds(12, 174, 84, 16);
		panel_1.add(nhanvien_4);
		
		JLabel nhanvien_5 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_5.setBounds(12, 216, 84, 16);
		panel_1.add(nhanvien_5);
		
		JLabel nhanvien_6 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_6.setBounds(12, 261, 84, 16);
		panel_1.add(nhanvien_6);
		
		JLabel nhanvien_7 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_7.setBounds(12, 300, 84, 16);
		panel_1.add(nhanvien_7);
		
		JLabel nhanvien_8 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_8.setBounds(12, 337, 84, 16);
		panel_1.add(nhanvien_8);
		
		JLabel nhanvien_9 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_9.setBounds(12, 377, 84, 16);
		panel_1.add(nhanvien_9);
		
		JLabel nhanvien_10 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_10.setBounds(12, 419, 84, 16);
		panel_1.add(nhanvien_10);
		
		JLabel nhanvien_11 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_11.setBounds(12, 460, 84, 16);
		panel_1.add(nhanvien_11);
		
		JLabel nhanvien_12 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_12.setBounds(12, 503, 84, 16);
		panel_1.add(nhanvien_12);
		
		JLabel nhanvien_13 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_13.setBounds(12, 538, 84, 16);
		panel_1.add(nhanvien_13);
		
		JLabel nhanvien_14 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		nhanvien_14.setBounds(12, 579, 84, 16);
		panel_1.add(nhanvien_14);
		
		JLabel turn_13 = new JLabel("Turn");
		turn_13.setBounds(128, 538, 56, 16);
		panel_1.add(turn_13);
		
		JLabel turn_14 = new JLabel("Turn");
		turn_14.setBounds(128, 579, 56, 16);
		panel_1.add(turn_14);
		
		JLabel turn_1 = new JLabel("Turn");
		turn_1.setBounds(128, 54, 56, 16);
		panel_1.add(turn_1);
		
		JLabel turn_2 = new JLabel("Turn");
		turn_2.setBounds(128, 94, 56, 16);
		panel_1.add(turn_2);
		
		JLabel turn_3 = new JLabel("Turn");
		turn_3.setBounds(128, 134, 56, 16);
		panel_1.add(turn_3);
		
		JLabel turn_4 = new JLabel("Turn");
		turn_4.setBounds(128, 174, 56, 16);
		panel_1.add(turn_4);
		
		JLabel turn_5 = new JLabel("Turn");
		turn_5.setBounds(128, 216, 56, 16);
		panel_1.add(turn_5);
		
		JLabel turn_6 = new JLabel("Turn");
		turn_6.setBounds(128, 261, 56, 16);
		panel_1.add(turn_6);
		
		JLabel turn_7 = new JLabel("Turn");
		turn_7.setBounds(128, 300, 56, 16);
		panel_1.add(turn_7);
		
		JLabel turn_8 = new JLabel("Turn");
		turn_8.setBounds(128, 337, 56, 16);
		panel_1.add(turn_8);
		
		JLabel turn_9 = new JLabel("Turn");
		turn_9.setBounds(128, 377, 56, 16);
		panel_1.add(turn_9);
		
		JLabel turn_10 = new JLabel("Turn");
		turn_10.setBounds(128, 419, 56, 16);
		panel_1.add(turn_10);
		
		JLabel turn_11 = new JLabel("Turn");
		turn_11.setBounds(128, 460, 56, 16);
		panel_1.add(turn_11);
		
		JLabel turn_12 = new JLabel("Turn");
		turn_12.setBounds(128, 503, 56, 16);
		panel_1.add(turn_12);
		
		double a = 0;
		turn1_cash = new JFormattedTextField();
		turn1_cash.setValue(new Double(a));
		turn1_cash.setBounds(196, 51, 74, 22);
		panel_1.add(turn1_cash);
		turn1_cash.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(196, 91, 74, 22);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(196, 131, 74, 22);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(196, 168, 74, 22);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(196, 213, 74, 22);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(196, 258, 74, 22);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(196, 297, 74, 22);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(196, 334, 74, 22);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(196, 374, 74, 22);
		panel_1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(196, 416, 74, 22);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(196, 457, 74, 22);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(196, 500, 74, 22);
		panel_1.add(textField_11);
		
		turn1_card = new JTextField();
		turn1_card.setColumns(10);
		turn1_card.setBounds(300, 51, 74, 22);
		panel_1.add(turn1_card);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(300, 91, 74, 22);
		panel_1.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(300, 131, 74, 22);
		panel_1.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(300, 171, 74, 22);
		panel_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(300, 213, 74, 22);
		panel_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(300, 258, 74, 22);
		panel_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(300, 297, 74, 22);
		panel_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(300, 334, 74, 22);
		panel_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(300, 371, 74, 22);
		panel_1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(300, 416, 74, 22);
		panel_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(300, 457, 74, 22);
		panel_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(300, 500, 74, 22);
		panel_1.add(textField_23);
		
		turn1_tip = new JTextField();
		turn1_tip.setColumns(10);
		turn1_tip.setBounds(400, 51, 74, 22);
		panel_1.add(turn1_tip);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(400, 91, 74, 22);
		panel_1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(400, 131, 74, 22);
		panel_1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(400, 171, 74, 22);
		panel_1.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(400, 213, 74, 22);
		panel_1.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(400, 258, 74, 22);
		panel_1.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(400, 297, 74, 22);
		panel_1.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(400, 334, 74, 22);
		panel_1.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(400, 374, 74, 22);
		panel_1.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(400, 416, 74, 22);
		panel_1.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(400, 457, 74, 22);
		panel_1.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(400, 500, 74, 22);
		panel_1.add(textField_35);
		
		JButton btnAdd = new JButton("T\u00EDnh Ti\u1EC1n");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				save_load_tienbac thuNhap = new save_load_tienbac();
				try {
					thuNhap.main(nhanvien_1,turn1_cash, turn1_card, turn1_tip);
					//DefaultListModel<String> listModel = hienthi_nhanvien.main();
					//showlist_employee.setModel(listModel);
					//nhanvien_name.setText("");
					//nhanvien_money_ratio.setText("");
					//nhanvien_ratio_cash.setText("");
				} catch (WriteException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(227, 616, 97, 25);
		panel_1.add(btnAdd);
		
		JButton btnRandomTurn = new JButton("Random ");
		btnRandomTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ArrayList<Integer> numbers = new ArrayList<Integer>();   
				Random randomGenerator = new Random();
				
				ArrayList<String> names = new ArrayList<String>();
				try {
					hienthi_nhanvien.get_name(names);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				while (numbers.size() < names.size()) {

				    int random = randomGenerator .nextInt(names.size()) + 1;
				    if (!numbers.contains(random)) {
				        numbers.add(random);
				    }
				}
			for(int i = 0; i< names.size(); i++){
				switch(numbers.get(i)){
				case 1: 	nhanvien_1.setText(names.get(i));
							turn_1.setText("0");
							break;
							
				case 2:	nhanvien_2.setText(names.get(i));
							turn_2.setText("0");
							break;	
			
				case 3:	nhanvien_3.setText(names.get(i));
							turn_3.setText("0");
							break;
							
				case 4:	nhanvien_4.setText(names.get(i));
							turn_4.setText("0");
							break;	
							
				case 5:	nhanvien_5.setText(names.get(i));
							turn_5.setText("0");
							break;	
				
				case 6:	nhanvien_6.setText(names.get(i));
							turn_6.setText("0");
							break;
				
				case 7:	nhanvien_7.setText(names.get(i));
							turn_7.setText("0");
							break;	
				
				case 8:	nhanvien_8.setText(names.get(i));
							turn_8.setText("0");
							break;	
				
				case 9:	nhanvien_9.setText(names.get(i));
							turn_9.setText("0");
							break;	
				
				case 10:	nhanvien_10.setText(names.get(i));
							turn_10.setText("0");
							break;	
				
				case 11:	nhanvien_11.setText(names.get(i));
							turn_11.setText("0");
							break;	
				
				case 12:	nhanvien_12.setText(names.get(i));
							turn_12.setText("0");
							break;	
				
				case 13:	nhanvien_13.setText(names.get(i));
							turn_13.setText("0");
							break;	
				
				case 14:	nhanvien_14.setText(names.get(i));
							turn_14.setText("0");
							break;	
				
				default: JOptionPane.showMessageDialog(null, 
						  "nhập đúng turn từ 1-14",
                          "ALERT MESSAGE", 
                          JOptionPane.WARNING_MESSAGE);
							break;
				
			}
			}
			}
		});
		btnRandomTurn.setBounds(729, 50, 126, 25);
		panel_1.add(btnRandomTurn);
		
		JButton btnNewButton = new JButton("Chia turn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
				try {
					if(hienthi_nhanvien.check_name(ten.getText()) == true){
						switch(turn.getText()){
						case "1": 	nhanvien_1.setText(ten.getText());
									turn_1.setText("0");
									break;
									
						case "2":	nhanvien_2.setText(ten.getText());
									turn_2.setText("0");
									break;	
					
						case "3":	nhanvien_3.setText(ten.getText());
									turn_3.setText("0");
									break;
									
						case "4":	nhanvien_4.setText(ten.getText());
									turn_4.setText("0");
									break;	
									
						case "5":	nhanvien_5.setText(ten.getText());
									turn_5.setText("0");
									break;	
						
						case "6":	nhanvien_6.setText(ten.getText());
									turn_6.setText("0");
									break;
						
						case "7":	nhanvien_7.setText(ten.getText());
									turn_7.setText("0");
									break;	
						
						case "8":	nhanvien_8.setText(ten.getText());
									turn_8.setText("0");
									break;	
						
						case "9":	nhanvien_9.setText(ten.getText());
									turn_9.setText("0");
									break;	
						
						case "10":	nhanvien_10.setText(ten.getText());
									turn_10.setText("0");
									break;	
						
						case "11":	nhanvien_11.setText(ten.getText());
									turn_11.setText("0");
									break;	
						
						case "12":	nhanvien_12.setText(ten.getText());
									turn_12.setText("0");
									break;	
						
						case "13":	nhanvien_13.setText(ten.getText());
									turn_13.setText("0");
									break;	
						
						case "14":	nhanvien_14.setText(ten.getText());
									turn_14.setText("0");
									break;	
						
						default: JOptionPane.showMessageDialog(null, 
								  "nhập đúng turn từ 1-14",
		                          "ALERT MESSAGE", 
		                          JOptionPane.WARNING_MESSAGE);
									break;
						
						}
						}
					else
					{
						JOptionPane.showMessageDialog(null, 
								  "Tên không chính xac",
		                          "ALERT MESSAGE", 
		                          JOptionPane.WARNING_MESSAGE);
									
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnNewButton.setBounds(729, 152, 126, 25);
		panel_1.add(btnNewButton);
		
		JLabel lblRandomTurn = new JLabel("Random turn");
		lblRandomTurn.setBackground(Color.WHITE);
		lblRandomTurn.setBounds(548, 45, 102, 34);
		panel_1.add(lblRandomTurn);
		
		JLabel lblChiaTurnTay = new JLabel("Chia turn tay");
		lblChiaTurnTay.setBounds(548, 91, 84, 22);
		panel_1.add(lblChiaTurnTay);
		
		ten = new JTextField();
		ten.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ten.setText("");
			}
		});
		
		ten.setText("T\u00EAn nh\u00E2n vi\u00EAn");
		ten.setBounds(548, 131, 116, 22);
		panel_1.add(ten);
		ten.setColumns(10);
	
		turn = new JTextField();
		turn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				turn.setText("");
			}
		});
		turn.setText("Turn");
		turn.setBounds(548, 171, 116, 22);
		panel_1.add(turn);
		turn.setColumns(10);
		
		JLabel lblHinThThng = new JLabel("Hi\u1EC3n th\u1ECB th\u00F4ng tin nh\u00E2n vi\u00EAn");
		lblHinThThng.setBounds(548, 216, 170, 16);
		panel_1.add(lblHinThThng);
		
		show_employee_name = new JTextField();
		show_employee_name.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				show_employee_name.setText("");
			}
		});
		show_employee_name.setText("T\u00EAn nh\u00E2n vi\u00EAn");
		show_employee_name.setBounds(548, 258, 116, 22);
		panel_1.add(show_employee_name);
		show_employee_name.setColumns(10);
		
		JTextArea hienthi_thongtin_nhanvien = new JTextArea();
		hienthi_thongtin_nhanvien.setBounds(548, 297, 310, 344);
		panel_1.add(hienthi_thongtin_nhanvien);
		
		JButton btnHinTh = new JButton("Hi\u1EC3n th\u1ECB");
		btnHinTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					hienthi_thongtin_nhanvien.setText("");
					hienthi_nhanvien.read_all(show_employee_name.getText(),hienthi_thongtin_nhanvien);
					show_employee_name.setText("");
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			}
		});
		btnHinTh.setBounds(758, 257, 97, 25);
		panel_1.add(btnHinTh);
		
		
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(196, 535, 74, 22);
		panel_1.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(196, 576, 74, 22);
		panel_1.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(300, 535, 74, 22);
		panel_1.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(300, 576, 74, 22);
		panel_1.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(400, 535, 74, 22);
		panel_1.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(400, 576, 74, 22);
		panel_1.add(textField_59);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Kh\u00E1ch H\u00E0ng", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblHinThThng_1 = new JLabel("Hi\u1EC3n th\u1ECB th\u00F4ng tin kh\u00E1ch h\u00E0ng");
		lblHinThThng_1.setBounds(12, 13, 310, 16);
		panel_2.add(lblHinThThng_1);
		
		JLabel lblTn_1 = new JLabel("T\u00EAn :");
		lblTn_1.setBounds(12, 50, 56, 16);
		panel_2.add(lblTn_1);
		
		show_customer_name = new JTextField();
		show_customer_name.setBounds(57, 47, 204, 22);
		panel_2.add(show_customer_name);
		show_customer_name.setColumns(10);
		
		JTextArea Hienthi_thongtin_khachhang = new JTextArea();
		Hienthi_thongtin_khachhang.setBounds(23, 135, 377, 322);
		panel_2.add(Hienthi_thongtin_khachhang);
		
		JButton btnHinTh_2 = new JButton("Hi\u1EC3n th\u1ECB ");
		btnHinTh_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hienthi_thongtin_khachhang.setText("");
				hienthi_khachhang hienthi = new hienthi_khachhang();
				System.out.println("ten: -- " + show_customer_name.getText());
				String tmp = show_customer_name.getText();
				try {
					hienthi.main(tmp,Hienthi_thongtin_khachhang);
					show_customer_name.setText("");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnHinTh_2.setBounds(57, 79, 97, 25);
		panel_2.add(btnHinTh_2);
		
		JLabel lblChnhSaThng = new JLabel("Ch\u1EC9nh s\u1EEDa th\u00F4ng tin kh\u00E1ch h\u00E0ng");
		lblChnhSaThng.setBounds(12, 468, 204, 16);
		panel_2.add(lblChnhSaThng);
		
		JLabel label_25 = new JLabel("T\u00EAn :");
		label_25.setBounds(12, 500, 56, 16);
		panel_2.add(label_25);
		
		update_customer_name = new JTextField();
		update_customer_name.setColumns(10);
		update_customer_name.setBounds(72, 497, 204, 22);
		panel_2.add(update_customer_name);
		
		JLabel lblDchVS_1 = new JLabel("D\u1ECBch v\u1EE5 s\u1EED d\u1EE5ng");
		lblDchVS_1.setBounds(12, 529, 111, 16);
		panel_2.add(lblDchVS_1);
		
		update_customer_service = new JTextField();
		update_customer_service.setColumns(10);
		update_customer_service.setBounds(150, 526, 126, 22);
		panel_2.add(update_customer_service);
		
		JLabel lblNgyn_1 = new JLabel("Ng\u00E0y \u0111\u1EBFn ");
		lblNgyn_1.setBounds(12, 558, 111, 16);
		panel_2.add(lblNgyn_1);
		
		update_customer_date = new JTextField();
		update_customer_date.setColumns(10);
		update_customer_date.setBounds(150, 555, 126, 22);
		panel_2.add(update_customer_date);
		
		JLabel lblSTin = new JLabel("S\u1ED1 ti\u1EC1n :");
		lblSTin.setBounds(12, 587, 56, 16);
		panel_2.add(lblSTin);
		
		update_customer_payment = new JTextField();
		update_customer_payment.setColumns(10);
		update_customer_payment.setBounds(150, 584, 126, 22);
		panel_2.add(update_customer_payment);
		
		JButton btniuChnh = new JButton("\u0110i\u1EC1u ch\u1EC9nh");
		btniuChnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				update_khachhang capnhat = new update_khachhang();
				try {
					capnhat.main(update_customer_name,update_customer_service,update_customer_date,update_customer_payment);
					update_customer_name.setText("");
					update_customer_service.setText("");
					update_customer_date.setText("");
					update_customer_payment.setText("");
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btniuChnh.setBounds(57, 616, 97, 25);
		panel_2.add(btniuChnh);
		
		JLabel lblThmKhchHng = new JLabel("Th\u00EAm kh\u00E1ch h\u00E0ng");
		lblThmKhchHng.setBounds(582, 13, 153, 16);
		panel_2.add(lblThmKhchHng);
		
		JLabel lblHTh = new JLabel("H\u1ECD t\u00EAn :");
		lblHTh.setBounds(520, 50, 56, 16);
		panel_2.add(lblHTh);
		
		JLabel lblaCh = new JLabel("\u0110\u1ECBa ch\u1EC9 :");
		lblaCh.setBounds(520, 83, 56, 16);
		panel_2.add(lblaCh);
		
		JLabel lblSinThoi = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i :");
		lblSinThoi.setBounds(520, 112, 97, 16);
		panel_2.add(lblSinThoi);
		
		JLabel lblLu = new JLabel("l\u01B0u \u00FD :");
		lblLu.setBounds(520, 139, 56, 16);
		panel_2.add(lblLu);
		
		add_customer_name = new JTextField();
		add_customer_name.setBounds(632, 47, 285, 22);
		panel_2.add(add_customer_name);
		add_customer_name.setColumns(10);
		
		
		add_customer_address = new JTextField();
		add_customer_address.setColumns(10);
		add_customer_address.setBounds(632, 80, 285, 22);
		panel_2.add(add_customer_address);
		
		add_customer_phoneNumber = new JTextField();
		add_customer_phoneNumber.setColumns(10);
		add_customer_phoneNumber.setBounds(632, 109, 285, 22);
		panel_2.add(add_customer_phoneNumber);
		
		add_customer_note = new JTextField();
		add_customer_note.setColumns(10);
		add_customer_note.setBounds(632, 144, 285, 208);
		panel_2.add(add_customer_note);
		
		JButton btnThmVo = new JButton("Th\u00EAm v\u00E0o");
		btnThmVo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add_khachhang them = new add_khachhang();
				try {
					them.main(add_customer_name,add_customer_address,add_customer_phoneNumber,add_customer_note);
					add_customer_name.setText("");
					add_customer_address.setText("");
					add_customer_phoneNumber.setText("");
					add_customer_note.setText("");
				} catch (WriteException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}

			}
		});
		
		btnThmVo.setBounds(713, 378, 97, 25);
		panel_2.add(btnThmVo);
		
	
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Tinh tien", null, panel_3, null);
		//panel_3.setLayout(null);
		panel_3.setLayout(new GridLayout(5, 4));
	      // add the display
		
		tinh_tien = new JTextField();
		tinh_tien.setEditable(false);
		tinh_tien.setColumns(10);
		tinh_tien.setBounds(150, 584, 126, 22);
		panel_3.add(tinh_tien);

		 display = new JButton("0");
	     display.setEnabled(true);
	     //getContentPane().add(display, BorderLayout.NORTH);
         ActionListener insert = new InsertAction();
	     ActionListener command = new CommandAction();

	     // add the buttons in a 4 x 4 grid
	     addButton("7", insert, panel_3);
	     addButton("8", insert, panel_3);
	     addButton("9", insert, panel_3);
	     addButton("/", command, panel_3);
    
	     addButton("4", insert, panel_3);
	     addButton("5", insert, panel_3);
	     addButton("6", insert, panel_3);
	     addButton("*", command, panel_3);

	     addButton("1", insert, panel_3);
	     addButton("2", insert, panel_3);
	     addButton("3", insert, panel_3);
	     addButton("-", command, panel_3);

	     addButton("0", insert, panel_3);
	     addButton(".", insert, panel_3);
	     addButton("=", command, panel_3);
	     addButton("+", command, panel_3);
	     
	     JMenuBar menuBar = new JMenuBar();
	     menuBar.setBounds(12, 0, 70, 26);
	     contentPane.add(menuBar);
	     
	     JMenu mnFile = new JMenu("File");
	     menuBar.add(mnFile);
	     
	     JMenuItem mntmngXut = new JMenuItem("Đăng xuất");
	     mntmngXut.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     		dangnhap login = new dangnhap();
	     		login.main(null);
	     		dispose();
	     		
	     	}
	     });
	     mnFile.add(mntmngXut);
	     
	     JMenuItem mntmThot = new JMenuItem("Thoát");
	     mntmThot.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent arg0) {
	     		System.exit(0);
	     	}
	     });
	     mnFile.add(mntmThot);
	     
	     JMenu mnHelp = new JMenu("Help");
	     menuBar.add(mnHelp);
	     
	     JMenuItem mntmngKSoftware = new JMenuItem("Đăng ký software mới");
	     mnHelp.add(mntmngKSoftware);
	     
	     JMenuItem mntmCpNht = new JMenuItem("Cập nhật");
	     mnHelp.add(mntmCpNht);
	     
	     JSeparator separator = new JSeparator();
	     mnHelp.add(separator);
	     
	     JMenuItem mntmGiiThiu = new JMenuItem("Giới thiệu");
	     mntmGiiThiu.addActionListener(new ActionListener() {
	     	public void actionPerformed(ActionEvent e) {
	     		final JPanel panel = new JPanel();

	     	    JOptionPane.showMessageDialog(panel, 
	     	    		"Phiên bản: 0.0.1 "
	     	    		+ "\n CopyRight © 2017"
	     	    		+ "\n Developer: Hoàng Péo, Huy Trịnh."
	     	    		+ "\n Sản phẩm này chưa được đăng ký",
	     	    		"CopyRight",
	     	        JOptionPane.INFORMATION_MESSAGE);
	     	}
	     });
	     mnHelp.add(mntmGiiThiu);

	}
	   

	   /**
	    * Adds a button to the center panel.
	    * @param label the button label
	    * @param listener the button listener
	    */
	   private void addButton(String label, ActionListener listener,JPanel panel)
	   {
	      JButton button = new JButton(label);
	      button.addActionListener(listener);
	      panel.add(button);
	   }

	   /**
	    * This action inserts the button action string to the end of the display text.
	    */
	   private class InsertAction implements ActionListener
	   {
	      public void actionPerformed(ActionEvent event)
	      {
	         String input = event.getActionCommand();
	         if (start)
	         {
	        	tinh_tien.setText("");
	            start = false;
	         }
	         tinh_tien.setText(tinh_tien.getText() + input);
	      }
	   }

	   /**
	    * This action executes the command that the button action string denotes.
	    */
	   private class CommandAction implements ActionListener
	   {
	      public void actionPerformed(ActionEvent event)
	      {
	         String command = event.getActionCommand();

	         if (start)
	         {
	            if (command.equals("-"))
	            {
	               tinh_tien.setText(command);
	               start = false;
	            }
	            else lastCommand = command;
	         }
	         else
	         {
	            calculate(Double.parseDouble(tinh_tien.getText()));
	            lastCommand = command;
	            start = true;
	         }
	      }
	   }
	   
	   public void calculate(double x)
	   {
	      if (lastCommand.equals("+")) result += x;
	      else if (lastCommand.equals("-")) result -= x;
	      else if (lastCommand.equals("*")) result *= x;
	      else if (lastCommand.equals("/")) result /= x;
	      else if (lastCommand.equals("=")) result = x;
	      tinh_tien.setText("" + result);
	   }
}
