import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBookQuote2 extends JFrame implements ActionListener {
    FlowLayout flow = new FlowLayout();
    JLabel msg1 = new  JLabel("To begin with,");
    JLabel msg2 = new JLabel("Marley was dead.");
    JButton button = new JButton("Click for source");
    JLabel msg3 = new JLabel("**    A Christmas Carol    **");
    public JBookQuote2() {
        //add controls to the frame
        add(msg1);
        add(msg2);
        add(button);
        add(msg3);
        setLayout(flow); //set flow layout for the frame
        msg3.setVisible(false);
        button.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //explicitly close the frame
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource().equals(button))
        {
            msg3.setVisible(true);
        }
    }
    public static void main(String[] args) {
        JBookQuote2 aFrame = new JBookQuote2();
        aFrame.setSize(260, 150);
        aFrame.setVisible(true);
    }
}