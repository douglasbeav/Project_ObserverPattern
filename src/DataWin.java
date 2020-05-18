import javax.swing.*;
import java.awt.*;

public class DataWin implements Observer {

    private JLabel txtLabel;
    private JTextField txtField;

    public DataWin() {
        JFrame frame = new JFrame("Data window");
        frame.setLayout(new FlowLayout());
        txtField = new JTextField(10);
        txtField.setHorizontalAlignment(txtField.CENTER);
        txtField.setEditable(false);
        txtLabel = new JLabel("Stock in trade.");
        frame.add(txtLabel);
        frame.add(txtField);
        frame.setSize(215, 85);
        frame.setLocation(350, 100);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public void update(Subject s) {
        Stock l = (Stock) s;
        txtField.setText(String.valueOf(l.getStockIT()));
           // if(txtField.getText() < 100)
             //   txtField.setForeground(Color.red);


    }

}
