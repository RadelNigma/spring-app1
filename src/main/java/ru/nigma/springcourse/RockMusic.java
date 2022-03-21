package ru.nigma.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class RockMusic implements Music{

//    private String[] songs = {"Это всё","Unforgiven","Show mast go on"};
//private List<String> songs = new ArrayList<>();
//    {
//        songs.add("Это всё");
//        songs.add("Unforgiven");
//        songs.add("Show mast go on");
//    }
    @Override
    public String getSong() {
        return "Это всё";
    }
}
