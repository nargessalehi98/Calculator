import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * this class present a Calculator GUI
 *
 * @author Narges Salehi
 */
public class View extends Model {
    //creat a new JFrame for calculator frame
    JFrame window;
    //creat a new JPanel for standard calculator
    JPanel p1 = new JPanel();
    //creat a new JPanel for scientific calculator
    JPanel p2 = new JPanel();
    //creat a tab to add panels
    JTabbedPane Switch = new JTabbedPane();
    //creat a text area for showing result
    JTextArea display = new JTextArea();
    //an item for exit program
    JMenuItem exit;
    //am item to copy what is in text area
    JMenuItem copy;
    //Buttons
    JButton openBot = new JButton("(");
    JButton closeBot = new JButton(")");
    JButton remBot = new JButton("%");
    JButton clearBot = new JButton("C");
    JButton seven = new JButton("7");
    JButton eight = new JButton("8");
    JButton nine = new JButton("9");
    JButton divBot = new JButton("/");
    JButton four = new JButton("4");
    JButton five = new JButton("5");
    JButton six = new JButton("6");
    JButton mulBot = new JButton("*");
    JButton one = new JButton("1");
    JButton two = new JButton("2");
    JButton three = new JButton("3");
    JButton subBot = new JButton("-");
    JButton zeroBtn = new JButton("0");
    JButton dot = new JButton(".");
    JButton equalBtn = new JButton("=");
    JButton sumBtn = new JButton("+");
    //extra button of scientific calculator
    JButton eOrEuler = new JButton("e-π");
    JButton shift = new JButton("Shift");
    JButton sinOrCos = new JButton("sin-cos");
    JButton tanOrCot = new JButton("tan-cot");
    JButton expOrLog = new JButton("exp-log");
    JButton openBot2 = new JButton("(");
    JButton closeBot2 = new JButton(")");
    JButton remBot2 = new JButton("%");
    JButton clearBot2 = new JButton("C");
    JButton seven2 = new JButton("7");
    JButton eight2 = new JButton("8");
    JButton nine2 = new JButton("9");
    JButton divBot2 = new JButton("/");
    JButton four2 = new JButton("4");
    JButton five2 = new JButton("5");
    JButton six2 = new JButton("6");
    JButton mulBot2 = new JButton("*");
    JButton one2 = new JButton("1");
    JButton two2 = new JButton("2");
    JButton three2 = new JButton("3");
    JButton subBot2 = new JButton("-");
    JButton zeroBtn2 = new JButton("0");
    JButton equalBtn2 = new JButton("=");
    JButton sumBtn2 = new JButton("+");
    JButton dot2 = new JButton(".");

    /**
     * creat a new Calculator
     */
    public View() {
        super();
        //new JFrame
        window = new JFrame("AUTCalculator");
        //set size for frame
        window.setSize(400, 500);
        //set location of frame in your screen
        window.setLocation(550, 250);
        //make window not resizable
        window.setResizable(false);
        //set a layout for calculator
        window.setLayout(new GridBagLayout());
        //set location of first component
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;
        gbc.weighty = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //creat a JMenuBar
        JMenuBar jMenuBar = new JMenuBar();
        //creat a JMenu
        JMenu jMenu = new JMenu("File");
        //set a mnemonic Alt+f
        jMenu.setMnemonic('f');
        //creat Item for menu
        exit = new JMenuItem("Exit");
        copy = new JMenuItem("Copy");
        //set accelerator for items
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.SHIFT_MASK));
        copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.SHIFT_MASK));
        //creat a new handler for JMenuBar
        jMenuHandler jMenuHandler = new jMenuHandler();
        //add handler to items
        exit.addActionListener(jMenuHandler);
        copy.addActionListener(jMenuHandler);
        //add items to JMenu
        jMenu.add(exit);
        jMenu.add(copy);
        //add menu to JMenuBar
        jMenuBar.add(jMenu);
        //add JMenuBar to JFrame with given gbc
        window.add(jMenuBar, gbc);
        //make window visible
        window.setVisible(true);
        //set a layout for panel
        p1.setLayout(new GridLayout(5, 4));
        //set a layout for panel
        p2.setLayout(new GridLayout(5, 5));
        //set bounds of tab
        Switch.setBounds(0, 100, 400, 380);
        //add panels to tab
        Switch.add("Standard", p1);
        Switch.add("Scientific", p2);
        //make not possible to write in text area
        display.setEditable(false);
        display.setPreferredSize(new Dimension(0, 10));
        display.setToolTipText("Display");
        //set font size and type of words in text area
        display.setFont(new Font("Arial", Font.BOLD, 14));
        //make scroll for both horizontal and vertical
        //creat a scroll for text area
        JScrollPane scrollPane = new JScrollPane(display);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        //add scroll to frame
        //set location fot second component
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weightx = 1;
        gbc.weighty = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        window.getContentPane().add(scrollPane, gbc);
        //creat a new handler for buttons
        ButtonClickHandler handler = new ButtonClickHandler();
        //creating and adding buttons to each calculator - adding handler to buttons - also set tool tip text
        p1.add(openBot);
        openBot.addActionListener(handler);
        openBot.setToolTipText("Parentheses");
        p1.add(closeBot);
        closeBot.setToolTipText("Parentheses");
        closeBot.addActionListener(handler);
        p1.add(remBot);
        remBot.setToolTipText("Remaining");
        remBot.addActionListener(handler);
        p1.add(clearBot);
        clearBot.setToolTipText("Clear");
        clearBot.addActionListener(handler);
        p1.add(seven);
        seven.setToolTipText("Number 7");
        seven.addActionListener(handler);
        p1.add(eight);
        eight.setToolTipText("Number 8");
        eight.addActionListener(handler);
        p1.add(nine);
        nine.setToolTipText("Number 9");
        nine.addActionListener(handler);
        p1.add(divBot);
        divBot.setToolTipText("Division");
        divBot.addActionListener(handler);
        p1.add(four);
        four.setToolTipText("Number 4");
        four.addActionListener(handler);
        p1.add(five);
        five.setToolTipText("number 5");
        five.addActionListener(handler);
        p1.add(six);
        six.setToolTipText("Number 6");
        six.addActionListener(handler);
        p1.add(mulBot);
        mulBot.setToolTipText("Multiplier");
        mulBot.addActionListener(handler);
        p1.add(one);
        one.setToolTipText("Number 1");
        one.addActionListener(handler);
        p1.add(two);
        two.setToolTipText("Number 2");
        two.addActionListener(handler);
        p1.add(three);
        three.setToolTipText("Number 3");
        three.addActionListener(handler);
        p1.add(subBot);
        subBot.setToolTipText("Subtraction");
        subBot.addActionListener(handler);
        p1.add(zeroBtn);
        zeroBtn.setToolTipText("Number 0");
        zeroBtn.addActionListener(handler);
        p1.add(dot);
        dot.setToolTipText("Dot");
        dot.addActionListener(handler);
        p1.add(equalBtn);
        equalBtn.setToolTipText("Equal");
        equalBtn.addActionListener(handler);
        p1.add(sumBtn);
        sumBtn.setToolTipText("Sub");
        sumBtn.addActionListener(handler);
        //adding and creating buttons for scientific calculator
        p2.add(shift);
        shift.setToolTipText("Shift");
        shift.addActionListener(handler);
        p2.add(openBot2);
        openBot2.addActionListener(handler);
        p2.add(closeBot2);
        closeBot2.addActionListener(handler);
        p2.add(remBot2);
        remBot2.addActionListener(handler);
        p2.add(clearBot2);
        clearBot2.addActionListener(handler);
        p2.add(eOrEuler);
        eOrEuler.addActionListener(handler);
        p2.add(seven2);
        seven2.addActionListener(handler);
        p2.add(eight2);
        eight2.addActionListener(handler);
        p2.add(nine2);
        nine2.addActionListener(handler);
        p2.add(divBot2);
        divBot2.addActionListener(handler);
        p2.add(tanOrCot);
        tanOrCot.addActionListener(handler);
        p2.add(four2);
        four2.addActionListener(handler);
        p2.add(five2);
        five2.addActionListener(handler);
        p2.add(six2);
        six2.addActionListener(handler);
        p2.add(mulBot2);
        mulBot2.addActionListener(handler);
        p2.add(expOrLog);
        expOrLog.addActionListener(handler);
        p2.add(one2);
        one2.addActionListener(handler);
        p2.add(two2);
        two2.addActionListener(handler);
        p2.add(three2);
        three2.addActionListener(handler);
        p2.add(subBot2);
        subBot2.addActionListener(handler);
        p2.add(sinOrCos);
        sinOrCos.addActionListener(handler);
        p2.add(zeroBtn2);
        zeroBtn2.addActionListener(handler);
        p2.add(dot2);
        dot2.addActionListener(handler);
        p2.add(equalBtn2);
        equalBtn2.addActionListener(handler);
        p2.add(sumBtn2);
        sumBtn2.addActionListener(handler);
        //add tab to frame with new location
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1;
        gbc.weighty = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        window.add(Switch, gbc);
        //make text area focused
        display.requestFocusInWindow();
        display.setFocusable(true);
        //creat a new handler
        ButtonKeyboardHandler handler1 = new ButtonKeyboardHandler();
        //add handler to text area
        display.addKeyListener(handler1);
    }

    /**
     * this class manage buttons on Calculator
     */
    private class ButtonClickHandler implements ActionListener {
        @Override
        /**
         * perform each button action
         */
        public void actionPerformed(ActionEvent e) {
            //check if button 1 has pressed
            if (e.getSource().equals(one) || e.getSource().equals(one2)) {
                //check if an operator has pressed befor
                if (hasOperation) {
                    //make text area empty for new number
                    display.setText("");
                    //make hasOperation Boolean false
                    hasOperation = false;
                }
                //check if its first digit of number - handel out of bounds exception
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                //this double keep numbers value
                Double temp = numbers.get(indexOfNum) * 10 + 1;
                //update number and add it again
                numbers.add(indexOfNum, temp);
                //show number on text area
                display.setText(String.valueOf(temp));

                //same as before fot all other buttons
            } else if (e.getSource().equals(two) || e.getSource().equals(two2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                Double temp = numbers.get(indexOfNum) * 10 + 2;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(three) || e.getSource().equals(three2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                double temp = numbers.get(indexOfNum) * 10 + 3;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(four) || e.getSource().equals(four2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                double temp = numbers.get(indexOfNum) * 10 + 4;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(five) || e.getSource().equals(five2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                double temp = numbers.get(indexOfNum) * 10 + 5;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(six) || e.getSource().equals(six2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                double temp = numbers.get(indexOfNum) * 10 + 6;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(seven) || e.getSource().equals(seven2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                double temp = numbers.get(indexOfNum) * 10 + 7;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(eight) || e.getSource().equals(eight2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                double temp = numbers.get(indexOfNum) * 10 + 8;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(nine) || e.getSource().equals(nine2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                double temp = numbers.get(indexOfNum) * 10 + 9;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(zeroBtn) || e.getSource().equals(zeroBtn2)) {
                if (hasOperation) {
                    display.setText("");
                    hasOperation = false;
                }
                if (firstTime) {
                    numbers.add(indexOfNum, 0.0);
                    firstTime = false;
                }
                double temp = numbers.get(indexOfNum) * 10;
                numbers.add(indexOfNum, temp);
                display.setText(String.valueOf(temp));
            } else if (e.getSource().equals(shift)) {
                if (shiftfalg == 0)
                    shiftfalg = 1;
                else
                    shiftfalg = 0;

            }
            //check if we can add operator - at least one number has added
            else if (numbers.size() != 0) {
                //check if its sum button
                if (e.getSource().equals(sumBtn) || e.getSource().equals(sumBtn2)) {
                    //count index of number - next number is a new number
                    indexOfNum++;
                    //next digit is first digit
                    firstTime = true;
                    //it has operation before
                    hasOperation = true;
                    //add operation
                    operations.add('+');
                }
                //same for other operation buttons
                else if (e.getSource().equals(subBot) || e.getSource().equals(subBot2)) {
                    indexOfNum++;
                    firstTime = true;
                    hasOperation = true;
                    operations.add('-');
                } else if (e.getSource().equals(divBot) || e.getSource().equals(divBot2)) {
                    indexOfNum++;
                    firstTime = true;
                    hasOperation = true;
                    operations.add('/');
                } else if (e.getSource().equals(remBot) || e.getSource().equals(remBot2)) {
                    indexOfNum++;
                    firstTime = true;
                    hasOperation = true;
                    operations.add('%');
                } else if (e.getSource().equals(mulBot) || e.getSource().equals(mulBot2)) {
                    indexOfNum++;
                    firstTime = true;
                    hasOperation = true;
                    operations.add('*');
                    System.out.println(operations);
                } else if (e.getSource().equals(sinOrCos)) {
                    if (shiftfalg == 0)
                        operations.add('s');
                    else {
                        operations.add('c');
                    }
                    indexOfNum++;
                    firstTime = true;
                    hasOperation = true;

                } else if (e.getSource().equals(equalBtn) || e.getSource().equals(equalBtn2)) {
                    indexOfNum++;
                    firstTime = true;
                    hasOperation = true;
                    operations.add('=');
                    display.setText(operation());
                    //after counting result call Model class constructor to reset data
                    numbers = new ArrayList<Double>();
                    operations = new ArrayList<Character>();
                    result = 0;
                    indexOfNum = 0;
                    indexOfOpe = 0;
                    text = "";
                    firstTime = true;
                    hasOperation = false;
                }
            }
        }
    }

    /**
     * manage buttons on JMenu
     */
    private class jMenuHandler implements ActionListener {

        @Override
        /**
         * perform JItem actions
         */
        public void actionPerformed(ActionEvent e) {
            //exit item exit program
            if (e.getSource().equals(exit)) {
                System.exit(0);
            }
            //copy text area content
            if (e.getSource().equals(copy)) {
                display.selectAll();
                display.copy();
            }
        }
    }

    /**
     * manage keyboard event
     */
    private class ButtonKeyboardHandler implements KeyListener {
        //this boolean check if shift button has pressed
        boolean Shift;

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        /*
          check which button has pressed
         */
        public void keyPressed(KeyEvent e) {
            //get event keyCode
            int keyCode = e.getKeyCode();
            //do for each case - like  action listener
            switch (keyCode) {

                case KeyEvent.VK_SHIFT:
                    Shift = true;
                    break;

                case KeyEvent.VK_0:
                    if (hasOperation) {
                        display.setText("");
                        hasOperation = false;
                    }
                    if (firstTime) {
                        numbers.add(indexOfNum, 0.0);
                        firstTime = false;
                    }
                    double temp = numbers.get(indexOfNum) * 10;
                    numbers.add(indexOfNum, temp);
                    display.setText(String.valueOf(temp));
                    break;

                case KeyEvent.VK_1:
                    if (hasOperation) {
                        display.setText("");
                        hasOperation = false;
                    }
                    if (firstTime) {
                        numbers.add(indexOfNum, 0.0);
                        firstTime = false;
                    }
                    temp = numbers.get(indexOfNum) * 10 + 1;
                    numbers.add(indexOfNum, temp);
                    display.setText(String.valueOf(temp));
                    break;

                case KeyEvent.VK_2:
                    if (hasOperation) {
                        display.setText("");
                        hasOperation = false;
                    }
                    if (firstTime) {
                        numbers.add(indexOfNum, 0.0);
                        firstTime = false;
                    }
                    temp = numbers.get(indexOfNum) * 10 + 2;
                    numbers.add(indexOfNum, temp);
                    display.setText(String.valueOf(temp));
                    break;

                case KeyEvent.VK_3:
                    if (hasOperation) {
                        display.setText("");
                        hasOperation = false;
                    }
                    if (firstTime) {
                        numbers.add(indexOfNum, 0.0);
                        firstTime = false;
                    }
                    temp = numbers.get(indexOfNum) * 10 + 3;
                    numbers.add(indexOfNum, temp);
                    display.setText(String.valueOf(temp));
                    break;

                case KeyEvent.VK_4:
                    if (hasOperation) {
                        display.setText("");
                        hasOperation = false;
                    }
                    if (firstTime) {
                        numbers.add(indexOfNum, 0.0);
                        firstTime = false;
                    }
                    temp = numbers.get(indexOfNum) * 10 + 4;
                    numbers.add(indexOfNum, temp);
                    display.setText(String.valueOf(temp));
                    break;

                case KeyEvent.VK_5:
                    if (Shift) {
                        indexOfNum++;
                        firstTime = true;
                        hasOperation = true;
                        operations.add('%');
                        Shift = false;
                        break;
                    } else {
                        if (hasOperation) {
                            display.setText("");
                            hasOperation = false;
                        }
                        if (firstTime) {
                            numbers.add(indexOfNum, 0.0);
                            firstTime = false;
                        }
                        temp = numbers.get(indexOfNum) * 10 + 5;
                        numbers.add(indexOfNum, temp);
                        display.setText(String.valueOf(temp));
                        break;
                    }

                case KeyEvent.VK_6:
                    if (hasOperation) {
                        display.setText("");
                        hasOperation = false;
                    }
                    if (firstTime) {
                        numbers.add(indexOfNum, 0.0);
                        firstTime = false;
                    }
                    temp = numbers.get(indexOfNum) * 10 + 6;
                    numbers.add(indexOfNum, temp);
                    display.setText(String.valueOf(temp));
                    break;

                case KeyEvent.VK_7:
                    if (hasOperation) {
                        display.setText("");
                        hasOperation = false;
                    }
                    if (firstTime) {
                        numbers.add(indexOfNum, 0.0);
                        firstTime = false;
                    }
                    temp = numbers.get(indexOfNum) * 10 + 7;
                    numbers.add(indexOfNum, temp);
                    display.setText(String.valueOf(temp));
                    break;

                case KeyEvent.VK_8:
                    if (Shift) {
                        indexOfNum++;
                        firstTime = true;
                        hasOperation = true;
                        operations.add('*');
                        Shift = false;
                        break;
                    } else {
                        if (hasOperation) {
                            display.setText("");
                            hasOperation = false;
                        }
                        if (firstTime) {
                            numbers.add(indexOfNum, 0.0);
                            firstTime = false;
                        }
                        temp = numbers.get(indexOfNum) * 10 + 8;
                        numbers.add(indexOfNum, temp);
                        display.setText(String.valueOf(temp));
                        break;
                    }
                case KeyEvent.VK_9:
                    if (hasOperation) {
                        display.setText("");
                        hasOperation = false;
                    }
                    if (firstTime) {
                        numbers.add(indexOfNum, 0.0);
                        firstTime = false;
                    }
                    temp = numbers.get(indexOfNum) * 10 + 9;
                    numbers.add(indexOfNum, temp);
                    display.setText(String.valueOf(temp));
                    break;


                case KeyEvent.VK_MINUS:
                    System.out.println("k");
                    indexOfNum++;
                    firstTime = true;
                    hasOperation = true;
                    operations.add('-');
                    break;


                case KeyEvent.VK_SLASH:
                    indexOfNum++;
                    firstTime = true;
                    hasOperation = true;
                    operations.add('/');
                    break;

                case KeyEvent.VK_EQUALS:
                    if (Shift) {
                        indexOfNum++;
                        firstTime = true;
                        hasOperation = true;
                        operations.add('+');
                        Shift = false;
                        break;
                    } else {
                        indexOfNum++;
                        firstTime = true;
                        hasOperation = true;
                        operations.add('=');
                        display.setText(operation());
                        numbers = new ArrayList<Double>();
                        operations = new ArrayList<Character>();
                        result = 0;
                        indexOfNum = 0;
                        indexOfOpe = 0;
                        text = "";
                        firstTime = true;
                        hasOperation = false;
                    }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }


    /**
     * this method calculate - for each operation
     *
     * @return String of result
     */
    public String operation() {
        //for first and second number check first operation
        if (operations.get(0).equals('+'))
            result = numbers.get(0) + numbers.get(1);
        if (operations.get(0).equals('-'))
            result = numbers.get(0) - numbers.get(1);
        if (operations.get(0).equals('*'))
            result = numbers.get(0) * numbers.get(1);
        if (operations.get(0).equals('/')) {
            result = numbers.get(0) / numbers.get(1);
        }
        if (operations.get(0).equals('%'))
            result = numbers.get(0) % numbers.get(1);

        indexOfNum = 2;
        indexOfOpe = 1;

        if (operations.get(0).equals('s')) {
            if (numbers.get(0) % 180 == 0) {
                result = Math.toRadians(numbers.get(0));
                result = Math.round(Math.sin(result));
                indexOfNum = 1;
                indexOfOpe = 1;

            } else {
                result = Math.toRadians(numbers.get(0));
                result = Math.sin(result);
                indexOfNum = 1;
                indexOfOpe = 1;
            }
        }
        if (operations.get(0).equals('c')) {
            if (numbers.get(0) % 90 == 0) {
                result = Math.toRadians(numbers.get(0));
                result = Math.round(Math.cos(result));
                indexOfNum = 1;
                indexOfOpe = 1;

            } else {
                result = Math.toRadians(numbers.get(0));
                result = Math.cos(result);
                indexOfNum = 1;
                indexOfOpe = 1;
            }
        }
        //for the rest number
        while (indexOfOpe < operations.size()) {
            if (operations.get(indexOfOpe) == '+') {
                result += numbers.get(indexOfNum);
            } else if (operations.get(indexOfOpe) == '-') {
                result -= numbers.get(indexOfNum);
            } else if (operations.get(indexOfOpe) == '*') {
                result *= numbers.get(indexOfNum);
            } else if (operations.get(indexOfOpe) == '/') {
                result /= numbers.get(indexOfNum);
            } else if (operations.get(indexOfOpe) == '%') {
                result %= numbers.get(indexOfNum);
            } else if (operations.get(indexOfOpe) == '=') {
                String str = String.valueOf(result);
                return str;
            } else if (operations.get(indexOfOpe) == 's') {
                result = Math.toRadians(result);
                result = Math.sin(result);
            } else if (operations.get(indexOfOpe) == 'c') {
                result = Math.toRadians(result);
                result = Math.cos(result);
            }
            indexOfOpe++;
            indexOfNum++;
        }
        String str = String.valueOf(result);
        return str;
    }
}