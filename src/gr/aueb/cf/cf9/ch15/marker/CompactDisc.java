package gr.aueb.cf.cf9.ch15.marker;

public class CompactDisc implements Item{
    String title;
    int id;

    CompactDisc() {

    }

    public CompactDisc(String title, int id) {
        this.title = title;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

