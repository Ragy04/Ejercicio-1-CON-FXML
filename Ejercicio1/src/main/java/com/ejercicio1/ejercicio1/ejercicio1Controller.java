package com.ejercicio1.ejercicio1;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ejercicio1Controller {
    @FXML
    private ListView<String> listView;
    @FXML
    private TextField textField;
    @FXML
    private void initialize() {
        cargarImagenes();
    }
    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private ImageView imageView3;

    @FXML
    private ImageView imageView4;

    private void cargarImagenes() {

        Image image1 = new Image(getClass().getResourceAsStream("IMG/Persona.jpg"));
        Image image2 = new Image(getClass().getResourceAsStream("IMG/PersonaMujer.jpg"));
        Image image3 = new Image(getClass().getResourceAsStream("IMG/Persona.jpg"));
        Image image4 = new Image(getClass().getResourceAsStream("IMG/PersonaMujer.jpg"));



        imageView1.setImage(image1);
        imageView2.setImage(image2);
        imageView3.setImage(image3);
        imageView4.setImage(image4);

    }
}