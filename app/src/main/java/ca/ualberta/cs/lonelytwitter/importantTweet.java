/*
 * importantTweet
 * Represents an important tweet.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class importantTweet extends Tweet {
    /**
     * Constructor with just message. Date will set automatically.
     * @param message
     */
    public importantTweet(String message){
        super(message);
    }

    /**
     * Constructor with both message and date
     * @param message
     * @param date
     */
    public importantTweet(String message, Date date)
    {
        super(message, date);
    }

    /**
     * Check if tweet is important
     * @return bool
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}