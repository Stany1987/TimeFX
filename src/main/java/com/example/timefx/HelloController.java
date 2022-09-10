package com.example.timefx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HelloController extends HelloApplication {

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    private Button butActT;


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
    private MenuItem minute05;

    @FXML
    private MenuItem minute50;

    @FXML
    private MenuItem minute55;


    @FXML

    public Label timeTxt;


    @FXML
    void initialize() throws IOException {


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateCount = DateTimeFormatter.ofPattern("HHmm");
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.scheduleWithFixedDelay(() -> {
            LocalDateTime now = LocalDateTime.now();
            String nowFormatted = dateTimeFormatter.format(now);
            Platform.runLater(() -> timeTxt.setText(nowFormatted));
        }, 0, 1, TimeUnit.SECONDS);

        int minuteBut = LocalDateTime.now().getMinute();
        int hourBut = LocalDateTime.now().getHour();
        hour.setText(String.valueOf(hourBut));
        minute.setText(String.valueOf(minuteBut));
        b = 0;
        executor.scheduleWithFixedDelay(() -> {
            LocalDateTime neew = LocalDateTime.now();
            String newFormatted = String.valueOf(Integer.parseInt(dateCount.format(neew)));
            if (b > 0) {
                if (newFormatted.equals(hour.getText() + minute.getText())) {
                    try {
                        Process off = Runtime.getRuntime().exec("shutdown -s");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }, 0, 1, TimeUnit.SECONDS);

        butActT.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                b++;
            }
        });

        hour0.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("00");

            }
        });
        hour1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("01");

            }
        });
        hour2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("02");

            }
        });
        hour3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("03");

            }
        });
        hour4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("04");

            }
        });
        hour5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("05");

            }
        });
        hour6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("06");

            }
        });
        hour7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("07");

            }
        });
        hour8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("08");

            }
        });
        hour9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("09");

            }
        });
        hour10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("10");

            }
        });
        hour11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("11");

            }
        });
        hour12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("12");
            }
        });
        hour13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("13");
            }
        });
        hour14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("14");
            }
        });
        hour15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("15");
            }
        });
        hour16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("16");
            }
        });
        hour17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("17");
            }
        });
        hour18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("18");
            }
        });
        hour19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("19");
            }
        });
        hour20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("20");
            }
        });
        hour21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("21");
            }
        });
        hour22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("22");
            }
        });
        hour23.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                hour.setText("23");
            }
        });

        minute00.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("00");
            }
        });
        minute05.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("05");
            }
        });
        minute10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("10");
            }
        });
        minute15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("15");
            }
        });
        minute20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("20");
            }
        });
        minute25.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("25");
            }
        });
        minute30.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("30");
            }
        });
        minute35.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("35");
            }
        });
        minute40.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("40");
            }
        });
        minute45.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("45");
            }
        });
        minute50.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("50");
            }
        });
        minute55.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                minute.setText("55");
            }
        });

    }
}