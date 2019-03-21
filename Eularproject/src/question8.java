import java.util.*;

public class question8 {
    public static void main(String[] args) {
        HashMap<String, List<String>> h1 = new LinkedHashMap<>();
        HashMap<String, String> h2 = new LinkedHashMap<>();
        System.out.println();
        System.out.println("Checking if the HasMaps are empty after creation: ");
        System.out.println("is studentsMapping empty?: " + h1.isEmpty());
        System.out.println("is subjectsMapping empty?: " + h2.isEmpty());
        System.out.println();
        // creating list of subjects and adding to hash map
        List<String> subjects = Arrays.asList("Python", "Maths", "C");
        h1.put("A",subjects);
        subjects = Arrays.asList("C","C++");
        h1.put("B",subjects);
        subjects = Arrays.asList("C++","Physics","Chemistry");
        h1.put("C",subjects);

        // creating hashmap of faculty
        h2.put("Python","111");
        h2.put("Math","222");
        h2.put("C","333");
        h2.put("C++","444");
        h2.put("Physics","555");
        h2.put("Chemistry","666");
        h2.put("Digital Electronics","777");

        System.out.println("Key-Vaue Pairs in h1 map: ");
        // displaying all students and subjects
        for(Map.Entry m:h1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        System.out.println("Key-Vaue Pairs in h2 map: ");
        // displaying all subjects and faculty
        for(Map.Entry m:h2.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a student: ");
        String s = sc.nextLine();

        System.out.println("Faculties are: ");
        h1.forEach((k, v) -> {
            if(k.equals(s))
            v.forEach(w -> {for(Map.Entry m:h2.entrySet()){
                if(m.getKey().equals(w))
                    System.out.println(m.getValue());
            }});
        });
        //Deleting Student A record from map h1
        h1.remove("A");
        System.out.println();
        System.out.println("Key-Vaue Pairs in h1 map after deleting Student A's records: ");
        // displaying all students and subjects
        for(Map.Entry m:h1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}