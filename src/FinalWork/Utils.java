package FinalWork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    public void savePlaylist(Playlist playlist){
        //File file = new File("C:\\upload\\Java\\projects\\JD1\\home_work\\src\\FinalWork\\playlist.txt");

        StringBuilder builder = new StringBuilder();
        int i =1;
        for (Song song: playlist.getList()){
            builder.append(i).append(". ").append(song.toString()).append("\n");
            i++;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\upload\\Java\\projects\\JD1\\home_work\\src\\FinalWork\\playlist.txt"))){
            bw.write(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
