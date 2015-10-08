package blackjack;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BlackJack extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Creates and shuffles 2 decks for 2 players
        Deck player1 = new Deck();
        Deck player2 = new Deck();
        player1.shuffleDeck();
        player2.shuffleDeck();
        
        // Draws hands for each player and lays them out at their spots
        Card[] hand1 = player1.getHand();
        Card[] hand2 = player2.getHand();
        FlowPane spot1 = new FlowPane();
        spot1.setHgap(5);
        spot1.getChildren().addAll(hand1);
        FlowPane spot2 = new FlowPane();
        spot2.setHgap(5);
        spot2.getChildren().addAll(hand2);
        
        // Puts spots (with hands) on the table
        BorderPane table = new BorderPane();
        table.setTop(spot1);
        table.setBottom(spot2);
        
        Scene scene = new Scene(table, 550, 550);
        
        primaryStage.setTitle("Black Jack Setup");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
