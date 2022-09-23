import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton login,cancel;
    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("UserName");
        lblusername.setBounds(40,20,100,20);
        add(lblusername);



        JTextField juserName = new JTextField();
        juserName.setBounds(150,20,150,20);
        add(juserName);

        JLabel lblpass = new JLabel("Password");
        lblpass.setBounds(40,70,100,20);
        add(lblpass);

        JPasswordField jpass = new JPasswordField();
        jpass.setBounds(150,70,150,20);
        add(jpass);

        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this::actionPerformed);
        login.setFont(new Font("Tahoma",Font.BOLD,15));
        add(login);

         cancel = new JButton("Cancel");
        cancel.setBounds(180,140,120,30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma",Font.BOLD,15));
        add(cancel);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 =il.getImage().getScaledInstance(1000,650,Image.SCALE_DEFAULT);
        ImageIcon  i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(3500,20,200,200);
        add(image);


        setSize(600,300);
        setLocation(500,250);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==login){

        }
        else  if (e.getSource()==cancel){
 setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }
}
