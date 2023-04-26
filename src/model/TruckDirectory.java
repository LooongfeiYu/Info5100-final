/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yulon
 */
public class TruckDirectory {
    
    private ArrayList<User> trucks;   
    
    private static volatile TruckDirectory instance = null;

    private TruckDirectory() {
        trucks = new ArrayList<>();
    }
    
    public static TruckDirectory getInstance(){
        if(instance == null){
            synchronized(TruckDirectory.class){
                if(instance == null){
                    instance = new TruckDirectory();
                }
            }
        }
        return instance;
    }

    public ArrayList<User> getTrucks() {
        return trucks;
    }

    public void setTrucks(ArrayList<User> trucks) {
        this.trucks = trucks;
    }
}
