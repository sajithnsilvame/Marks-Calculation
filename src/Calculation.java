import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculation {

	private JFrame frmMarksCalculation;
	private JTextField txtEng;
	private JTextField txtMaths;
	private JTextField txtSci;
	private JTextField txtTot;
	private JTextField txtAve;
	private JTextField txtStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculation window = new Calculation();
					window.frmMarksCalculation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMarksCalculation = new JFrame();
		frmMarksCalculation.setTitle("Marks Calculation");
		frmMarksCalculation.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(21, 22, 529, 363);
		frmMarksCalculation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("English");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(34, 24, 88, 29);
		panel.add(lblNewLabel);
		
		JLabel lblMaths = new JLabel("Maths");
		lblMaths.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMaths.setBounds(34, 66, 88, 29);
		panel.add(lblMaths);
		
		JLabel lblScience = new JLabel("Science");
		lblScience.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblScience.setBounds(34, 110, 88, 29);
		panel.add(lblScience);
		
		txtEng = new JTextField();
		txtEng.setBounds(142, 30, 147, 23);
		panel.add(txtEng);
		txtEng.setColumns(10);
		
		txtMaths = new JTextField();
		txtMaths.setColumns(10);
		txtMaths.setBounds(142, 72, 147, 23);
		panel.add(txtMaths);
		
		txtSci = new JTextField();
		txtSci.setColumns(10);
		txtSci.setBounds(142, 116, 147, 23);
		panel.add(txtSci);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTotal.setBounds(34, 166, 88, 29);
		panel.add(lblTotal);
		
		txtTot = new JTextField();
		txtTot.setColumns(10);
		txtTot.setBounds(142, 172, 147, 23);
		panel.add(txtTot);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAverage.setBounds(34, 206, 88, 29);
		panel.add(lblAverage);
		
		txtAve = new JTextField();
		txtAve.setColumns(10);
		txtAve.setBounds(142, 212, 147, 23);
		panel.add(txtAve);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblStatus.setBounds(34, 246, 88, 29);
		panel.add(lblStatus);
		
		txtStatus = new JTextField();
		txtStatus.setColumns(10);
		txtStatus.setBounds(142, 252, 147, 23);
		panel.add(txtStatus);
		
		JButton btnCal = new JButton("Calculate");
		btnCal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sub1 = Integer.parseInt(txtEng.getText());
				int sub2 = Integer.parseInt(txtMaths.getText());
				int sub3 = Integer.parseInt(txtSci.getText());
				
				int total = sub1 + sub2 + sub3;
				double avg = total /3;
				
				txtTot.setText(String.valueOf(total));
				txtAve.setText(String.valueOf(avg));
				
				if(avg > 50) {
					txtStatus.setText(String.valueOf("Pass"));
				}
				else {
					txtStatus.setText(String.valueOf("Fail"));
				}
			}
		});
		btnCal.setBounds(378, 71, 112, 34);
		panel.add(btnCal);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtEng.setText("");
				txtMaths.setText("");
				txtSci.setText("");
				txtTot.setText("");
				txtAve.setText("");
				txtStatus.setText("");
				
				txtEng.requestFocus();
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnClear.setBounds(378, 129, 112, 34);
		panel.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(378, 184, 112, 34);
		panel.add(btnExit);
	}
}
