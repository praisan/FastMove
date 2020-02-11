/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmoveV0_7_8;

/**
 *
 * @author Praisan
 */
public class Vehicle{
    private int id;
    private String driverName;

    public Vehicle(int id, String driverName) {
        this.id = id;
        this.driverName = driverName;
    }

    public int getId() {
        return id;
    }

    public String getDriverName() {
        return driverName;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", driverName=" + driverName + '}';
    }
    
    
}
