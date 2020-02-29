package com.example.a3;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TagMapModel {

    HashMap<String, List<String>> map = new HashMap<>();

    public void add(String tag, String id) {
        List<String> list = get(tag);

        if (list == null) {
            list = new ArrayList<String>();
            map.put(tag, list);
        }
        list.add(id);
    }

    public List<String> get(String tag) {
        return map.get(tag);
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static TagMapModel fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, TagMapModel.class);
    }


}