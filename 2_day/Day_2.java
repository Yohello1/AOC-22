import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.*;

public class Day_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world");

        Scanner sc = new Scanner(new File("input"));
        int total_score = 0;

        while (sc.hasNext()) {
            total_score += calc(sc.nextLine());
        }

        System.out.println(total_score);
    }

    public static int calc(String input) {
        int result = 0;

        String[] split_input = input.split(" ");

        // A = Rock
        // B = Paper
        // C = Scissors
        // X = Rock
        // Y = Paper
        // Z = Scissors

        if (split_input[0].equals("A")) {
            if (split_input[1].equals("X")) {
                result += 0 + 3;
            } else if (split_input[1].equals("Y")) {
                result += 3 + 1;
            } else if (split_input[1].equals("Z")) {
                result += 6 + 2;
            }

        } else if (split_input[0].equals("B")) {
            if (split_input[1].equals("X")) {
                result += 0 + 1;
            } else if (split_input[1].equals("Y")) {
                result += 3+2;
            } else if (split_input[1].equals("Z")) {
                result += 6+3;
            }
        } else if (split_input[0].equals("C")) {
            if (split_input[1].equals("X")) {
                result += 0+2;
            } else if (split_input[1].equals("Y")) {
                result += 3+3;
            } else if (split_input[1].equals("Z")) {
                result += 6+1;
            }
        }

        // Im gonna redo this in a diff language to see
        // wait a modified version of this works for pt2 :skull:

        return result;
    }
}
