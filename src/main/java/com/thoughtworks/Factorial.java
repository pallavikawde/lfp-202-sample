package com.thoughtworks;

public class Factorial {
  private final int value ;

    public Factorial(int value) {
        this.value = value;
    }

    public int Calculatevalue()  {
      if(value < 0)throw new FactorialException("please enter valid number");
      if(value == 0)return 1;
      int factorial =1 ;
      for(int i =1;i <= value; i++){
          factorial = factorial * i;
        System.out.println("new change");

      }
      return factorial;

    }
    }



