package ru.nigma.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Music music = context.getBean("rockMusic", Music.class);
//        Music music1 = context.getBean("classicalMusic", Music.class);
//        Computer computer = context.getBean("computer",Computer.class);
//        System.out.println(computer);


        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);

//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicalMusic classicalMusic = context.getBean("classicalMusic",ClassicalMusic.class);
        System.out.println(musicPlayer.playMusic());

        context.close();

    }
}
