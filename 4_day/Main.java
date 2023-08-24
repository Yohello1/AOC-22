import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("input");
        Scanner sc;

        sc = new Scanner(file);


        // I ONLY WANT THE INTS, DANG IT!
        sc.useDelimiter(",|\n|-");

        int p1 = 0;
        int p2 = 0;

        while(sc.hasNext()){

            int x_1 = Integer.parseInt(sc.next());
            // why r there random charcters lmaoooo
            int x_2 = Integer.parseInt(sc.next().trim());

            int y_1 = Integer.parseInt(sc.next());
            int y_2 = Integer.parseInt(sc.next().trim());

            // p1 sol

            if(x_1 <= y_1 && x_2 >= y_2){
                System.out.println("Thaaa");
                p1++;
            } else if(y_1 <= x_1 && y_2 >= x_2){
                System.out.println("threee");
                p1++;
            }


            // Part 2 Solution
            if(x_1 <= y_1 && x_2 >= y_1){
                p2++;
            } else if(y_1 <= x_1 && y_2 >= x_1){
                p2++;
            }

        }


        System.out.println(p1 + " " + p2);


    }
}