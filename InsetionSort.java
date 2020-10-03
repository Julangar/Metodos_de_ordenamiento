public class InsetionSort {

    static void OrdenarInsercion(int arreglo[]) {
        int aux, cont1, cont2;
        for (cont1 = 1; cont1 < arreglo.length; cont1++) {
            aux = arreglo[cont1];
            for (cont2 = cont1 - 1; cont2 >= 0 && arreglo[cont2] > aux; cont2--) {
                arreglo[cont2 + 1] = arreglo[cont2];
                arreglo[cont2] = aux;
            }
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

    public static void main(String[] args) {
        int[] arreglo = { 5, 11, 2, 35, 6, 7 };
        System.out.println("Arreglo dado:");
        ImpArr(arreglo);
        OrdenarInsercion(arreglo);
        System.out.println("Arreglo ordenado:");
        ImpArr(arreglo);

    }
}
