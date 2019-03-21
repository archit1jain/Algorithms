import java.util.*;
import java.io.*;
public class FilmMain {
    public static void main(String[] args) throws IOException{
        Vector<Film> v = new Vector<>();
        System.out.println("Enter number of films you want to add: ");
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            System.out.println("Enter name,language,lead_actor,category and duration of the film: ");
            String name = br.readLine(); 
            String language=br.readLine();
            String lead_actor=br.readLine();
            String category=br.readLine();
            sc.nextLine();
            int duration = sc.nextInt();
            Film obj = new Film(name,language,lead_actor,category,duration);
            
            v.add(obj);
        }
        System.out.println(v.get(0).getName());
        System.out.println("The English film(s) that has Arnold as its lead actor and that runs for shortest duration.");
        int min=Integer.MAX_VALUE;
        Film res = new Film("No such movie exist"," "," "," ",0);
        for (int i =0;i<v.size();i++) {
            Film obj = (Film) v.get(i);
            if("English".equals(obj.getlang()) && "arnold".equals(obj.getlead())){
                if(obj.getdur()<min) res = obj;
            }
        }
        System.out.println(res.getName());
        System.out.println("The Tamil film(s) with Rajini as lead actor.");
        for (Film obj : v) {
            if("Tamil".equals(obj.getlang()) && "Rajini".equals(obj.getlead()))
                System.out.println(obj.getName());
        }
        System.out.println("All the comedy movies: ");
        for (Film obj : v) {
            if("Comedy".equals(obj.getcategory()))
                System.out.println(obj.getName());
        }
    }
}
