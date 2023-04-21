package com.cagesandcreatures.controllers;

import com.cagesandcreatures.App;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MenuController implements Initializable {
    @FXML
    private ComboBox<Integer> numPlayers;

    @FXML
    private ComboBox<String> classSelection;

    @FXML
    private Button numSelect;

    @FXML
    private Label playerChooseTitle;

    @FXML
    private TextField characterName;
    @FXML
    private ProgressBar healthBar;

    @FXML
    private ProgressBar strengthBar;

    @FXML
    private ProgressBar speedBar;

    @FXML
    private ProgressBar agilityBar;

    @FXML
    private ProgressBar intelligenceBar;

    static int playerAmount;
    private int playerTotal;
    private int playerIndex = 1;
    private final Integer[] nums = {2, 3, 4, 5, 6};
    private final ObservableList<String> classes = FXCollections.observableArrayList("Elf", "Dwarf", "Knight", "Assassin", "Orc"); // Create an ObservableList from the array

    public void initialize(URL url, ResourceBundle resourceBundle) {
        numPlayers.getItems().addAll(nums);
        classSelection.setItems(classes);
    }

    @FXML
    public void getPlayerAmount(ActionEvent event) throws IOException, Exception {
        // Triggered when player clicks submit on menu screen
        playerAmount = numPlayers.getValue();
        // Switch to character selection screen
        loadFmxl("CharacterSelect");
    }

    @FXML
    public void displayClassStats(ActionEvent event) {
        // Triggered when player selects a different option
        String selectedClass = classSelection.getValue();

        // Set character stat bars according to character
        healthBar.setProgress(1.0);
        switch (selectedClass) {
            case "Elf":
                strengthBar.setProgress(0.1);
                speedBar.setProgress(0.4);
                agilityBar.setProgress(0.7);
                intelligenceBar.setProgress(0.4);
                break;
            case "Dwarf":
                strengthBar.setProgress(0.7);
                speedBar.setProgress(0.1);
                agilityBar.setProgress(0.2);
                intelligenceBar.setProgress(0.6);
                break;
            case "Knight":
                strengthBar.setProgress(0.4);
                speedBar.setProgress(0.4);
                agilityBar.setProgress(0.4);
                intelligenceBar.setProgress(0.4);
                break;
            case "Assassin":
                strengthBar.setProgress(0.2);
                speedBar.setProgress(0.2);
                agilityBar.setProgress(0.6);
                intelligenceBar.setProgress(0.6);
                break;
            case "Orc":
                strengthBar.setProgress(0.8);
                speedBar.setProgress(0.5);
                agilityBar.setProgress(0.2);
                intelligenceBar.setProgress(0.1);
        }
    }

    @FXML
    public void submitPlayer(ActionEvent event) {
        // Triggered when player clicks on submit in character selection screen
        playerChooseTitle.setText(
                String.format("Player %d, choose your class", ++playerIndex)
        );
        // Get name
        String name = characterName.getText();
        String selectedClass = classSelection.getValue();
        System.out.println("Name: " + name);
        System.out.println("Selected Class: " + selectedClass);

        // Clear values and move on to next player
        characterName.clear();
        classSelection.setValue("0");
        classes.remove(selectedClass);

        // If sufficient number of players have been created, switch to next page
        System.out.println("Player index: " + playerIndex);
        System.out.println("Player amount: " + playerAmount);
        if (playerIndex - 1 == playerAmount) {
            System.out.println("Switching boards");
            loadFmxl("Board");
        }
    }

    private void loadFmxl(String fmxlFile) {
        // Load FXML File
        try {
            App.setRoot(fmxlFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}