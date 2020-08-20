package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class loggedInController {
    //ne?
    static Stage stage;

    public static Stage s() {
        return stage;
    }
    //??
    @FXML
    private Button backButon;

    @FXML
    private Text ClientName;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu menuBarToday;

    @FXML
    private Menu menuBarWeek;

    @FXML
    private Menu menuBarMonth;

    @FXML
    private TextArea TodaysPlanTextArea;

    @FXML
    private ImageView addEventPic;

    @FXML
    private Text addEventText;

    @FXML
    private ImageView close;

}
