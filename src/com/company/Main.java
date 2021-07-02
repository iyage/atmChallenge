package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(atmChange(14));


        // a method to give smallesst possible change to a customer
        // Chang available is [11,9,7,5,2,1]
    }
    public  static ArrayList atmChange(Integer moneyPaid){
        ArrayList<Integer> customerChange = new ArrayList<>();

        do{
            if(moneyPaid >=11){
                moneyPaid -=11;
                customerChange.add(11);
            }
            else if(moneyPaid>=9){
                moneyPaid -=9;
                customerChange.add(9);
            }
           else if(moneyPaid>=7){
                moneyPaid -=7;
                customerChange.add(7);
            }
            else if(moneyPaid>=5){
                moneyPaid -=5;
                customerChange.add(5);
            }
            else if(moneyPaid>=2){
                moneyPaid -=2;
                customerChange.add(2);
            }
            else{
                moneyPaid -= 1;
                customerChange.add(1);
            }

        } while (moneyPaid>0);

   return customerChange ;
    }
}
