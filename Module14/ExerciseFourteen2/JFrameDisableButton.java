import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JFrameDisableButton extends JFrame implements ActionListener {
    final int SIZE = 180;
    Container con = getContentPane();
    JButton button = new JButton("Press Me");
    int count = 0;
    final int MAX = 8;
    JLabel label = new JLabel("That's enough!");
    public JFrameDisableButton()
    {
        con.setLayout(new FlowLayout());
        //Adding action listener
        button.addActionListener(this);
        //Adding to pane
        con.add(button);
        con.add(label);
        //Setting visibility
        label.setVisible(false);
        //Set title
        setTitle("----");
        pack();
        setVisible(true); //allows the frame to be visible
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Incrementing count
        count += 1;
        //Checking count
        if(count == 8)
        {
            //Updating visibility
            label.setVisible(true);
            button.setEnabled(false);
        }
    }
    public static void main(String[] args)
    {
        JFrameDisableButton frame =
                new JFrameDisableButton();
    }
}
