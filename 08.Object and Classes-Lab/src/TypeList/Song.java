package TypeList;

public class Song {
    private String typeList;
    private String name;
    private String time;


    public Song(String typeList, String name, String time) {
        this.typeList = typeList;
        this.time = time;
        this.name = name;
    }

    public String getTypeList() {
        return typeList;
    }

    public String getName() {
        return name;
    }
}
