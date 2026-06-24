import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        boolean[] values = {true, false};
        System.out.println("Conjunction truth-table:");
               for(boolean i : values){
                    for(boolean j : values){
                        System.out.println("\n" +
                                i +"\t" +
                                j + "\t" +
                                (i && j) +
                                "\n");
                    }
               }
        System.out.println("Disjunction truth-table:");
                for(boolean i : values){
                    for(boolean j : values){
                        System.out.println("\n" +
                                i + "\t" +
                                j + "\t" +
                                (i || j) +
                                "\n");
                    }
                }
    }
}