package main;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Twop extends JFrame implements ActionListener {
    private JButton l7, l8, l9;
    private int counter = 0;
    private JLabel counterLabel;

    public static void main(String[] args) {
        new Twop().setVisible(true);
    }

    Twop() {
        setUndecorated(true);
        setBackground(Color.CYAN);
        setLayout(null);
        setBounds(690, 150, 550, 850);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        setContentPane(panel);
        panel.setLayout(null);
        ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("icons/Two.jpg"));
        Image p2 = p1.getImage().getScaledInstance(550, 450, Image.SCALE_DEFAULT);
        ImageIcon p3 = new ImageIcon(p2);

        ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("icons/heart.png"));
        Image h2 = h1.getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT);
        ImageIcon h3 = new ImageIcon(h2);
        JLabel hi1 = new JLabel(h3);
        hi1.setBounds(470, 400, 25, 45);
        panel.add(hi1);
        counterLabel = new JLabel("0");
        counterLabel.setForeground(new Color(255, 102, 102));
        counterLabel.setFont(new Font("Arial", Font.BOLD, 25));
        counterLabel.setBounds(500, 400, 100, 45);
        panel.add(counterLabel);

        JLabel l1 = new JLabel(p3);
        l1.setBounds(0, 0, 550, 450);
        panel.add(l1);

        JLabel l2 = new JLabel("  J'ADORE   eau de parfum");
        l2.setFont(new Font("Tahoma", Font.BOLD, 20));
        l2.setBounds(5, 470, 550, 25);
        panel.add(l2);

        JLabel a3 = new JLabel("100mg/ml");
        a3.setForeground(new Color(153, 102, 0));
        a3.setFont(new Font("Tahoma", Font.TYPE1_FONT, 20));
        a3.setBounds(16, 500, 150, 45);
        panel.add(a3);

        JLabel a2 = new JLabel("$" + 108.78);
        a2.setForeground(new Color(153, 102, 0));
        a2.setFont(new Font("Tahoma", Font.TYPE1_FONT, 20));
        a2.setBounds(446, 500, 150, 45);
        panel.add(a2);

        JLabel l3 = new JLabel(
                "    An iconic fragrance, J'adore Eau de Parfum is the grand feminine floral by  ");
        l3.setFont(new Font("Tahoma", Font.ITALIC, 15));
        l3.setBounds(10, 560, 550, 45);
        panel.add(l3);

        JLabel l4 = new JLabel("the House of Dior.Finely crafted down to the last detail, like a custom-made ");
        l4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l4.setBounds(11, 590, 550, 45);
        panel.add(l4);

        JLabel l5 = new JLabel("flower, J'adore is a bouquet of the most beautiful flowers from around ");
        l5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l5.setBounds(11, 620, 570, 45);
        panel.add(l5);

        JLabel l6 = new JLabel("the world.");
        l6.setFont(new Font("Tahoma", Font.PLAIN, 15));
        l6.setBounds(11, 650, 570, 45);
        panel.add(l6);

        l7 = new JButton("ADD TO CART");
        l7.addActionListener(this);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l7.setForeground(new Color(255, 255, 255));
        l7.setBackground(new Color(255, 102, 102));
        l7.setBorder(null);
        // l7.getUI();
        l7.setBounds(0, 740, 430, 50);
        panel.add(l7);

        l8 = new JButton();
        l8.addActionListener(this);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l8.setForeground(new Color(255, 255, 255));
        l8.setBackground(new Color(255, 102, 102));
        l8.setBorder(null);
        // l8.getUI();
        l8.setBounds(450, 740, 60, 50);
        panel.add(l8);
        ImageIcon q1 = new ImageIcon(ClassLoader.getSystemResource("icons/Picture1.png"));
        Image q2 = q1.getImage().getScaledInstance(50, 40, Image.SCALE_DEFAULT);
        ImageIcon q3 = new ImageIcon(q2);
        JLabel d5 = new JLabel(q3);
        l8.setLayout(new BorderLayout());
        l8.add(d5, BorderLayout.CENTER);

        l9 = new JButton();
        l9.addActionListener(this);
        l8.setForeground(new Color(255, 255, 255));
        l9.setBorder(null);
        l9.setBounds(485, 10, 40, 50);
        panel.add(l9);
        ImageIcon pa1 = new ImageIcon(ClassLoader.getSystemResource("icons/close.jpg"));
        Image pa2 = pa1.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT);
        ImageIcon pa3 = new ImageIcon(pa2);
        JLabel da5 = new JLabel(pa3);
        l9.setLayout(new BorderLayout());
        l9.add(da5, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == l8) {
                try {
                    counter++;
                    counterLabel.setText(Integer.toString(counter));
                } catch (Exception e) {

                }
            }
            if (ae.getSource() == l7) {
                try {
                    new AddtoCart().setVisible(true);
                    dispose();
                } catch (Exception e) {

                }
            }
            if (ae.getSource() == l9) {
                try {
                    dispose();
                } catch (Exception e) {

                }
            }

        } catch (Exception e) {

        }
    }
}