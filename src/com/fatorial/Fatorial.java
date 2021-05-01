package com.fatorial;

/**
 * @author RafaelRodrigues1
 */
public class Fatorial {
    
    private Integer num;

    public Fatorial(Integer num) {
        this.num = num;
    }
    
    public Integer calcular(){
        int c = 1, result = 1;     
        while(this.num>=c){   
            result *= c;    
            c++;
        }
        return result;
    }
    
    @Override
    public String toString(){
        String calcF = "";
        int c=1;
        while(this.num>=c){     
            if(c != this.num){    
                calcF += c + "*";                       
            }else{                     
                calcF += c;
            }
            c++;
        }
        return calcF;
    }
}
