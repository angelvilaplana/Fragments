package orihuel.vilaplana.angel.fragments;

import java.io.Serializable;

public class Disc implements Serializable {

    private int idImage;

    private String title;

    private String subtitle;

    private String description;

    public Disc(int idImage, String title, String subtitle, String description) {
        this.idImage = idImage;
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
    }

    public int getIdImage() {
        return idImage;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDescription() {
        return description;
    }

}
