package matriz;

/**
 *
 * @author Joshua
 */
import java.util.Scanner;
public class Matriz12 {
    
    final static int tam=5;
    final static int tam2=5;
    
    public static void main(String[] args){
        
        int[][] matriz=new int[tam][tam2];
        
        rellenoMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        matrizCuadrada(matriz);
        
    }
    
    public static void rellenoMatriz(int[][] m){
        
        Scanner sc=new Scanner(System.in);
        
        //Relleno de la matriz
        for(int i=0; i<m.length; i++){
            
            for(int j=0; j<m[i].length; j++){
                
                if(i==j){
                    
                    m[i][j]=1;
                    
                }
                
                else{
                    
                    m[i][j]=0;
                    
                }
                
            }
            
        }
        
    }
    
    public static void mostrarMatriz(int[][] m){
        
        //Muestra la matriz introducida
        for(int i=0; i<m.length; i++){
            
            for(int j=0; j<m[i].length; j++){
                
                System.out.print(m[i][j] + " ");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
    public static void matrizCuadrada(int[][] m){
        
        if(m.length==m[0].length){
            
            System.out.println("Es cuadrada");
            
        }
        
        else{
            
            System.out.println("No es cuadrada");
            
        }
        
    }
    
}