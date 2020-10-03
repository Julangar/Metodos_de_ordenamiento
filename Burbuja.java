public class Burbuja{

    public static int[] burbuja(int[] arreglo)
    {
      int auxiliar;
      int[] arregloOrdenado;
      for(int i = 0; i < arreglo.length; i++)
      {
        for(int j = 0;j < arreglo.length-1;j++)
        {
          if(arreglo[j] > arreglo[j+1])
          {
            auxiliar = arreglo[j];
            arreglo[j] = arreglo[j+1];
            arreglo[j+1] = auxiliar;
          }   
        }
      }
      arregloOrdenado = arreglo;
      return arregloOrdenado;
    }

    static void ImpArr (int arreglo[]){
        int n = arreglo.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arreglo[i]+" "); 
        System.out.println(); 
    }
    
    public static void main(String[] args) 
    {
      //Valores que tiene el arreglo desordenado.
      int arreglo[] = {87,6,76,2,17,3,60,8,7,13,92,71,15,23};
      System.out.println("Arreglo dado:");
      ImpArr(arreglo);
      int arregloOrdenado[] = burbuja(arreglo);
 
      //Imprimimos el arreglo ordenado.
      System.out.println("Arreglo ordenado:");
      ImpArr(arregloOrdenado);
    }
}