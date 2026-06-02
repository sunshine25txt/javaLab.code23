void main() {
    // A: for(int i=1; i<=5; i++) {
    //     for (int j=1; j<=5; j++) {
    //         // if (j==3) break;
    //         // if (j==3) break A;
    //         // if (j==3) continue;
    //         if (j==3) continue A;
    //         IO.print(i+","+j+" ");
    //     }
    //     IO.println();
    // }
    A: {
        IO.println("Block A");
        {
            IO.println("Nested Block A");
            // break; //error: break outside switch or loop
            // break A; // error: unreachable statement
            if (true) break A;
            // if (true) break B; // error: undefined label: B
            // if (true) continue A; //error: not a loop label: A

        }
        IO.println("Block A End");
    }
    B: {
        IO.println("Block B");
        {
            IO.println("Nested Block B");
        }
        IO.println("Block B End");
    }
}