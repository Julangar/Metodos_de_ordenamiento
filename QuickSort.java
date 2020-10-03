public class QuickSort {
    int particion(int arreglo[], int menor, int mayor) 
    { 
        int pivote = arreglo[mayor];  
        int i = (menor-1); // indice del menor elemento
        for (int j=menor; j<mayor; j++) 
        { 
            // Si el elemento actual es menor que el pivote
            if (arreglo[j] < pivote) 
            { 
                i++; 
  
                // cambia arreglo[i] y arreglo[j] 
                int aux = arreglo[i]; 
                arreglo[i] = arreglo[j]; 
                arreglo[j] = aux; 
            } 
        } 
  
        // cambia arreglo[i+1] y arreglo[mayor] (o pivote) 
        int aux = arreglo[i+1]; 
        arreglo[i+1] = arreglo[mayor]; 
        arreglo[mayor] = aux; 
  
        return i+1; 
    } 
  
  
    /*
      arreglo[] --> Areglo a organizar, 
      menor  --> Inicio del indice, 
      mayor  --> Final del indice */
    void organizar(int arreglo[], int menor, int mayor) 
    { 
        if (menor < mayor) 
        { 
            // pi particiona el indice, arreglo[pi] esta al lado derecho 
            int pi = particion(arreglo, menor, mayor); 
  
            // Organiza los elmentos antes y despues de la particion
            organizar(arreglo, menor, pi-1); 
            organizar(arreglo, pi+1, mayor); 
        } 
    } 
  

    static void ImpArr(int arreglo[]) 
    { 
        int n = arreglo.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arreglo[i]+" "); 
        System.out.println(); 
    } 
  
    public static void main(String args[]) 
    { 
        int arreglo[] = {10, 7, 50, 9, 33, 5, 6,20,11,4,15,3}; 
        int n = arreglo.length; 
        System.out.println("Arreglo dado:");
        ImpArr(arreglo);
        QuickSort ob = new QuickSort(); 
        ob.organizar(arreglo, 0, n-1); 
        System.out.println("Arreglo ordenado:"); 
        ImpArr(arreglo); 
    } 
}
