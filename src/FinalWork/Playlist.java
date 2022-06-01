package FinalWork;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String name;
    private String description;
    private List<Song> list;

    public Playlist(String name, String description, List<Song> list) {
        this.name = name;
        this.description = description;
        this.list = list;
    }

    public Playlist(String name, String description) {
        this(name, description, new ArrayList<>());
    }

    public Playlist(String name) {
        this(name, "default");
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song){
        list.add(song);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Song> getList() {
        return list;
    }

    public void setList(List<Song> list) {
        this.list = list;
    }
}
