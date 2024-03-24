package ntu.dhl63134410;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class InterfaceBMI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public InterfaceBMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 745);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(51, 153, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

}
