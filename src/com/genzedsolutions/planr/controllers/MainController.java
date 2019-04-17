package com.genzedsolutions.planr.controllers;


import com.genzedsolutions.planr.objects.AgendaItem;
import com.genzedsolutions.planr.objects.Tag;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.paint.Color;

public class MainController {

    @FXML
    private TableView<AgendaItem> tableView;

    @FXML
    private TableColumn<AgendaItem, String> timeCol;

    @FXML
    private TableColumn<AgendaItem, String> descCol;

    @FXML
    private TableColumn<AgendaItem, String> tagCol;

    @FXML
    private void initialize() {
        timeCol.setCellValueFactory(f -> f.getValue().timeProperty());
        descCol.setCellValueFactory(f -> f.getValue().descriptionProperty());
        tagCol.setCellValueFactory(f -> f.getValue().tagProperty());

        tableView.setItems(FXCollections.observableArrayList(new AgendaItem("10:45PM", "Begin studying for the final exam!", new Tag(Color.RED, 1))));
    }
}
