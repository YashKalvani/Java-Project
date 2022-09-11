import javax.swing.JFrame;

public class test {
    public static void main(String[] args){
        GUI jfMain = new GUI();
        jfMain.setTitle("Crypto Market");
        jfMain.setSize(400, 250);
        jfMain.setLocationRelativeTo( null ); 
        jfMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfMain.setVisible(true);
        }
} 