package com.genzedsolutions.planr.scene;

import com.genzedsolutions.planr.Main;
import com.genzedsolutions.planr.controllers.MainController;
import com.genzedsolutions.planr.objects.AgendaItem;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class App extends Application {

    @FXML private TableView<AgendaItem> tableView;

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Planr");
        primaryStage.show();

    }
}
