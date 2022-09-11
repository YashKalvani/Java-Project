/**
 * GUI hw2
 * @author Yash Kalvani
 * The program is about crypto market which lets user buy or sell his/her assets
 */



import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Color;

public class GUI extends JFrame implements ActionListener{
  JRadioButton bad,worse,worst;
  ButtonGroup bg;
  JTextField jtf;
  JCheckBox bcd, ccb, acb;
  JTextArea jta;
    public GUI(){
      UIManager UI = new UIManager();
      UI.put("OptionPane.background", Color.RED);
      Random random_code = new Random();
    	int color=random_code.nextInt(6);
    	String final_color;
      Border blackline = BorderFactory.createLineBorder(Color.black);
      setLayout(new BorderLayout(20,20));


      JPanel North = new JPanel();
      North.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));

      String checkcryptoprices[] ={ "BitCoin", "Solana", "Ethereum", "Ripple coin", "LiteCoin", "BUSD" };
      JComboBox<String> cb = new JComboBox<> (checkcryptoprices);
      cb.setBounds (50, 50, 90, 20);
      cb.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {       
      String data = cb.getItemAt(cb.getSelectedIndex());  
      if (data == "BitCoin"){
        JOptionPane.showMessageDialog(null,"BITcoiN CUrEnT PRicE is 20000 $"); 
      }
      else if (data == "Solana"){
        JOptionPane.showMessageDialog(null,"SoLAnA currENT PrICE is 500"); 
      }
      else if (data == "Ethereum"){
        JOptionPane.showMessageDialog(null,"ETHEReum CuRRent PeiCe is 10000$"); }
      else if (data == "Ripple coin"){
        JOptionPane.showMessageDialog(null," RIPple CUrreent PRice is 200 $"); }
      else if (data == "LiteCoin"){
        JOptionPane.showMessageDialog(null,"LiTeCOIN currENT PrICE is 1800 $"); }
      else if (data == "BUSD"){
        JOptionPane.showMessageDialog(null,"bUSD currENT PrICE is 300 $"); }}
      });
      North.add(cb);
      add(North, BorderLayout.NORTH);



      JPanel South = new JPanel (new FlowLayout(FlowLayout.RIGHT,10,3));
      add(South,BorderLayout.SOUTH);



      JPanel West  = new JPanel();
      West.setLayout(new GridLayout(0,2));
      West.add(new JLabel(new ImageIcon("crypto.jpeg")));
      JButton Buy1 = new JButton("BuY");
      JButton Sell1 = new JButton("SeL");
      Buy1.setBackground(Color.CYAN);
      Sell1.setBackground(Color.PINK);
      West.add(Buy1);
      West.add(Sell1);
      Buy1.addActionListener(this);
      Sell1.addActionListener(this);

      West.add(new JLabel(new ImageIcon("download.jpg")));
      JButton Buy2 = new JButton("BUi");
      JButton Sell2 = new JButton("SEll");
      Buy2.setBackground(Color.GRAY);
      Sell2.setBackground(Color.RED);
      West.add(Buy2);
      West.add(Sell2);
      Buy2.addActionListener(this);
      Sell2.addActionListener(this);
      
      West.add(new JLabel(new ImageIcon("solana.jpg")));
      JButton Buy3 = new JButton("buY");
      JButton Sell3 = new JButton("sel");
      Buy3.setBackground(Color.BLUE);
      Sell3.setBackground(Color.MAGENTA);
      West.add(Buy3);
      West.add(Sell3);
      Buy3.addActionListener(this);
      Sell3.addActionListener(this);
      
      West.add(new JLabel(new ImageIcon("ripple.png")));
      JButton Buy4 = new JButton("Bu");
      JButton Sell4 = new JButton("sELL");
      Buy4.setBackground(Color.DARK_GRAY);
      Sell4.setBackground(Color.ORANGE);
      West.add(Buy4);
      West.add(Sell4);
      Buy4.addActionListener(this);
      Sell4.addActionListener(this);
      
      West.add(new JLabel(new ImageIcon("download.png")));
      JButton Buy5 = new JButton("bUY");
      JButton Sell5 = new JButton("selll");
      Buy5.setBackground(Color.LIGHT_GRAY);
      Sell5.setBackground(Color.GREEN);
      West.add(Buy5);
      West.add(Sell5);
      Buy5.addActionListener(this);
      Sell5.addActionListener(this);
      
      West.add(new JLabel(new ImageIcon("BUSD.jpeg")));
      JButton Buy6 = new JButton("BUY BUY");
      JButton Sell6 = new JButton("SELLll");
      Buy6.setBackground(Color.CYAN);
      Sell6.setBackground(Color.BLACK);
      West.add(Buy6);
      West.add(Sell6);
      Buy6.addActionListener(this);
      Sell6.addActionListener(this);
      add(West, BorderLayout.WEST);

  


      West.setBorder(blackline);

      

      JPanel Center  = new JPanel();
      Center.setLayout(new GridLayout(1,2));
      ImageIcon gaphh= new ImageIcon("cryptograph.gif");
      Image scale = gaphh.getImage().getScaledInstance(940, 600, Image.SCALE_DEFAULT);
      Center.add(new JLabel(new ImageIcon(scale)));
      add(Center, BorderLayout.CENTER);




      JPanel East = new JPanel();
      East.setLayout(new FlowLayout(FlowLayout.RIGHT,10,10));
      JButton Wallet = new JButton("Wallet");
      Wallet.setBackground(Color.CYAN);
      East.add(Wallet);
      Wallet.addActionListener(this);
      add(East, BorderLayout.EAST);



      JMenu file  = new JMenu("File");
      JMenuBar menubar = new JMenuBar();
      JMenu submenu = new JMenu("Sub menu");
      setJMenuBar(menubar);
      file = new JMenu("File");
      JMenuItem exit = new JMenuItem("Exit");
      exit.addActionListener(this);
      file.add(exit);
      JMenuItem send = new JMenuItem("Send Crypto to your friends");
      submenu.add(send);
      JMenuItem receive = new JMenuItem("Receive Crypto from your friends");
      submenu.add(receive);
      JMenuItem help = new JMenuItem("help");
      submenu.add(help);
      send.addActionListener(this);
      receive.addActionListener(this);
      help.addActionListener(this);
      file.add(submenu);
      menubar.add(file);

  


      switch(color) {
        case 0: 
        South.setBackground(Color.yellow);
        West.setBackground(Color.yellow);
        North.setBackground(Color.yellow);
        Center.setBackground(Color.yellow);
        break;
        case 1: final_color="RED";
        South.setBackground(Color.red);
        West.setBackground(Color.red);
        North.setBackground(Color.red);
        Center.setBackground(Color.red);
        break;
        case 2: final_color="BLUE";
        South.setBackground(Color.blue);
        West.setBackground(Color.blue);
        North.setBackground(Color.blue);
        Center.setBackground(Color.blue);
        break;
        case 3: final_color="PINK";
        South.setBackground(Color.pink);
        West.setBackground(Color.pink);
        North.setBackground(Color.pink);
        Center.setBackground(Color.pink);
        break;
        case 4: final_color="GREEN";
        South.setBackground(Color.green);
        West.setBackground(Color.green);
        North.setBackground(Color.green);
        Center.setBackground(Color.green);
        break;
        case 5: final_color="BLACK";
        South.setBackground(Color.black);
        West.setBackground(Color.black);
        North.setBackground(Color.black);
        Center.setBackground(Color.black);
        break;
      }

    JButton review= new JButton("Review");
    JButton review1= new JButton("Review1");

    review.addActionListener(this);
    review1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e){
            review1.setBackground(Color.RED);
        }
        });

    South.add(review);
    East.add(review1);

      
      

    
    }
    
    /** 
     * @param ae
     */
    public void actionPerformed(ActionEvent ae) {
      String choice = ae.getActionCommand();
      if (choice.equals("Exit")) {
         System.exit(0);
      }
      if (ae.getActionCommand().equals("Review")) {
        JFrame newwindows=new JFrame("Review");
      JPanel newpanel=new JPanel();
      newpanel.setBackground(Color.CYAN);
      newpanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
      newpanel.setLayout(new GridLayout(0,1));
      newwindows.add(newpanel,BorderLayout.CENTER);
      newwindows.setSize(500,500);
      newwindows.setVisible(true);
      newwindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label=new JLabel("<html><h1>Review</h1><br><br>");
        newpanel.add(label);
  
      JButton newbutton=new JButton("Submit");
      newbutton.setBounds(10,100,40,30);
      newbutton.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              newwindows.dispose();
          }
      });
      
      bad = new JRadioButton ("worse");
      bad.setBounds(10,10,40,20);
      worse = new JRadioButton ("worse");
      worse.setBounds(10,25,40,20);
      worst = new JRadioButton ("worst");
      worst.setBounds(10,40,40,20);
      bg = new ButtonGroup ();
      bg.add (bad);
      bg.add (worse);
      bg.add(worst);

  
      JLabel jl = new JLabel ("Enter your name");
      jl.setBounds(40,10,100,20);
      jtf = new JTextField (10);
      jtf.setBounds(50,10,100,20);
      JLabel jl1 = new JLabel ("Enter your review here:");
      jl1.setBounds(60,10,100,20);
      jta = new JTextArea (5, 20);
      jta.setBounds(70,10,100,20);
      newpanel.add (bad);
      newpanel.add (worse);
      newpanel.add (worst);
      newpanel.add (jl);
      newpanel.add (jtf);
      newpanel.add (jl1);
      newpanel.add (jta);
      newpanel.add (newbutton);
      }
      if (ae.getActionCommand().equals("Send Crypto to your friends")){
        JOptionPane.showMessageDialog(null, "This service is not available right now");
      }
      if (ae.getActionCommand().equals("Receive Crypto from your friends")){
        JOptionPane.showMessageDialog(null, "This service is not available right now");
      }
      if (ae.getActionCommand().equals("help")){
        JOptionPane.showMessageDialog(null, "Sorry you are on your own (Evil laugh haha)");
      }
      if(ae.getActionCommand().equals("BuY")){
        int yes1 = JOptionPane.showConfirmDialog(null, "Buy Bitcoin?");
        if(yes1 == JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        }
        int yes2= JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        if(yes2 == JOptionPane.YES_OPTION)
        {
          ImageIcon hack = new ImageIcon("Hacked.jpg");
          JOptionPane.showMessageDialog(null,"You have been hacked", "image", JOptionPane.INFORMATION_MESSAGE,hack);
        }
      }
      if(ae.getActionCommand().equals("SeL")){
        int sel1 = JOptionPane.showConfirmDialog(null, "Sell Bitcoin?");
        if(sel1==JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        }
        int sel2 = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        if(sel2 == JOptionPane.YES_OPTION)
        {
          ImageIcon dip = new ImageIcon("sellcrypto.gif");
          JOptionPane.showMessageDialog(null,"SOLD", "sell", JOptionPane.INFORMATION_MESSAGE,dip);
        }
      }
      if(ae.getActionCommand().equals("BUi")){
        int yes3 =JOptionPane.showConfirmDialog(null, "Buy Ethereum?");
        if(yes3 == JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        }
        int yes4= JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        if(yes4 == JOptionPane.YES_OPTION)
        {
          ImageIcon hack = new ImageIcon("Hacked.jpg");
          JOptionPane.showMessageDialog(null,"You have been hacked", "image", JOptionPane.INFORMATION_MESSAGE,hack);
        }
      }
      if(ae.getActionCommand().equals("SEll")){
        int sel3=JOptionPane.showConfirmDialog(null, "Sell Ethereum");
        if(sel3==JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        }
        int sel4 = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        if(sel4 == JOptionPane.YES_OPTION)
        {
          ImageIcon dip = new ImageIcon("sellcrypto.gif");
          JOptionPane.showMessageDialog(null,"SOLD", "sell", JOptionPane.INFORMATION_MESSAGE,dip);
        }
      }
      if(ae.getActionCommand().equals("buY")){
        int yes5=JOptionPane.showConfirmDialog(null, "Buy Solana?");
        if(yes5 == JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        }
        int yes6= JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        if(yes6 == JOptionPane.YES_OPTION)
        {
          ImageIcon hack = new ImageIcon("Hacked.jpg");
          JOptionPane.showMessageDialog(null,"You have been hacked", "image", JOptionPane.INFORMATION_MESSAGE,hack);
        }
      }
      if(ae.getActionCommand().equals("sel")){
        int sel5=JOptionPane.showConfirmDialog(null, "Sell Solana?");
        if(sel5==JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        }
        int sel6 = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        if(sel6 == JOptionPane.YES_OPTION)
        {
          ImageIcon dip = new ImageIcon("sellcrypto.gif");
          JOptionPane.showMessageDialog(null,"SOLD", "sell", JOptionPane.INFORMATION_MESSAGE,dip);
        }
      }
      if(ae.getActionCommand().equals("Bu")){
        int yes7= JOptionPane.showConfirmDialog(null, "Buy Ripple coin?");
        if(yes7 == JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        }
        int yes8= JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        if(yes8 == JOptionPane.YES_OPTION)
        {
          ImageIcon hack = new ImageIcon("Hacked.jpg");
          JOptionPane.showMessageDialog(null,"You have been hacked", "image", JOptionPane.INFORMATION_MESSAGE,hack);
        }
      }
      if(ae.getActionCommand().equals("sELL")){
        int sel7=JOptionPane.showConfirmDialog(null, "Sell Ripple Coin");
        if(sel7==JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        }
        int sel8 = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        if(sel8 == JOptionPane.YES_OPTION)
        {
          ImageIcon dip = new ImageIcon("sellcrypto.gif");
          JOptionPane.showMessageDialog(null,"SOLD", "sell", JOptionPane.INFORMATION_MESSAGE,dip);
        }
      }
      if(ae.getActionCommand().equals("bUY")){
        int yes9=JOptionPane.showConfirmDialog(null, "Buy Litecoin?");
        if(yes9 == JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        }
        int yes10= JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        if(yes10 == JOptionPane.YES_OPTION)
        {
          ImageIcon hack = new ImageIcon("Hacked.jpg");
          JOptionPane.showMessageDialog(null,"You have been hacked", "image", JOptionPane.INFORMATION_MESSAGE,hack);
        }
      }
      if(ae.getActionCommand().equals("selll")){
        int sel9=JOptionPane.showConfirmDialog(null, "Sell Litecoin?");
        if(sel9==JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        }
        int sel10 = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        if(sel10 == JOptionPane.YES_OPTION)
        {
          ImageIcon dip = new ImageIcon("sellcrypto.gif");
          JOptionPane.showMessageDialog(null,"gone", "SOLD", JOptionPane.INFORMATION_MESSAGE,dip);
        }
      }
      if(ae.getActionCommand().equals("BUY BUY")){
        int yes11=JOptionPane.showConfirmDialog(null, "Buy BUSD?");
        if(yes11 == JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        }
        int yes12= JOptionPane.showConfirmDialog(null, "Are you sure you want to buy more?");
        if(yes12 == JOptionPane.YES_OPTION)
        {
          ImageIcon hack = new ImageIcon("Hacked.jpg");
          JOptionPane.showMessageDialog(null,"hacked", "you have been hacked", JOptionPane.INFORMATION_MESSAGE,hack);
        }
      }
      if(ae.getActionCommand().equals("SELLll")){
        int sel11=JOptionPane.showConfirmDialog(null, "Sell BUSD?");
        if(sel11==JOptionPane.YES_OPTION)
        {
          JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        }
        int sel2 = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell?");
        if(sel2 == JOptionPane.YES_OPTION)
        {
          ImageIcon dip = new ImageIcon("sellcrypto.gif");
          JOptionPane.showMessageDialog(null,"gone", "sell", JOptionPane.INFORMATION_MESSAGE,dip);
        }
      }
      if(ae.getActionCommand().equals("Wallet")){
        String y = JOptionPane.showInputDialog( null,"Enter username", "Login", JOptionPane.QUESTION_MESSAGE);
        String k =JOptionPane.showInputDialog( null,"Enter password", "Login", JOptionPane.QUESTION_MESSAGE);
        String u = "";
        String p = "";
        if(y.equals(u) & k.equals(p)){
          JOptionPane.showMessageDialog(null, "Welcome");
        }
        if(!(y.equals(u))) {
          JOptionPane.showMessageDialog(null, "Error");
        }
        if(!(y.equals(p))) {
          JOptionPane.showMessageDialog(null, "Error");
        }
      }

}
}