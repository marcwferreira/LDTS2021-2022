package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{

    Integer divisor;

    public DivisibleByFilter(Integer divideNumber){
        divisor = divideNumber;
    }

    public boolean accept(Integer number) {
       if(number%divisor==0){
           return true;
       } else{return false;}
    }
}
