package Proj_Interface;
import Proj_Princ.Song;

public interface MusicLibInterface{
    public Song addSong(Song Song);
    public Song removeSong(Song Song);
    public Song searchSong(int id);
} 