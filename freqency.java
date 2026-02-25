import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
     a=a.toLowerCase();
     b=b.toLowerCase();
     if(a.length()!=b.length()){
        return false;
     }
     int [] counts=new int[26];
     for(int i=0;i<a.length;i++){
        char c=a.charAt(i);
        count[c-'a']++;
     }
     for(int i=0;i<b.length;i++){
        char c=b.charAt(i);
        count[c-'b']--;
     }
     for(int count : counts){
        if(count != 0){
            return false;
        }
     }
     }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}