import javax.swing.*;
import java.awt.*;
class MyFrame extends JFrame{
    public MyFrame(String title) throws Exception{
        super(title);
        setLayout(new GridLayout(1,2));
        add(new JButton("BURH BURH LMAO"));
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        p1.add(new JTextField("alo alo"), BorderLayout.NORTH);
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(4,3));
        for(int i=1;i<=9;i++){
            p2.add(new JButton(""+i));

        }
        p2.add(new JButton("0"));
        p2.add(new JButton("st"));
        p2.add(new JButton("ex"));
        p1.add(p2,BorderLayout.CENTER);
    }
}
public class Main {
    public static void main(String[] args) throws Exception{
        MyFrame f = new MyFrame("Test Test");
        f.setSize(600,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}