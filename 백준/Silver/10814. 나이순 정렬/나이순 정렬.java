import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        List<Person> list = new ArrayList<>();

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(new Person(Integer.parseInt(st.nextToken()), i, st.nextToken()));
        }

        list.sort((a, b) -> {
            if(a.age == b.age) {
                return Integer.compare(a.num, b.num);
            }

            return Integer.compare(a.age, b.age);
        });

        for(Person p : list) {
            bw.write(p.age + " " + p.name + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }

    public static class Person {
        int age;
        int num;
        String name;

        Person(int age, int num, String name) {
            this.age = age;
            this.num = num;
            this.name = name;
        }
    }
}
