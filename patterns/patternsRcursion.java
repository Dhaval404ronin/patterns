class patternsRcursion {
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
        pattern13(n);
        pattern14(n);
        pattern17(n);
    }

     public static void pattern1Recursive(int n, int row) {
        // Base case: if all rows are printed
        if (row == n) {
            return;
        }

        // Print '*' for each column
        for (int col = 0; col < n; col++) {             // col < n  
            System.out.print("* ");
        }
        System.out.println();

        // Move to the next row
        pattern1Recursive(n, row + 1);
    }

    public static void pattern1(int n) {
        System.out.println("Pattern 1:");
        pattern1Recursive(n, 0);
        System.out.println();
    }

    public static void pattern2Recursive(int n, int row) {
        // Base case: if all rows are printed
        if (row == n) {
            return;
        }

        // Print '*' for the current row
        for (int col = 0; col <= row; col++) {            // col <= row
            System.out.print("* ");
        }
        System.out.println();

        // Move to the next row
        pattern2Recursive(n, row + 1);
    }

    public static void pattern2(int n) {
        System.out.println("Pattern 2:");
        pattern2Recursive(n, 0);
        System.out.println();
    }

    public static void pattern3Recursive(int n, int row) {
        // Base case: if all rows are printed
        if (row == n) {
            return;
        }

        // Print '*' for the current row
        for (int col = 0; col < n - row; col++) {            // col < n -  row
            System.out.print("* ");
        }
        System.out.println();

        // Move to the next row
        pattern3Recursive(n, row + 1);
    }

    public static void pattern3(int n) {
        System.out.println("Pattern 3:");
        pattern3Recursive(n, 0);
        System.out.println();
    }

    public static void pattern4Recursive(int row, int col) {
        // Base case: if all rows are printed
        if (row == 0) {
            return;
        }

        // Print numbers for the current row
        if (col < row) {
            System.out.print(col + 1 + " ");
            pattern4Recursive(row, col + 1);
        } else {
            System.out.println();
            // Move to the next row
            pattern4Recursive(row - 1, 0);
        }
    }

    public static void pattern4(int n) {
        System.out.println("Pattern 4:");
        pattern4Recursive(n, 0);
        System.out.println();
    }

    public static void pattern5Recursive(int row, int n) {
        // Base case: if row reaches 0, return
        if (row == 0) {
            return;
        }

        // Print '*' for the current row
        for (int col = 0; col < row; col++) {
            System.out.print("* ");
        }
        System.out.println();

        // Recur for the next row
        if (row < n) {
            pattern5Recursive(row + 1, n);

            // Print '*' for the current row again, except for the last row
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        System.out.println("Pattern 5:");
        pattern5Recursive(1, n);
        System.out.println();
    }


// Pattern 6:
// Function to print Pattern 6
public static void pattern6(int n) {
    System.out.println("Pattern 6:");
    pattern6Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 6
private static void pattern6Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < n - row - 1; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j <= row; j++) // Loop to print stars
        System.out.print("*");
    System.out.println();
    pattern6Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 7:
// Function to print Pattern 7
public static void pattern7(int n) {
    System.out.println("Pattern 7:");
    pattern7Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 7
private static void pattern7Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < row; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = row; j < n; j++) // Loop to print stars
        System.out.print("*");
    System.out.println();
    pattern7Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 8:
// Function to print Pattern 8
public static void pattern8(int n) {
    System.out.println("Pattern 8:");
    pattern8Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 8
private static void pattern8Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < n - row - 1; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j < 2 * row + 1; j++) // Loop to print stars
        System.out.print("*");
    System.out.println();
    pattern8Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 9:
// Function to print Pattern 9
public static void pattern9(int n) {
    System.out.println("Pattern 9:");
    pattern9Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 9
private static void pattern9Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < row; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j < 2 * (n - row) - 1; j++) // Loop to print stars
        System.out.print("*");
    System.out.println();
    pattern9Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 10:
// Function to print Pattern 10
public static void pattern10(int n) {
    System.out.println("Pattern 10:");
    pattern10Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 10
private static void pattern10Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j <= row; j++) // Loop to print stars
        System.out.print("* ");
    System.out.println();
    pattern10Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 11:
// Function to print Pattern 11
public static void pattern11(int n) {
    System.out.println("Pattern 11:");
    pattern11Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 11
private static void pattern11Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < n - row - 1; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j <= row; j++) // Loop to print stars
        System.out.print("* ");
    System.out.println();
    pattern11Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 12:
// Function to print Pattern 12
public static void pattern12(int n) {
    System.out.println("Pattern 12:");
    pattern12Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 12
private static void pattern12Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < n - row - 1; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j <= row; j++) // Loop to print stars
        System.out.print("* ");
    System.out.println();
    pattern12Recursive(n, row + 1); // Recursive call to print the next row

    for (int j = 0; j < n - row - 1; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j <= row; j++) // Loop to print stars
        System.out.print("* ");
    System.out.println();
    pattern12Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 13:
// Function to print Pattern 13
public static void pattern13(int n) {
    System.out.println("Pattern 13:");
    pattern13Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 13
private static void pattern13Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < n - row - 1; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j <= row; j++) { // Loop to print stars or spaces based on conditions
        if (j == 0 || j == row || row == n - 1)
            System.out.print("* ");
        else
            System.out.print("  ");
    }
    System.out.println();
    pattern13Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 14:
// Function to print Pattern 14
public static void pattern14(int n) {
    System.out.println("Pattern 14:");
    pattern14Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 14
private static void pattern14Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < row; j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j < 2 * (n - row) - 1; j++) { // Loop to print stars or spaces based on conditions
        if (j == 0 || j == 2 * (n - row) - 2 || row == 0)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
    pattern14Recursive(n, row + 1); // Recursive call to print the next row
}

// Pattern 17:
// Function to print Pattern 17
public static void pattern17(int n) {
    System.out.println("Pattern 17:");
    pattern17Recursive(n, 0); // Call recursive function
    System.out.println();
}

// Recursive function to print Pattern 17
private static void pattern17Recursive(int n, int row) {
    if (row == n) // Base case: If row equals n, return
        return;
    for (int j = 0; j < 2 * (n - row - 1); j++) // Loop to print spaces
        System.out.print(" ");
    for (int j = 0; j <= row; j++) // Loop to print numbers
        System.out.print(j + 1 + " ");
    for (int j = row - 1; j >= 0; j--) // Loop to print numbers in reverse order
        System.out.print(j + 1 + " ");
    System.out.println();
    pattern17Recursive(n, row + 1); // Recursive call to print the next row
}

    
}
