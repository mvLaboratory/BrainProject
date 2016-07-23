package com.brainacad.lessons.lesson10;

/**
 * Created by mv on 20.07.2016.
 */
public interface Sumable {
    default int sum() {
        return 1;
    }
}
