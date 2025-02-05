package game;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Bildschirm {
    
    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel;
    JLabel titleNameJLabel;
    Font titleFont = new Font("Serif", Font.BOLD, 35);
    Font normalFont = new Font("Serif", Font.BOLD, 25);
    JButton startButton, choiceButton1, choiceButton2;
    JTextArea mainTextArea;
    
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    public static void main(String[] args) {
        
        new Bildschirm();
    
    }
    
    public Bildschirm() {
        
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 150);
        titleNamePanel.setBackground(Color.black); //schafft eine fläche wo text reinkommt
        titleNameJLabel = new JLabel("GOLDRAUSCH: JAGD AUF WINKY");
        
        titleNameJLabel.setForeground(Color.white);//farbe vom text
        titleNameJLabel.setFont(titleFont);
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 400, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("Start");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.addActionListener(tsHandler);
        
        titleNamePanel.add(titleNameJLabel);
        startButtonPanel.add(startButton);
        
        con.add(titleNamePanel);
        con.add(startButtonPanel);
    }

    public void createGameScreen() {

        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);
        
        mainTextArea = new JTextArea("Das ist das Feld für den Spieltext.");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true); //text macht automatsich shift enter für sich
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 350, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        con.add(choiceButtonPanel);
        choiceButtonPanel.setLayout(new GridLayout(2,1));
        
        


        choiceButton1 = new JButton("Ja");
        choiceButton1.setBackground(Color.black);
        choiceButton1.setForeground(Color.white);
        choiceButton1.setFont(normalFont);
        choiceButton1.addActionListener(tsHandler);
        con.add(choiceButton1);
        choiceButtonPanel.add(choiceButton1);

        choiceButton2 = new JButton("Nein");
        choiceButton2.setBackground(Color.black);
        choiceButton2.setForeground(Color.white);
        choiceButton2.setFont(normalFont);
        choiceButton2.addActionListener(tsHandler);
        con.add(choiceButton2);
        choiceButtonPanel.add(choiceButton2);

    }

    public class TitleScreenHandler implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }

}