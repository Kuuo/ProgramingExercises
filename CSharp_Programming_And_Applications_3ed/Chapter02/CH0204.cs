using System;

class MainClass {
    static void Main() {
        for (int i = 1; i < 6; i++) {
            Console.Write(i*i + " ");
        }
        Console.WriteLine();
        int n = 1;
        while (n < 6) {
            Console.Write(n*n + " ");
            n++;
        }
        Console.WriteLine();
        n = 1;
        do {
            Console.Write(n*n + " ");
            n++;
        } while (n < 6);
    }
}