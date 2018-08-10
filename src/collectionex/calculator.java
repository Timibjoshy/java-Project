package collectionex;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 7/24/18.
 */

    public class calculator extends Applet implements ActionListener {
    Label fn;
    Label sn;
    Label res;
    TextField num1, num2, result;
    Button sum, sub, mul, div;
    int a, b, c;

    public void init() {
        setForeground(Color.blue);
        setLayout(new GridLayout(5, 5));
        fn = new Label("number 1");
        add(fn);
        num1 = new TextField(10);
        add(num1);
        sn = new Label("number 2");
        add(sn);
        num2 = new TextField(10);
        add(num2);
        res = new Label("Result");
        add(res);
        result = new TextField(25);
        add(result);
        sum = new Button("+");
        add(sum);
        sub = new Button("-");
        add(sub);
        mul = new Button("*");
        add(mul);
        div = new Button("/");
        add(div);
        sum.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        result.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String op = e.getActionCommand();
        a = Integer.parseInt(num1.getText());
        b = Integer.parseInt(num2.getText());
        if (op.equals("result")) {
            if (op.equals("+"))
                c = a + b;
            else if (op.equals("-"))
                c = a - b;
            else if (op.equals("*"))
                c = a * b;
            else if (op.equals("/"))
                c = a / b;

        }
    }

    public void paint(Graphics g) {

        String r = "" + c;
        result.setText(r);
    }
}



