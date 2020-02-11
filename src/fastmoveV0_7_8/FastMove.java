package fastmoveV0_7_8;

public class FastMove {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle vehicle =new Vehicle(1,"John");
        Job job001=new Job(vehicle);
        Parcel parcel01=new Parcel(0, 13.662348, 100.502370,Status.PACKED);
        Parcel parcel02=new Parcel(1, 13.658739, 100.494089,Status.PACKED);
        job001.add(parcel01);
        job001.add(parcel02);
        System.out.println(job001);
    }
    
}
