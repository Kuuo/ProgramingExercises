using System;

class MainClass {
    static void Main() {
        Console.WriteLine("{0}--{0:p}good", 12.34F);
        Console.WriteLine("{0}--{0:####}good", 0);
        Console.WriteLine("{0}--{0:00000}good", 456);
    }
}