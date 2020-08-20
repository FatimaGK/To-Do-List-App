package sample.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import sample.model.LocalEvent;

import java.net.URL;
import java.time.LocalDate;
import java.util.Observable;
import java.util.ResourceBundle;

public class addEventController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dateArea.setValue(LocalDate.now());
    }

    @FXML
    private Button backButton;

    @FXML
    private Button addButton;

    @FXML
    private DatePicker dateArea;

    @FXML
    private TextField textArea;

    @FXML
    private ListView<LocalEvent> eventList;
    //keeps events in another class
    //in order to populate

      ObservableList<LocalEvent> list = FXCollections.observableArrayList(); //it is empty and expecting a LocalEvent
    //soo..
    @FXML
    private ImageView close;

    @FXML
    private Text nameArea;


    @FXML
    private void addEvent(Event e) {
        // when we press the add  button
        //populate  a list first
        list.add(new LocalEvent(dateArea.getValue(), textArea.getText()));
        eventList.setItems(list);
    }

}
