import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Quiz extends JFrame implements ActionListener
{
    String que[][]=new String[10][5];
    String ans[][]=new String[10][2];
    String ua[][]=new String[10][1];
    JLabel qno,q;
    JRadioButton o1,o2,o3,o4;
    ButtonGroup go;
    JButton x,s,l;
    public static int t2=15;
    public static int ag=0;
    public static int c=0;
    public static int score=0;
    String n;
    Quiz(String n)
    {
        this.n=n;
        getContentPane().setBackground(Color.black);
        setLayout(null);
        JLabel h=new JLabel("Quiz Time");
        h.setBounds(380,10,400,150);
        h.setFont(new Font("Viner Hand ITC", Font.BOLD,50));
        h.setForeground(Color.green);
        add(h); 
        qno=new JLabel();
        qno.setBounds(25,150,50,30);
        qno.setFont(new Font("Tahoma",Font.PLAIN,24));
        qno.setForeground(Color.white);
        add(qno);
        q = new JLabel();
        q.setBounds(60,150,900,30);
        q.setFont(new Font("Tahoma",Font.PLAIN,24));
        q.setForeground(Color.white);
        add(q);
        que[0][0]="Which is used to find and fix bugs in the Java programs?";
        que[0][1]="JVM";
        que[0][2]="JDB";
        que[0][3]="JDK";
        que[0][4]="JRE";

        que[1][0]="What is the return type of the hashCode() method in the Object class?";
        que[1][1]="int";
        que[1][2]="Object";
        que[1][3]="long";
        que[1][4]="void";

        que[2][0]="Which package contains the Random class?";
        que[2][1]="java.util package";
        que[2][2]="java.lang package";
        que[2][3]="java.awt package";
        que[2][4]="java.io package";

        que[3][0]="An interface with no fields or methods is known as?";
        que[3][1]="Runnable Interface";
        que[3][2]="Abstract Interface";
        que[3][3]="Marker Interface";
        que[3][4]="CharSequence Interface";

        que[4][0]="In which memory a String is stored, when we create a string using new operator?";
        que[4][1]="Stack";
        que[4][2]="String memory";
        que[4][3]="Random storage space";
        que[4][4]="Heap memory";

        que[5][0]="Which of the following is a marker interface?";
        que[5][1]="Runnable interface";
        que[5][2]="Remote interface";
        que[5][3]="Readable interface";
        que[5][4]="Result interface";

        que[6][0]="Which keyword is used for accessing the features of a package?";
        que[6][1]="import";
        que[6][2]="package";
        que[6][3]="extends";
        que[6][4]="export";

        que[7][0]="In java, jar stands for?";
        que[7][1]="Java Archive Runner";
        que[7][2]="Java Archive";
        que[7][3]="Java Application Resource";
        que[7][4]="Java Application Runner";

        que[8][0]="Which of the following is a mutable class in java?";
        que[8][1]="java.lang.StringBuilder";
        que[8][2]="java.lang.Short";
        que[8][3]="java.lang.Byte";
        que[8][4]="java.lang.String";

        que[9][0]="Which of the following option leads to the portability and security of Java?";
        que[9][1]="Bytecode is executed by JVM";
        que[9][2]="The applet makes the Java code secure and portable";
        que[9][3]="Use of exception handling";
        que[9][4]="Dynamic binding between objects";

        ans[0][1]="JDB";
        ans[1][1]="int";
        ans[2][1]="java.util package";
        ans[3][1]="Marker Interface";
        ans[4][1]="Heap memory";
        ans[5][1]="Remote interface";
        ans[6][1]="import";
        ans[7][1]="Java Archive";
        ans[8][1]="java.lang.StringBuilder";
        ans[9][1]="Bytecode is executed by JVM";
        o1=new JRadioButton();
        o1.setBounds(100,210,400,30);
        o1.setBackground(Color.WHITE);
        o1.setFont(new Font("Dialog",Font.PLAIN,20));
        add(o1);
        o2=new JRadioButton();
        o2.setBounds(100,250,400,30);
        o2.setBackground(Color.WHITE);
        o2.setFont(new Font("Dialog",Font.PLAIN,20));
        add(o2);
        o3=new JRadioButton();
        o3.setBounds(100,290,400,30);
        o3.setBackground(Color.WHITE);
        o3.setFont(new Font("Dialog",Font.PLAIN,20));
        add(o3);
        o4=new JRadioButton();
        o4.setBounds(100,330,400,30);
        o4.setBackground(Color.WHITE);
        o4.setFont(new Font("Dialog",Font.PLAIN,20));
        add(o4);
        go=new ButtonGroup();
        go.add(o1);
        go.add(o2);
        go.add(o3);
        go.add(o4);
        x=new JButton("Next");
        x.setBounds(80,400,180,40);
        x.setFont(new Font("Tahoma",Font.PLAIN,22));
        x.setBackground(Color.red);
        x.setForeground(Color.WHITE);
        x.addActionListener(this);
        add(x);
        l=new JButton("50-50 Lifeline");
        l.setBounds(370,400,180,40);
        l.setFont(new Font("Tahoma",Font.PLAIN,20));
        l.setBackground(Color.red);
        l.setForeground(Color.WHITE);
        l.addActionListener(this);
        add(l);   
        s=new JButton("Submit");
        s.setBounds(650,400,180,40);
        s.setFont(new Font("Tahoma",Font.PLAIN,22));
        s.setBackground(Color.red);
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        s.setEnabled(false);
        add(s);
        start(c);
        setSize(1000,500);
        setLocation(200,150);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==x)
        {
            repaint();
            o1.setEnabled(true);
            o2.setEnabled(true);
            o3.setEnabled(true);
            o4.setEnabled(true);
            ag=1;
            if(go.getSelection()==null)
            {
               ua[c][0]="";
            } 
            else
            {
                ua[c][0]=go.getSelection().getActionCommand();
            }
            if(c==8)
            {
                x.setEnabled(false);
                s.setEnabled(true);
            }
            c++;
            start(c);
        }
        else if(e.getSource()==l)
        {
            if(c==2||c==4||c==6||c==8||c==9)
            {
                o2.setEnabled(false);
                o3.setEnabled(false);
            } 
            else
            {
                o1.setEnabled(false);
                o4.setEnabled(false);
            }
            l.setEnabled(false);
        }
        else if(e.getSource()==s)
        {
            ag=1;
            if(go.getSelection()==null)
            {
                ua[c][0]="";
            }
            else
            {
                ua[c][0]=go.getSelection().getActionCommand();
            }
            for(int i=0;i<ua.length;i++)
            {
                if(ua[i][0].equals(ans[i][1]))
                {
                    score+=10;
                }
                else
                {
                    score+=0;
                }
            }
            setVisible(false);
            new Score(n,score);
        }
    }
    public void paint(Graphics g)
    {
        super.paint(g);    
        String t="Time left - "+t2+" seconds";
        g.setColor(Color.red);
        g.setFont(new Font("Tahoma",Font.BOLD,25));
        if(t2>0)
        { 
            g.drawString(t,600,300);
        }
        else
        {
            g.drawString("Times up!!",1100,500);
        }
        t2--; 
        try
        {
            Thread.sleep(1000);
            repaint();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        if(ag==1)
        {
            ag=0;
            t2=15;
        }
        else if(t2<0)
        {
            t2=15;
            o1.setEnabled(true);
            o2.setEnabled(true);
            o3.setEnabled(true);
            o4.setEnabled(true);
            if(c==8)
            {
                x.setEnabled(false);
                s.setEnabled(true);
            }
            if(c==9)
            { 
                if(go.getSelection()==null)
                {
                   ua[c][0]="";
                }
                else
                {
                    ua[c][0]=go.getSelection().getActionCommand();
                }
                for(int i=0;i<ua.length;i++)
                {
                    if(ua[i][0].equals(ans[i][1]))
                    {
                        score+=10;
                    }
                    else
                    {
                        score+=0;
                    }
                }
                setVisible(false);
                new Score(n,score);
            }
            else
            { 
                if(go.getSelection()==null)
                {
                   ua[c][0]="";
                }
                else
                {
                    ua[c][0]=go.getSelection().getActionCommand();
                }
                c++; 
                start(c);
            }
        }
    }
    public void start(int c)
    {
        qno.setText(""+(c+1)+". ");
        q.setText(que[c][0]);
        o1.setText(que[c][1]);
        o1.setActionCommand(que[c][1]);
        o2.setText(que[c][2]);
        o2.setActionCommand(que[c][2]);
        o3.setText(que[c][3]);
        o3.setActionCommand(que[c][3]);
        o4.setText(que[c][4]);
        o4.setActionCommand(que[c][4]);
        go.clearSelection();
    }
    public static void main(String[] args)
    {
        new Quiz("User");
    }
}