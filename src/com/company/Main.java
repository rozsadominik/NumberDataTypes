package com.company;
import java.util.*;

public class Main {
        public static void checkNumDataTypes() {
            Scanner scanner  = new Scanner(System.in);
            int n            = scanner.nextInt();

            for(int i=0;i<n;i++)
            {
                try
                {
                    long x=scanner.nextLong();
                    System.out.println(x+" can be fitted in:");
                    if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                        System.out.println("* byte");
                    }
                    if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                        System.out.println("* short");
                    }
                    if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                        System.out.println("* int");
                    }
                    if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                        System.out.println("* long");
                    }
                }
                catch(Exception e)
                {
                    System.out.println(scanner.next()+" can't be fitted anywhere.");
                }
            }
            scanner.close();
        }

        public static void main(String []argh)
        {
            checkNumDataTypes();
        }
}
