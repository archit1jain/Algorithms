import java.util.*;
class dna{
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Genome");
        String genome=sc.next();
        int i,found=0,start=-1;
        for(i=0;i<genome.length()-2;i++){
            String triplet=genome.substring(i,i+3);
            if (triplet.equals("ATG"))
                start = i + 3;
            else if (((triplet.equals("TAG")) || (triplet.equals("TAA")) || (triplet.equals("TGA"))) && (start != -1)){
                String gene = genome.substring(start, i);
                if (gene.length() % 3 == 0){
                found = 1;
                System.out.println(gene);
                start = -1;
                }
            }
        }
        if (found!=1)
        System.out.println("no gene is found");
    }
}