package android.example.yesterdayland.classes;

import java.util.ArrayList;

public class Performance {

    // Declare attributes
    private String title, dateTime, artist, venue, descriptionLong, descriptionShort;
    private ArrayList<EventParticipant> participants = null;

    // Constructor to create new performance object
    public Performance(String title, String dateTime, String artist, String venue, String descriptionLong, String descriptionShort) {

        // Initialize attributes
        this.title = title;
        this.dateTime = dateTime;
        this.artist = artist;
        this.venue = venue;
        this.descriptionLong = descriptionLong;
        this.descriptionShort = descriptionShort;

    }

    // Define method to obtain performance information, long or short
    public String[] getInfo(boolean longVersion) {
        if (longVersion) {
            return new String[]{this.title, this.dateTime, this.artist, this.venue, this.descriptionLong};
        } else {
            return new String[]{this.title, this.dateTime, this.artist, this.venue, this.descriptionShort};
        }
    }

    // Define method to add a new participant to the performance
    public void addParticipant(EventParticipant newParticipant) {
        participants.add(newParticipant);
    }


    // Define setter methods
    public void setTitle(String newTitle) { this.title = newTitle; }
    public void setDateTime(String newDateTime) { this.dateTime = newDateTime; }
    public void setArtist(String newArtist) { this.artist = newArtist; }
    public void setVenue(String newVenue) { this.venue = newVenue; }
    public void setDescriptionLong(String newDescriptionLong) { this.descriptionLong = newDescriptionLong; }
    public void setDescriptionShort(String newDescriptionShort) { this.descriptionShort = newDescriptionShort; }

    // Define getter methods
    public String getTitle() { return this.title; }
    public String getDateTime() { return this.dateTime; }
    public String getArtist() { return this.artist; }
    public String getVenue() { return this.venue; }
    public String getDescriptionLong() { return this.descriptionLong; }
    public String getDescriptionShort() { return this.descriptionShort; }

}
