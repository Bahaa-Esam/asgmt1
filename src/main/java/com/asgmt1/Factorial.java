package com.asgmt1;

/**
 *
 * @author bahaa
 */
public class Factorial {
    int num;
    int fNum=1;

     public void setNum(int num) {
        this.num = num;
    }

     public int getfNum() {
        for (int i = 1; i <= num; i++){
            fNum *= i;
           if (i < num) {
                System.out.print(i + " x ");
                if(i > 9){
                    System.out.println("...x " + num + " = " );
                    break;
                }
            } else {
                System.out.print(i + " = ");
            }
            
            
        }
        System.out.println(fNum);
        
        return fNum;
    }

  
    
}

