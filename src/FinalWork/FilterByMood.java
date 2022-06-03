package FinalWork;

public class FilterByMood {

    public Playlist filterByMood (Playlist pl, String mood) {
        Playlist newPlaylist = new Playlist("filtered playlist");
        for (Song song : pl.getList()) {
            for (String t : song.getMoods()) {
                if (t.equalsIgnoreCase(mood)){
                    newPlaylist.addSong(song);
                }
            }
        }
        return newPlaylist;
    }
}
