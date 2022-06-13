package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
// private List<Music> musicList = new ArrayList<>();

    //public void setMusicList(List<Music> musicList) {
     //   this.musicList = musicList;
    //}



    //ioc
    @Autowired
    public MusicPlayer ( @Qualifier("rapMusic")Music music) {
       this.music=music;
   }

    //public MusicPlayer () {
    //}

    //public void setMusic(Music music) {
    //    this.music = music;
    //}

   public void playMusic() {
       System.out.println("Playing -> " + music.getSong());
   }

  //  public void playMusicList() {
   //     for(Music music : musicList) {
    //        System.out.println("Playing -> " + music.getSong());
     //   }
   // }
}
