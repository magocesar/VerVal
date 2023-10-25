package Proj_Princ;
import Proj_Interface.MusicLibInterface;
import java.util.ArrayList;

public class MusicLibrary implements MusicLibInterface{
    
    private ArrayList<Song> songs;

    public MusicLibrary(){
        songs = new ArrayList<Song>();
    };

    public Song addSong(Song Song){
        //Verificar de id ja existe
        for(Song s : songs){
            if(s.getId() == Song.getId()){
                return null;
            }
        }
        songs.add(Song);
        return Song;
    }

    public Song removeSong(Song Song){
        for(Song s : songs){
            if(s.getId() == Song.getId()){
                songs.remove(s);
                return Song;
            }
        }
        return null;
    }

    public Song searchSong(int id){
        for(Song s : songs){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }

}