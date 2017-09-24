package home_prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ProbaJavaRush {

    public static void main(String[] args) throws IOException {


        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

       // String name = a.readLine();

        ArrayList spisok = new ArrayList();

        for (int i = 0; i <10 ; i++) {
            spisok.add(i);

        }
        int razmer = spisok.size();
        for (int i = 0; i <spisok.size() ; i++) {

            System.out.print(razmer +" ");

        }
        System.out.println("");
        String s = "dfdff";
        spisok.add(0,s);
        spisok.add(5,s);

        System.out.println(razmer=spisok.size());
        spisok.set(5,"zamena");

        for (int i = 0; i < spisok.size() ; i++) {
        System.out.print(spisok.get(i)+" ");
    }
        System.out.println(" ");
        for (int i = razmer; i >0 ; i--) {
            System.out.print(spisok.get(i-1)+" ");
        }




    }

}
