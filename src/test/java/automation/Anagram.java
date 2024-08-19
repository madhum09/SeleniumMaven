package automation;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String st1, String st2) 
    {
   
    st1 = st1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    st2 = st2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
    
    char[] arr1 = st1.toCharArray();
    char[] arr2 = st2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
 
    return Arrays.equals(arr1, arr2);
}

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    while (true) {
        System.out.println("enter the strings: st1 st2");
        String anag = sc.nextLine();
        if (anag.equals("."))
        break ;
        String [] T = anag.split(" ");
        if (T.length != 2)
            break;

        System.out.println(isAnagram(T[0], T[1]));
    }
    sc.close();
    
}
}