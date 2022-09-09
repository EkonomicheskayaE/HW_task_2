package Task_2;

public class task_2_var1 {

    // Нахождение кол-ва маршрутов.
    static int solve(int start, int end, int com1, int com2) {
        int [] ways = new int[end + 1];
        ways[start] = 1;
        for (int index = start + com1; index <= end; index++) {
            if(index % 2 == 0) {
                ways[index] = ways[index / com2] + ways[index - com1];
            }    else {
                ways[index] = ways[index - com1];
                        
            }
        }
        System.out.println("Количество маршрутов: ");
        System.out.println(print(ways));
        
        return ways[end];
    }

    static String print(int[] items) {
    StringBuilder sb = new StringBuilder();
    for(Integer item: items) {
        sb.append(String.format("%d", item));
    }
    return sb.toString();
    }

// вариант решения № 1.

    static int transformation(int a, int b, int com1, int com2) {
    System.out.println("Вариант решения задачи, когда двигаемся от обратного от b - чередуя операции ' - ' и ' : ', пока не догостигнем числа a: ");
    System.out.println("число a = " + a);
    System.out.println("число b = " + b);
        if (a < b) {
            while (a < b) {
                if (b % 2 != 0) {
                    b = b - com1;
                    System.out.println("операция - " + com1 + " = " + b);

                } else {
                    b = b / com2;
                    System.out.println("операция : " + com2 + " = " + b);
                }
            }                  
        } else {
            System.out.println("Решений нет!");
        }
    return a;
    }
  
// вариант решения № 2.

    static int addition(int a, int b, int com1) {
    System.out.println(" ");
    System.out.println("Вариант решения задачи, когда к числу a все время прибавляем 1, пока не догостигнем числа b: ");
    System.out.println("число a = " + a);
    System.out.println("число b = " + b);
    if (a < b) {
        while (a <= b) {
            if (a < b) {
            a += com1;
            System.out.println("операция + " + com1 + " = " + a);
            } else {
                break;
            }
        }
    } else {
        System.out.println("Решений нет!");
    }
    return b;
    }

    public static void main(String[] args) {
        System.out.println((solve(1, 7, 1, 2)));    
        System.out.println(transformation(1, 7, 1, 2));
        System.out.println(addition(1, 7, 1));
    }

}

