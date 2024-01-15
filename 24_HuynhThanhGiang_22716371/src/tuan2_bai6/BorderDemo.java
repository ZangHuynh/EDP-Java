package tuan2_bai6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BorderDemo extends JFrame implements ActionListener{

	private JLabel p1;

	public BorderDemo() {
		setTitle("Border Demo");
		setSize(300,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridLayout(0,2,5,10));
		
		p1 = new JLabel("Line Border");
		p1.setBorder(BorderFactory.createLineBorder(Color.red, 3));
		add(p1);
	}
	
	public static void main(String[] args) {
		new BorderDemo().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
