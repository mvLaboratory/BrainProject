package com.brainacad.lessons.lesson14;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mv on 08.08.2016.
 */
public class Lesson {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("qw", 3);
        map.put("qw1", 33);
        map.put("qw2", 32);
        map.put("qw3", 31);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }
}
