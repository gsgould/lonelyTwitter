/*
 * Mood
 * Abstract class Mood
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {
    private Date CurrentDate;

    public Date getCurrentDate() {
        return CurrentDate;
    }

    public void setCurrentDate(Date currentDate) {
        CurrentDate = currentDate;
    }

    public abstract String whatMood();
}