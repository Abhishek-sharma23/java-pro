import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener
{
    String n;
    JButton b,s;
    Rules(String n)
    {
        this.n=n;
        getContentPane().setBackground(Color.black);
        setLayout(null);
        JLabel h=new JLabel("Welcome In Quiz "+n);
        h.setBounds(50,20,700,80);
        h.setFont(new Font("Balloon", Font.BOLD,50));
        h.setForeground(Color.CYAN);
        add(h); 
        JLabel r=new JLabel();
        r.setBounds(20,50,700,350);
        r.setFont(new Font("Tahoma", Font.PLAIN,16));
        r.setText("<html>"+
        "1. Test Yourself and you knowladge."+"<br><br>"+
        "2. Play with free and fresh mind."+"<br><br>"+
        "3. You can select only one option at a time."+"<br><br>"+
        "4. You can not move back after completing the question."+"<br><br>"+
        "5. Check your score in last."+"<br><br>"+
        "<html>");
        r.setForeground(Color.white);
        add(r); 
        b=new JButton("Back");
        b.setBounds(150,350,120,25);
        b.setBackground(Color.red);
        b.setForeground(Color.white);
        b.addActionListener(this);
        add(b);
        s=new JButton("Start");
        s.setBounds(440,350,120,25);
        s.setBackground(Color.red);
        s.setForeground(Color.white);
        s.addActionListener(this);
        add(s);
        setSize(800,500);
        setLocation(200,150);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==s)
        {
            setVisible(false);
            new Quiz(n);
        }
        else
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args)
    {
        new Rules("User");
    }
}