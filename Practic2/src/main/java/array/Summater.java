package array;

public class Summater implements IArraySummater
    {public int[] sum(int [] mass) {
        mass = new int[]{1, 3, 20, 1};

        return mass;
    }

    public int pairSummater(final int [] mass) {
        int sum = 0;
        int maxElement = 0;

        int[] a = new int[mass.length / 2];
        for (int i = 0; i < mass.length - 1; i += 2)
            { a[sum] = mass[i] + mass[i + 1];
                if (maxElement < a[sum]) {maxElement = a[sum];
                    }
                        sum += 1;
             }
        return maxElement;
    }

    public int simpleSummater(final int [] mass) {
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        return sum;
    }
}