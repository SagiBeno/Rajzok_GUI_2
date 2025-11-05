package com.example.rajzok_gui;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.*;

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
    public String[] nev = {"Baba", "Vonat", "Hajó", "Hintaló", "Nyuszi", "Repülő", "T-Rex"};
    public String[] kepnev = {"baba", "vonat", "hajo", "hintalo", "nyuszi", "repulo", "tirex"};
    public Image[] kep = new Image[7];

    // store 4 of map: baba -> image
    public List<Map<String, Image>> pos4 = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // load initial images
        for (int i = 0; i < kep.length; i++) {
            kep[i] = new Image("file:rajzok/" + kepnev[i] + ".png");

            if (Objects.equals(kepnev[i], "baba")) {
                imageView1.setImage(kep[i]);
                Map<String, Image> map = new HashMap<>();
                map.put("baba", kep[i]);
                pos4.add(map);
            }
            if (Objects.equals(kepnev[i], "vonat")) {
                imageView2.setImage(kep[i]);
                Map<String, Image> map = new HashMap<>();
                map.put("vonat", kep[i]);
                pos4.add(map);
            }
            if (Objects.equals(kepnev[i], "hajo")) {
                imageView3.setImage(kep[i]);
                Map<String, Image> map = new HashMap<>();
                map.put("hajo", kep[i]);
                pos4.add(map);

            }
            if (Objects.equals(kepnev[i], "hintalo")) {
                imageView4.setImage(kep[i]);
                Map<String, Image> map = new HashMap<>();
                map.put("hintalo", kep[i]);
                pos4.add(map);
            }
        }

        // TODO - style image squares

    }

    public void handleImageClick(int idx) {
        int newId = idx;
        while (newId == idx) newId = (int) (Math.random() * kep.length);

        switch (idx) {
            case 1: {
                imageView1.setImage(kep[newId]);
                pos4.get(0).clear();
                Map<String, Image> map = new HashMap<>();
                map.put(kepnev[idx], kep[idx]);
                pos4.add(map);
                break;
            }

            case 2: {
                imageView2.setImage(kep[newId]);
                pos4.get(1).clear();
                Map<String, Image> map = new HashMap<>();
                map.put(kepnev[idx], kep[idx]);
                pos4.add(map);
                break;
            }

            case 3: {
                imageView3.setImage(kep[newId]);
                pos4.get(2).clear();
                Map<String, Image> map = new HashMap<>();
                map.put(kepnev[idx], kep[idx]);
                pos4.add(map);
                break;
            }

            case 4: {
                imageView4.setImage(kep[newId]);
                pos4.get(3).clear();
                Map<String, Image> map = new HashMap<>();
                map.put(kepnev[idx], kep[idx]);
                pos4.add(map);
                break;
            }
        }
    }

    public void handleImage1Click() {
        handleImageClick(1);
    }

    public void handleImage2Click() {
        handleImageClick(2);
    }

    public void handleImage3Click() {
        handleImageClick(3);
    }

    public void handleImage4Click() {
        handleImageClick(4);
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