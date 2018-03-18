package iot_database;

public class User {
    private int userID;
    private String user_name;
    
    public User(int userID, String user_name){
        this.userID = userID;
        this.user_name = user_name;
    }
    
    public User(String user_name){
        this.user_name = user_name;
    }
    
    public int getUserID(){
        return userID;
    } 
    
    public String getUsername(){
        return user_name;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    
    
}
