package itm.streams;

public class EvenOddChecker {

    // Method to check even or odd
    public String findEvenOdd(int number) {
        if (number % 2 == 0) {
            return number + " is Even";
        } else {
            return number + " is Odd";
        }
    }

}
