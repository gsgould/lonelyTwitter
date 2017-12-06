/*
 * Tweet
 * Represents a TWeet
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private ArrayList<Mood> MoodList;

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    /**
     * Constructs a Tweet object
     *
     * @param message tweet message
     * @param date tweet date
     */

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    /**
     * Sets the tweet message.
     * @param message tweet message
     * @throws tweetTooLongException when tweet length is more than 140 characters
     */

    public void setMessage(String message) throws tweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else{
            throw new tweetTooLongException();
        }
    }

    /**
     * getter for date
     * @return date
     */

    public Date getDate() {
        return date;
    }

    /**
     * setter for date
     * @param date
     */
    public void setDate(Date date){ this.date = date;}

    /**
     * converts date to string and appends before message
     * @return
     */
    @Override
    public String toString(){
        return date.toString() + "|" + message;
    }

    /**
     * query if tweet is important
     * @return boolean
     */
    public abstract Boolean isImportant();

    /**
     * get list of moods
     * @param list
     */
    public void moodList(ArrayList<Mood> list){
        this.MoodList = list;
    }
}