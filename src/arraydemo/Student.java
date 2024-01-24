/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemo;

/**
 * added few comments on 24 jan at 1:53PM
 * @author aswad
 * added comments for pull
 * added comment for fetch and merge
 */
public class Student {
    private int sID;
    private String sName;
    public Student(int sID, String sName){
        this.sID = sID;
        this.sName = sName;
    }
    public int getsID() {
        return sID;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
}
