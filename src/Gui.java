

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
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
	private JTextField txtTnNhnVin;
	private JTextField txtTurn;
	private JTextField txtTnNhnVin_1;
	private JTextField txtTn;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField txtNgy;
	private JTextField txtThng;
	private JTextField txtNm;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;

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
		tabbedPane.setBounds(12, 13, 934, 696);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Qu\u1EA3n L\u00FD", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblDanhSchNhn = new JLabel("Danh s\u00E1ch nh\u00E2n vi\u00EAn");
		lblDanhSchNhn.setBounds(12, 13, 144, 28);
		panel.add(lblDanhSchNhn);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBounds(12, 68, 304, 397);
		panel.add(textPane);
		
		JLabel lblThmNhnVin = new JLabel("th\u00EAm nh\u00E2n vi\u00EAn");
		lblThmNhnVin.setBounds(22, 490, 105, 16);
		panel.add(lblThmNhnVin);
		
		txtTn = new JTextField();
		txtTn.setBounds(134, 530, 220, 22);
		panel.add(txtTn);
		txtTn.setColumns(10);
		
		JButton btnThm = new JButton("Th\u00EAm");
		btnThm.setBounds(134, 638, 97, 25);
		panel.add(btnThm);
		
		textField_36 = new JTextField();
		textField_36.setBounds(134, 566, 220, 22);
		panel.add(textField_36);
		textField_36.setColumns(10);
		
		JLabel lblTn = new JLabel("T\u00EAn");
		lblTn.setBounds(28, 535, 56, 16);
		panel.add(lblTn);
		
		JLabel lblTLChia = new JLabel("t\u1EF7 l\u1EC7 chia ti\u1EC1n (%)");
		lblTLChia.setBounds(22, 569, 134, 16);
		panel.add(lblTLChia);
		
		JLabel lblNewLabel = new JLabel("T\u1EF7 l\u1EC7 cast");
		lblNewLabel.setBounds(28, 606, 66, 16);
		panel.add(lblNewLabel);
		
		textField_37 = new JTextField();
		textField_37.setBounds(134, 603, 220, 22);
		panel.add(textField_37);
		textField_37.setColumns(10);
		
		JLabel lblHinThThu = new JLabel("Hi\u1EC3n th\u1ECB thu nh\u1EADp ti\u1EC7m");
		lblHinThThu.setBackground(Color.WHITE);
		lblHinThThu.setForeground(Color.BLACK);
		lblHinThThu.setBounds(527, 19, 144, 22);
		panel.add(lblHinThThu);
		
		textField_38 = new JTextField();
		textField_38.setBounds(12, 68, 304, 397);
		panel.add(textField_38);
		textField_38.setColumns(10);
		
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
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Nh\u00E2n Vi\u00EAn", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblTnNhnVin = new JLabel("T\u00EAn Nh\u00E2n Vi\u00EAn");
		lblTnNhnVin.setBounds(12, 13, 102, 28);
		panel_1.add(lblTnNhnVin);
		
		JLabel lblTurn = new JLabel("Turn");
		lblTurn.setBounds(128, 19, 56, 16);
		panel_1.add(lblTurn);
		
		JLabel lblCast = new JLabel("Cast");
		lblCast.setBounds(196, 19, 56, 16);
		panel_1.add(lblCast);
		
		JLabel lblCredit = new JLabel("Th\u1EBB");
		lblCredit.setBounds(300, 19, 56, 16);
		panel_1.add(lblCredit);
		
		JLabel lblTip = new JLabel("Tip");
		lblTip.setBounds(400, 19, 56, 16);
		panel_1.add(lblTip);
		
		JLabel lblNhnVinXyz = new JLabel("nh\u00E2n vi\u00EAn xyz");
		lblNhnVinXyz.setBounds(12, 54, 84, 16);
		panel_1.add(lblNhnVinXyz);
		
		JLabel label = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label.setBounds(12, 94, 84, 16);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_1.setBounds(12, 134, 84, 16);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_2.setBounds(12, 174, 84, 16);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_3.setBounds(12, 216, 84, 16);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_4.setBounds(12, 261, 84, 16);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_5.setBounds(12, 300, 84, 16);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_6.setBounds(12, 337, 84, 16);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_7.setBounds(12, 377, 84, 16);
		panel_1.add(label_7);
		
		JLabel label_8 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_8.setBounds(12, 419, 84, 16);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_9.setBounds(12, 460, 84, 16);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_10.setBounds(12, 503, 84, 16);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel("Turn");
		label_11.setBounds(128, 54, 56, 16);
		panel_1.add(label_11);
		
		JLabel label_12 = new JLabel("Turn");
		label_12.setBounds(128, 94, 56, 16);
		panel_1.add(label_12);
		
		JLabel label_13 = new JLabel("Turn");
		label_13.setBounds(128, 134, 56, 16);
		panel_1.add(label_13);
		
		JLabel label_14 = new JLabel("Turn");
		label_14.setBounds(128, 174, 56, 16);
		panel_1.add(label_14);
		
		JLabel label_15 = new JLabel("Turn");
		label_15.setBounds(128, 216, 56, 16);
		panel_1.add(label_15);
		
		JLabel label_16 = new JLabel("Turn");
		label_16.setBounds(128, 261, 56, 16);
		panel_1.add(label_16);
		
		JLabel label_17 = new JLabel("Turn");
		label_17.setBounds(128, 300, 56, 16);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Turn");
		label_18.setBounds(128, 337, 56, 16);
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("Turn");
		label_19.setBounds(128, 377, 56, 16);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("Turn");
		label_20.setBounds(128, 419, 56, 16);
		panel_1.add(label_20);
		
		JLabel label_21 = new JLabel("Turn");
		label_21.setBounds(128, 460, 56, 16);
		panel_1.add(label_21);
		
		JLabel label_22 = new JLabel("Turn");
		label_22.setBounds(128, 503, 56, 16);
		panel_1.add(label_22);
		
		textField = new JTextField();
		textField.setBounds(196, 51, 74, 22);
		panel_1.add(textField);
		textField.setColumns(10);
		
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
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(300, 51, 74, 22);
		panel_1.add(textField_12);
		
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
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(400, 51, 74, 22);
		panel_1.add(textField_24);
		
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
		btnAdd.setBounds(227, 616, 97, 25);
		panel_1.add(btnAdd);
		
		JButton btnRandomTurn = new JButton("Random ");
		btnRandomTurn.setBounds(729, 50, 126, 25);
		panel_1.add(btnRandomTurn);
		
		JButton btnNewButton = new JButton("Chia turn");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		
		txtTnNhnVin = new JTextField();
		txtTnNhnVin.setText("T\u00EAn nh\u00E2n vi\u00EAn");
		txtTnNhnVin.setBounds(548, 131, 116, 22);
		panel_1.add(txtTnNhnVin);
		txtTnNhnVin.setColumns(10);
		
		txtTurn = new JTextField();
		txtTurn.setText("Turn");
		txtTurn.setBounds(548, 171, 116, 22);
		panel_1.add(txtTurn);
		txtTurn.setColumns(10);
		
		JLabel lblHinThThng = new JLabel("Hi\u1EC3n th\u1ECB th\u00F4ng tin nh\u00E2n vi\u00EAn");
		lblHinThThng.setBounds(548, 216, 170, 16);
		panel_1.add(lblHinThThng);
		
		txtTnNhnVin_1 = new JTextField();
		txtTnNhnVin_1.setText("T\u00EAn nh\u00E2n vi\u00EAn");
		txtTnNhnVin_1.setBounds(548, 258, 116, 22);
		panel_1.add(txtTnNhnVin_1);
		txtTnNhnVin_1.setColumns(10);
		
		JButton btnHinTh = new JButton("Hi\u1EC3n th\u1ECB");
		btnHinTh.setBounds(758, 257, 97, 25);
		panel_1.add(btnHinTh);
		
		textField_53 = new JTextField();
		textField_53.setBounds(548, 312, 324, 329);
		panel_1.add(textField_53);
		textField_53.setColumns(10);
		
		JLabel label_26 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_26.setBounds(12, 538, 84, 16);
		panel_1.add(label_26);
		
		JLabel label_27 = new JLabel("nh\u00E2n vi\u00EAn xyz");
		label_27.setBounds(12, 579, 84, 16);
		panel_1.add(label_27);
		
		JLabel label_28 = new JLabel("Turn");
		label_28.setBounds(128, 538, 56, 16);
		panel_1.add(label_28);
		
		JLabel label_29 = new JLabel("Turn");
		label_29.setBounds(128, 579, 56, 16);
		panel_1.add(label_29);
		
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
		
		textField_43 = new JTextField();
		textField_43.setBounds(57, 47, 204, 22);
		panel_2.add(textField_43);
		textField_43.setColumns(10);
		
		JButton btnHinTh_2 = new JButton("Hi\u1EC3n th\u1ECB ");
		btnHinTh_2.setBounds(57, 79, 97, 25);
		panel_2.add(btnHinTh_2);
		
		textField_44 = new JTextField();
		textField_44.setBounds(12, 136, 281, 274);
		panel_2.add(textField_44);
		textField_44.setColumns(10);
		
		JLabel lblChnhSaThng = new JLabel("Ch\u1EC9nh s\u1EEDa th\u00F4ng tin kh\u00E1ch h\u00E0ng");
		lblChnhSaThng.setBounds(12, 468, 204, 16);
		panel_2.add(lblChnhSaThng);
		
		JLabel label_25 = new JLabel("T\u00EAn :");
		label_25.setBounds(12, 500, 56, 16);
		panel_2.add(label_25);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(72, 497, 204, 22);
		panel_2.add(textField_47);
		
		JLabel lblDchVS_1 = new JLabel("D\u1ECBch v\u1EE5 s\u1EED d\u1EE5ng");
		lblDchVS_1.setBounds(12, 529, 111, 16);
		panel_2.add(lblDchVS_1);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(150, 526, 126, 22);
		panel_2.add(textField_48);
		
		JLabel lblNgyn_1 = new JLabel("Ng\u00E0y \u0111\u1EBFn ");
		lblNgyn_1.setBounds(12, 558, 111, 16);
		panel_2.add(lblNgyn_1);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(150, 555, 126, 22);
		panel_2.add(textField_49);
		
		JLabel lblSTin = new JLabel("S\u1ED1 ti\u1EC1n :");
		lblSTin.setBounds(12, 587, 56, 16);
		panel_2.add(lblSTin);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(150, 584, 126, 22);
		panel_2.add(textField_50);
		
		JButton btniuChnh = new JButton("\u0110i\u1EC1u ch\u1EC9nh");
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
		
		textField_45 = new JTextField();
		textField_45.setBounds(632, 47, 285, 22);
		panel_2.add(textField_45);
		textField_45.setColumns(10);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(632, 80, 285, 22);
		panel_2.add(textField_46);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(632, 109, 285, 22);
		panel_2.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(632, 144, 285, 208);
		panel_2.add(textField_52);
	}
}