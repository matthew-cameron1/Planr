package com.genzedsolutions.planr.objects;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class AgendaItem {

    private StringProperty time;
    private StringProperty description;
    private StringProperty tag;

    public AgendaItem(String time, String description, Tag tag) {
        this.time = new SimpleStringProperty(time);
        this.description = new SimpleStringProperty(description);
        this.tag = new SimpleStringProperty(String.valueOf(tag.getPriority()));
    }

    public String getTime() {
        return time.get();
    }

    public StringProperty timeProperty() {
        return time;
    }

    public String getDescription() {
        return description.get();
    }

    public StringProperty descriptionProperty() {
        return description;
    }

    public String getTag() {
        return tag.get();
    }

    public StringProperty tagProperty() {
        return tag;
    }
}
