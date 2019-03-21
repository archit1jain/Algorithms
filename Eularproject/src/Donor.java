import java.io.Serializable;
class Donor implements Serializable{
 String name;
 int age;
 String address;
 String contactnumber;
 String bloodgroup;
 String date;
 Donor(String name,int age,String address,String contactnumber,String
bloodgroup,String date){
 this.name = name;
 this.age = age;
 this.address = address;
 this.contactnumber = contactnumber;
 this.bloodgroup = bloodgroup;
 this.date = date;
 }
 @Override
 public String toString(){
 return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " +
address + "\n" + "Contact Number: " + contactnumber + "\n" + "Blood Group: " +
bloodgroup + "\n" + "Last Date of Donation: " + date;
 }
}