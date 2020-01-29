/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmoveV0_7_5;

/**
 *
 * @author Praisan
 */
public class Parcel {

    private int id;
    private double lat, longi;
    private Status status;

    public Parcel(int id, double lat, double longi, Status status) {
        this.id = id;
        this.lat = lat;
        this.longi = longi;
        this.status = status;
    }

    public double[] getLatLong() {
        return new double[]{this.lat, this.longi};
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(" ");
        str.append(this.id);
        str.append(" ");
        str.append(this.lat);
        str.append(" ");
        str.append(this.longi);
        str.append(" ");
        str.append(this.status);
        return str.toString();
    }
    
    public Parcel clone(){
        Parcel temp =new Parcel(this.id,this.lat,this.longi,this.status);
        return temp;
    }

}
