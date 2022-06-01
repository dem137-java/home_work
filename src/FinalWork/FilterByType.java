package FinalWork;

public class FilterByType {

    public Playlist filterByType (Playlist pl, String type) {
        Playlist newPlaylist = new Playlist("filtered playlist");
        for (Song song : pl.getList()) {
            for (String t : song.getTypes()) {
                if (t.equalsIgnoreCase(type)){
                    newPlaylist.addSong(song);
                }
            }
        }
        return newPlaylist;
    }
}
