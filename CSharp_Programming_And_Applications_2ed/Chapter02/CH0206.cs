using System;

namespace textbookEX {
    class CH0206 {
        static bool Check(string str) {
            if (str.Length != 5) return false;
            foreach (char c in str) {
                if (!char.IsUpper(c)) return false;
            }
            return true;
        }
        static void Main(string[] args) {
            bool accept = false;
            do {
                Console.WriteLine("请输入5个大写字母：");
                accept = Check(Console.ReadLine());
            } while (!accept);
        }
    }
}
