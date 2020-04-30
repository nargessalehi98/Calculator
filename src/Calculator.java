import javax.swing.*;
import java.awt.*;

/**
 * this class present a Calculator GUI
 * @author Narges Salehi
 */
public class Calculator {
    //creat a new JFrame for calculator frame
    JFrame calcFrame;

    /**
     * creat a new Calculator
     */
    public Calculator() {
        //new JFrame
        calcFrame = new JFrame("AUTCalculator");
        //set size for frame
        calcFrame.setSize(400, 500);
        //set location of frame in your screen
        calcFrame.setLocation(550, 250);
        //make window not resizable
        calcFrame.setResizable(false);
        //set a layout for calculator
        calcFrame.setLayout(new GridLayout(2,0,0,0));
        calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //make window visible
        calcFrame.setVisible(true);
        //creat a new JPanel for standard calculator
        JPanel p1 = new JPanel();
        //set a layout for panel
        p1.setLayout(new GridLayout(5, 4));
        //creat a new JPanel for scientific calculator
        JPanel p2 = new JPanel();
        //set a layout for panel
        p2.setLayout(new GridLayout(5, 5));
        //creat a tab to add panels
        JTabbedPane Calc = new JTabbedPane();
        //set bounds of tab
        Calc.setBounds(0, 100, 400, 380);
        //add panels to tab
        Calc.add("Standard", p1);
        Calc.add("Scientific", p2);
        //creat a text area for showing result
        JTextArea display = new JTextArea();
        //make possible to write in text area
        display.setEditable(true);
        //set font size and type of words in text area
        display.setFont(new Font("Arial", Font.BOLD, 14));
        //creat a scroll for text area
        JScrollPane scrollPane = new JScrollPane(display);
        //make scroll for both horizontal and vertical
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //add scroll to frame
        calcFrame.getContentPane().add(scrollPane);
        //creating and adding buttons to each calculator
        JButton openBot = new JButton("(");
        p1.add(openBot);
        JButton closeBot = new JButton(")");
        p1.add(closeBot);
        JButton remBot = new JButton("%");
        p1.add(remBot);
        JButton clearBot = new JButton("C");
        p1.add(clearBot);
        JButton seven = new JButton("7");
        p1.add(seven);
        JButton eight = new JButton("8");
        p1.add(eight);
        JButton nine = new JButton("9");
        p1.add(nine);
        JButton divBot = new JButton("/");
        p1.add(divBot);
        JButton four = new JButton("4");
        p1.add(four);
        JButton five = new JButton("5");
        p1.add(five);
        JButton six = new JButton("6");
        p1.add(six);
        JButton mulBot = new JButton("*");
        p1.add(mulBot);
        JButton one = new JButton("1");
        p1.add(one);
        JButton two = new JButton("2");
        p1.add(two);
        JButton three = new JButton("3");
        p1.add(three);
        JButton subBot = new JButton("-");
        p1.add(subBot);
        JButton zeroBtn = new JButton("0");
        p1.add(zeroBtn);
        JButton dot = new JButton(".");
        p1.add(dot);
        JButton doBtn = new JButton("=");
        p1.add(doBtn);
        JButton sumBtn = new JButton("+");
        p1.add(sumBtn);
        //adding and creating buttons for scientific calculator
        //extra button of scientific calculator
        JButton eOrEuler = new JButton("e-π");
        JButton shift = new JButton("Shift");
        JButton sinOrCos = new JButton("sin-cos");
        JButton tanOrCot = new JButton("tan-cot");
        JButton expOrLog = new JButton("exp-log");
        p2.add(shift);
        JButton openBot2 = new JButton("(");
        p2.add(openBot2);
        JButton closeBot2 = new JButton(")");
        p2.add(closeBot2);
        JButton remBot2 = new JButton("%");
        p2.add(remBot2);
        JButton clearBot2 = new JButton("C");
        p2.add(clearBot2);
        p2.add(eOrEuler);
        JButton seven2 = new JButton("7");
        p2.add(seven2);
        JButton eight2 = new JButton("8");
        p2.add(eight2);
        JButton nine2 = new JButton("9");
        p2.add(nine2);
        JButton divBot2 = new JButton("/");
        p2.add(divBot2);
        p2.add(tanOrCot);
        JButton four2 = new JButton("4");
        p2.add(four2);
        JButton five2 = new JButton("5");
        p2.add(five2);
        JButton six2 = new JButton("6");
        p2.add(six2);
        JButton mulBot2 = new JButton("*");
        p2.add(mulBot2);
        p2.add(expOrLog);
        JButton one2 = new JButton("1");
        p2.add(one2);
        JButton two2 = new JButton("2");
        p2.add(two2);
        JButton three2 = new JButton("3");
        p2.add(three2);
        JButton subBot2 = new JButton("-");
        p2.add(subBot2);
        p2.add(sinOrCos);
        JButton zeroBtn2 = new JButton("0");
        p2.add(zeroBtn2);
        JButton dot2 = new JButton(".");
        p2.add(dot2);
        JButton doBtn2 = new JButton("=");
        p2.add(doBtn2);
        JButton sumBtn2 = new JButton("+");
        p2.add(sumBtn2);
        //add tab to frame
        calcFrame.add(Calc);
    }
}