package software.ulpgc.kata3.swing;

import software.ulpgc.kata3.Histogram;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram(4,3,2,1,6,8,7,9,5,6,4,3,6,2,3,5);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
