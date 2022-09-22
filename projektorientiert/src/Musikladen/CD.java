package Musikladen;

import java.util.ArrayList;

public class CD {
    private Interpret interpret;
    private ArrayList<Song> songs = new ArrayList<Song>();
    public CD() {
    }

    public CD(Interpret interpret) {
        super();
        this.interpret = interpret;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(int position) {
        songs.remove(position);
    }

    public ArrayList<Song> suche(String suchStr) {
        ArrayList<Song> treffer = new ArrayList<Song>();
        for (Song song : songs) {
            if (song.getTitel().contains(suchStr)) {
                treffer.add(song);
            }
        }
        return songs;
    }

    public void ausgabe() {
        interpret.ausgabe();

        for (Song song : songs) {
            song.ausgabe();
        }
    }
}
