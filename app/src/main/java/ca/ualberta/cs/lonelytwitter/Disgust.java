/*
 * Disgust
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Disgust extends Mood {

    public Disgust(Date date){
        setCurrentDate(date);
    }

    /**
     * Happy mood constructor with default date
     */
    public Disgust(){
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }

    /**
     * Query what mood it is
     * @return String
     */
    @Override
    public String whatMood() {
        String mood = "Disgust";
        return mood;
    }
}