package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
       //         "applicationContext.xml"
       // );

        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        //MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);

        //boolean compare = musicPlayer == musicPlayer2;
        //System.out.println(compare);
        System.out.println(musicPlayer);
        //System.out.println(musicPlayer2);
       // musicPlayer.playMusicList();
        System.out.println("Name    -> "+ musicPlayer.getName());
        System.out.println("Volume  -> "+ musicPlayer.getVolume());
        musicPlayer.playMusic();

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic1==classicalMusic2);
        context.close();
    }
}
