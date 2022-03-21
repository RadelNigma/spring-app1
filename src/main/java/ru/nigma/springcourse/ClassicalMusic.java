package ru.nigma.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music{

//        private String[] songs = {"Болеро","Лунная соната","Пэр Гюнт"};
//    private List<String> songs = new ArrayList<>();
//    {
//        songs.add("Болеро");
//        songs.add("Лунная соната");
//        songs.add("Пэр Гюнт");
//    }
    @PostConstruct
    public void doMyInit(){
        System.out.println("Do my initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Do my destruction");
    }

    @Override
    public String getSong() {
        return "Болеро";
    }
}
