using System;

namespace textbookEX {
    class CH0207 {
        static void Main() {
            Console.WriteLine("请输入一个整数：");
            int n = int.Parse(Console.ReadLine());
            if (n < 0) {
                return;
            } else {
                for (int i = 1; i < n; i++) {
                    Console.Write(i + " ");
                }
            }
        }
    }
}
