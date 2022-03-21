package ru.nigma.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private  String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;
    List<Music> musicList = new ArrayList<>();
//    {
//        musicList.add(new ClassicalMusic());
//        musicList.add(new RockMusic());
//        musicList.add(new JazzMusic());
//    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    //    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
//                       @Qualifier("rockMusic")  Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();
        int randNum = random.nextInt(3);
        return "Playing: " + musicList.get(randNum).getSong();
//      return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
