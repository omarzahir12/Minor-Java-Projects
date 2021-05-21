public class Merge {
    public static void main (int [] first, int [] second) {
        int firstIndex = 0;
        int secondIndex = 0;
        while (firstIndex < first.length && secondIndex < second.length) {
            if (first[firstIndex] < second[secondIndex]) {
                System.out.println(first[firstIndex]);
                firstIndex++;
            } else {
                System.out.println(second[secondIndex]);
                secondIndex++;
            }
        }
    }

}


