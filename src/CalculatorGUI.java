import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {

    Calculator myCalculator = new Calculator();
    private JFrame mainFrame;
    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private JButton exponent;
    private JButton cubed;
    private JButton squared;
    private JButton divide;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton multiply;
    private JButton subtract;
    private JButton add;
    private JButton equal;
    private JLabel box;
    private JButton blank;
    private int vOne = 1;
    private int vTwo = 2;
    private int vThree = 3;
    private int vFour = 4;
    private int vFive = 5;
    private int vSix =6;
    private int vSeven = 7;
    private int vEight = 8;
    private int vNine = 9;
    private int vZero = 0;
    private int num1;
    private int num2;
    private String operation;




    public static void main(String[] args) {
        new CalculatorGUI();
    }

    //constructor
    public CalculatorGUI(){
        mainFrame = new JFrame();
        exponent = new JButton("x^y");
        exponent.addActionListener(this);
        cubed = new JButton("x^3");
        cubed.addActionListener(this);
        squared = new JButton("x^2");
        squared.addActionListener(this);
        divide = new JButton("÷");
        divide.addActionListener(this);
        multiply = new JButton("*");
        multiply.addActionListener(this);
        subtract = new JButton("-");
        subtract.addActionListener(this);
        add = new JButton("+");
        add.addActionListener(this);
        equal = new JButton("=");
        equal.addActionListener(this);
        one = new JButton("1");
        one.addActionListener(this);
        two = new JButton("2");
        two.addActionListener(this);
        three = new JButton("3");
        three.addActionListener(this);
        four = new JButton("4");
        four.addActionListener(this);
        five = new JButton("5");
        five.addActionListener(this);
        six = new JButton("6");
        six.addActionListener(this);
        seven = new JButton("7");
        seven.addActionListener(this);
        eight = new JButton("8");
        eight.addActionListener(this);
        nine = new JButton("9");
        nine.addActionListener(this);
        zero = new JButton("0");
        zero.addActionListener(this);
        box = new JLabel("");
        blank = new JButton("clear");
        blank.addActionListener(this);


        box.setFont(new Font (Font.SERIF, Font.BOLD, 60));


        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();


        panel.setLayout(new GridLayout(4,3)); // sets up layout for the button and panel
        //new row
        panel.add(one);
        panel.add(two);
        panel.add(three);
        //new row
        panel.add(four);
        panel.add(five);
        panel.add(six);
        // new row
        panel.add(seven);
        panel.add(eight);
        panel.add(nine);

        //new row
        panel.add(blank);
        panel.add(zero, BorderLayout.CENTER);
        panel.add(equal);


        panel2.setLayout(new GridLayout(8,1));
        panel2.add(exponent);
        panel2.add(cubed);
        panel2.add(squared);
        panel2.add(divide);
        panel2.add(multiply);
        panel2.add(subtract);
        panel2.add(add);

        panel3.setLayout(new BorderLayout());
        panel3.add(box, BorderLayout.NORTH);
        panel3.add(panel2, BorderLayout.EAST);
        panel3.add(panel, BorderLayout.CENTER);



        mainFrame.add(panel3);
        mainFrame.setSize(400,600);
        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object buttonClicked = e.getSource();

        if(buttonClicked == one){
            box.setText(box.getText() + "1");

        }
        if(buttonClicked == two){
            box.setText(box.getText() + "2");

        }

        if(buttonClicked == three){
            box.setText(box.getText() + "3");

        }

        if(buttonClicked == four){
            box.setText(box.getText() + "4");
        }
        if(buttonClicked == five){
            box.setText(box.getText() + "5");
        }
        if(buttonClicked == six){
            box.setText(box.getText() + "6");

        }
        if(buttonClicked == seven){
            box.setText(box.getText() + "7");

        }
        if(buttonClicked == eight){
            box.setText(box.getText() + "8");

        }
        if(buttonClicked == nine){
            box.setText(box.getText() + "9");

        }
        if(buttonClicked == zero){
            box.setText(box.getText() + "0");
        }

        //  operations

        if(buttonClicked == add){
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText("");
            operation = "add";
        }

        if(buttonClicked == equal){ // if buttonClicked == add (then?) equals...
            num2 = Integer.parseInt(box.getText());
            System.out.println(num2);
            if(operation == "add") {
                System.out.println(num1 + num2);
                box.setText("" + (myCalculator.add(num1, num2)));
            }
        }

        if(buttonClicked == subtract){
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText("");
            operation = "subtract";
        }
        if (buttonClicked == equal) {
            num2 = Integer.parseInt(box.getText());
            System.out.println(num2);
            if(operation == "subtract") {
                System.out.println(num1 - num2);
                box.setText("" + (myCalculator.subtract(num1, num2)));
            }
        }

        if(buttonClicked == multiply) {
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText("");
            operation = "multiply";

        }
           if (buttonClicked == equal) {
                num2 = Integer.parseInt(box.getText());
              System.out.println(num2);
              if(operation == "multiply") {
                  System.out.println(num1 * num2);
                  box.setText("" + (myCalculator.multiply(num1, num2)));
              }
           }


        if(buttonClicked == divide){
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText("");
            operation = "divide";

        }
        if (buttonClicked == equal) {
            num2 = Integer.parseInt(box.getText());
            System.out.println(num2);
            if(operation == "divide") {
                System.out.println(num1 / num2);
                box.setText("" + (myCalculator.divide(num1, num2)));
            }
        }

        if(buttonClicked == exponent){
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText("");
            operation = "exponent";
        }

        if (buttonClicked == equal) {
            num2 = Integer.parseInt(box.getText());
            System.out.println(num2);
            if(operation == "exponent") {
                for(int i=1;i<num2;i++) {
                    System.out.println(num1 ^ num2);
                    box.setText("" + (myCalculator.exponent(num1, num2)));
                }
            }
        }
        if(buttonClicked == cubed){
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText("");
            operation = "cubed";
        }

        if(buttonClicked == equal){
            if(operation == "cubed"){
                box.setText("" + (myCalculator.cube(num1)));
            }
        }

        if(buttonClicked == squared){
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText("");
            operation = "squared";
        }

        if(buttonClicked == equal){
            if(operation == "squared"){
                box.setText("" + (myCalculator.square(num1)));
            }
        }
        if(buttonClicked == blank){
            box.setText("");
        }




    }

}
