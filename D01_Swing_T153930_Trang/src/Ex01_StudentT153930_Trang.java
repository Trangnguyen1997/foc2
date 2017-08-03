import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Ex01_StudentT153930_Trang extends JFrame{
	//
	JLabel lblUsername;
	JTextField txtUsername;
	private JPasswordField txtPassword;
	
	//Ham dung  Constructor
	public Ex01_StudentT153930_Trang(){
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		getContentPane().setBackground(Color.PINK);
		getContentPane().setLayout(null);
		//
		lblUsername = new JLabel("Username:");
		lblUsername.setLocation(30,50);
		lblUsername.setSize(80,25);
		//
		
		txtUsername = new JTextField("");
		txtUsername.setLocation(30,80);
		txtUsername.setSize(150,20);
		//
		getContentPane().add(lblUsername);
		getContentPane().add(txtUsername);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(30, 147, 150, 20);
		getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(30, 126, 80, 14);
		getContentPane().add(lblPassword);
		
		JPanel panel = new JPanel();
		panel.setBounds(277, 142, -14, 43);
		getContentPane().add(panel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember Me");
		chckbxNewCheckBox.setBounds(30, 174, 122, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userName = txtUsername.getText();
				char[] passArray = txtPassword.getPassword();
				String password = new String(passArray);
				if(userName.equals("admin") && password.equals("root")){
					JOptionPane.showMessageDialog(Ex01_StudentT153930_Trang.this, "Hello"+userName);
				}else{
					JOptionPane.showMessageDialog(Ex01_StudentT153930_Trang.this, "Login Fail");
				}
				
			}
		});
		btnNewButton.setBounds(63, 214, 89, 23);
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("   LOGIN");
		lblNewLabel.setFont(new Font("VnBandit", Font.PLAIN, 15));
		lblNewLabel.setBounds(72, 11, 80, 43);
		getContentPane().add(lblNewLabel);
		
	}
	public static void main(String []args){
		Ex01_StudentT153930_Trang t = new Ex01_StudentT153930_Trang();
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.setSize(250,300);
	}
}