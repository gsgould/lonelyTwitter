package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


public class Contempt extends currentMood{
    public Contempt(Date date){
        setCurrentDate(date);
    }
    public Contempt(){
        Date CurrentDate = new Date();
        setCurrentDate(CurrentDate);
    }

    @Override
    public String whatMood() {
        String mood = "Contempt";
        return mood;
    }
}