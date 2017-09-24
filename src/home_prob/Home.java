package home_prob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Павел on 02.08.2017.
 */
public class Home {
    public static void main(String[] args) throws IOException {


        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("введите имя");
        String name = a.readLine();

        System.out.println("введите число");
        String age = a.readLine();
        //int age1 = Integer.parseInt(age);


        System.out.println(name+ " захватит мир через "+ age + " года! Му-ха-ха!");







    }
}
