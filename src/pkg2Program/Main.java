package pkg2Program;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList array = PrimesGenerator.CreateArray(10);
        PrimesGeneratorTest pgt = new PrimesGeneratorTest(array);
        pgt.PrintArray();
    }
}
