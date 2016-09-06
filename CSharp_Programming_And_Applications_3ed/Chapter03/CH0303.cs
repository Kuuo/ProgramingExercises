using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace CH03 {
    class CH0303 {
        static void Main(string[] args) {
            A a = new A();
            Console.WriteLine(a.MyMethod(1));
            B b = new B();
            Console.WriteLine(b.MyMethod(1));
        }
    }

    class A {
        public virtual int MyMethod(int arg) {
            return arg + 10;
        }
    }

    class B : A {
        public override int MyMethod(int arg) {
            return arg + 50;
        }
        
    }
}
