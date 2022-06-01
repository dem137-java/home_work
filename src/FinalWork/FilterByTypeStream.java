package FinalWork;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByTypeStream {

    public Playlist filterByType (Playlist pl, String type) {
        Playlist newPlaylist = new Playlist("filtered playlist");
        List<Song> songList = pl.getList().stream()
                .filter(song -> {
                    for (String songType : song.getTypes()) {
                        if (songType.equalsIgnoreCase(type)) {
                            return true;
                        }
                    }
                    return false;
                }).collect(Collectors.toList());
        newPlaylist.setList(songList);
        return newPlaylist;
    }
}
