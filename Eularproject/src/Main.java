import java.io.*;
import java.text.*;
import java.util.*;
class Main {
 public static void main(String[] args) throws IOException, ClassNotFoundException{

 Donor donor1 = new Donor("Archit Jain ",22,"L-621","9874563215","O+ve","06-02-2019");
 Donor donor2 = new Donor("Rahul",22,"F-821","7530000460","A+ve","12-01-2018");
 Donor donor3 = new Donor("Shanatanu",19,"L-1021","8524569870","Ave","25-02-2018");
 Donor donor4 = new Donor("Mehul",18,"E-01","9564521320","O-ve","13-08-2005");
 Donor donor5 = new Donor("kaushik",21,"L621","9461016424","A+ve","01-05-2012");
 Donor donor6 = new Donor("ojasva",22,"F-303","7530045605","A+ve","26-12-2018");
 File f = new File("donor.txt");
 FileOutputStream fos = new FileOutputStream(f);
 ObjectOutputStream oos = new ObjectOutputStream(fos);
 oos.writeObject(donor1);
 oos.writeObject(donor2);
 oos.writeObject(donor3);
 oos.writeObject(donor4);
 oos.writeObject(donor5);
 oos.writeObject(donor6);
 fos.close();
 oos.close();
 FileInputStream fis = new FileInputStream(f);
 ObjectInputStream ois = new ObjectInputStream(fis);
 Date dt = new Date();
 String date = new SimpleDateFormat("dd-MM-yyyy").format(dt);
 int cday = Integer.parseInt(date.substring(0,2));
 int cmonth = Integer.parseInt(date.substring(3,5));
 int cyear = Integer.parseInt(date.substring(6,10));
 System.out.println();
 System.out.println("The donors with blood Group A+ve and have not donated blood for recent 6 months are: ");
 System.out.println();
 for(int i=0; i<6; i++){
 Donor d = (Donor) ois.readObject();
 int dday = Integer.parseInt(d.date.substring(0,2));
 int dmonth = Integer.parseInt(d.date.substring(3,5));
 int dyear = Integer.parseInt(d.date.substring(6,10));
 int difday = (cday - dday)*(1/30);
 int difmonth = cmonth - dmonth;
 int difyear = (cyear - dyear)*12;
 int diff = (difyear + difmonth + difday);
 if(d.bloodgroup.equals("A+ve") && diff >= 6){
 System.out.println(d);
 System.out.println();
 }
 }

 fis.close();
 ois.close();
 }
}