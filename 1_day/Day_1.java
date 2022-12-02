/**
 * Day_1
 * 
 * @Author Yohwllo
 * @date 2022/12/01
 */

import java.util.*;
import java.io.*;

class Day_1
{
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Hello world");
        // cant be this many, right?
        int[] vals = new int[1500];
        for(int i = 0; i < 1500; i++){ vals[i] = 0;}
        int index = 0;
        // wahy
        Scanner sc = new Scanner(new File("input"));

        while(sc.hasNextLine())
        {
            String line = sc.nextLine();

            // track elf
            if(line.equals(""))
            {
                index++;
            }
            else
            {
                int temp = Integer.parseInt(line);
                vals[index] += temp;
            }
        }

        Arrays.sort(vals);

        System.out.println(vals[1499]);
        System.out.println(vals[1498]);
        System.out.println(vals[1497]);


    }
}