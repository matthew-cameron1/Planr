package com.genzedsolutions.planr.objects;

import javafx.scene.paint.Color;

public class Tag {

    private Color tagColor;
    private int priority;

    public Tag(Color tagColor, int priority) {
        this.tagColor = tagColor;
        this.priority = priority;
    }

    public Color getTagColor() {
        return tagColor;
    }

    public int getPriority() {
        return priority;
    }
}
