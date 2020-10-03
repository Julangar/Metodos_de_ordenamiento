public class MergeSort {

    /* Mezcla dos subarreglos de arr[]. 
    Primer arreglo es arr[l..m] 
    Segundo arreglo es arr[m+1..r] */
    void mezclar(int arr[], int l, int m, int r) 
    { 
        // Halla los tamaños de los arreglos a ser ordenados
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        // Crea arreglos auxiliares 
        int I[] = new int [n1]; 
        int D[] = new int [n2]; 
  
        //Copia los elementos a los auxiliares
        for (int i=0; i<n1; ++i) 
            I[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            D[j] = arr[m + 1+ j]; 
  
  
        // Indices iniciales del primer y segundo subarreglos
        int i = 0, j = 0; 
  
        // Indice inicial del arreglo mezclado
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (I[i] <= D[j]) 
            { 
                arr[k] = I[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = D[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Copia los elementos restates de I[], si hay
        while (i < n1) 
        { 
            arr[k] = I[i]; 
            i++; 
            k++; 
        } 
  
        // Copia los elementos restates de D[], si hay
        while (j < n2) 
        { 
            arr[k] = D[j]; 
            j++; 
            k++; 
        } 
    } 
  

    void organizar(int arr[], int l, int r) 
    { 
        if (l < r) 
        { 
            // Encuentra el punto medio
            int m = (l+r)/2; 
  
            // Organiza las mitades
            organizar(arr, l, m); 
            organizar(arr , m+1, r); 
  
            // Mezcla las partes
            mezclar(arr, l, m, r); 
        } 
    } 
    //Funcion para imprimir un arreglo
    static void ImpArr(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  

    public static void main(String args[]) 
    { 
        int arr[] = {5, 11, 2, 35, 6, 7}; 
        System.out.println("Arreglo dado"); 
        ImpArr(arr);   
        MergeSort ob = new MergeSort(); 
        ob.organizar(arr, 0, arr.length-1); 
        System.out.println("Arreglo ordenado"); 
        ImpArr(arr); 
    } 
}
