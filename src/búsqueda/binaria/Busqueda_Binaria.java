/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package búsqueda.binaria;

import java.util.Scanner;



public class Busqueda_Binaria {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int elementoBuscar, posicion;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Que desea buscar: ");
        elementoBuscar = sc.nextInt();
        posicion = busquedabinaria(arr, elementoBuscar);
        System.out.println("posicion del elemento "+ posicion);
         
    }
    
    public static int busquedabinaria(int[] arr, int x){
        int posicion = -1;
        int low = 0;
        int high = arr.length -1;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] == x){
                return mid;
            } else if (arr[mid]< x){
                low = mid +1;
            } else{
                high = mid -1;
            }
        }
        return posicion;
              
    }
}

    
    
       
        



