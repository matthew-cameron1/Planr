package com.genzedsolutions.planr;

import com.genzedsolutions.planr.scene.App;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

    /**
     * Planr will be a task app
     *
     * Scenes:
     * Add Task - Timeframe, description, reminders etc...
     * Home (Side bar, and task display on right)
     */

    public static void main(String[] args) {
        Application.launch(App.class);
    }
}
