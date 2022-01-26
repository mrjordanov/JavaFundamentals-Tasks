package TypeListV2;

public class Song {
    private String typeList;
    private String nameOfSong;
    private String duration;

    public Song(String typeList, String nameOfSong, String duration) {
        this.typeList = typeList;
        this.nameOfSong = nameOfSong;
        this.duration = duration;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getTypeList() {
        return this.typeList;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public String getNameOfSong() {
        return this.nameOfSong;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return this.duration;
    }

}
