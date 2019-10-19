package com.finaltest.myarrayutils;

public class MyArrayUtils {

    public boolean hasMultipleMaximum(int[] arry){
        if(arry==null || arry.length <= 1){
            return false;
        }
        int count = 0;
        int maximum = arry[0];
        for(int i=0; i<arry.length; i++){
            if(arry[i]>maximum){
                maximum = arry[i];
            }
        }
        for(int i=0; i<arry.length; i++){
            if(arry[i]==maximum){
                count++;
            }
        }
        if(count>=2){
            return true;
        }else{
            return false;
        }
    }
}
