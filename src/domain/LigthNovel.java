package domain;

public class LigthNovel {
    private String title ;
    private double prince;

    public LigthNovel(String title, double prince) {
        this.title = title;
        this.prince = prince;
    }

    public String getTitle() {
        return title;
    }

    public double getPrince() {
        return prince;
    }

    @Override
    public String toString() {
        return "domain.LigthNovel{" +
                "title='" + title + '\'' +
                ", prince=" + prince +
                '}';
    }
}
