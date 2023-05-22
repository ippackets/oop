import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _25_colour_button implements ActionListener {
    public static JButton btn1;
    public static JLabel txt1;
    public static JButton btn2;
    public static JLabel txt2;
    public static JButton btn3;
    public static JLabel txt3;
    public static JButton btn4;
    public static JLabel txt4;
    public static JButton btn5;
    public static JLabel txt5;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(700, 500);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        btn1 = new JButton("All The Best");
        btn1.setBounds(50, 20, 150, 25);
        btn1.setForeground(Color.RED);
        btn1.addActionListener(new _25());
        panel.add(btn1);

        txt1 = new JLabel("All The Best");
        txt1.setBounds(100, 100, 150, 25);
        txt1.setForeground(Color.RED);
        panel.add(txt1);

        btn2 = new JButton("All The Best");
        btn2.setBounds(200, 20, 150, 25);
        btn2.setForeground(Color.pink);
        btn2.addActionListener(new _25());

        txt2 = new JLabel("All The Best");
        txt2.setBounds(200, 150, 150, 25);
        txt2.setForeground(Color.pink);
        panel.add(txt2);
        panel.add(btn2);

        btn3 = new JButton("All The Best");
        btn3.setBounds(350, 20, 150, 25);
        btn3.setForeground(Color.blue);
        btn3.addActionListener(new _25());

        txt3 = new JLabel("All The Best");
        txt3.setBounds(300, 200, 150, 25);
        txt3.setForeground(Color.blue);
        panel.add(txt3);

        panel.add(btn3);

        btn4 = new JButton("All The Best");
        btn4.setBounds(500, 20, 150, 25);
        btn4.setForeground(Color.green);
        btn4.addActionListener(new _25());

        txt4 = new JLabel("All The Best");
        txt4.setBounds(400, 250, 150, 25);
        txt4.setForeground(Color.green);
        panel.add(txt4);

        panel.add(btn4);

        btn5 = new JButton("All The Best");
        btn5.setBounds(275, 50, 150, 25);
        btn5.setForeground(Color.cyan);
        btn5.addActionListener(new _25());

        txt5 = new JLabel("All The Best");
        txt5.setBounds(500, 300, 150, 25);
        txt5.setForeground(Color.cyan);
        panel.add(btn5);
        panel.add(txt5);

        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        txt5.setVisible(false);
        frame.add(panel);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton[] btns = { btn1, btn2, btn3, btn4, btn5 };
        JLabel[] txts = { txt1, txt2, txt3, txt4, txt5 };
        for (int i = 0; i < 5; i++) {
            if (e.getSource() == btns[i]) {
                txts[i].setVisible(true);
            }
        }
    }
}

