/*
 * Name:    Zaki Jefferson
 *
 * Project:     Polynomial
 * Description: The ability to take two polynomials and perform addition
 *              Performs this by using a Array to store the coefficients
 *              and exponents.
 *              It will then be sorted by matching the exponents and
 *              performing addition on the coefficients.
 */

// Pre-Condition: Must have positive ints (coefficients & exponents).
// Post-Condition: Sorts the coefficients and exponents and adds
//                  the matching exponent's coefficients.

package Projects;

public class Polynomial {
    // A utility function to return maximum of two integers
    static int max(int m, int n) {
        return (m > n) ? m : n;
    }

    // A[] represents coefficients of first polynomial
    // B[] represents coefficients of second polynomial
    // m and n are sizes of A[] and B[] respectively
    static int[] add(int A[], int B[], int m, int n) {
        int size = max(m, n);
        int sum[] = new int[size];

        // Initialize the product polynomial
        for (int i = 0; i < m; i++) {
            sum[i] = A[i];
        }

        // Take ever term of first polynomial
        for (int i = 0; i < n; i++) {
            sum[i] += B[i];
        }

        return sum;
    }

    // A utility function to print a polynomial
    static void printPoly(int poly[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(poly[i]);
            if (i != 0) {
                System.out.print("x^" + i);
            }
            if (i != n - 1) {
                System.out.print(" + ");
            }
        }
    }

    // Driver program to test above functions
    public static void main(String[] args) {
        // The following array represents polynomial 5 + 10x^2 + 6x^3
        int A[] = {5, 0, 10, 6};

        // The following array represents polynomial 1 + 2x + 4x^2
        int B[] = {1, 2, 4};
        int m = A.length;
        int n = B.length;
        System.out.println("First polynomial is");
        printPoly(A, m);
        System.out.println("\nSecond polynomial is");
        printPoly(B, n);
        int sum[] = add(A, B, m, n);
        int size = max(m, n);
        System.out.println("\nsum polynomial is");
        printPoly(sum, size);

    }
}
