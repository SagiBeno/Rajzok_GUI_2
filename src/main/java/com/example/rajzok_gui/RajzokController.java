package com.example.rajzok_gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

import java.net.URL;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}