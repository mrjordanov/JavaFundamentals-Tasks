public class Articles {
    private String title;
    private String content;
    private String author;


    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void renameTitle(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}
