// celcius to fahrenheit

import java.util.*;
import java.io.*;

class Temp {
  public static void main(String arg[]) {
    double temperature;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter temperature in celcius");
    temperature = input.nextDouble();
    double farenhite = (temperature * 9 / 5) + 32;
    System.out.println("Temperature in farenhite is " + farenhite);
  }
}
