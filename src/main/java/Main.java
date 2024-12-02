public class Main {
  public static int average(int[] array) {
          int sum = 0;
          for (int num : array) {
              sum += num;
          }
          return sum / array.length;
      }
      public static double average(double[] array) {
          double sum = 0;
          for (double num : array) {
              sum += num;
          }
          return sum / array.length;
      }
      public static void main(String[] args) {
          java.util.Scanner input = new java.util.Scanner(System.in);
          double[] numbers = new double[10];
          System.out.println("Enter 10 double values:");
          for (int i = 0; i < 10; i++) {
              numbers[i] = input.nextDouble();
          }
          double avg = average(numbers);
          System.out.println("The average is: " + avg);
      }
  }