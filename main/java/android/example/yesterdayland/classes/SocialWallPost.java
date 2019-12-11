package android.example.yesterdayland.classes;

import android.text.style.TtsSpan;

import java.util.Date;

public class SocialWallPost {

    private String content;
    private final String AUTHOR_NAME;
    private final int AUTHOR_ID;
    private final long TIME;


    public SocialWallPost(String content, String AUTHOR_NAME, int AUTHOR_ID) {

        this.content = content;
        this.AUTHOR_NAME = AUTHOR_NAME;
        this.AUTHOR_ID = AUTHOR_ID;
        this.TIME = new Date().getTime();

    }

    // Method to extract information for SocialWall UI
    public String[] getUiInfo() { return new String[]{ this.AUTHOR_NAME, this.content}; }

    // Setter method for content
    public void setContent(String newContent) {
        this.content = newContent;
    }

    // Getter method for content
    public String getContent() { return this.content; }

    // Getter method for author name
    public String getAuthorName() { return this.AUTHOR_NAME; }

    // Getter method for time
    public long getTime() { return this.TIME; }

}

