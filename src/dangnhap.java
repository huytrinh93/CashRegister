import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dangnhap extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dangnhap frame = new dangnhap();
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
	public dangnhap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNgy = new JLabel("Ng\u00E0y");
		lblNgy.setBounds(12, 13, 56, 16);
		contentPane.add(lblNgy);
		
		JLabel lblThng = new JLabel("Th\u00E1ng");
		lblThng.setBounds(12, 42, 56, 16);
		contentPane.add(lblThng);
		
		JLabel lblNm = new JLabel("N\u0103m");
		lblNm.setBounds(12, 71, 56, 16);
		contentPane.add(lblNm);
		
		textField = new JTextField();
		textField.setBounds(80, 10, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(80, 39, 116, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(80, 68, 116, 22);
		contentPane.add(textField_2);
		
		JLabel lblVuiLngNhp = new JLabel("Vui l\u00F2ng nh\u1EADp Password");
		lblVuiLngNhp.setBounds(121, 120, 142, 16);
		contentPane.add(lblVuiLngNhp);
		
		JLabel lblPasswork = new JLabel("Passwork");
		lblPasswork.setBounds(12, 170, 56, 16);
		contentPane.add(lblPasswork);
		
		textField_3 = new JTextField();
		textField_3.setBounds(80, 167, 116, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnngNhp = new JButton("\u0110\u0103ng Nh\u1EADp");
		btnngNhp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Gui gui = new Gui();
				gui.Gui();
			}
		});
		btnngNhp.setBounds(162, 202, 97, 25);
		contentPane.add(btnngNhp);
	}

}
