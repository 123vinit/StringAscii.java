import java.util.*;
public class StringAscii {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a valid string:");
        String name= sc.nextLine();
        System.out.println("character"+"\t"+"Aciicode");

        for(int i=0;i<name.length();i++){
             char value=name.charAt(i);
            System.out.println(value+"\t\t\t"+(int)value);
            //System.out.printf("%d",(int)value);

        }
    }
}
