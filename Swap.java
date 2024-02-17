import java.util.*;
import java.io.*;

class Swap {
  public static void swao(String[] args) {
    int a = 10;
    int b = 20;
    int temp;
    System.out.println("Before swapping a = " + a + " b = " + b);
    temp = a;
    a = b;
    b = temp;
    System.out.println("After swapping a = " + a + " b = " + b);
  }
}
