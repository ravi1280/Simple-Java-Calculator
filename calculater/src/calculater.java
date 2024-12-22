/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


class close extends WindowAdapter {

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30;
    TextField tf;
    String fv, sv, op;
    double fdv, sdv, tot, ssdv;
    Color clr1, clr2, clr3, clr4, clr5, clr6, clr7;

    cal() {

        clr1 = new Color(62, 131, 133);
        clr2 = new Color(190, 237, 237);
        clr3 = new Color(87, 194, 155); 
        clr4 = new Color(14, 173, 176);
        clr5 = new Color(204, 219, 214);
        clr6 = new Color(61, 71, 68);
        clr7 = new Color(252, 252, 252);

        Frame f1 = new Frame();
        f1.setBackground(Color.white);
        f1.addWindowListener(new close());
        f1.setBounds(500, 200, 500, 350);

        f1.setTitle("Calculater");
        MenuBar mbar = new MenuBar();

        MenuItem mi1 = new MenuItem("Light mode");
        MenuItem mi2 = new MenuItem("Dark mode");
        MenuItem sep = new MenuItem("-");
        MenuItem Exit = new MenuItem("Exit");
        MenuItem mi3 = new MenuItem("Copy");
        MenuItem mi4 = new MenuItem("Paste");
        MenuItem mi5 = new MenuItem("Other");
        MenuItem mi6 = new MenuItem("Exit Window");

        Menu m1 = new Menu("View");
        m1.add(mi1);
        m1.add(mi2);
        m1.add(sep);
        m1.add(Exit);
      
        Menu m2 = new Menu("Edit");
        m2.add(mi3);
        m2.add(mi4);
        
        Menu m3 = new Menu("Help");
        m3.add(mi5);
        m3.add(mi6);
        
        Exit.addActionListener(this);
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi6.addActionListener(this);
    
        mbar.add(m1);
        mbar.add(m2);
        mbar.add(m3);

        f1.setMenuBar(mbar);

        b1 = new Button("x^2");
        b2 = new Button("1/x");
        b3 = new Button("x^y");
        b4 = new Button("/");
        b5 = new Button("sqrt");
        b6 = new Button("cbrt");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("*");
        b11 = new Button("sin");
        b12 = new Button("asin");
        b13 = new Button("4");
        b14 = new Button("5");
        b15 = new Button("6");
        b16 = new Button("-");
        b17 = new Button("cos");
        b18 = new Button("acos");
        b19 = new Button("1");
        b20 = new Button("2");
        b21 = new Button("3");
        b22 = new Button("+");
        b23 = new Button("tan");
        b24 = new Button("atan");
        b25 = new Button(".");
        b26 = new Button("0");
        b27 = new Button("C");
        b28 = new Button("=");
        b29 = new Button("%");
        b30 = new Button("log(10)");

        Font font1 = new Font("Cambria Math", Font.BOLD, 30);
        Font font2 = new Font("Courier New", Font.BOLD, 15);
        Font font3 = new Font("Courier New", Font.BOLD, 25);
        Font font4 = new Font("Courier New", Font.BOLD, 20);

        b1.setFont(font2);
        b2.setFont(font2);
        b3.setFont(font2);
        b4.setFont(font4);
        b5.setFont(font2);
        b6.setFont(font2);
        b7.setFont(font1);
        b8.setFont(font1);
        b9.setFont(font1);
        b10.setFont(font3);
        b11.setFont(font2);
        b12.setFont(font2);
        b13.setFont(font1);
        b14.setFont(font1);
        b15.setFont(font1);
        b16.setFont(font3);
        b17.setFont(font2);
        b18.setFont(font2);
        b19.setFont(font1);
        b20.setFont(font1);
        b21.setFont(font1);
        b22.setFont(font4);
        b23.setFont(font2);
        b24.setFont(font2);
        b25.setFont(font2);
        b26.setFont(font1);
        b27.setFont(font2);
        b28.setFont(font3);
        b29.setFont(font2);
        b30.setFont(font2);

        tf = new TextField(20);
        Font font = new Font("Cambria Math", Font.BOLD, 25);
        tf.setFont(font);

        tf.setEditable(false);

        tf.setForeground(Color.BLACK);
        tf.setBackground(Color.white);

        Panel p1 = new Panel();
        p1.setBackground(Color.lightGray);

        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();

        GridLayout gl = new GridLayout(5, 6, 5, 5);

        p1.add(tf);

        p2.setLayout(gl);
        p2.setBackground(Color.lightGray);
        p3.setBackground(Color.lightGray);
        p4.setBackground(Color.lightGray);
        p5.setBackground(Color.lightGray);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);
        p2.add(b17);
        p2.add(b18);
        p2.add(b19);
        p2.add(b20);
        p2.add(b21);
        p2.add(b22);
        p2.add(b23);
        p2.add(b24);
        p2.add(b25);
        p2.add(b26);
        p2.add(b27);
        p2.add(b28);
        p2.add(b29);
        p2.add(b30);
        Theam();

        f1.add(p1, BorderLayout.NORTH);
        f1.add(p2, BorderLayout.CENTER);
        f1.add(p3, BorderLayout.SOUTH);
        f1.add(p4, BorderLayout.WEST);
        f1.add(p5, BorderLayout.EAST);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);
        b25.addActionListener(this);
        b26.addActionListener(this);
        b27.addActionListener(this);
        b28.addActionListener(this);
        b29.addActionListener(this);
        b30.addActionListener(this);

        f1.setVisible(true);

    }

    public void Theam() {

        b7.setBackground(clr4);
        b7.setForeground(clr7);
        b8.setBackground(clr4);
        b8.setForeground(clr7);
        b9.setBackground(clr4);
        b9.setForeground(clr7);
        b19.setBackground(clr4);
        b19.setForeground(clr7);
        b20.setBackground(clr4);
        b20.setForeground(clr7);
        b21.setBackground(clr4);
        b21.setForeground(clr7);
        b13.setBackground(clr4);
        b13.setForeground(clr7);
        b14.setBackground(clr4);
        b14.setForeground(clr7);
        b15.setBackground(clr4);
        b15.setForeground(clr7);;
        b26.setBackground(clr4);
        b26.setForeground(clr7);
        b28.setBackground(clr4);
        b28.setForeground(clr7);

        b1.setBackground(clr5);
        b1.setForeground(clr6);
        b2.setBackground(clr5);
        b2.setForeground(clr6);
        b3.setBackground(clr5);
        b3.setForeground(clr6);
        b4.setBackground(clr5);
        b4.setForeground(clr6);
        b5.setBackground(clr5);
        b5.setForeground(clr6);
        b6.setBackground(clr5);
        b6.setForeground(clr6);
        b10.setBackground(clr5);
        b10.setForeground(clr6);
        b11.setBackground(clr5);
        b11.setForeground(clr6);
        b12.setBackground(clr5);
        b12.setForeground(clr6);
        b16.setBackground(clr5);
        b16.setForeground(clr6);
        b17.setBackground(clr5);
        b17.setForeground(clr6);
        b18.setBackground(clr5);
        b18.setForeground(clr6);
        b22.setBackground(clr5);
        b22.setForeground(clr6);
        b23.setBackground(clr5);
        b23.setForeground(clr6);
        b24.setBackground(clr5);
        b24.setForeground(clr6);
        b25.setBackground(clr5);
        b25.setForeground(clr6);
        b27.setBackground(clr5);
        b27.setForeground(clr6);
        b29.setBackground(clr5);
        b29.setForeground(clr6);
        b30.setBackground(clr5);
        b30.setForeground(clr6);

    }

    @Override
    public void actionPerformed(ActionEvent d) {
        Object o = d.getSource();
        if (o.equals(b7)) {
            tf.setText(tf.getText() + b7.getLabel());
        } else if (o.equals(b8)) {
            tf.setText(tf.getText() + b8.getLabel());
        } else if (o.equals(b9)) {
            tf.setText(tf.getText() + b9.getLabel());
        } else if (o.equals(b13)) {
            tf.setText(tf.getText() + b13.getLabel());
        } else if (o.equals(b14)) {
            tf.setText(tf.getText() + b14.getLabel());
        } else if (o.equals(b15)) {
            tf.setText(tf.getText() + b15.getLabel());
        } else if (o.equals(b19)) {
            tf.setText(tf.getText() + b19.getLabel());
        } else if (o.equals(b20)) {
            tf.setText(tf.getText() + b20.getLabel());
        } else if (o.equals(b21)) {
            tf.setText(tf.getText() + b21.getLabel());
        } else if (o.equals(b26)) {
            tf.setText(tf.getText() + b26.getLabel());
        } else if (o.equals(b25)) {
            tf.setText(tf.getText() + b25.getLabel());
            
        } else if (o.equals(b1)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.pow(fdv, 2) + "");
            
        } else if (o.equals(b2)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = 1 / fdv;
            tf.setText(tot + "");

        } else if (o.equals(b5)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);

            tf.setText(Math.sqrt(fdv) + "");
        } else if (o.equals(b6)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);

            tf.setText(Math.cbrt(fdv) + "");

        } else if (o.equals(b30)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.log10(fdv) + "");

        } else if (o.equals(b11)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            ssdv = Math.toRadians(fdv);
            tf.setText(Math.sin(ssdv) + "");

        } else if (o.equals(b12)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.asin(fdv) + "");

        } else if (o.equals(b17)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            ssdv = Math.toRadians(fdv);
            tf.setText(Math.cos(ssdv) + "");

        } else if (o.equals(b18)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.acos(fdv) + "");

        } else if (o.equals(b23)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            ssdv = Math.toRadians(fdv);
            tf.setText(Math.tan(ssdv) + "");

        } else if (o.equals(b24)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tf.setText(Math.atan(fdv) + "");

        } else if (o.equals(b29)) {
            fv = tf.getText();
            fdv = Double.parseDouble(fv);
            tot = fdv / 100;
            tf.setText(tot + "");
        } else if (o.equals(b4)) {
            fv = tf.getText();
            tf.setText("");
            op = b4.getLabel();
        } else if (o.equals(b10)) {
            fv = tf.getText();
            tf.setText("");
            op = b10.getLabel();
        } else if (o.equals(b16)) {
            fv = tf.getText();
            tf.setText("");
            op = b16.getLabel();
        } else if (o.equals(b22)) {
            fv = tf.getText();
            tf.setText("");
            op = b22.getLabel();

        } else if (o.equals(b1)) {
            fv = tf.getText();
            tf.setText("");
            op = b1.getLabel();
        } else if (o.equals(b2)) {
            fv = tf.getText();
            tf.setText("");
            op = b2.getLabel();
        } else if (o.equals(b3)) {
            fv = tf.getText();
            tf.setText("");
            op = b3.getLabel();
        } else if (o.equals(b27)) {
            tf.setText("");

        } else if (o.equals(b28)) {
            sv = tf.getText();
            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);

            if (op.equals("-")) {
                tot = fdv - sdv;
                tf.setText(tot + "");

            } else if (op.equals("+")) {
                tot = fdv + sdv;
                tf.setText(tot + "");
            } else if (op.equals("*")) {
                tot = fdv * sdv;
                tf.setText(tot + "");
            } else if (op.equals("/")) {
                tot = fdv / sdv;
                tf.setText(tot + "");
            } else if (op.equals("x^y")) {

                tf.setText(Math.pow(fdv, sdv) + "");
            }

        }

        String lable = d.getActionCommand();
        switch (lable) {
            case "Exit":
                System.exit(0);

            case "Dark mode":
                clr4 = new Color(54, 138, 122);
                clr5 = new Color(71, 77, 84);
                clr6 = new Color(112, 255, 211);

                Theam();
                break;
            case "Light mode":

                clr4 = new Color(14, 173, 176);
                clr5 = new Color(204, 219, 214);
                clr6 = new Color(61, 71, 68);

                Theam();
                break;

            case "Exit Window":
                System.exit(0);
                break;

        }

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

public class calculater {

    public static void main(String[] args) {

        new cal();

    }

}
