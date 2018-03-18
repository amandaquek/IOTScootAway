/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iot_database;

import java.util.Date;

public class SpeedingCases {
    private int speedingCase;
    private Date date;

    public SpeedingCases(Date date, int speedingCase) {
        this.speedingCase = speedingCase;
        this.date = date;
    }

    public int getSpeedingCase() {
        return speedingCase;
    }

    public void setSpeedingCase(int speedingCase) {
        this.speedingCase = speedingCase;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
