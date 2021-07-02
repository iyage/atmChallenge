package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(atmChange(19));
    }
    public  static Map atmChange(Integer moneyPaid){
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
        Map<Integer,Integer> customerChangecount = new HashMap<>();
        for (Integer e:customerChange) {
            if(!(customerChangecount.containsKey(e))){
                customerChangecount.put(e,1);
            }else{
                customerChangecount.put(e,customerChangecount.get(e)+1);
            }
        }

        return customerChangecount ;
    }
    }
