package ru.nigma.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }

    @Bean
    public MusicPlayer musicPlayer(){
      return   new MusicPlayer(musicList());
    }

    @Bean
    Computer computer(){
        return new Computer(musicPlayer());
    }

    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(),rockMusic(),jazzMusic());
    }
}
