package blackjack;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

// This class creates a card, depending on the suit and rank passed
public class Card extends Pane {
    Text cornerLeftText = new Text();
    Text centerText = new Text();
    Text cornerRightText = new Text();
    
    public Card(String suit, String rank) { 
        setStyle("-fx-border-color: black");
        
        // Puts rank and suit in corners
        cornerLeftText.setText(rank + "\n" + suit);
        cornerRightText.setText(cornerLeftText.getText());
        
        // Sets center image (chess pieces) based on rank
        if (rank.equals("A")) centerText.setText("\u265C"); // rook
        else if (rank.equals("K")) centerText.setText("\u265A"); // king
        else if (rank.equals("Q")) centerText.setText("\u265B"); // queen
        else if (rank.equals("J")) centerText.setText("\u265E"); // knight
        else centerText.setText("\u265F"); // pawn
        
        // Makes center image bold and big
        centerText.setFont(Font.font("Calibri", FontWeight.BOLD, 
                FontPosture.REGULAR, 40));
        
        // Sets color to red if hearts or diamonds, else black
        if (suit.equals("\u2665") || suit.equals("\u2666")) {
            centerText.setStroke(Color.RED);
            cornerLeftText.setStroke(Color.RED);
            cornerRightText.setStroke(Color.RED);
        }
        
        // Sets position of all the text
        cornerLeftText.setX(5);
        cornerLeftText.setY(15);
        centerText.setX(30);
        centerText.setY(90);
        cornerRightText.setX(90);
        cornerRightText.setY(140);
        
        // Makes border around center image
        Rectangle rectBorder = new Rectangle(20, 20, 60, 120);
        rectBorder.setStrokeWidth(2);
        rectBorder.setFill(null);
        rectBorder.setStroke(Color.BLACK);
        
        // Adds everything to Card
        getChildren().add(cornerLeftText);
        getChildren().add(cornerRightText);
        getChildren().add(rectBorder);
        getChildren().add(centerText);
    }    
}
