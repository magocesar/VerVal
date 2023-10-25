package junit;
import org.junit.Test;
import junit.framework.TestCase;
import Proj_Princ.*;

public class MusicTest {

    public MusicTest(){}

    @Test
    public void addSongTest(){
        Song s = new Song(1, "title", "artist", "album", "length_time", 2020);
        Song s2 = new Song(1, "title2", "artist2", "album2", "length_time2", 2021);

        MusicLibrary ml = new MusicLibrary();
        
        TestCase.assertEquals(s, ml.addSong(s));

        TestCase.assertEquals(ml.addSong(s2), null);
    }

    @Test
    public void searchSongTest(){
        Song s = new Song(1, "title", "artist", "album", "length_time", 2020);

        MusicLibrary ml = new MusicLibrary();

        ml.addSong(s);

        TestCase.assertEquals(s, ml.searchSong(1));

        TestCase.assertEquals(null, ml.searchSong(2));
    }

    @Test
    public void removeSongTest(){
        Song s = new Song(1, "title", "artist", "album", "length_time", 2020);

        MusicLibrary ml = new MusicLibrary();

        ml.addSong(s);

        TestCase.assertEquals(s, ml.removeSong(s));

        TestCase.assertEquals(null, ml.removeSong(s));
    }
}