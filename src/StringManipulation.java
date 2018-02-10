import java.util.*;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        String inputString = src.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(inputString);
        int n = src.nextInt();
        String[] in = new String[n];
        String temp = src.nextLine();

        for(int i=0;i<n;i++){
            in[i] = src.nextLine();
        }


        for(int i=0;i<n;i++){
            String[] strings = in[i].split(" ");

            int x1 = Integer.parseInt(strings[0]);
            int x2 = Integer.parseInt(strings[1]);
            char c = strings[2].charAt(0);

            for(int j=x1;j<=x2;j++){
                if(c=='L'){
                    char change = sb.charAt(j);
                    change = (char)((change - 1));
                    if(change==('a'-1))
                        change = 'z';
                sb.setCharAt(j,change);

                }else {
                    char change = sb.charAt(j);
                    change = (char)((change + 1));
                    if(change==('z'+1))
                        change = 'a';
                    sb.setCharAt(j,change);
                }
            }

        }

        String op = new String(sb);
        System.out.println(op);
    }
}
