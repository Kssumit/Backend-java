package Java.Day01datatypes;

import java.math.BigInteger;
import java.util.Random;
import java.util.random.RandomGenerator;

class Datatypes {
    public static void main(String[] arr) {
        // byte short int long
        // float double
        // for capacity use MIN_VALUE & MAX_VALUE
        System.out.println(Integer.MIN_VALUE);
        // imp point in long (272822829292929292) this num is out of int range so use l
        // after it, otherwise no need
        long b = 272822829292929292l;
        // double use when more precision needed
        // in float use f after num (bcz java think every decimal num as double)
        float c = 100.282982982f;

        // typecasting : smaller to big (automatic)
        char ch = 'a';
        int x = ch;
        // maunally
        byte y = (byte) x;

        RandomGenerator randomGenerator = RandomGenerator.getDefault();
        System.out.println(randomGenerator.nextInt());

        double nan = Double.NaN;
        if (nan == Double.NaN)
            System.out.println("hello"); // it give false bcz every NaN is different from each each other
        if (Double.isNaN(nan))
            System.out.println("hello"); // it give true

        var generator = new Random();
        final int pi;
        if (Double.isNaN(nan)) {
            pi = 8;
        } else {
            pi = 7;
        }

        double ans = Math.floorMod(0 - 2, 12);
        System.out.println(ans);

        BigInteger n = BigInteger.valueOf(1234567890);
        var m = new BigInteger("12344567890");
        System.out.println(n);
        System.out.println(m);

        BigInteger ans1 = BigInteger.valueOf(5).multiply(n.add(m));
        System.out.println(ans1);

        int seasonNo = 4;
        String seasonName = switch (seasonNo) {
            case 1 -> "winter";
            case 2 -> "spring";
            case 3 -> "summer";
            default -> {
                System.out.println("Unexecpted seasonNo");
                yield "???";
            }
        };

        // int seasonCode = switch (seasonName) {
        //     case "spring", "winter", "summer" -> 0;
        //     case "fall" -> 1;
        //     default -> {
        //         System.out.println("Unexecpted season code");
        //         throw new IllegalArgumentException();
        //     }
        // };
        // System.out.println(seasonName);

        switch (seasonNo) {
            case 1 -> seasonName = "spring";
            case 2 -> seasonName = "winter";
            default -> {
                System.out.println("error");
                seasonName = "???";
            }
        }

        int i = 0, j = 0;
        outer: 
        while (i < 10) {
            while (j < 10) {
                j++;
                if (j == 8)
                    break outer;
            }
            System.out.println("hello");
            i++;
        }
        System.out.println("love");
    }
}