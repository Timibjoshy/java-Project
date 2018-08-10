package collectionex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 7/23/18.
 */
public class myApp implements ActionListener{
    JLabel label;
    JButton button;
    JTextField textField;
   // myApp()
   {
        JFrame f=new JFrame("first Window");//set form name
        f.setLayout(null);
        f.setSize(500,500);
        label=new JLabel("enter name");
        f.add(label);
        label.setBounds(100,100,150,50);
        button=new JButton("click");
        f.add(button);
        button.addActionListener(this);//generate action of button
        button.setBounds(100,300,75,50);
        textField=new JTextField();
        f.add(textField);
        textField.setBounds(100,200,75,50);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBackground(Color.MAGENTA);
        f.setVisible(true);
    }

    public static void main(String[] args) {
      new myApp();}

       @Override
    public void actionPerformed(ActionEvent e){
    //label.setText("first label");
    label.setText(textField.getText());
       }

}
