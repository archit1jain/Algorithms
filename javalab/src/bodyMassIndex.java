import java.util.*;
public class bodyMassIndex{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first,last,x;
        float wt,ht,bmi;
        first=sc.next();
        System.out.println("Enter last name: ");
        last=sc.next();
        System.out.println("Enter height in m: ");
        ht=sc.nextFloat();
        System.out.println("Enter weight in Kg: ");
        wt=sc.nextFloat();
        bmi = wt/ht/ht;
        System.out.println(first + " " + last );
        System.out.println("BMI:" +bmi);
        if(bmi<18.5)
            x="Underweight";
        else if(bmi>=18.5 && bmi<25)
            x="Normal (healthy weight)";
        else if(bmi>=25 && bmi<30)
            x="Overweight";
        else
            x="Obese Class";
        System.out.println("Category: " + x);
}
}
