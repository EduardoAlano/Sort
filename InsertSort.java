/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulaJava;

import java.util.Arrays;

/**
 *
 * @author Pichau
 */
public class InsertSort {
    
    public static void main(String[] args) {
        
        int[]v={8,2,4,9,3,6};
        insertionSort(v);
        System.out.println(Arrays.toString(v));
        
        
    }
    
    public static void insertionSort(int[] v) {
        int x,j;
        for (int i = 1; i < v.length; i++) {
            x = v[i];
            j= i-1;
            while (j>=0 && v[j]>x)
            {
                v[j+1] = v[j];
                j=j-1;
                
            }
            
            v[j+1] = x;
            
            }
            
        }
        
        
    }
    

