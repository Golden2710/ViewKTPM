package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JRadioButton;
import javax.swing.border.MatteBorder;
import javax.swing.JCheckBox;

public class VacxinView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VacxinView frame = new VacxinView();
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
	public VacxinView() {
		setBackground(Color.WHITE);
	    //setExtendedState(Frame.MAXIMIZED_BOTH);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1920, 3000);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(Color.GRAY));
		contentPane.setBackground(Color.WHITE);
		contentPane.setPreferredSize(new Dimension(1520, 3000));
		
		JScrollPane scrollPane = new JScrollPane(contentPane);
		
		getContentPane().add(scrollPane);
	
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Liên hệ & Góp ý",SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel.setBackground(new Color(9, 87, 222));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(254, 255, 255));
		lblNewLabel.setBounds(0, 0, 1520, 50);
		
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("    THÔNG TIN KHÁCH HÀNG\n");
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel_2.setBackground(new Color(247, 248, 255));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBounds(0, 140, 1520, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("     Phiếu Góp Ý");
		lblNewLabel_3.setBackground(new Color(247, 248, 255));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		lblNewLabel_3.setBounds(0, 70, 1520, 50);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Họ và tên \n\n");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(18, 210, 72, 20);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("*");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(82, 210, 19, 16);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(18, 240, 1520, 40);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(18, 193, 61, 16);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Số điện thoại");
		lblNewLabel_7.setBounds(19, 290, 100, 20);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(18, 320, 1520, 40);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Email");
		lblNewLabel_9.setBounds(18, 370, 61, 20);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("*");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(47, 370, 21, 16);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_8 = new JLabel("*");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBounds(101, 290, 19, 16);
		contentPane.add(lblNewLabel_8);
		
		textField_2 = new JTextField();
		textField_2.setBounds(17, 400, 1520, 40);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("    1.Mức độ hài lòng của Quý khách với Trung tâm tiêm chủng? ");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_11.setBounds(0, 460, 1520, 50);
		lblNewLabel_11.setBackground(new Color(247, 248, 255));
	    lblNewLabel_11.setOpaque(true);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBorderPainted(false);
	    ImageIcon icon = new ImageIcon("/Users/nguyenminh/Downloads/Pictogrammers-Material-Light-Star.512.png");
	    Image image = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	    btnNewButton.setIcon(new ImageIcon(image));
		btnNewButton.setBounds(60, 530, 60, 60);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setIcon(new ImageIcon(image));
		btnNewButton_1.setBounds(340, 530, 60, 60);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon(image));
		btnNewButton_2.setBounds(200, 530, 60, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setBounds(480, 530, 60, 60);
		btnNewButton_3.setIcon(new ImageIcon(image));
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.setIcon(new ImageIcon(image));
		btnNewButton_4.setBounds(620, 530, 60, 60);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_11_1 = new JLabel("    2. Quý khách vui lòng đánh giá mức độ hài lòng về dịch vụ của Trung tâm tiêm chủng VNVC ");
		lblNewLabel_11_1.setOpaque(true);
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_11_1.setBackground(new Color(247, 248, 255));
		lblNewLabel_11_1.setBounds(0, 610, 1520, 50);
		contentPane.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_1 = new JLabel("Dịch vụ chăm sóc khách hàng");
		lblNewLabel_1.setBounds(18, 680, 220, 20);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_5 = new JButton("1");
		btnNewButton_5.setBackground(new Color(247, 255, 238));
		btnNewButton_5.setBounds(60, 720, 50, 50);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("2");
		btnNewButton_5_1.setBackground(new Color(247, 255, 238));
		btnNewButton_5_1.setBounds(200, 720, 50, 50);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("3");
		btnNewButton_5_2.setBackground(new Color(247, 255, 238));
		btnNewButton_5_2.setBounds(350, 720, 50, 50);
		contentPane.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_2_1 = new JButton("4");
		btnNewButton_5_2_1.setBackground(new Color(247, 255, 238));
		btnNewButton_5_2_1.setBounds(480, 720, 50, 50);
		contentPane.add(btnNewButton_5_2_1);
		
		JButton btnNewButton_5_2_2 = new JButton("5");
		btnNewButton_5_2_2.setBackground(new Color(247, 255, 238));
		btnNewButton_5_2_2.setBounds(630, 720, 50, 50);
		contentPane.add(btnNewButton_5_2_2);
		
		JTextArea textAreaed = new JTextArea();
		textAreaed.setBorder(new LineBorder(Color.DARK_GRAY));
		textAreaed.setBackground(Color.WHITE);
		textAreaed.setRows(5);
		textAreaed.setColumns(5);
		textAreaed.setBounds(84, 800, 649, 40);
		contentPane.add(textAreaed);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dịch vụ Tư vấn vắc xin");
		lblNewLabel_1_1.setBounds(18, 860, 220, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setBackground(new Color(247, 255, 238));
		btnNewButton_6.setBounds(60, 900, 50, 50);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_6_1 = new JButton("2");
		btnNewButton_6_1.setBackground(new Color(247, 255, 238));
		btnNewButton_6_1.setBounds(200, 900, 50, 50);
		contentPane.add(btnNewButton_6_1);
		
		JButton btnNewButton_6_2 = new JButton("3");
		btnNewButton_6_2.setBackground(new Color(247, 255, 238));
		btnNewButton_6_2.setBounds(350, 900, 50, 50);
		contentPane.add(btnNewButton_6_2);
		
		JButton btnNewButton_6_2_1 = new JButton("4");
		btnNewButton_6_2_1.setBackground(new Color(247, 255, 238));
		btnNewButton_6_2_1.setBounds(480, 900, 50, 50);
		contentPane.add(btnNewButton_6_2_1);
		
		JButton btnNewButton_6_2_2 = new JButton("5");
		btnNewButton_6_2_2.setBackground(new Color(247, 255, 238));
		btnNewButton_6_2_2.setBounds(630, 900, 50, 50);
		contentPane.add(btnNewButton_6_2_2);
		
		JTextArea textAreaed2 = new JTextArea();
		textAreaed2.setBorder(new LineBorder(Color.DARK_GRAY));
		textAreaed2.setBackground(Color.WHITE);
		textAreaed2.setRows(5);
		textAreaed2.setColumns(5);
		textAreaed2.setBounds(84, 970, 649, 40);
		contentPane.add(textAreaed2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Dịch vụ Tư vấn gói vắc xin");
		lblNewLabel_1_2.setBounds(18, 1030, 220, 20);
		contentPane.add(lblNewLabel_1_2);
		
		JButton btnNewButton_7 = new JButton("1");
		btnNewButton_7.setBackground(new Color(247, 255, 238));
		btnNewButton_7.setBounds(60, 1070, 50, 50);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_7_1 = new JButton("2");
		btnNewButton_7_1.setBackground(new Color(247, 255, 238));
		btnNewButton_7_1.setBounds(200, 1070, 50, 50);
		contentPane.add(btnNewButton_7_1);
		
		JButton btnNewButton_7_2 = new JButton("3");
		btnNewButton_7_2.setBackground(new Color(247, 255, 238));
		btnNewButton_7_2.setBounds(350, 1070, 50, 50);
		contentPane.add(btnNewButton_7_2);
		
		JButton btnNewButton_7_2_1 = new JButton("4");
		btnNewButton_7_2_1.setBackground(new Color(247, 255, 238));
		btnNewButton_7_2_1.setBounds(480, 1070, 50, 50);
		contentPane.add(btnNewButton_7_2_1);
		
		JButton btnNewButton_7_2_2 = new JButton("5");
		btnNewButton_7_2_2.setBackground(new Color(247, 255, 238));
		btnNewButton_7_2_2.setBounds(630, 1070, 50, 50);
		contentPane.add(btnNewButton_7_2_2);
		
		JTextArea textAreaed3 = new JTextArea();
		textAreaed3.setBorder(new LineBorder(Color.DARK_GRAY));
		textAreaed3.setBackground(Color.WHITE);
		textAreaed3.setRows(5);
		textAreaed3.setColumns(5);
		textAreaed3.setBounds(84, 1140, 649, 40);
		contentPane.add(textAreaed3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Dịch vụ Khám sàng lọc");
		lblNewLabel_1_3.setBounds(18, 1200, 220, 20);
		contentPane.add(lblNewLabel_1_3);
		
		JButton btnNewButton_8 = new JButton("1");
		btnNewButton_8.setBackground(new Color(247, 255, 238));
		btnNewButton_8.setBounds(60, 1240, 50, 50);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("2");
		btnNewButton_8_1.setBackground(new Color(247, 255, 238));
		btnNewButton_8_1.setBounds(200, 1240, 50, 50);
		contentPane.add(btnNewButton_8_1);
		
		JButton btnNewButton_8_2 = new JButton("3");
		btnNewButton_8_2.setBackground(new Color(247, 255, 238));
		btnNewButton_8_2.setBounds(350, 1240, 50, 50);
		contentPane.add(btnNewButton_8_2);
		
		JButton btnNewButton_8_2_1 = new JButton("4");
		btnNewButton_8_2_1.setBackground(new Color(247, 255, 238));
		btnNewButton_8_2_1.setBounds(480, 1240, 50, 50);
		contentPane.add(btnNewButton_8_2_1);
		
		JButton btnNewButton_8_2_2 = new JButton("5");
		btnNewButton_8_2_2.setBackground(new Color(247, 255, 238));
		btnNewButton_8_2_2.setBounds(630, 1240, 50, 50);
		contentPane.add(btnNewButton_8_2_2);
		
		JTextArea textAreaed4 = new JTextArea();
		textAreaed4.setBorder(new LineBorder(Color.DARK_GRAY));
		textAreaed4.setBackground(Color.WHITE);
		textAreaed4.setRows(5);
		textAreaed4.setColumns(5);
		textAreaed4.setBounds(84, 1310, 649, 40);
		contentPane.add(textAreaed4);
		
		JLabel lblNewLabel_1_4 = new JLabel("Dịch vụ Tiêm/ Uống vắc xin");
		lblNewLabel_1_4.setBounds(18, 1370, 220, 20);
		contentPane.add(lblNewLabel_1_4);
		
		JButton btnNewButton_9 = new JButton("1");
		btnNewButton_9.setBackground(new Color(247, 255, 238));
		btnNewButton_9.setBounds(60, 1410, 50, 50);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("2");
		btnNewButton_9_1.setBackground(new Color(247, 255, 238));
		btnNewButton_9_1.setBounds(200, 1410, 50, 50);
		contentPane.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("3");
		btnNewButton_9_2.setBackground(new Color(247, 255, 238));
		btnNewButton_9_2.setBounds(350, 1410, 50, 50);
		contentPane.add(btnNewButton_9_2);
		
		JButton btnNewButton_9_2_1 = new JButton("4");
		btnNewButton_9_2_1.setBackground(new Color(247, 255, 238));
		btnNewButton_9_2_1.setBounds(480, 1410, 50, 50);
		contentPane.add(btnNewButton_9_2_1);
		
		JButton btnNewButton_9_2_2 = new JButton("5");
		btnNewButton_9_2_2.setBackground(new Color(247, 255, 238));
		btnNewButton_9_2_2.setBounds(630, 1410, 50, 50);
		contentPane.add(btnNewButton_9_2_2);
		
		JTextArea textAreaed5 = new JTextArea();
		textAreaed5.setBorder(new LineBorder(Color.DARK_GRAY));
		textAreaed5.setBackground(Color.WHITE);
		textAreaed5.setRows(5);
		textAreaed5.setColumns(5);
		textAreaed5.setBounds(84, 1480, 649, 40);
		contentPane.add(textAreaed5);
		
		JLabel lblNewLabel_1_5 = new JLabel("Dịch vụ Kiểm tra sau tiêm");
		lblNewLabel_1_5.setBounds(18, 1540, 220, 20);
		contentPane.add(lblNewLabel_1_5);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.setBackground(new Color(247, 255, 238));
		btnNewButton_10.setBounds(60, 1580, 50, 50);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_10_1 = new JButton("2");
		btnNewButton_10_1.setBackground(new Color(247, 255, 238));
		btnNewButton_10_1.setBounds(200, 1580, 50, 50);
		contentPane.add(btnNewButton_10_1);
		
		JButton btnNewButton_10_2 = new JButton("3");
		btnNewButton_10_2.setBackground(new Color(247, 255, 238));
		btnNewButton_10_2.setBounds(350, 1580, 50, 50);
		contentPane.add(btnNewButton_10_2);
		
		JButton btnNewButton_10_2_1 = new JButton("4");
		btnNewButton_10_2_1.setBackground(new Color(247, 255, 238));
		btnNewButton_10_2_1.setBounds(480, 1580, 50, 50);
		contentPane.add(btnNewButton_10_2_1);
		
		JButton btnNewButton_10_2_2 = new JButton("5");
		btnNewButton_10_2_2.setBackground(new Color(247, 255, 238));
		btnNewButton_10_2_2.setBounds(630, 1580, 50, 50);
		contentPane.add(btnNewButton_10_2_2);
		
		JTextArea textAreaed6 = new JTextArea();
		textAreaed6.setBorder(new LineBorder(Color.DARK_GRAY));
		textAreaed6.setBackground(Color.WHITE);
		textAreaed6.setRows(5);
		textAreaed6.setColumns(5);
		textAreaed6.setBounds(84, 1650, 649, 40);
		contentPane.add(textAreaed6);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("    3. Quý khác biết tới Trung tâm tiêm chủng qua ?\n");
		lblNewLabel_11_1_1.setOpaque(true);
		lblNewLabel_11_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_11_1_1.setBackground(new Color(247, 248, 255));
		lblNewLabel_11_1_1.setBounds(0, 1710, 1520, 50);
		contentPane.add(lblNewLabel_11_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Báo đài\n");
		rdbtnNewRadioButton.setBorderPainted(true);
		rdbtnNewRadioButton.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton.setBounds(18, 1760, 1520, 40);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Bác sĩ\n\n");
		rdbtnNewRadioButton_1.setBorderPainted(true);
		rdbtnNewRadioButton_1.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_1.setBounds(18, 1801, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Bạn bè hoặc Người thân giới thiệu\n\n");
		rdbtnNewRadioButton_2.setBorderPainted(true);
		rdbtnNewRadioButton_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_2.setBounds(18, 1841, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Internet, mạng xã hội (Facebook, Instagram, Tiktok,... )\n");
		rdbtnNewRadioButton_2_1.setBorderPainted(true);
		rdbtnNewRadioButton_2_1.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_2_1.setBounds(18, 1883, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_2_2 = new JRadioButton("Khác\n");
		rdbtnNewRadioButton_2_2.setBorderPainted(true);
		rdbtnNewRadioButton_2_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_2_2.setBounds(18, 1924, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_2_2);
		
		JTextArea textAreaed6_1 = new JTextArea();
		textAreaed6_1.setRows(5);
		textAreaed6_1.setColumns(5);
		textAreaed6_1.setBorder(new LineBorder(Color.DARK_GRAY));
		textAreaed6_1.setBackground(Color.WHITE);
		textAreaed6_1.setBounds(31, 1966, 649, 40);
		contentPane.add(textAreaed6_1);
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("    4. Quý khách sẽ tiếp tục sử dụng dịch vụ của Trung tâm tiêm chủng trong thời gian sắp tới ?\n");
		lblNewLabel_11_1_1_1.setOpaque(true);
		lblNewLabel_11_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_11_1_1_1.setBackground(new Color(247, 248, 255));
		lblNewLabel_11_1_1_1.setBounds(0, 2026, 1520, 50);
		contentPane.add(lblNewLabel_11_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Có\n");
		rdbtnNewRadioButton_3.setBorderPainted(true);
		rdbtnNewRadioButton_3.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_3.setBounds(18, 2075, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Không\n");
		rdbtnNewRadioButton_4.setBorderPainted(true);
		rdbtnNewRadioButton_4.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_4.setBounds(18, 2116, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Có thể\n");
		rdbtnNewRadioButton_5.setBorderPainted(true);
		rdbtnNewRadioButton_5.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_5.setBounds(18, 2156, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JLabel lblNewLabel_11_1_1_1_1 = new JLabel("    5. Quý khách có sẵn lòng giới thiệu Trung tâm tiêm chủng VNVC cho người thân/ bạn bè ?");
		lblNewLabel_11_1_1_1_1.setOpaque(true);
		lblNewLabel_11_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_11_1_1_1_1.setBackground(new Color(247, 248, 255));
		lblNewLabel_11_1_1_1_1.setBounds(0, 2206, 1520, 50);
		contentPane.add(lblNewLabel_11_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("Có\n");
		rdbtnNewRadioButton_3_1.setBorderPainted(true);
		rdbtnNewRadioButton_3_1.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_3_1.setBounds(18, 2255, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_3_1_1 = new JRadioButton("Không\n");
		rdbtnNewRadioButton_3_1_1.setBorderPainted(true);
		rdbtnNewRadioButton_3_1_1.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_3_1_1.setBounds(18, 2296, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_3_1_1);
		
		JRadioButton rdbtnNewRadioButton_3_1_2 = new JRadioButton("Có thể\n\n");
		rdbtnNewRadioButton_3_1_2.setBorderPainted(true);
		rdbtnNewRadioButton_3_1_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) Color.LIGHT_GRAY));
		rdbtnNewRadioButton_3_1_2.setBounds(18, 2336, 1520, 40);
		contentPane.add(rdbtnNewRadioButton_3_1_2);
		
		JLabel lblNewLabel_11_1_1_1_1_1 = new JLabel("    6. Quý khách vui lòng chia sẻ thêm ý kiến khác (Nếu có)");
		lblNewLabel_11_1_1_1_1_1.setOpaque(true);
		lblNewLabel_11_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1_1_1_1.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblNewLabel_11_1_1_1_1_1.setBackground(new Color(247, 248, 255));
		lblNewLabel_11_1_1_1_1_1.setBounds(0, 2376, 1520, 50);
		contentPane.add(lblNewLabel_11_1_1_1_1_1);
		
		JTextArea textAreaed6_1_1 = new JTextArea();
		textAreaed6_1_1.setRows(10);
		textAreaed6_1_1.setColumns(10);
		textAreaed6_1_1.setBorder(new LineBorder(Color.DARK_GRAY));
		textAreaed6_1_1.setBackground(Color.WHITE);
		textAreaed6_1_1.setBounds(84, 2448, 649, 134);
		contentPane.add(textAreaed6_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tôi đồng ý với các điều khoản và chấp nhận cho trung tâm sử dụng thông tin nhằm nâng cao chất lượng dịch vụ");
		chckbxNewCheckBox.setBackground(new Color(227, 241, 252));
		chckbxNewCheckBox.setOpaque(true);
		chckbxNewCheckBox.setBounds(31, 2635, 755, 120);
		
		contentPane.add(chckbxNewCheckBox);
	}
}
