import javax.swing.*;

public class MyFrame5 extends JFrame {
    private JButton button;
    private JLabel label;

    public MyFrame5(){
        this.setSize(300,200);
        this.setTitle("이벤트 예제");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        button = new JButton("버튼을 누르시오");
        label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
        button.addActionListener(e->{
            label.setText("마침내 버튼이 눌렸습니다.");
        });
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.setVisible(true);
    }
}
