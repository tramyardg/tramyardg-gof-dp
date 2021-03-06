package com.tramyardg.dp.structural.flyweight.trees;

import java.awt.*;

public class TreeType {

    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    void draw(Graphics g, int x, int y) {
        // trunks
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 4, 6);
        // head of the tree
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }

}
