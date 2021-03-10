package com.example.ha_minh_tu_assignment_android;

public class ConvertIconImage {
    public String convertIcon(int input){
        String Url = "https://developer.accuweather.com/sites/default/files/";
        if(input < 10){
            return  Url+"0"+input+"-s.png";
        }
        return  Url+input+"-s.png";
    }
}
