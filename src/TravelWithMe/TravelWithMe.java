import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TravelWithMe extends Result{

    Result cll = new Result(fare, discount, cash, ownmoney);

    String cb11[] = {"Please choose","jakjujak","Dusit","Pra Nakorn","norj jok"};
    String cb22[] = {"Please choose","MorSheet","Jom thorn","Phathum wan","Korn tuey"};
    String cb33[] = {"Please choose","YES","NO"};
    String cb44[] = {"Please choose","Only you","Couple","With Friends","Family"};

    TravelWithMe(double fare,double discount,double cash,double ownmoney) {
        super(fare,discount,cash,ownmoney);

        JFrame frame;
        frame = new JFrame("Travel with me company");

        JPanel panelfront,panelback,panelmixnmatch;
        panelfront = new JPanel();
        panelback = new JPanel();
        panelmixnmatch = new JPanel();

        JLabel l1,l2,l3,l4,l5;
        l1 = new JLabel("Transportation around Bangkok");
        l2 = new JLabel("Your current location");
        l3 = new JLabel("destination station");
        l4 = new JLabel("How many people?");
        l5 = new JLabel("Are you my member?");

        JLabel lb1,lb2,lb3,lb4,lb5,lbOP,lbownmoney;
        lb1 = new JLabel(" ");
        lb2 = new JLabel(" ");
        lb3 = new JLabel(" ");
        lb4 = new JLabel(" ");
        lb5 = new JLabel(" ");
        lbOP = new JLabel(" ");
        lbownmoney = new JLabel("");

        JComboBox cb1,cb2,cb3,cb4;
        cb1 = new JComboBox<>(cb11);
        cb2 = new JComboBox<>(cb22);
        cb3 = new JComboBox<>(cb44);
        cb4 = new JComboBox<>(cb33);
        cb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("Please choose"))
                {
                    lb1.setText("Please choose Your location ");
                }
                if(selected.toString().equals("jakjujak"))
                {
                    lb1.setText("Your current location is Jak ju jak ");
                }
                if(selected.toString().equals("Dusit"))
                {
                    lb1.setText("Your current location is Dusit");
                }
                if(selected.toString().equals("Pra Nakorn"))
                {
                    lb1.setText("Your current location is Pra Nakorn");
                }
                if(selected.toString().equals("norj jok"))
                {
                    lb1.setText("Your current location is Norj jok");
                }
            }
        });
        cb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("Please choose"))
                {
                    cll.setFare(0);
                    lb2.setText("Please choose your destination station");
                }
                if(selected.toString().equals("MorSheet"))
                {
                    cll.setFare(60);
                    lb2.setText("And you are going to MorSheet");
                }
                if(selected.toString().equals("Jom thorn"))
                {
                    cll.setFare(70);
                    lb2.setText("And you are going to Jom thorn");
                }
                if(selected.toString().equals("Phathum wan"))
                {
                    cll.setFare(80);
                    lb2.setText("And you are going to Phathum wan");
                }
                if(selected.toString().equals("Korn tuey"))
                {
                    cll.setFare(100);
                    lb2.setText("And you are going to Korn tuey");
                }
            }
        });
        cb3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("Please choose"))
                {
                    cll.fare = cll.fare;
                    lb3.setText("Please choose who you come with");
                    
                    
                }
                if(selected.toString().equals("Only you"))
                {
                    cll.fare = cll.fare + 0;
                    lb3.setText("You come alone");
                    
                    
                }
                if(selected.toString().equals("Couple"))
                {
                    cll.fare = cll.fare + 10;
                    lb3.setText("you come with your friend");
                    
                    
                }
                if(selected.toString().equals("With Friends"))
                {
                    cll.fare = cll.fare + 20;
                    lb3.setText("you come with your friends");
                    
                    
                }
                if(selected.toString().equals("Family"))
                {
                    cll.fare = cll.fare + 30;
                    lb3.setText("you come with family");
                    
                }

            }
        });
        cb4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                Object selected = comboBox.getSelectedItem();
                if(selected.toString().equals("Please choose"))
                {
                    lb4.setText("You don't have member discount");
                    cll.discount = 0;
                }
                if(selected.toString().equals("YES"))
                {
                    lb4.setText("Now you have member discount 10%");
                    cll.discount = cll.discountcal(cll.discount, cll.fare);
                }
                if(selected.toString().equals("NO"))
                {
                    lb4.setText("You don't have member discount");
                    cll.discount = 0;
                }
            }
        });
        Font fontB,FontS,fontmid;
        fontB = new Font("TH SarabunPSK",Font.BOLD,33);
        l1.setFont(fontB);
        FontS = new Font("TH SarabunPSK",Font.BOLD,15);
        l2.setFont(FontS);
        l3.setFont(FontS);
        l4.setFont(FontS);
        l5.setFont(FontS);
        fontmid = new Font("TH SarabunPSK",Font.BOLD,25);
        lb1.setFont(fontmid);
        lb2.setFont(fontmid);
        lb3.setFont(fontmid);
        lb4.setFont(fontmid);
        lb5.setFont(fontmid);
        lbOP.setFont(fontmid);
        lbownmoney.setFont(fontmid);
        CardLayout cl1;
        cl1 = new CardLayout();
        panelmixnmatch.setLayout(cl1);
        panelmixnmatch.add(panelfront,"1");
        panelmixnmatch.add(panelback,"2");

        JButton bconfirm,bback,bnext;
        bconfirm = new JButton("Confirm");
        bconfirm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                cll.cash = cll.fare -cll.discount;
                cll.ownmoney = cll.ownmoney - cll.cash;
                if(cll.ownmoney<=0){
                    lb5.setText("You have not enouge money");
                    lbOP.setText("");
                }
                else{
                lb5.setText(" "+cll.cash+" baht");
                lbOP.setText("Thanks for purchase");
                }
            }  
        });
        bback = new JButton("Back");
        bback.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cl1.show(panelmixnmatch,"1");
            }  
        });
        bnext = new JButton("next");
        bnext.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cl1.show(panelmixnmatch, "2");

            }
        });
       

        panelfront.setBackground(Color.pink);
        panelfront.setBorder(BorderFactory.createEmptyBorder(10, 100, 50, 100));
        panelfront.setLayout(new GridLayout(0,1));
        panelfront.add(l1);
        panelfront.add(l2);
        panelfront.add(cb1);
        panelfront.add(l3);
        panelfront.add(cb2);
        panelfront.add(l4);
        panelfront.add(cb4);
        panelfront.add(l5);
        panelfront.add(cb3);
        panelfront.add(bnext);

        panelback.setBackground(Color.pink);
        panelback.setBorder(BorderFactory.createEmptyBorder(10, 100, 50, 100));
        panelback.setLayout(new GridLayout(0,1));
        panelback.add(lb1);
        panelback.add(lb2);
        panelback.add(lb4);
        panelback.add(lb3);
        panelback.add(lb5);
        panelback.add(lbOP);
        panelback.add(bconfirm);
        panelback.add(bback);
        frame.add(panelmixnmatch);
        frame.setSize(560,480);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new TravelWithMe(0,0,0,500);
    }
    
}
