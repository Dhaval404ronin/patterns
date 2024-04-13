class patterns {
    public static void main(String[] args) {    
        int n = 5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);
        pattern17(n);
        pattern18(n);
        pattern19(n);
        pattern20(n);
        pattern21(n);
        pattern22(n);
        pattern23(n);
        pattern26(n);
        pattern28(n);
        pattern30(n);
        pattern31(n);
        pattern32(n);
        pattern33(n);
        pattern34(n);
        pattern35(n);
    }

    public static void pattern1(int n) {
        System.out.println("Pattern 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 1:
        // * * * * * 
        // * * * * * 
        // * * * * * 
        // * * * * * 
        // * * * * * 
    }

    public static void pattern2(int n) {
        System.out.println("Pattern 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 2:
        // * 
        // * * 
        // * * * 
        // * * * * 
        // * * * * *
    }

public static void pattern3(int n) {
    System.out.println("Pattern 3:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
    // Pattern 3:
    // * * * * * 
    // * * * * 
    // * * * 
    // * * 
    // *
}

    public static void pattern4(int n) {
        System.out.println("Pattern 4:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 4:
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5 
    }

    public static void pattern5(int n) {
        System.out.println("Pattern 5:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 5:
        // * 
        // * * 
        // * * * 
        // * * * * 
        // * * * * * 
        // * * * * 
        // * * * 
        // * * 
        // * 
    }

    public static void pattern6(int n) {
        System.out.println("Pattern 6:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 6:
        //         *
        //         **
        //         ***
        //         ****
        //         *****
    }

    public static void pattern7(int n) {
        System.out.println("Pattern 7:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
//         pattern 7:
//               *****
//                ****
//                 ***
//                  **
//                   *
    }

    public static void pattern8(int n) {
        System.out.println("Pattern 8:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 8:
        //     *
        //    ***
        //   *****
        //  *******
        // *********
    }

    public static void pattern9(int n) {
        System.out.println("Pattern 9:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 9:
        // *********
        //  *******
        //   *****
        //    ***
        //     *
    }

    public static void pattern10(int n) {
        System.out.println("Pattern 10:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 10:
        // * 
        // * * 
        // * * * 
        // * * * * 
        // * * * * * 
    }

    public static void pattern11(int n) {
        System.out.println("Pattern 11:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 11:
        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * * 
    }

    public static void pattern12(int n) {
        System.out.println("Pattern 12:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 12:
        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * * 
        //  * * * * 
        //   * * * 
        //    * * 
        //     * 
    }

    public static void pattern13(int n) {
        System.out.println("Pattern 13:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 13:
        //     * 
        //    * * 
        //   *   * 
        //  *     * 
        // * * * * * 
    }

    public static void pattern14(int n) {
        System.out.println("Pattern 14:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                if (j == 0 || j == 2 * (n - i) - 2 || i == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 14:
        // *********
        //  *     *
        //   *   *
        //    * *
        //     *
    }

    public static void pattern15(int n) {
        System.out.println("Pattern 15:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 15:
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        //    ***
        //   *****
        //  *******
        // *********
    }

    public static void pattern16(int n) {
        System.out.println("Pattern 16:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoeff(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 16:
        //         1 
        //       1 1 
        //     1 2 1 
        //   1 3 3 1 
        // 1 4 6 4 1 
    }

    public static void pattern17(int n) {
        System.out.println("Pattern 17:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 17:
        //         1 
        //       1 2 1 
        //     1 2 3 2 1 
        //   1 2 3 4 3 2 1 
        // 1 2 3 4 5 4 3 2 1 
    }

    public static void pattern18(int n) {
        System.out.println("Pattern 18:");
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 18:
        // ****
        // *  *
        // *  *
        // ****
    }

    public static void pattern19(int n) {
        System.out.println("Pattern 19:");
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2 + 1; i++) {
            for (int j = 0; j < n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 19:
        //     *****
        //      ***
        //       *
        //      ***
        //     *****
    }

    public static void pattern20(int n) {
        System.out.println("Pattern 20:");
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 20:
        //     *****
        //     *   *
        //     *   *
        //     *   *
        //     *****
    }

    public static void pattern21(int n) {
        System.out.println("Pattern 21:");
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        System.out.println();
        // pattern 21:
        //     1 
        //     2 3 
        //     4 5 6 
        //     7 8 9 10 
        //     11 12 13 14 15
    }

    public static void pattern22(int n) {
        System.out.println("Pattern 22:");
        for (int i = 0; i < n; i++) {
            int num = i % 2 == 0 ? 1 : 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 22:
        //     1 
        //     0 1 
        //     1 0 1 
        //     0 1 0 1 
        //     1 0 1 0 1 
    }

    public static void pattern23(int n) {
        System.out.println("Pattern 23:");
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 23:
        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * * 
    }

    public static void pattern26(int n) {
        System.out.println("Pattern 26:");
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        System.out.println();
//         attern 26:
//               1 
//             2 3 
//           4 5 6 
//         7 8 9 10 
//   11 12 13 14 15 
    }

 

    public static void pattern28(int n) {
        System.out.println("Pattern 28:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 28:
        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * * 
        //  * * * * 
        //   * * * 
        //    * * 
        //     * 
    }

  
    public static void pattern30(int n) {
        System.out.println("Pattern 30:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
    //     pattern 30:
    //         1 
    //       1 2 1 
    //     1 2 3 2 1 
    //   1 2 3 4 3 2 1 
    // 1 2 3 4 5 4 3 2 1 
    }

    public static void pattern31(int n) {
        System.out.println("Pattern 31:");
        int num = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num--;
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
            num = n;
        }
        System.out.println();
    //     pattern 31:
    //         5 
    //       5 4 3 
    //     5 4 3 2 1 
    //   5 4 3 2 1 0 -1 
    // 5 4 3 2 1 0 -1 -2 -3 
    }

    public static void pattern32(int n) {
        System.out.println("Pattern 32:");
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        System.out.println();
        // pattern 32:
        // A 
        // B C 
        // C D E 
        // D E F G 
        // E F G H I 
    }

    public static void pattern33(int n) {
        System.out.println("Pattern 33:");
        char ch = 'a';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(Character.toUpperCase(ch++) + " ");
                } else {
                    System.out.print(Character.toLowerCase(ch++) + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        
//       Pattern 33:
//       A 
//       B c 
//       D e F 
//       G h I j 
//       K l M n O 
    }

    public static void pattern34(int n) {
        System.out.println("Pattern 34:");
        for (int i = 0; i < n; i++) {
            char ch = 'A';
            for (int j = 0; j < n - i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
        System.out.println();
        // Pattern 34:
        // A B C D E 
        // A B C D 
        // A B C 
        // A B 
        // A 
    }

    public static void pattern35(int n) {
        System.out.println("Pattern 35:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * (n - i - 1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
        System.out.println();
    //     Pattern 35:
    //         1 
    //       1 2 1 
    //     1 2 3 2 1 
    //   1 2 3 4 3 2 1 
    // 1 2 3 4 5 4 3 2 1 
    }

    private static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
