// Write your code here

package com.example.song;

public class Song {
    private int songId;
    private String songName;
    private String lyricsBy;
    private String vocalsBy;
    private String musicDirector;

    public Song(int songId, String songName, String lyricsBy, String vocalsBy, String musicDirector) {

        this.songId = songId;
        this.songName = songName;
        this.lyricsBy = lyricsBy;
        this.vocalsBy = vocalsBy;
        this.musicDirector = musicDirector;

    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getLyricsBy() {
        return lyricsBy;
    }

    public void setLyricsBy(String lyricsBy) {
        this.lyricsBy = lyricsBy;
    }

    public String getVocalsBy() {
        return vocalsBy;
    }

    public void setVocalsBy(String vocalsBy) {
        this.vocalsBy = vocalsBy;
    }

    public String getMusicDirector() {
        return musicDirector;
    }

    public void setMusicDirector(String musicDirector) {
        this.musicDirector = musicDirector;
    }

}