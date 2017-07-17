package sg.edu.rp.c346.movieslist;

/**
 * Created by 16022550 on 17/7/2017.
 */

public class MovieDetails {
    private String title;
    private String details;

    public MovieDetails(String title, String details){
        this.title = title;
        this.details = details;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

}
