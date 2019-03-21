package test;
enum Day
{ 
    MONDAY("hello"),TUESDAY("Bye");
    private String greet;
    public String getgreet(){
        return this.greet;
    }
    private Day(String greet){
        this.greet = greet;
    }
}  
public class datatype 
{
    Day day;
    public datatype(Day day){
        this.day = day; 
    }
    public void printday(){
        System.out.println("The day you endered is: "  + day);
    }
    
    public static void main(String[] args) 
    {
         Day[] d1 = Day.values();
         for(Day d : d1){
            System.out.println(d.name() + "- " + d.getgreet()) ;
         }
    } 
}
