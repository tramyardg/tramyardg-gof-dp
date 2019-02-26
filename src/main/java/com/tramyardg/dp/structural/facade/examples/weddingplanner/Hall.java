package com.tramyardg.dp.structural.facade.examples.weddingplanner;

import com.tramyardg.util.LoggerSingleton;

class Hall {

    void book() {
        LoggerSingleton.getInstance(this.getClass().getName()).info("Book marriage hall");
    }

}
