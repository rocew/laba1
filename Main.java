import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1.1: ");
        System.out.print("Введите число с дробной частью: ");
        double frac = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(main.fraction(frac));

        System.out.println("Задание 1.3: ");
        System.out.print("Введите символ цифры: ");
        char charInput = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println(main.charToNum(charInput));

        System.out.println("Задание 1.5: ");
        System.out.print("Введите число для проверки на двузначность: ");
        int twoDigitsInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.is2Digits(twoDigitsInput));

        System.out.println("Задание 1.7: ");
        System.out.print("Введите три числа (a, b, num): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.isInRange(a, b, num));

        System.out.println("Задание 1.9: ");
        System.out.print("Введите три числа (a, b, c): ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int c1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.isEqual(a1, b1, c1));

        System.out.println("Задание 2.1: ");
        System.out.print("Введите число для вычисления модуля: ");
        int absInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.abs(absInput));

        System.out.println("Задание 2.3: ");
        System.out.print("Введите число для проверки на делимость на 3 или 5: ");
        int is35Input = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.is35(is35Input));

        System.out.println("Задание 2.5: ");
        System.out.print("Введите три числа (x, y, z): ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.max3(x, y, z));

        System.out.println("Задание 2.7: ");
        System.out.print("Введите два числа (x, y): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.sum2(x1, y1));

        System.out.println("Задание 2.9: ");
        System.out.print("Введите число от 1 до 7 для определения дня недели: ");
        int dayInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.day(dayInput));

        System.out.println("Задание 3.1: ");
        System.out.print("Введите число для вывода списка чисел: ");
        int listNumsInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.listNums(listNumsInput));

        System.out.println("Задание 3.3: ");
        System.out.print("Введите число для вывода четных чисел: ");
        int chetInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.chet(chetInput));

        System.out.println("Задание 3.5: ");
        System.out.print("Введите число для подсчета количества цифр: ");
        long numLenInput = scanner.nextLong();
        scanner.nextLine();
        System.out.println(main.numLen(numLenInput));

        System.out.println("Задание 3.7: ");
        System.out.print("Введите число для вывода квадрата: ");
        int squareInput = scanner.nextInt();
        scanner.nextLine();
        main.square(squareInput);

        System.out.println("Задание 3.9: ");
        System.out.print("Введите число для вывода прямоугольного треугольника: ");
        int rightTriangleInput = scanner.nextInt();
        scanner.nextLine();
        main.rightTriangle(rightTriangleInput);

        System.out.println("Задание 4.1: ");
        System.out.print("Введите элементы массива через пробел: ");
        String arr1input = scanner.nextLine();
        String[] stringArray = arr1input.split(" ");
        int[] arr1 = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            arr1[i] = Integer.parseInt(stringArray[i]);
        }
        System.out.print("Введите число для поиска: ");
        int x2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println(main.findFirst(arr1, x2));

        System.out.println("Задание 4.3: ");
        System.out.print("Введите массив чисел через пробел: ");
        String[] arr3Input = scanner.nextLine().split(" ");
        int[] arr3 = new int[arr3Input.length];
        for (int i = 0; i < arr3Input.length; i++) {
            arr3[i] = Integer.parseInt(arr3Input[i]);
        }
        System.out.println(main.maxAbs(arr3));

        System.out.println("Задание 4.5: ");
        System.out.print("Введите массив чисел через пробел: ");
        String[] arr5Input = scanner.nextLine().split(" ");
        int[] arr5 = new int[arr5Input.length];
        for (int i = 0; i < arr5Input.length; i++) {
            arr5[i] = Integer.parseInt(arr5Input[i]);
        }
        System.out.print("Введите массив чисел для вставки через пробел: ");
        String[] insInput = scanner.nextLine().split(" ");
        int[] ins = new int[insInput.length];
        for (int i = 0; i < insInput.length; i++) {
            ins[i] = Integer.parseInt(insInput[i]);
        }
        System.out.print("Введите позицию для вставки: ");
        int pos = scanner.nextInt();
        scanner.nextLine();
        int[] result = main.add(arr5, ins, pos);
        if (result != null) {
            System.out.print("Ответ: ");
            for (int num2 : result) {
                System.out.print(num2 + " ");
            }
            System.out.println();
        }

        System.out.println("Задание 4.7: ");
        System.out.print("Введите массив чисел через пробел: ");
        String[] arr7Input = scanner.nextLine().split(" ");
        int[] arr7 = new int[arr7Input.length];
        for (int i = 0; i < arr7Input.length; i++) {
            arr7[i] = Integer.parseInt(arr7Input[i]);
        }
        int[] reversedArr = main.reverseBack(arr7);
        System.out.print("Ответ: ");
        for (int num3 : reversedArr) {
            System.out.print(num3 + " ");
        }
        System.out.println();

        System.out.println("Задание 4.9: ");
        System.out.print("Введите массив чисел через пробел: ");
        String[] arr9Input = scanner.nextLine().split(" ");
        int[] arr9 = new int[arr9Input.length];
        for (int i = 0; i < arr9Input.length; i++) {
            arr9[i] = Integer.parseInt(arr9Input[i]);
        }
        System.out.print("Введите число для поиска: ");
        int xx = scanner.nextInt();
        scanner.nextLine();
        int[] result4 = main.findAll(arr9, xx);
        System.out.print("Ответ: ");
        for (int index : result4) {
            System.out.print(index + " ");
        }
        System.out.println();
        scanner.close();
    }

    public double fraction(double x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        return x - (int)x;
    }

    public int charToNum(char x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        return x - '0';
    }

    public boolean is2Digits(int x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    public boolean isInRange(int a, int b, int num) {
        System.out.print("  Входные данные: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.println(num);
        System.out.print("  Ответ: ");
        int min, max;
        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }
        return num >= min && num <= max;
    }

    public boolean isEqual(int a, int b, int c) {
        System.out.print("  Входные данные: ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.println(c);
        System.out.print("  Ответ: ");
        return (a == b) && (b == c);
    }

    public int abs(int x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        if (x < 0) {
            return -x;
        }
        return x;
    }

    public boolean is35(int x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        boolean del3 = (x % 3 == 0);
        boolean del5 = (x % 5 == 0);
        return (del3 || del5) && !(del3 && del5);
    }

    public int max3(int x, int y, int z) {
        System.out.print("  Входные данные: ");
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
        System.out.print(" ");
        System.out.println(z);
        System.out.print("  Ответ: ");
        int maxXY;
        if (x > y) {
            maxXY = x;
        } else {
            maxXY = y;
        }
        if (maxXY > z) {
            return maxXY;
        } else {
            return z;
        }
    }

    public int sum2(int x, int y) {
        System.out.print("  Входные данные: ");
        System.out.print(x);
        System.out.print(" ");
        System.out.println(y);
        System.out.print("  Ответ: ");
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        System.out.print("  Входные данные: ");
        System.out.println(x);
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        System.out.print("  Ответ: ");
        return result.toString();
    }

    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        System.out.print("  Входные данные: ");
        System.out.println(x);
        for (int i = 0; i <= x; i += 2) {
            result.append(i).append(" ");
        }
        System.out.print("  Ответ: ");
        return result.toString();
    }

    public int numLen(long x) {
        int count = 0;
        System.out.print("  Входные данные: ");
        System.out.println(x);
        if (x == 0) {
            return 1;
        }
        if (x < 0) {
            x = -x;
        }

        while (x > 0) {
            x /= 10;
            count++;
        }
        System.out.print("  Ответ: ");
        return count;
    }

    public void square(int x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        System.out.println();
        for (int i = 0; i < x; i++) {
            System.out.print("          ");
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        System.out.println();
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }
            System.out.print("          ");
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {
        System.out.print("  Входные данные: ");
        System.out.println(x);
        System.out.print("  Ответ: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        System.out.print("  Ответ: ");
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не может быть пустым");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            return null;
        }
        int[] newArray = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, newArray, 0, pos);
        System.arraycopy(ins, 0, newArray, pos, ins.length);
        System.arraycopy(arr, pos, newArray, pos + ins.length, arr.length - pos);
        return newArray;
    }

    public int[] reverseBack(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public int[] findAll(int[] arr, int x) {
        System.out.print("  Ответ: ");
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        int[] ind = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ind[index++] = i;
            }
        }
        return ind;
    }
}
