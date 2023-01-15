package org.aquarium;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Popup;

public class BadgeSingleton {
    private static BadgeSingleton uniqueInstance;

    private BadgeSingleton(){

    }

    public static BadgeSingleton getInstance(){
        if (uniqueInstance == null) {
			System.out.println("Creating unique instance of a badge");
			uniqueInstance = new BadgeSingleton();
		}
		return uniqueInstance;
    }
}