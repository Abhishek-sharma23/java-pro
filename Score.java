import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener
{
    JButton a,ex;
    Score(String n,int s)
    {
        getContentPane().setBackground(Color.black);
        setLayout(null);    
        JLabel h=new JLabel("Thank you "+n+" for playing Quiz");
        h.setBounds(90,5,800,200);
        h.setFont(new Font("Tahoma",Font.BOLD,40));
        h.setForeground(Color.magenta);
        add(h);
        JLabel t=new JLabel("Your score is "+s);
        t.setBounds(350,220,300,30);
        t.setFont(new Font("Tahoma",Font.PLAIN,26));
        t.setForeground(Color.white);
        add(t);
        a=new JButton("Play Again");
        a.setBounds(250,350,120,30);
        a.setBackground(Color.yellow);
        a.setForeground(Color.black);
        a.addActionListener(this);
        add(a);
        setVisible(true);
        ex=new JButton("Exit");
        ex.setBounds(550,350,120,30);
        ex.setBackground(Color.yellow);
        ex.setForeground(Color.black);
        ex.addActionListener(this);
        add(ex);
        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==a)
        {
            new Login();
            setVisible(false);
        }
        if(e.getSource()==ex)
        {
            setVisible(false);
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        new Score("User",0);
    }
}