import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Exception{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the registration number: ");
		String r = sc.nextLine();
		System.out.println("Enter the mobile number: ");
		String m =  sc.nextLine();	
                boolean flag = true;
	
		try{
			if(r.length()>10 || m.length()>10){
                           flag = false;
                           System.out.println(m.length());
                           throw new IllegalArgumentException("Length Exceeds..!!");
                        }
			
		}
		catch(IllegalArgumentException e){
			System.out.println(e);
		}

		try{
			Pattern p = Pattern.compile("[^0-9]");
			Matcher m1 = p.matcher(m);
			boolean b = m1.find();
			if(b) {
                            flag = false;
                            throw new NumberFormatException("Invalid Mobile Number..!!");
                        }
		}
		catch(NumberFormatException e){System.out.println(e);}
		try{
			Pattern p = Pattern.compile("[^a-zA-Z0-9]");
			Matcher m1 = p.matcher(r);
			boolean b = m1.find();
			if(b) {
                            flag = false;
                            throw new NoSuchElementException("Invalid Registration number..!");
                        }
		}
		catch(NoSuchElementException e){System.out.println(e);}
                
                if(flag) System.out.println("Valid Inputs");

	}
	
}
