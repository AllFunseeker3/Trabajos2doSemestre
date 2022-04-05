package compilacioncodigos2ca;
public class MetodoB {
    public int  MBurbuja(int[] a) {
        int i, j, z;
        for (i = 0; i < a.length -1; i++) {
            for (j = 0; j < a.length -i-1; j++) {
                if (a[j + 1] < a[j]) {
                    z =a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = z;
                    
                }
                
            }
            System.out.println("El nuevo orden es: "+a[i]);
        }
 
    return 0;
    }
    
}
