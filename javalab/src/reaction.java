import java.util.*;
import java.io.*;
import java.util.regex.Pattern;


public class reaction {
    public static void main(String[] args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String s = br.readLine().trim();
     String[][] s1 = new String[2][]; 
     String[] reaction = s.trim().split("->");
     String[] reactant = reaction[0].trim().split("\\+");
     String[] product = reaction[1].trim().split("\\+");
     System.out.print("Reactants are ");
    for(String i: reactant){
       i = i.trim();
       if(Pattern.matches("[2-9]",i.substring(0,1))){
           System.out.print(i.substring(0,1)+ " moles of " + i.substring(1)+  ". ");
       }
       else
           System.out.print(1+ " mole of " + i.substring(0)+ ". ");
    }
    
    System.out.print("\nProducts are ");
    
    for(String i: product){
       i = i.trim();
       if(Pattern.matches("[2-9]",i.substring(0,1))){
           System.out.print(i.substring(0,1)+ " moles of " + i.substring(1)+  ". ");
       }
       else
           System.out.print(1+ " mole of " + i.substring(0)+". ");
    }
    System.out.println(" ");
   }
}
