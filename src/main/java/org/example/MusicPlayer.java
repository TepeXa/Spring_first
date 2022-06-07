package org.example;

public class MusicPlayer {
    private Music music;

    //ioc
    public MusicPlayer (Music music) {
        this.music=music;
    }

    public void playMusic() {
        System.out.println("Playing -> " + music.getSong());
    }
}
