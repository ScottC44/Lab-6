/*
Scott Cromling
COMP167
LAB 6
 */
import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch();
    }

    public void start(Stage primaryStage) throws Exception {

            Deck deck = new Deck();
            deck.shuffle();
            JOptionPane.showMessageDialog(null, deck.toString(), null, JOptionPane.INFORMATION_MESSAGE);
            deck.sort();
            JOptionPane.showMessageDialog(null, deck.toString(), null, JOptionPane.INFORMATION_MESSAGE);

        }
    }

