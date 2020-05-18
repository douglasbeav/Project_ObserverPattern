import javax.swing.*;
import java.awt.*;
public class GraphicWin implements Observer {

    private JSlider slider;

    public GraphicWin() {
        JFrame frame = new JFrame("Graphic window");
        frame.setLayout(new FlowLayout());
        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 1000, 0);
        slider.setMajorTickSpacing(250);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        frame.add(slider);
        frame.setSize(215, 85);
        frame.setLocation(350, 200);
        frame.setResizable(false);
        frame.setVisible(true);

    }

    public void update(Subject s) {
        Stock l = (Stock) s;
        slider.setValue(l.getStockIT());
    }
}