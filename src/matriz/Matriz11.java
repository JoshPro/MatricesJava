package matriz;

/**
 *
 * @author Joshua
 */
import java.util.Scanner;
public class Matriz11 {
    
    final static int tam=3;
    
    public static void main(String[] args){
        
        int[][] matriz=new int[tam][tam];
        
        rellenoMatriz(matriz);
        mostrarMatriz(matriz);
        System.out.println("");
        mostrarDiagonal(matriz);
        System.out.println("");
        mostrarDiagonalSecundaria(matriz);
        
    }
    
    public static void rellenoMatriz(int[][] m){
        
        Scanner sc=new Scanner(System.in);
        
        //Relleno de la matriz
        for(int i=0; i<m.length; i++){
            
            for(int j=0; j<m[i].length; j++){
                
                System.out.print("Dame un elemento: ");
                m[i][j]=sc.nextInt();
                
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
    
    public static void mostrarDiagonalSecundaria(int[][] m){
        
        System.out.print("La diagonal secundaria es: ");
        
        for(int i=0; i<m.length; i++){
            
            for(int j=0; j<m[i].length; j++){
                
                if(i+j==m.length-1){
                System.out.print(m[i][j] + " ");}
                
                
            }
            
        }
        
    }
    
    public static void mostrarDiagonal(int[][] m){
        
        System.out.print("La diagonal es: ");
        
        for(int i=0; i<m.length; i++){
            
            for(int j=0; j<m[i].length; j++){
                
                if(i==j){
                System.out.print(m[i][j] + " ");}
                
                
            }
            
        }
        
    }
    
}
