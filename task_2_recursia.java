package Task_2;

public class task_2_recursia {
    static int transform(int a, int b) {
        if (a < b) {
            if (b % 2 == 0 && a <= b/2){
                b = b/2;
                return transform(a, b/2);
            } else {
                b = b - 1;
                return transform(a, b-1);
            }
        } else {
            return 0; 
        }            
        
    }

    public static void main(String[] args) {
        System.out.println(transform(1, 7));
    }
}
