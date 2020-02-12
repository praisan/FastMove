/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmoveV0_7_8;

import java.util.Comparator;

/**
 *
 * @author Praisan
 */
public class Parcel implements Comparable<Parcel> {

    private int id;
    private double lat, longi;
    private Status status;
    private double weight;

    public Parcel(int id, double lat, double longi, Status status) {
        this.id = id;
        this.lat = lat;
        this.longi = longi;
        this.status = status;
    }

    public Parcel(int id, double lat, double longi, Status status, double weight) {
        this.id = id;
        this.lat = lat;
        this.longi = longi;
        this.status = status;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

   public int compareTo(Parcel anotherParcel){
       return this.id-anotherParcel.id;
   }
   public Comparator weightComparator(){
       return new Comparator<Parcel>(){
           @Override
           public int compare(Parcel t1, Parcel t2) {
               return Double.compare(t1.weight, t2.weight);
           }
       };
   }
  

}
