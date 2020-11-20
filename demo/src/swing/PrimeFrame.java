package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PrimeFrame extends JFrame {

	JTextField tfNumber;
	JButton btnPrime;
	JButton btnExit;

	public PrimeFrame() {
		super("Prime Number");
		// UI
		tfNumber = new JTextField(20);
		btnPrime = new JButton("Prime");
		btnPrime.setBackground(Color.lightGray);

		btnPrime.addActionListener(e -> {
			int num = Integer.parseInt(tfNumber.getText());
			boolean prime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime)
				JOptionPane.showMessageDialog(this, "Prime number!");
			else
				JOptionPane.showMessageDialog(this, "Not a Prime number!");
		});

		btnExit = new JButton("Exit");
		btnExit.setBackground(Color.lightGray);
		btnExit.addActionListener(e -> System.exit(0));

		JPanel tp = new JPanel();
		tp.add(new JLabel("Number :"));
		tp.add(tfNumber);

		JPanel bp = new JPanel();
		bp.add(btnPrime);
		bp.add(btnExit);

		Container c = getContentPane();
		c.add(tp, BorderLayout.NORTH);
		c.add(bp, BorderLayout.SOUTH);

		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new PrimeFrame();
	}
}
