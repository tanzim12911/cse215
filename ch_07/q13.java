package ch07;

public class q13 {
    public static void main(String[] args) {
        System.out.print("Random number: " + getRandom(13, 23, 39));
    }

    public static int getRandom(int... numbers) {
        int numRandom = (int) (1 + Math.random() * 53);

        for (int x: numbers) {
            
            if (numRandom == x)
                getRandom(numbers);
        }
        return numRandom;
    }
}
