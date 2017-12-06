/*
 * NormalTweet
 * Normal Tweet
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class normalTweet extends Tweet {
    public normalTweet(String message) {
        super(message);
    }

    public normalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}