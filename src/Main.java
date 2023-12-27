import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nFac = 1,rFac = 1, nrFac = 1;
        System.out.println("C(n,r)");
        System.out.print("Total Amount in a Set (n) : ");
        int n = sc.nextInt();
        System.out.print("Amount in each Sub-Set (r) : ");
        int r = sc.nextInt();

        for (int i = 1; i <= n-r; i++){
            nrFac = nrFac *i;
        }
        for (int i = 1; i <= n; i++){
            nFac = nFac * i;
        }
        for (int i = 1; i <= r; i++){
            rFac = rFac * i;
        }


        int c;
        c = (int) (nFac / (rFac * nrFac));
        System.out.println("Combination : " + c);
    }
}