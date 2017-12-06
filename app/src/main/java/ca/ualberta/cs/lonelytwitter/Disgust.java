package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Disgust extends currentMood {
    public Disgust(Date date){
        setCurrentDate(date);
    }
    public Disgust(){
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }

    @Override
    public String whatMood() {
        String mood = "Disgust";
        return mood;
    }
}