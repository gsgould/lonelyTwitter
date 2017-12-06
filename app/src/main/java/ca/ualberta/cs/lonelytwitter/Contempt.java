/*
 * Contempt
 *
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Contempt extends Mood {

    public Contempt(Date date){
        setCurrentDate(date);
    }

    /**
     * Happy mood constructor with default date
     */
    public Contempt(){
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }

    /**
     * Query what mood it is
     * @return String
     */
    @Override
    public String whatMood() {
        String mood = "Contempt";
        return mood;
    }
}