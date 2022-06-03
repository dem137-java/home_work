package FinalWork;

public class Main {
    public static void main(String[] args) {

        Song song1 = new Song("Sergey Zukov", "Rozy", new String[]{"pop", "dance"}, new String[]{"sad", "romance"},226);
        Song song2 = new Song("Simple Plan", "Welcom to my life",new String[]{"pop", "rock"}, new String[]{"happy","life"},295);
        Song song3 = new Song("Sum41", "Still waiting",new String[]{"rock"}, new String[]{"fight", "life"},226);
        Playlist playlist1 = new Playlist("new playlist");
        playlist1.addSong(song1);
        playlist1.addSong(song2);
        playlist1.addSong(song3);
        System.out.println(playlist1);

        Utils utils = new Utils();
        utils.savePlaylist(playlist1);

        FilterByMood filter1 = new FilterByMood();
        Playlist playlist2 = filter1.filterByMood(playlist1,"sad");
        utils.savePlaylist(playlist2);

        FilterByType filter2 = new FilterByType();
        Playlist playlist3 = filter2.filterByType(playlist1, "rock");
        utils.savePlaylist(playlist3);

        FilterByTypeStream filter3 = new FilterByTypeStream();
        Playlist playlist4 = filter3.filterByType(playlist1, "pop");
        utils.savePlaylist(playlist4);

    }
}
