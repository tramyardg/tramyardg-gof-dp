package com.tramyardg.dp.structural.facade.examples.weddingplanner;

import com.tramyardg.util.LoggerSingleton;

class Photographer {

    void book() {
        LoggerSingleton.getInstance(this.getClass().getName()).info("Book photographer");
    }

}
