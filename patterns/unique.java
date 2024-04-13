// import java.*;

class unique {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("Pattern 1:");
        pattern1(n);
        System.out.println("\nPattern 2:");
        pattern2(n);
        System.out.println("\nPattern 3:");
        pattern3(n);
        System.out.println("\nPattern 4:");
        pattern4(n);
        System.out.println("\nPattern 5:");
        pattern5(n);
        System.out.println("\nPattern 6:");
        pattern6(n);
      
    }
      // Pattern 1
    public static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        // Pattern 1:
        // 1
        // 123
        // 12345
        // 1234567        
    }

    // Pattern 2
    public static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print((i * 2) - k);
            }
            System.out.println();
        }
        // Pattern 2:
        // ***1
        // **321
        // *54321
        // 7654321
    }
    public static void pattern3(int n){
          for (int i = -n + 1; i < n; i++) {
            int absI = Math.abs(i);
            for (int j = 0; j < 2*(n - absI) - 1; j++) {
                if (j % 2 == 0)
                    System.out.print(n - absI);
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // 1
        // 2*2
        // 3*3*3
        // 4*4*4*4
        // 3*3*3
        // 2*2
        // 1
    }
    public static void pattern4(int n){
           for(int i =0; i<n;i++){
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=n-i;j++){
                    System.out.print(j);
                }
                System.out.println();
           }
            // Pattern 4:
            // 1234
            // *123
            // **12
            // ***1           
    }
    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            int p=(int)(Math.pow(4,i));
            while(p>0){
                System.out.print(p+" ");
                p=p/2;
            }
            System.out.println();
        }
        // Pattern 5:
        // 1 
        // 4 2 1 
        // 16 8 4 2 1 
        // 64 32 16 8 4 2 1 
    }
    public static void pattern6(int n){
        int p = 0;
        System.out.println(p+1);
        for(int i=0;i<n;i++){
            for(int j=0;j<=i+1;j++){
                if(p==1) p=0;
                else p=1;
                System.out.print(p);
            }
            for(int j=0;j<=i+1;j++){
                    System.out.print(p);
                     if(p==1) p=0;
                else p=1;
                }
            System.out.println();
        }
        
    }

}