import myutils.*;
import myutils.time.*;
import myutils.list.*;

class Main {
    public static void main(String[] args) {
        StopWatch c = new StopWatch();
        c.start();
        int[] t = {1, 2, 4};
        List l = new List();
        l.push(t);
        Array.print(t);
        System.out.println(l.sum()); 
        System.out.println(l.mean());
        System.out.println(l.max());
        //int[] t2 = Array.genArray(20000);

        File.cat("README.md");
        Time.print();
        c.stop();
        System.out.println(c);
    }
}