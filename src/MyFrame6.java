import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame6 extends JFrame{
    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public MyFrame6(){
        this.setTitle("이벤트 예제");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        button1 = new JButton("노란색");
        button1.addActionListener(new MyListener2());
        panel.add(button1);
        button2 = new JButton("핑크색");
        button2.addActionListener(new MyListener2());
        panel.add(button2);

        this.add(panel);
        this.setVisible(true);
    }

    private class MyListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==button1){
                panel.setBackground(Color.YELLOW);
            }
            else if(e.getSource()==button2){
                panel.setBackground(Color.PINK);
            }
        }
    }
}
