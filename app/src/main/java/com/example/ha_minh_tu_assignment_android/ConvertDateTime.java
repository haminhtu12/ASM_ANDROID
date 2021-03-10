package com.example.ha_minh_tu_assignment_android;


import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateTime {

    public String convertTime(String inputTime) {
        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = null;
        try {
            date = inFormat.parse(inputTime);
        } catch (Exception e) {
            e.toString();
        }
        SimpleDateFormat outFormat = new SimpleDateFormat("ha");
        String goal = outFormat.format(date);
        return goal;
    }
    public String timeNow(){
        return "";
    }

}
