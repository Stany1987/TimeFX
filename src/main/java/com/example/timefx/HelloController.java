package com.example.timefx;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private MenuButton hour;
    @FXML
    private MenuItem hour0;

    @FXML
    private MenuItem hour1;

    @FXML
    private MenuItem hour10;

    @FXML
    private MenuItem hour11;

    @FXML
    private MenuItem hour12;

    @FXML
    private MenuItem hour13;

    @FXML
    private MenuItem hour14;

    @FXML
    private MenuItem hour15;

    @FXML
    private MenuItem hour16;

    @FXML
    private MenuItem hour17;

    @FXML
    private MenuItem hour18;

    @FXML
    private MenuItem hour19;

    @FXML
    private MenuItem hour2;

    @FXML
    private MenuItem hour20;

    @FXML
    private MenuItem hour21;

    @FXML
    private MenuItem hour22;

    @FXML
    private MenuItem hour23;

    @FXML
    private MenuItem hour3;

    @FXML
    private MenuItem hour4;

    @FXML
    private MenuItem hour5;

    @FXML
    private MenuItem hour6;

    @FXML
    private MenuItem hour7;

    @FXML
    private MenuItem hour8;

    @FXML
    private MenuItem hour9;


    @FXML
    private MenuButton minute;
    @FXML
    private MenuItem minute00;

    @FXML
    private MenuItem minute10;

    @FXML
    private MenuItem minute15;

    @FXML
    private MenuItem minute20;

    @FXML
    private MenuItem minute25;

    @FXML
    private MenuItem minute30;

    @FXML
    private MenuItem minute35;

    @FXML
    private MenuItem minute40;

    @FXML
    private MenuItem minute45;

    @FXML
    private MenuItem minute5;

    @FXML
    private MenuItem minute50;

    @FXML
    private MenuItem minute55;



    @FXML

    public Label timeTxt;

    @FXML
    void initialize() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(() -> {
            LocalDateTime now = LocalDateTime.now();
            String nowFormatted = dateTimeFormatter.format(now);
            Platform.runLater(() -> timeTxt.setText(nowFormatted));
        }, 0, 1, TimeUnit.SECONDS);

     int minuteBut=LocalDateTime.now().getMinute();
        int hourBut= LocalDateTime.now().getHour();
        hour.setText(String.valueOf(hourBut));
        minute.setText(String.valueOf(minuteBut));

    }

}