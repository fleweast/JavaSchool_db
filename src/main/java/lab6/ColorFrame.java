package lab6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {

    public ColorFrame(int counter) throws HeadlessException {
        Counter changingCounter = new Counter(counter);
        setSize(500,500);
        JButton button = new JButton("click me to be red");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(changingCounter.Increase(1));
            }
        });

        getContentPane().add(button, BorderLayout.NORTH);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class Counter {
        private int value;
        public int Increase(int num) {
            value+= num;
            return value;
        }
        Counter (int counter) {
            this.value = counter;
        }
    }

    public static void main(String[] args) {
        new ColorFrame(10);
    }
}
