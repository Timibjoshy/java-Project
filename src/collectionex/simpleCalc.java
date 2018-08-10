package collectionex;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert  n 7/24/18.
 */
public class simpleCalc extends Applet implements ActionListener

    {
        //String msg=" ";
        int v1,v2,result;
        TextField t1;
        Button b[]=new Button[10];
        Button add,sub,mul,div,clear,eq,mod;
        char OP;
        public void init()
        {
            Color k=new Color(120,89,90);
            setBackground(k);
            t1=new TextField(10);
            GridLayout g=new GridLayout(4,5);
            setLayout(g);
            for(int i=0;i<10;i++)
            {
                b[i]=new Button(""+i);
            }
            add=new Button("+");
            sub=new Button("-");
            mul=new Button("*");
            div=new Button("/");
            clear=new Button("clear");
            eq=new Button("eq");
            mod=new Button("mod");

            t1.addActionListener(this);
            add(t1);
            for(int i=0;i<10;i++)
            {
                add(b[i]);
            }
            add(add);
            add(sub);
            add(mul);
            add(div);
            add(clear);
            add(eq);
            add(mod);
            for(int i=0;i<10;i++)
            {
                b[i].addActionListener(this);
            }
            add.addActionListener(this);
            sub.addActionListener(this);
            mul.addActionListener(this);
            div.addActionListener(this);
            clear.addActionListener(this);
            eq.addActionListener(this);
            mod.addActionListener(this);
        }

        public void actionPerformed(ActionEvent e)
        {
            String str=e.getActionCommand();
            char ch=str.charAt(0);
            if ( Character.isDigit(ch))
                t1.setText(t1.getText()+str);
            else
                if(str.equals("add"))
            {
                v1=Integer.parseInt(t1.getText());
                OP='+';
                t1.setText("");
            }
            else if(str.equals("sub"))
            {
                v1=Integer.parseInt(t1.getText());
                OP='-';
                t1.setText("");
            }
            else if(str.equals("mul"))
            {
                v1=Integer.parseInt(t1.getText());
                OP='*';
                t1.setText("");
            }
            else if(str.equals("div"))
            {
                v1=Integer.parseInt(t1.getText());
                OP='/';
                t1.setText("");
            }
                else if(str.equals("mod"))
                {
                    v1=Integer.parseInt(t1.getText());
                    OP='%';
                    t1.setText("");
                }

            if(str.equals("eq"))
            {
                v2=Integer.parseInt(t1.getText());
                if(OP=='+')
                    result=v1+v2;
                else if(OP=='-')
                    result=v1-v2;
                else if(OP=='*')
                    result=v1*v2;
                else if(OP=='/')
                    result=v1/v2;
                else if(OP=='%')
                    result=v1%v2;
                t1.setText(""+result);
            }
            if(str.equals("clear"))
            {
                t1.setText("");
            }
        }

    }
