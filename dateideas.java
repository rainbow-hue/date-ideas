import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Color;

class dateideas implements ActionListener {
    JFrame f = new JFrame("<3");
    JTextField tf = new JTextField("");
    JLabel l = new JLabel("cute date ideas ;)");
    String s;
    int x = 0;

    dateideas() {
        f.setSize(320, 180);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.getContentPane().setBackground(Color.WHITE);

        tf.setEditable(false);
        tf.setBounds(10, 50, 280, 80);
        tf.setBackground(Color.CYAN);
        tf.setFont(new Font("Arial", Font.ITALIC, 12));
        tf.setText("mhmm");

        l.setBounds(10, 10, 140, 30);
        l.setFont(new Font("Arial", Font.BOLD, 15));

        JButton t = new JButton("change");
        t.setBounds(200, 10, 90, 30);
        t.addActionListener(this);

        f.add(tf);
        f.add(t);
        f.add(l);

        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("change")) {
            if (x == 0) {
                x++;
                tf.setText("go on a picnic to watch the sunset together :p");
            }
            else if (x == 1) {
                x++;
                tf.setText("go to a restaurant you never have been to before.");
            }
            else if (x == 2) {
                x++;
                tf.setText("roam around at night hand in hand :)))");
            }
            else if (x == 3) {
                x++;
                tf.setText("go arcade gaming. its fun.");
            }
            else if (x == 4) {
                x++;
                tf.setText("its always a date if the two are together and in love.");
            }
            else if (x == 5) {
                x = 0;
                tf.setText("lay in bed together and cuddle all night :)))");
            }
        }
    }
    
    public static void main(String[] args) {
        new dateideas();
    }
}