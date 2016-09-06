using System;

namespace textbookEX {
    class CH0208 {
        static void Main() {
            for (int i = 6; i < 1001; i++) {
                int upperBound = i / 2;
                int sum = 1;
                for (int j = 2; j <= upperBound; j++) {
                    if (i % j == 0) sum += j;
                }
                if (sum == i) {
                    Console.Write(i + " ");
                }
            }
        }
    }
}
