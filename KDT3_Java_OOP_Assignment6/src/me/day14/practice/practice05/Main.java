package me.day14.practice.practice05;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\n" +
                "  \"name\": \"Madame Uppercut\",\n" +
                "  \"age\": 39,\n" +
                "  \"secretIdentity\": \"Jane Wilson\",\n" +
                "  \"powers\": [\n" +
                "    \"Million tonne punch\",\n" +
                "    \"Damage resistance\",\n" +
                "    \"Superhuman reflexes\"\n" +
                "  ]\n" +
                "}";

        Map<String,String> jsonMap = new HashMap<>();
        String[] jsonKeys = {"name","age","secretIdentity","powers"};
        String[] jsonValue = {"Madame Uppercut","39","Jane Wilson","[Million tonne punch, Damage resistance, Superhuman reflexes]"};

        for(int i = 0; i < jsonKeys.length; i++){
            jsonMap.put(jsonKeys[i],jsonValue[i]);
        }
        System.out.println(jsonMap);
    }
}
