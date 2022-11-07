package Vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;

/**
 * @author alfre
 * View class of the Mastermind
 */
public class View extends JFrame {
    private final int[] counts = {10};
    private ArrayList<Integer> number = new ArrayList<>();
    private ArrayList<Integer> keySecret = new ArrayList<>();
    private JTextArea tryTextArea = new JTextArea();
    private JPanel buttonNumber, gridMasterMind, masterGrid;
    private JLabel code, answer;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonOk, buttonClear;

    /**
     * Constructor of the class
     */
    public View() {

        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 500);


    }

    /**
     * Method to init components
     */
    private void initComponents() {
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonOk = new JButton("OK");
        buttonClear = new JButton("C");
        code = new JLabel("Start");
        code.setFont(new Font("codeSize", 20, 30));
        answer = new JLabel("GOOD LUCK");
        answer.setFont(new Font("answerSize", 20, 30));


        buttonNumber = new JPanel(new GridLayout(4, 3));
        buttonNumber.add(button7);
        buttonNumber.add(button8);
        buttonNumber.add(button9);
        buttonNumber.add(button4);
        buttonNumber.add(button5);
        buttonNumber.add(button6);
        buttonNumber.add(button1);
        buttonNumber.add(button2);
        buttonNumber.add(button3);

        buttonNumber.add(buttonOk);
        buttonNumber.add(button0);
        buttonNumber.add(buttonClear);


        gridMasterMind = new JPanel(new GridLayout(3, 1));
        gridMasterMind.add(code);
        gridMasterMind.add(buttonNumber);
        gridMasterMind.add(answer);

        masterGrid = new JPanel(new GridLayout(1, 1));
        masterGrid.add(gridMasterMind);
        masterGrid.add(tryTextArea);
        this.add(masterGrid);


        randomSecretKey(keySecret);


        buttonClear.addActionListener(e -> buttonDelete());
        buttonOk.addActionListener(e -> buttonEnter());
        button0.addActionListener(e -> buttonZero());
        button1.addActionListener(e -> buttonOne());
        button2.addActionListener(e -> buttonTwo());
        button3.addActionListener(e -> buttonThree());
        button4.addActionListener(e -> buttonFour());
        button5.addActionListener(e -> buttonFive());
        button6.addActionListener(e -> buttonSix());
        button7.addActionListener(e -> buttonSeven());
        button8.addActionListener(e -> buttonEight());
        button9.addActionListener(e -> buttonNine());

    }
    /**
     * ButtonClear actionListener
     */
    private void buttonDelete() {
        number.clear();
        code.setText(number.toString());
    }

    /**
     * ButtonOK actionListener
     */
    private void buttonEnter() {

        if (number.size() == 4) {
            checkKey(counts);
            number.clear();
            counts[0]--;
            if (counts[0] == 0) {
                JOptionPane.showMessageDialog(null, "You lose", "Game Over", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please, 4 numbers", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    /**
     * ButtonZero actionListener
     */
    private void buttonZero() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button0.getText()))) {

            } else {
                number.add(Integer.parseInt(button0.getText()));
            }

        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));

    }

    /**
     * ButtonOne actionListener
     */
    private void buttonOne() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button1.getText()))) {
            } else {
                number.add(Integer.parseInt(button1.getText()));
            }
        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));
    }

    /**
     * ButtonTwo actionListener
     */
    private void buttonTwo() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button2.getText()))) {

            } else {
                number.add(Integer.parseInt(button2.getText()));
            }
        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));
    }

    /**
     * ButtonThree actionListener
     */
    private void buttonThree() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button3.getText()))) {

            } else {
                number.add(Integer.parseInt(button3.getText()));
            }

        } else {
            maxLength();
        }

        code.setText(numbersScreen(number));
    }

    /**
     * ButtonFour actionListener
     */
    private void buttonFour() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button4.getText()))) {
            } else {
                number.add(Integer.parseInt(button4.getText()));
            }
        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));
    }

    /**
     * ButtonFive actionListener
     */
    private void buttonFive() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button5.getText()))) {
            } else {
                number.add(Integer.parseInt(button5.getText()));
            }
        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));
    }

    /**
     * ButtonSix actionListener
     */
    private void buttonSix() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button6.getText()))) {
            } else {
                number.add(Integer.parseInt(button6.getText()));
            }
        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));
    }

    /**
     * ButtonSeven actionListener
     */
    private void buttonSeven() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button7.getText()))) {
            } else {
                number.add(Integer.parseInt(button7.getText()));
            }
        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));
    }

    /**
     * ButtonEight actionListener
     */
    private void buttonEight() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button8.getText()))) {
            } else {
                number.add(Integer.parseInt(button8.getText()));
            }
        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));
    }

    /**
     * ButtonNine actionListener
     */
    private void buttonNine() {
        if (number.size() < 4) {
            if (number.stream().anyMatch(x -> x == Integer.parseInt(button9.getText()))) {
            } else {
                number.add(Integer.parseInt(button9.getText()));
            }
        } else {
            maxLength();
        }
        code.setText(numbersScreen(number));
    }




    /**
     * Method that show the max length that is four numbers.
     */
    public void maxLength() {
        JOptionPane.showMessageDialog(null, "Only 4 numbers", "Max Length", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * @param numbersofScreen
     * @return number of screen
     */

    private String numbersScreen(ArrayList<Integer> numbersofScreen) {
        return numbersofScreen.toString();
    }
    /**
     * Method to verify if the secret key is correct
     *
     * @param left
     */
    private void checkKey(int[] left) {
        var streamKeySecretList = keySecret.stream().toList();
        var numberList = number.stream().toList();


        int correctDigit = 0;
        int correctPosition = 0;

        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) == streamKeySecretList.get(i)) {
                correctPosition++;
            } else {
                int finalI = i;
                if (streamKeySecretList.stream().anyMatch(x -> numberList.get(finalI) == x)) {
                    correctDigit++;
                }
            }
        }
        var clouds = new ArrayList();
        for (int i = 0; i < correctPosition; i++) {
            clouds.add("1");
        }
        for (int i = 0; i < correctDigit; i++) {
            clouds.add("0");
        }
        var hyphen = 4 - clouds.size();
        for (int i = 0; i < hyphen; i++) {
            clouds.add("-");
        }
        if (clouds.stream().allMatch(x -> x == "1")) {
            JOptionPane.showMessageDialog(null, "Congratulations", "You win", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        }
        answer.setText(clouds.toString());
        tryTextArea.setText(tryTextArea.getText() + " \n Left: " + left[0] + "\n This attempt: " + number.toString() + "\n Cloud: " + clouds + "\n");
    }

    /**
     * Method to generate the secret key
     *
     * @param secretKey
     * @return secretKey
     */
    private ArrayList<Integer> randomSecretKey(ArrayList<Integer> secretKey) {

        do {
            int numberSecret = new Random().nextInt(0, 10);
            System.out.print(numberSecret);
            if (secretKey.stream().anyMatch(x -> x == numberSecret)) {

            } else {
                secretKey.add(numberSecret);
            }

        } while ((secretKey.size()) < 4);
        System.out.println("\nSecret number is: " + secretKey);
        return secretKey;

    }

}
