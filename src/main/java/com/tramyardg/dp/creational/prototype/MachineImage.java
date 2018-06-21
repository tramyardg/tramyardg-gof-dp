package com.tramyardg.dp.creational.prototype;

import java.util.logging.Logger;

public class MachineImage implements Cloneable {

    private final Logger logger = Logger.getLogger(MachineImage.class.getName());
    private StringBuilder image;
    
    public MachineImage(String software) {
	image = new StringBuilder(software);
    }
    
    public MachineImage(String os, String antivirusSoftware) {
	image = new StringBuilder();
	image.append(os).append(" + " + antivirusSoftware);
    }
    
    public void install(String software) {
	image.append(software);
    }
    
    public void printSoftware() {
	logger.info(image.toString());
    }
    
    @Override
    public MachineImage clone() throws CloneNotSupportedException {
	return new MachineImage(this.image.toString());
    }
    
}
