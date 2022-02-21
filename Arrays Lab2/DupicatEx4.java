public class DupicatEx4 {
  
    public static int modifyArray(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;  
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }
  
        temp[j++] = a[n - 1];
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }
  
        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 4,4,1,1 };
        int n = a.length;
  
        n = modifyArray(a, n);
        for (int i = 0; i < n; i++)
	    System.out.print(" removed duplicates ");
            System.out.print(" removed duplicates "+a[i] + " ");
    }
}