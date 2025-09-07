import java.awt.*;
import java.awt.event.*;
public class ButtonListener implements ActionListener{
    Frame f;
    TextField tf;
    Button b;

    public ButtonListener() {
        f= new Frame("Action Listener Example");
        tf= new TextField();
        tf.setBounds(50,50,150,20);
        b = new Button("Click me");
        b.setBounds(50,100,60,30);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome to Javatpoint.");
    }
    public static void main(String[] args) {
        new ButtonListener();
        
    }
}
