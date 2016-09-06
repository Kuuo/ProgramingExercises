using System;

namespace CH03 {
    class CH0302 {
        static void Main(string[] args) {
            MyClass mc1 = new MyClass();
            MyClass mc2 = new MyClass("This is a string.");
            MyClass[] mcarr = new MyClass[5];
        }
    }

    class MyClass {
        public MyClass() {
            Console.WriteLine("MyClass");
        }

        public MyClass(string str) {
            Console.WriteLine(str);
        }
    }
}
