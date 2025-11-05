package com.example.rajzok_gui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class RajzokController implements Initializable {

    @FXML public MenuItem menuitemMegnyitas;
    @FXML public MenuItem menuitemMentes;
    @FXML public MenuItem menuitemKilepes;
    @FXML public MenuItem menuitemKulonbozo;
    @FXML public MenuItem menuitemEgyforma;
    @FXML public MenuItem menuitemElso;
    @FXML public MenuItem menuitemNevjegy;
    @FXML public ImageView imageView1;
    @FXML public ImageView imageView2;
    @FXML public ImageView imageView3;
    @FXML public ImageView imageView4;
    @FXML public Button buttonHoozaad;
    @FXML public Button buttonModosit;
    @FXML public Button buttonTorol;
    @FXML public ListView<String> listview;
    @FXML public ImageView menuitemImageMegnyitas;
    @FXML public ImageView menuitemImageMentes;
    @FXML public ImageView menuitemImageKilepes;
    @FXML public ImageView menuitemImageKulonbozo;
    @FXML public ImageView menuitemImageEgyforma;
    @FXML public ImageView menuitemImageElso;
    @FXML public ImageView menuitemImageNevjegy;


    // Strore data
    public String[] nev = {"Baba", "Hajó", "Hintaló", "Nyuszi", "Repülő", "T-Rex", "Vonat"};
    public String[] kepnev = {"baba", "hajo", "hintalo", "nyuszi", "repulo", "tirex", "vonat"};
    public Image[] kep = new Image[7];

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // load initial images
        for (int i = 0; i < kep.length; i++) {
            kep[i] = new Image("file:rajzok/" + kepnev[i] + ".png");

            if (Objects.equals(kepnev[i], "baba")) imageView1.setImage(kep[i]);
            if (Objects.equals(kepnev[i], "vonat")) imageView2.setImage(kep[i]);
            if (Objects.equals(kepnev[i], "hajo")) imageView3.setImage(kep[i]);
            if (Objects.equals(kepnev[i], "hintalo")) imageView4.setImage(kep[i]);
        }

        // TODO - style image squares

    }

    public void handleMegnyitas() {

    }

    public void handleMentes() {

    }

    public void handleKilepes() {
        Platform.exit();
    }

    public void handleKulonbozo() {

    }

    public void handleEgyforma() {

    }

    public void handleElso() {

    }

    public void handleNevjegy() {

    }

    public void handleHozzaad() {

    }

    public void handleModosit() {

    }

    public void handleTorol() {

    }
}