public class KesmarkiPost {

    private String title;
    private String text;
    private String category;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getCategory() {
        return category;
    }

    public KesmarkiPost setTitle(String title) {
        this.title = title;
        return this;
    }

    public KesmarkiPost setText(String text) {
        this.text = text;
        return this;
    }

    public KesmarkiPost setCategory(String category) {
        this.category = category;
        return this;
    }

    @Override
    public String toString() {
        return "KesmarkiPost{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}