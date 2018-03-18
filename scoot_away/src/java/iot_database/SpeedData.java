package iot_database;

import java.util.Date;

public class SpeedData {
    private int speedID;
    private String userID;
    private double speed;
    private double latitude;
    private double longtitude;
    private String landmark;
    private Date startDateTime;
    private Date endDateTime;

    public SpeedData(int speedID, String userID, double speed, double latitude, double longtitude, String landmark, Date startDateTime, Date endDateTime) {
        this.speedID = speedID;
        this.userID = userID;
        this.speed = speed;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.landmark = landmark;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public SpeedData(String userID, double speed, double latitude, double longtitude, String landmark, Date startDateTime, Date endDateTime) {
        this.userID = userID;
        this.speed = speed;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.landmark = landmark;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

    public int getSpeedID() {
        return speedID;
    }

    public String getUserID() {
        return userID;
    }

    public double getSpeed() {
        return speed;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongtitude() {
        return longtitude;
    }

    public String getLandmark() {
        return landmark;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setSpeedID(int speedID) {
        this.speedID = speedID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongtitude(double longtitude) {
        this.longtitude = longtitude;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }
    
    
}
