package employeeTest;

import employee.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import java.awt.Panel;
import javax.swing.JMenu;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import employee.PositionEnum;
import employee.DepartmentEnum;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.ScrollPane;

public class employee_gui extends JFrame {
	private JTextField worktime;
	private JTextField name;
	private JTextField grade;
	private JTextField namepart;
	private JTextField work_time;
	private JTextField id;
	private JTextField name_search;
	private JTable employee_table;
	private JTextField id_t;
	private JTextField name_t;
	private JTextField grade_t;
	private JTextField hour_t;
	private JTextField id_d;
	private JTextField name_d;
	private JTextField grade_d;
	private JTextField hour_d;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					employee_gui frame = new employee_gui();
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
	public employee_gui() {
		setTitle("Á÷¿øµî·Ï ÇÁ·Î±×·¥");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 675);
		EmployeeSet set = new EmployeeSet();
		
		JLabel lblNewLabel = new JLabel("\uADFC\uBB34\uC2DC\uAC04");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel.setBounds(201, 79, 80, 24);
		
		worktime = new JTextField();
		worktime.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		worktime.setToolTipText("");
		worktime.setColumns(10);
		worktime.setBounds(201, 113, 111, 33);
		
		JButton btnNewButton =  new JButton("\uB4F1\uB85D");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(12, 10, 100, 40);
		getContentPane().setLayout(null);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCC3E\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(12, 60, 100, 40);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC0AD\uC81C");
		btnNewButton_2.setBounds(12, 162, 100, 40);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC5C5\uB370\uC774\uD2B8");
		btnNewButton_3.setBounds(12, 110, 100, 40);
		getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uC885\uB8CC");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(NORMAL);
			}
		});
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(12, 212, 100, 40);
		getContentPane().add(btnNewButton_4);
		
		JPanel del_panel = new JPanel();
		del_panel.setBounds(122, 10, 428, 318);
		getContentPane().add(del_panel);
		del_panel.setLayout(null);
		del_panel.setVisible(false);
		
		JButton btnNewButton_8 = new JButton("\uC9C1\uC6D0\uCC3E\uAE30");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(46, 10, 124, 47);
		del_panel.add(btnNewButton_8);
		
		JButton btnNewButton_8_1 = new JButton("\uD574\uB2F9\uC9C1\uC6D0 \uC0AD\uC81C\uD558\uAE30");
		btnNewButton_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8_1.setBounds(232, 10, 151, 47);
		del_panel.add(btnNewButton_8_1);
		
		JLabel lblNewLabel_3 = new JLabel("ID:");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(25, 107, 55, 25);
		del_panel.add(lblNewLabel_3);
		
		id_d = new JTextField();
		id_d.setBounds(60, 103, 102, 33);
		del_panel.add(id_d);
		id_d.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("\uC774\uB984:");
		lblNewLabel_3_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(213, 107, 55, 25);
		del_panel.add(lblNewLabel_3_1);
		
		name_d = new JTextField();
		name_d.setColumns(10);
		name_d.setBounds(263, 103, 102, 33);
		del_panel.add(name_d);
		
		JLabel lblNewLabel_3_2 = new JLabel("\uBD80\uC11C:");
		lblNewLabel_3_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(25, 186, 55, 25);
		del_panel.add(lblNewLabel_3_2);
		
		JComboBox part_d = new JComboBox();
		part_d.setModel(new DefaultComboBoxModel(DepartmentEnum.values()));
		part_d.setBounds(60, 186, 110, 24);
		del_panel.add(part_d);
		
		JComboBox pos_d = new JComboBox();
		pos_d.setModel(new DefaultComboBoxModel(PositionEnum.values()));
		pos_d.setBounds(263, 186, 110, 24);
		del_panel.add(pos_d);
		
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
		public void mouseClicked(MouseEvent e) {
			String name = name_d.getText();
			int find = set.EmpSearch(name);
			if(find == -1) {
				name_t.setText("ÇØ´çÁ÷¿ø¾øÀ½");
			}
			else if(find != -1) {
				Object emp = set.returningEMP(find);
				Employee empcheck = (Employee)emp;
				if(((empcheck.getId())/10000) == 1) {
					FullTimeEmp emp_f = (FullTimeEmp)emp;
					id_d.setText(Integer.toString(emp_f.getId()));
					name_d.setText(emp_f.getName());
					part_d.setSelectedItem(emp_f.getDepart());
					pos_d.setSelectedItem(emp_f.getP());
					grade_d.setText(Integer.toString(emp_f.getGrade()));
					hour_d.setText(null);
				}
				else if (((empcheck.getId())/10000) == 5) {
					PartTimeEmp emp_p = (PartTimeEmp)emp;
					id_d.setText(Integer.toString(emp_p.getId()));
					name_d.setText(emp_p.getName());
					part_d.setSelectedItem(emp_p.getDepart());
					hour_d.setText(Integer.toString(emp_p.getHours()));
					grade_d.setText(null);
				}
			}
		}
		});
		
		btnNewButton_8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int id = Integer.parseInt(id_d.getText());
				set.DeleteEmp(id);
				id_d.setText(null);
				name_d.setText(null);
			}
		});
		
		JLabel lblNewLabel_3_2_1 = new JLabel("\uC9C1\uAE09:");
		lblNewLabel_3_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(213, 186, 55, 25);
		del_panel.add(lblNewLabel_3_2_1);
		
		
		JLabel lblNewLabel_3_2_2 = new JLabel("\uD638\uBD09:");
		lblNewLabel_3_2_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_3_2_2.setBounds(25, 259, 55, 25);
		del_panel.add(lblNewLabel_3_2_2);
		
		grade_d = new JTextField();
		grade_d.setColumns(10);
		grade_d.setBounds(60, 255, 102, 33);
		del_panel.add(grade_d);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("\uADFC\uBB34\uC2DC\uAC04:");
		lblNewLabel_3_2_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1.setBounds(213, 259, 70, 25);
		del_panel.add(lblNewLabel_3_2_2_1);
		
		hour_d = new JTextField();
		hour_d.setColumns(10);
		hour_d.setBounds(283, 251, 90, 33);
		del_panel.add(hour_d);
		
		JPanel update_panel = new JPanel();
		update_panel.setBounds(122, 10, 428, 390);
		getContentPane().add(update_panel);
		update_panel.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("\uC9C1\uC6D0\uCC3E\uAE30");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(56, 10, 112, 45);
		update_panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("\uC9C1\uC6D0 \uC815\uBCF4 \uC5C5\uB370\uC774\uD2B8");
		btnNewButton_7.setBounds(214, 10, 158, 45);
		update_panel.add(btnNewButton_7);
		
		JLabel lblNewLabel_1 = new JLabel("\uC774\uB984\uC744 \uC785\uB825\uD558\uACE0 \uC9C1\uC6D0\uC815\uBCF4\uAC00 \uBD88\uB7EC\uC640\uC9C0\uBA74 \uC815\uBCF4\uB97C \uC218\uC815\uD558\uACE0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(27, 65, 401, 45);
		update_panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uC5C5\uB370\uC774\uD2B8 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(12, 106, 401, 45);
		update_panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID:");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(27, 179, 58, 22);
		update_panel.add(lblNewLabel_2);
		
		id_t = new JTextField();
		id_t.setBounds(69, 176, 128, 30);
		update_panel.add(id_t);
		id_t.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("\uC774\uB984:");
		lblNewLabel_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(226, 183, 58, 22);
		update_panel.add(lblNewLabel_2_1);
		
		name_t = new JTextField();
		name_t.setColumns(10);
		name_t.setBounds(265, 180, 128, 30);
		update_panel.add(name_t);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\uBD80\uC11C:");
		lblNewLabel_2_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(27, 250, 58, 22);
		update_panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("\uC9C1\uAE09:");
		lblNewLabel_2_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(226, 250, 58, 22);
		update_panel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("\uD638\uBD09:");
		lblNewLabel_2_1_1_2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2_1_1_2.setBounds(27, 314, 58, 22);
		update_panel.add(lblNewLabel_2_1_1_2);
		
		grade_t = new JTextField();
		grade_t.setColumns(10);
		grade_t.setBounds(69, 311, 128, 30);
		update_panel.add(grade_t);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("\uADFC\uBB34\uC2DC\uAC04:");
		lblNewLabel_2_1_1_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1_1.setBounds(226, 319, 71, 22);
		update_panel.add(lblNewLabel_2_1_1_1_1);
		
		hour_t = new JTextField();
		hour_t.setColumns(10);
		hour_t.setBounds(300, 311, 93, 30);
		update_panel.add(hour_t);
		
		JComboBox part_com = new JComboBox();
		part_com.setModel(new DefaultComboBoxModel(DepartmentEnum.values()));
		part_com.setBounds(69, 246, 128, 30);
		update_panel.add(part_com);
		
		JComboBox position_com = new JComboBox();
		position_com.setModel(new DefaultComboBoxModel(PositionEnum.values()));
		position_com.setBounds(265, 242, 128, 30);
		update_panel.add(position_com);
		update_panel.setVisible(false);
		
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				String name = name_t.getText();
				int find = set.EmpSearch(name);
				if(find == -1) {
					name_t.setText("ÇØ´çÁ÷¿ø¾øÀ½");
				}
				else if(find != -1) {
					Object emp = set.returningEMP(find);
					Employee empcheck = (Employee)emp;
					if(((empcheck.getId())/10000) == 1) {
						FullTimeEmp emp_f = (FullTimeEmp)emp;
						id_t.setText(Integer.toString(emp_f.getId()));
						name_t.setText(emp_f.getName());
						part_com.setSelectedItem(emp_f.getDepart());
						position_com.setSelectedItem(emp_f.getP());
						grade_t.setText(Integer.toString(emp_f.getGrade()));
						hour_t.setText(null);
					}
					else if (((empcheck.getId())/10000) == 5) {
						PartTimeEmp emp_p = (PartTimeEmp)emp;
						id_t.setText(Integer.toString(emp_p.getId()));
						name_t.setText(emp_p.getName());
						part_com.setSelectedItem(emp_p.getDepart());
						hour_t.setText(Integer.toString(emp_p.getHours()));
						grade_t.setText(null);
					}
				}
			}
		});
		
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(((Integer.parseInt(id_t.getText()))/10000) == 1) {
					int id = Integer.parseInt(id_t.getText());
					String name = name_t.getText();
					Object part = part_com.getSelectedItem();
					Object pos = position_com.getSelectedItem();
					int grade = Integer.parseInt(grade_t.getText());
					set.UpdateFull(id, name, part, pos, grade);
				}
				else if (((Integer.parseInt(id_t.getText()))/10000) == 5) {
					int id = Integer.parseInt(id_t.getText());
					String name = name_t.getText();
					Object part = part_com.getSelectedItem();
					int hour = Integer.parseInt(hour_t.getText());
					set.UpdatePart(id, name, part, hour);
				}
			}
		});
		
		JPanel Ã£±â = new JPanel();
		Ã£±â.setBounds(124, 10, 416, 218);
		getContentPane().add(Ã£±â);
		Ã£±â.setLayout(null);
		Ã£±â.setVisible(false);
		
		JButton searchall = new JButton("\uBAA8\uB450 \uCC3E\uAE30");
		searchall.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.SearchAll();
			}
		});
		searchall.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		searchall.setBounds(43, 10, 156, 56);
		Ã£±â.add(searchall);
		
		JButton searchfull = new JButton("\uC815\uADDC\uC9C1 \uBAA8\uB450 \uCC3E\uAE30");
		searchfull.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.SearchFull();
			}
		});
		searchfull.setHorizontalAlignment(SwingConstants.LEFT);
		searchfull.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		searchfull.setBounds(230, 10, 156, 56);
		Ã£±â.add(searchfull);
		
		JButton searchpart = new JButton("\uC784\uC2DC\uC9C1 \uBAA8\uB450 \uCC3E\uAE30");
		searchpart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.SearchPart();
			}
		});
		searchpart.setHorizontalAlignment(SwingConstants.LEFT);
		searchpart.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		searchpart.setBounds(43, 76, 156, 56);
		Ã£±â.add(searchpart);
		
		JButton searchname = new JButton("\uC774\uB984\uC73C\uB85C \uCC3E\uAE30");
		searchname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				set.SearchName(name_search.getText());
			}
		});
		searchname.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchname.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		searchname.setBounds(230, 76, 156, 56);
		Ã£±â.add(searchname);
		
		JButton btnNewButton_5 = new JButton("\uB098\uAC00\uAE30");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(120, 139, 156, 39);
		Ã£±â.add(btnNewButton_5);
		
		JLabel namesearch_la = new JLabel("\uC774\uB984\uC73C\uB85C \uCC3E\uAE30\uB294 \uC774\uB984\uC744 \uC785\uB825\uD558\uACE0 \uBC84\uD2BC\uC744 \uB20C\uB7EC\uC8FC\uC138\uC694");
		namesearch_la.setHorizontalAlignment(SwingConstants.CENTER);
		namesearch_la.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		namesearch_la.setBounds(43, 188, 343, 20);
		Ã£±â.add(namesearch_la);
		
		
		JPanel Ã£±â2 = new JPanel();
		Ã£±â2.setBounds(124, 238, 424, 62);
		getContentPane().add(Ã£±â2);
		Ã£±â2.setLayout(null);
		Ã£±â2.setVisible(false);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("\uD14C\uC774\uBE14\uC5D0 \uCD9C\uB825 \uAD6C\uD604\uD558\uACE0 \uC2F6\uC5C8\uC9C0\uB9CC \uBABB\uD568.. \uCF58\uC194\uCC3D\uC73C\uB85C \uBAA8\uB4E0 \uAE30\uB2A5 \uC815\uC0C1\uCD9C\uB825\uB428");
		lblNewLabel_4_1_1.setBounds(12, 0, 404, 26);
		Ã£±â2.add(lblNewLabel_4_1_1);
		
		JLabel IDla = new JLabel("ID:");
		IDla.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		IDla.setBounds(27, 25, 41, 27);
		Ã£±â2.add(IDla);
		
		id = new JTextField();
		id.setBounds(80, 25, 102, 27);
		Ã£±â2.add(id);
		id.setColumns(10);
		
		JLabel namela2 = new JLabel("\uC774\uB984:");
		namela2.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		namela2.setBounds(205, 25, 41, 27);
		Ã£±â2.add(namela2);
		
		name_search = new JTextField();
		name_search.setColumns(10);
		name_search.setBounds(258, 25, 102, 27);
		Ã£±â2.add(name_search);
		
		JPanel partpanel = new JPanel();
		partpanel.setLayout(null);
		partpanel.setBounds(124, 90, 426, 138);
		getContentPane().add(partpanel);
		partpanel.setVisible(false);
		
		JLabel namela_1 = new JLabel("\uC774\uB984:");
		namela_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		namela_1.setBounds(24, 25, 42, 35);
		partpanel.add(namela_1);
		
		namepart = new JTextField();
		namepart.setToolTipText("");
		namepart.setColumns(10);
		namepart.setBounds(68, 25, 111, 33);
		partpanel.add(namepart);
		
		JLabel partla_1 = new JLabel("\uBD80\uC11C:");
		partla_1.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		partla_1.setBounds(24, 81, 42, 35);
		partpanel.add(partla_1);
		
		JComboBox part_1 = new JComboBox();
		part_1.setModel(new DefaultComboBoxModel(DepartmentEnum.values()));
		part_1.setBounds(68, 82, 111, 33);
		partpanel.add(part_1);
		
		JButton fullregibutton_1 = new JButton("\uB4F1\uB85D\uD558\uAE30");
		fullregibutton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name_ = namepart.getText();
				Object part_ = part_1.getSelectedItem();
				int time = Integer.parseInt(work_time.getText());
				set.RegisterPartTimeEmp(name_,part_,time);
				namepart.setText(null);
				work_time.setText(null);
				partpanel.setVisible(false);
			}
		});
		fullregibutton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fullregibutton_1.setBounds(239, 79, 111, 38);
		partpanel.add(fullregibutton_1);
		
		JLabel timela = new JLabel("\uADFC\uBB34\uC2DC\uAC04:");
		timela.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		timela.setBounds(206, 25, 77, 35);
		partpanel.add(timela);
		
		work_time = new JTextField();
		work_time.setToolTipText("");
		work_time.setColumns(10);
		work_time.setBounds(283, 27, 111, 33);
		partpanel.add(work_time);
		
		JPanel fullpanel = new JPanel();
		fullpanel.setLayout(null);
		fullpanel.setBounds(124, 90, 355, 210);
		getContentPane().add(fullpanel);
		fullpanel.setVisible(false);
		
		JLabel namela = new JLabel("\uC774\uB984:");
		namela.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		namela.setBounds(24, 25, 42, 35);
		fullpanel.add(namela);
		
		name = new JTextField();
		name.setToolTipText("");
		name.setColumns(10);
		name.setBounds(68, 25, 111, 33);
		fullpanel.add(name);
		
		JLabel partla = new JLabel("\uBD80\uC11C:");
		partla.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		partla.setBounds(24, 81, 42, 35);
		fullpanel.add(partla);
		
		JComboBox part = new JComboBox();
		part.setModel(new DefaultComboBoxModel(DepartmentEnum.values()));
		part.setBounds(68, 82, 111, 33);
		fullpanel.add(part);
		
		JLabel posila = new JLabel("\uC9C1\uAE09:");
		posila.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		posila.setBounds(24, 143, 42, 35);
		fullpanel.add(posila);
		
		JComboBox level = new JComboBox();
		level.setModel(new DefaultComboBoxModel(PositionEnum.values()));
		level.setBounds(68, 145, 103, 33);
		fullpanel.add(level);
		
		JLabel gradela = new JLabel("\uD638\uBD09");
		gradela.setHorizontalAlignment(SwingConstants.TRAILING);
		gradela.setFont(new Font("±¼¸²", Font.PLAIN, 15));
		gradela.setBounds(232, 25, 42, 35);
		fullpanel.add(gradela);
		
		grade = new JTextField();
		grade.setToolTipText("");
		grade.setColumns(10);
		grade.setBounds(202, 55, 111, 33);
		fullpanel.add(grade);
		
		JButton fullregibutton = new JButton("\uB4F1\uB85D\uD558\uAE30");
		fullregibutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name_ = name.getText();
				Object part_ = part.getSelectedItem();
				Object level_ = level.getSelectedItem();
				int grade_ = Integer.parseInt(grade.getText());
				set.RegisterFullTimeEmp(name_, part_,level_,grade_);
				name.setText(null);
				grade.setText(null);
				fullpanel.setVisible(false);
			}
		});
		fullregibutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fullregibutton.setBounds(202, 123, 111, 38);
		fullpanel.add(fullregibutton);
		
		JPanel µî·Ï = new JPanel();
		µî·Ï.setBounds(124, 10, 355, 62);
		getContentPane().add(µî·Ï);
		µî·Ï.setLayout(null);
		
		JButton btnNewButton_5_1 = new JButton("\uC815\uADDC\uC9C1");
		btnNewButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_1.setBounds(55, 10, 88, 41);
		µî·Ï.add(btnNewButton_5_1);
		µî·Ï.setVisible(false);
		
		
		
		JButton btnNewButton_5_2 = new JButton("\uD30C\uD2B8\uD0C0\uC784");
		btnNewButton_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5_2.setBounds(195, 10, 100, 41);
		µî·Ï.add(btnNewButton_5_2);
		
		employee_table = new JTable();
		employee_table.setFont(new Font("±¼¸²", Font.PLAIN, 17));
		employee_table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		employee_table.setBounds(124, 310, 426, 305);
		getContentPane().add(employee_table);
		employee_table.setVisible(false);
		
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ã£±â.setVisible(false);
				Ã£±â2.setVisible(false);
				employee_table.setVisible(false);
				update_panel.setVisible(false);
				del_panel.setVisible(false);
				fullpanel.setVisible(false);
				partpanel.setVisible(false);
			}
		});
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ã£±â.setVisible(true);
				Ã£±â2.setVisible(true);
				employee_table.setVisible(true);
				µî·Ï.setVisible(false);
				partpanel.setVerifyInputWhenFocusTarget(false);
				fullpanel.setVisible(false);
				update_panel.setVisible(false);
				del_panel.setVisible(false);
				fullpanel.setVisible(false);
				partpanel.setVisible(false);
			}
		});
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				µî·Ï.setVisible(true);
				Ã£±â.setVisible(false);
				Ã£±â2.setVisible(false);
				employee_table.setVisible(false);
				update_panel.setVisible(false);
				del_panel.setVisible(false);
				fullpanel.setVisible(false);
				partpanel.setVisible(false);
			}
		});
		
		btnNewButton_5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				partpanel.setVisible(true);
				fullpanel.setVisible(false);
			}
		});
		
		btnNewButton_5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fullpanel.setVisible(true);
				partpanel.setVisible(false);
			}
		});
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ã£±â.setVisible(false);
				Ã£±â2.setVisible(false);
				employee_table.setVisible(false);
				partpanel.setVerifyInputWhenFocusTarget(false);
				fullpanel.setVisible(false);
				update_panel.setVisible(true);
				del_panel.setVisible(false);
				fullpanel.setVisible(false);
				partpanel.setVisible(false);
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Ã£±â.setVisible(false);
				Ã£±â2.setVisible(false);
				employee_table.setVisible(false);
				partpanel.setVerifyInputWhenFocusTarget(false);
				fullpanel.setVisible(false);
				update_panel.setVisible(false);
				del_panel.setVisible(true);
				fullpanel.setVisible(false);
				partpanel.setVisible(false);
			}
		});
	}
}
