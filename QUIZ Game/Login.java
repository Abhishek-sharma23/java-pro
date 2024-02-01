import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener
{
    JButton r,ex;
    JTextField t;
    Login()
    {
        getContentPane().setBackground(Color.black);
        setLayout(null);
        JLabel h=new JLabel("Quiz Time");
        h.setBounds(60,180,300,100);
        h.setFont(new Font("Viner Hand ITC",Font.BOLD,55));
        h.setForeground(Color.yellow);
        add(h); 
        JLabel n=new JLabel("Enter Your Name ");
        n.setBounds(475,100,300,40);
        n.setFont(new Font("Mongolian Baiti",Font.BOLD,30));
        n.setForeground(Color.green);
        add(n); 
        t=new JTextField();
        t.setBounds(450,170,300,25);
        add(t);
        r=new JButton("Rules");
        r.setBounds(440,240,120,25);
        r.setBackground(Color.red);
        r.setForeground(Color.white);
        r.addActionListener(this);
        add(r);
        ex=new JButton("Exit");
        ex.setBounds(630,240,120,25);
        ex.setBackground(Color.red);
        ex.setForeground(Color.white);
        ex.addActionListener(this);
        add(ex);
        setSize(800,500);
        setLocation(200,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==r)
        {
            String n=t.getText();
            new Rules(n);
            setVisible(false);
        }
        if(e.getSource()==ex)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        new Login();
    }
}