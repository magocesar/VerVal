package Proj_Princ;

public class Song {
    
    private String title, artist, album, length_time;
    private int id, year;

    public Song(){};

    public Song(int id, String title, String artist, String album, String length_time, int year){
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.length_time = length_time;
        this.year = year;
    };

    public int getId(){
        return this.id;
    }


    public void exibirInfo(){
        System.out.println("Id: " + this.id);
        System.out.println("Título: " + this.title);
        System.out.println("Artista: " + this.artist);
        System.out.println("Álbum: " + this.album);
        System.out.println("Duração: " + this.length_time);
        System.out.println("Ano de lançameto: " + this.year);
    }
    
}