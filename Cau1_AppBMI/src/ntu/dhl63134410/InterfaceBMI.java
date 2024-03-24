package ntu.dhl63134410;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class InterfaceBMI extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField heightValue;
	private JTextField weightValue;
	private JTextField RESULT;
	private JLabel Display;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();

	public InterfaceBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 745);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 532, 96);
		panel.setBackground(new Color(0, 153, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Body Mass Index");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(167, 28, 191, 41);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		panel_1.setBounds(16, 108, 508, 354);
		panel_1.setBackground(new Color(0, 153, 255));
		panel_1.setForeground(new Color(0, 0, 0));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Height(m):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(33, 50, 110, 34);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Weight(kg):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(33, 135, 110, 28);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BMI");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(33, 219, 57, 22);
		panel_1.add(lblNewLabel_3);
		
		heightValue = new JTextField();
		heightValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		heightValue.setBounds(179, 48, 254, 34);
		panel_1.add(heightValue);
		heightValue.setColumns(10);
		
		weightValue = new JTextField();
		weightValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		weightValue.setBounds(179, 130, 254, 34);
		panel_1.add(weightValue);
		weightValue.setColumns(10);
		
		RESULT = new JTextField();
		RESULT.setFont(new Font("Tahoma", Font.BOLD, 14));
		RESULT.setBounds(129, 211, 80, 34);
		panel_1.add(RESULT);
		RESULT.setColumns(10);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setAction(action_1);
		btnNewButton.setBounds(275, 282, 91, 34);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit ");
		btnNewButton_1.setAction(action);
		btnNewButton_1.setBounds(406, 282, 85, 34);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Caculate");
		btnNewButton_2.setAction(action_2);
		btnNewButton_2.setBounds(149, 282, 91, 34);
		panel_1.add(btnNewButton_2);
		
		Display = new JLabel("");
		Display.setBackground(Color.WHITE);
		Display.setFont(new Font("Tahoma", Font.BOLD, 16));
		Display.setBounds(290, 211, 201, 34);
		panel_1.add(Display);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/bmi.jpg")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setBounds(16, 472, 508, 207);
		
		JLabel lblNewLabel_5 = new JLabel("Thank you for using my app");
		lblNewLabel_5.setBackground(new Color(102, 204, 51));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(-6, 672, 530, 38);
		contentPane.add(lblNewLabel_5);
	}
	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Exit");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Clear");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			heightValue.setText("");
			weightValue.setText("");
			RESULT.setText("");
			RESULT.setOpaque(true);
			RESULT.setBackground(null);
			Display.setText("");
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Caculate");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			double h = Double.parseDouble(heightValue.getText());
			double w = Double.parseDouble(weightValue.getText());
			
			double bmi= w / (h*h);
			
			String cal= String.format("%.2f", bmi);
			
			RESULT.setText(cal);
			
			if(bmi <= 18.5) {
				RESULT.setOpaque(true);
				RESULT.setBackground(Color.white);
				Display.setForeground(Color.black);
				Display.setText("Underweight");
			}
			else if(bmi <= 24.9) {
				RESULT.setOpaque(true);
				RESULT.setBackground(Color.green);
				Display.setForeground(Color.green);
				Display.setText("Normal");
			}
			else if(bmi <= 29.9) {
				RESULT.setOpaque(true);
				RESULT.setBackground(Color.yellow);
				Display.setForeground(Color.yellow);
				Display.setText("Overweight");
			}
			else if(bmi <= 34.9) {
				RESULT.setOpaque(true);
				RESULT.setBackground(Color.orange);
				Display.setForeground(Color.orange);
				Display.setText("Obese");
			}
			else {
				RESULT.setOpaque(true);
				RESULT.setBackground(Color.red);
				Display.setForeground(Color.red);
				Display.setText("Extremely Obese");
			}
			
		}
	}

}
