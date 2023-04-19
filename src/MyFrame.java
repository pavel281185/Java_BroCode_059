import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField textField;
    JButton button;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250, 40));
        textField.setFont(new Font("Consolas", Font.PLAIN,35));
        textField.setForeground(new Color(25,25,25));
        textField.setBackground(Color.gray);
        textField.setCaretColor(Color.white);
        textField.setText("username");


        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        this.add(textField);
        this.add(button);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==button){
    System.out.println(textField.getText());
    button.setEnabled(false);
    textField.setEditable(false);
}
    }
}
