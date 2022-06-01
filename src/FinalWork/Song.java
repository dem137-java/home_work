package FinalWork;

public class Song {
    private String singer;
    private String name;
    private String[] types;
    private String[] moods;
    private int timeInSec;

    public Song(String singer, String name, String[] types, String[] moods, int timeInSec) {
        this.singer = singer;
        this.name = name;
        this.types = types;
        this.moods = moods;
        this.timeInSec = timeInSec;
    }

    public Song(String singer, String name, String[] types, String[] moods) {
        this(singer,name,types,moods,0);
    }

    public Song(String singer, String name, String[] types) {
        this(singer,name,types, null);
    }

    public Song(String singer, String name) {
        this(singer,name,null);
    }

    public Song() {
        this("new singer","new name");
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    public String[] getMoods() {
        return moods;
    }

    public void setMoods(String[] moods) {
        this.moods = moods;
    }

    public int getTimeInSec() {
        return timeInSec;
    }

    public void setTimeInSec(int timeInSec) {
        this.timeInSec = timeInSec;
    }
    private int [] secToMins(int lengthInSec){
        int [] time = new int[2];
        time[0] = timeInSec/60;
        time[1] = timeInSec%60;
        return time;
    }

    @Override
    public String toString() {
        return singer + " - " + name + " " + secToMins(timeInSec)[0] + ":"+secToMins(timeInSec)[1];
    }
}
