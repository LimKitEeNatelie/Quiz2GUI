import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;

public class GUIWaterCalc {

	private JFrame frame;
	private JTextField textFieldWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIWaterCalc window = new GUIWaterCalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIWaterCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1068, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Tell Me");
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					double weight=0;
					double water=0;
				   
					weight = Double.parseDouble(textFieldWeight.getText());
					 water = weight/30;
					 
					JOptionPane.showConfirmDialog(null, "Buddy, you should drink " + water+ "L of water a day!");
				} catch(Exception e) {
					JOptionPane.showConfirmDialog(null, "Please enter valid number");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(418, 341, 189, 43);
		frame.getContentPane().add(btnNewButton);
		
		textFieldWeight = new JTextField();
		textFieldWeight.setBackground(new Color(230, 230, 250));
		textFieldWeight.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textFieldWeight.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldWeight.setBounds(510, 210, 294, 61);
		frame.getContentPane().add(textFieldWeight);
		textFieldWeight.setColumns(10);
		
		JLabel lblHowMuchWater = new JLabel("How much water should I drink?");
		lblHowMuchWater.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblHowMuchWater.setHorizontalAlignment(SwingConstants.CENTER);
		lblHowMuchWater.setBounds(221, 44, 599, 130);
		frame.getContentPane().add(lblHowMuchWater);
		
		JLabel lblMyWeightkg = new JLabel("My weight(kg) :");
		lblMyWeightkg.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMyWeightkg.setBounds(174, 218, 213, 44);
		frame.getContentPane().add(lblMyWeightkg);
	}
}
