/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package búsqueda.lineal;

import java.util.Scanner;



public class Busqueda_Lineal {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int elementoBuscar, posicion;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Que desea buscar: ");
        elementoBuscar = sc.nextInt();
        posicion = busquedalineal(arr, elementoBuscar);
        System.out.println("posicion del elemento"+ posicion);
         
    }
    
    public static int busquedalineal(int[] arr, int x){
        int posicion = -1;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if (arr[i] == x){
                return i;
               
            }
        }
            return posicion;
           
        }
    }

    
    
       
        



