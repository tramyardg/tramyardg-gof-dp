package com.tramyardg.dp.behavioral.state;

import com.tramyardg.util.LoggerSingleton;

/**
 * Demonstrate State design pattern without the use of inheritance
 *
 * @author RAYMARTHINKPAD
 */
public class TVRemoteBasic {

    private String state = "";
    private static final String TV_ON = "ON";
    private static final String TV_OFF = "OFF";

    private void setState(String state) {
        this.state = state;
    }

    private void doAction() {
        if (state.equalsIgnoreCase(TV_ON)) {
            LoggerSingleton.getInstance(this.getClass().getName()).info("TV is turned on!");
        } else if (state.equalsIgnoreCase(TV_OFF)) {
            LoggerSingleton.getInstance(this.getClass().getName()).info("TV is turned off!");
        }
    }

    public static void main(String[] args) {
        TVRemoteBasic test = new TVRemoteBasic();
        test.setState(TV_ON);
        test.doAction();

        test.setState(TV_OFF);
        test.doAction();
    }

}
