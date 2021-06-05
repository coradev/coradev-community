package model;

public class Lesson {

    private int id, chapterId;
    private String title;
    private String videoLink;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

}
