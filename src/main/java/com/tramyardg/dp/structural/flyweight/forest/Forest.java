package com.tramyardg.dp.structural.flyweight.forest;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.tramyardg.dp.structural.flyweight.trees.Tree;
import com.tramyardg.dp.structural.flyweight.trees.TreeFactory;
import com.tramyardg.dp.structural.flyweight.trees.TreeType;

public class Forest extends JFrame {

    private List<Tree> trees = new ArrayList<>();
    
    public void planTree(int x, int y, String name, Color color, String otherTreeData) {
	TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
	Tree tree = new Tree(x, y, type);
	// name, color and type bundle
	trees.add(tree);
    }
    
    @Override
    public void paint(Graphics graphics) {
        for (Tree tree : trees) {
            tree.draw(graphics);
        }
    }
    
}
