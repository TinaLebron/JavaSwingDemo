import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{



    /*計算機的寬*/
    private static final int WIDTH = 230;

    /*計算機的高*/
    private static final int HEIGHT = 350;

    JPanel panel;
    private JButton clearBtn;
    private JButton number7_Btn;
    private JButton number9_Btn;
    private JButton number4_Btn;
    private JButton number5_Btn;
    private JButton number6_Btn;
    private JButton number1_Btn;
    private JButton number2_Btn;
    private JButton number3_Btn;
    private JButton number0_Btn;
    private JButton dot_Btn;
    private JButton equal_Btn;
    private JButton subtract_Btn;
    private JButton add_Btn;
    private JButton multiply_Btn;
    private JButton divide_Btn;
    private JButton percentage_Btn;
    private JButton number8_Btn;
    private JButton sign_Btn;
    private JLabel display_Lbl;

    public  Main(){
        setTitle("yes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        add(panel);







        number0_Btn.addActionListener(new Action());
        number1_Btn.addActionListener(new Action());
        number2_Btn.addActionListener(new Action());
        number3_Btn.addActionListener(new Action());
        number4_Btn.addActionListener(new Action());
        number5_Btn.addActionListener(new Action());
        number6_Btn.addActionListener(new Action());
        number7_Btn.addActionListener(new Action());
        number8_Btn.addActionListener(new Action());
        number9_Btn.addActionListener(new Action());




    }


     class Action implements ActionListener {

         @Override
         public void actionPerformed(ActionEvent e) {
             Object object = e.getSource();
             JButton jButton = (JButton)object; //向下轉型
             String text = jButton.getText();

             display_Lbl.setText(text);



         }
     }














    public static void main(String[] args){

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main();
                main.setVisible(true);


            }
        });

    }


}

