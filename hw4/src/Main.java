import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> listA = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            listA.add(scanner.next());
        }

        System.out.println(listA);

        ArrayList<String> listB = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            listB.add(scanner.next());
        }

        System.out.println(listB);

        Collections.reverse(listB);

        ArrayList<String> listC = new ArrayList<>();
        for(int n = 0, i = 0, j = 0; i < listA.size() && j < listB.size(); n++)
        {
            if(n % 2 == 0) {
                listC.add(listA.get(i));
                i++;
            }
            else
            {
                listC.add(listB.get(j));
                j++;
            }

        }

        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);
    }
}