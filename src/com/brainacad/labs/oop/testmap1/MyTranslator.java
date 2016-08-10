package com.brainacad.labs.oop.testmap1;

import java.util.HashMap;

public class MyTranslator {
    private HashMap<String, String> dictionary = new HashMap<>();

    public void addNewWord(String en,String ua) {
        dictionary.put(en, ua);
    }

    public String translate(String en) {
        return dictionary.get(en);
    }
}
