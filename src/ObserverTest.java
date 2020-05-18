import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ObserverTest {
    private JLabel txtLabel;
    private JTextField txtField;  private DataWin dataWin;
    private Stock stock;          private GraphicWin graphicWin;
    //private ManagerWin managerWin;

    public ObserverTest() {
        JFrame frame = new JFrame("Stock");

        // construct the business model (Subject) - one class (Stock)
        stock = new Stock();

        // make the windows (Observers), which in different
        // ways shows the state in the business (Subject)
        dataWin = new DataWin();       stock.attach(dataWin);
        graphicWin = new GraphicWin(); stock.attach(graphicWin);
        //managerWin = new ManagerWin(); stock.attach(managerWin);

        // make main window, which updates the state of the business model
        frame.setLayout(new FlowLayout());
        txtLabel = new JLabel(" Input stock in trade: ");
        frame.add(txtLabel);
        txtField = new JTextField(10);
        txtField.setHorizontalAlignment(txtField.CENTER);
        frame.add(txtField);
        txtField.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stock.setStockIT(Integer.parseInt(txtField.getText()));
            }
        } );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(225,95); frame.setLocation(95,95);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // make main window
        ObserverTest obsAnv = new ObserverTest();
        System.out.println("Hello");
    }
}

