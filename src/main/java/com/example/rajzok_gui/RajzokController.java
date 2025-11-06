package com.example.rajzok_gui;

import javafx.application.Platform;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
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
                Map<String, Image> map = new HashMap<>();
                map.put(kepnev[newId], kep[newId]);
                pos4.set(0, map);
                break;
            }

            case 2: {
                imageView2.setImage(kep[newId]);
                Map<String, Image> map = new HashMap<>();
                map.put(kepnev[newId], kep[newId]);
                pos4.set(1, map);
                break;
            }

            case 3: {
                imageView3.setImage(kep[newId]);
                Map<String, Image> map = new HashMap<>();
                map.put(kepnev[newId], kep[newId]);
                pos4.set(2, map);
                break;
            }

            case 4: {
                imageView4.setImage(kep[newId]);
                Map<String, Image> map = new HashMap<>();
                map.put(kepnev[newId], kep[newId]);
                pos4.set(3, map);
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
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int idx = (int) (Math.random() * kep.length);
            while (indices.contains(idx)) {
                idx = (int) (Math.random() * kep.length);
            }
            indices.add(idx);
        }

        imageView1.setImage(kep[indices.get(0)]);
        imageView2.setImage(kep[indices.get(1)]);;
        imageView3.setImage(kep[indices.get(2)]);
        imageView4.setImage(kep[indices.get(3)]);
    }

    public void handleEgyforma() {
        int idx = (int) (Math.random() * kep.length);
        imageView1.setImage(kep[idx]);
        imageView2.setImage(kep[idx]);
        imageView3.setImage(kep[idx]);
        imageView4.setImage(kep[idx]);
    }

    public void handleElso() {
        String key = pos4.getFirst().keySet().toString();
        key = key.substring(1, key.length() - 1);
        int idx = 0;

        for (int i = 0; i < kepnev.length; i++) {
            if (Objects.equals(kepnev[i], key)) idx = i;
        }

        int randomIdx = (int) (Math.random() * kepnev.length);
        while (idx == randomIdx) randomIdx = (int) (Math.random() * kepnev.length);
        imageView1.setImage(kep[randomIdx]);
    }

    public void handleNevjegy() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(RajzokApplication.class.getResource("nevjegy-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 300);
        stage.getIcons().add(new Image("file:rajzok.png"));
        stage.setTitle("Rajzok - Névjegy");
        stage.setScene(scene);
        stage.show();
    }

    public void handleHozzaad() {

        StringBuilder listviewData = new StringBuilder();

        for (int i = 0; i < pos4.size(); i++) {
            String key = pos4.get(i).keySet().toString();
            key = key.substring(1, key.length() - 1);
            int idx = 1;

            for (int j = 0; j < kepnev.length; j++) {
                if (Objects.equals(kepnev[j], key)) idx = j;
            }

            listviewData.append(nev[idx]).append(" + ");
        }

        listviewData = listviewData.delete( listviewData.length() - 3, listviewData.length() -1 );
        ObservableList<String> observableList = listview.getItems();
        observableList.add(String.valueOf(listviewData));
        listview.setItems(observableList);
    }

    public void handleModosit() {
        int idx = listview.getSelectionModel().getSelectedIndex();
        ObservableList<String> listviewItems = listview.getItems();
        int imageIdx = 0;

        if (idx >= 0) {

            StringBuilder listviewData = new StringBuilder();

            for (int i = 0; i < pos4.size(); i++) {

                String key = pos4.get(i).keySet().toString();
                key = key.substring(1, key.length() - 1);

                for (int j = 0; j < kepnev.length; j++) {

                    if (Objects.equals(kepnev[j], key)) imageIdx = j;
                }

                listviewData.append(nev[imageIdx]).append(" + ");
            }

            listviewData = listviewData.delete( listviewData.length() - 3, listviewData.length() -1 );
            listviewItems.set(idx, String.valueOf(listviewData));
            listview.setItems(listviewItems);
        }
    }

    public void handleTorol() {
        int idx = listview.getSelectionModel().getSelectedIndex();
        ObservableList<String> listviewItems = listview.getItems();

        if (idx >= 0) {
            listviewItems.remove(idx);
            listview.setItems(listviewItems);
        }
    }
}