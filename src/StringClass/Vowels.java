package StringClass;

public class Vowels {
    public static void main(String[] args) {
        String a="Helloiamdnyaneshwaryeware";
        int cnt = 0;
        for(int i=0;i<a.length();i++){
            char curr = a.charAt(i);
            if(curr=='a'){
                cnt++;
            } else if (curr=='e') {
                cnt++;
            } else if (curr=='i') {
                cnt++;
            }else if (curr=='o'){
                cnt++;
            } else if (curr=='u') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
