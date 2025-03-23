package twitter.userinterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import twitter.model.Tweet;
import twitter.model.TwitterAccount;

public class TweetOpstellenController {
    @FXML private TextArea tweetTextArea;
    @FXML private Label tweetMeldingLabel;

    public void handleButtonTweet(ActionEvent actionEvent) {
        String bericht = tweetTextArea.getText().trim();

        try {
            Tweet nieuweTweet = new Tweet(bericht);
            TwitterAccount.getHuidigeUser().tweet(nieuweTweet);
            tweetMeldingLabel.setText("Tweet succesvol geplaatst!");

            Button source = (Button) actionEvent.getSource();
            Stage stage = (Stage) source.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            tweetMeldingLabel.setText("Er is een fout opgetreden: " + e.getMessage());
        }
    }

    public void handleButtonAnnuleren(ActionEvent actionEvent) {
        Button source = (Button)actionEvent.getSource();
        Stage stage = (Stage)source.getScene().getWindow();
        stage.close();
    }
}
