package com.tramyardg.dp.structural.flyweight;

import com.tramyardg.dp.structural.flyweight.forest.Forest;

import java.awt.*;

public class Client {

    public static void main(String[] args) {
        Forest forest = new Forest();
        String treeType1 = "Summer Oak";
        String treeType2 = "Autumn Oak";
        int CANVAS_SIZE = 600;
        int NUM_TREES_TO_DRAW = 10000;
        int TREE_TYPES = 2;
        for (int i = 0; i < Math.floor(NUM_TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.planTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), treeType1, Color.GREEN, "Oak texture stub");
            forest.planTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), treeType2, Color.ORANGE,
                    "Autumn Oak texture stub");
        }
        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);
    }


    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
