package ss12.bai_tap.bai_2;

import java.util.*;

public class WordInclude {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your String");
        String inputString = scanner.nextLine();

        String[] array = inputString.split(" ");
        int size = array.length;
        for (int i = 0; i < size; i++) {
            int count = 0;

            for (int j = 0; j < size; j++) {

                if (array[i].equals(array[j])) {
                    count++;
                } else {
                    map.put(array[i].toLowerCase(), 1);
                }
            }
            if (count > 0) {
                map.put(array[i].toLowerCase(), count);
            }


        }
        System.out.println( "word in your String " + map);
    }


}





