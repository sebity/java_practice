package com.jantatham;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jan on 29/03/17.
 */
public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        languages.put("Basic", "Beginners All Purpose Symbolic Instruction Code");
        languages.put("Lisp", "A beautiful language");

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        }
        else {
            languages.put("Java", "This course is about Java");
        }

        System.out.println(languages.get("Java"));
        System.out.println("====================================================");

//        languages.remove("Python");
        if(languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        }
        else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "A beautiful language",
                             "a functional language with imperative features")) {
            System.out.println("Lisp replaced");
        }
        else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "this will not be added"));
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
