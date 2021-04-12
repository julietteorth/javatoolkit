package myutils;

public class Array {
    
    public static void print(int[] t) {
        int len = t.length;
        System.out.print("[");
        if (len >= 1) {
            System.out.print(t[0]);
        }
        for (int i = 1; i < len; i++) {
            System.out.print(", " + t[i]);
        }
        System.out.println("]");
    }

        
    public static void print(String[] t) {
        int len = t.length;
        System.out.print("[");
        if (len >= 1) {
            System.out.print(t[0]);
        }
        for (int i = 1; i < len; i++) {
            System.out.print(", " + t[i]);
        }
        System.out.println("]");
    }


    public static int[] genArray(int size) {
        int[] t = new int[size];
        for (int i = 0; i < t.length; i++) {
            t[i] = (int)(Math.random() * 101);
        }
        return t;
    }

}
