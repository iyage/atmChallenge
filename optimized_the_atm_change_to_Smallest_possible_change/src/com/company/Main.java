package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(atmChange(19));
    }
    public  static ArrayList atmChange(Integer moneyPaid){
        ArrayList<Integer> customerChange1 = new ArrayList<>();
        ArrayList<Integer> customerChange2 = new ArrayList<>();
        Integer change1 =moneyPaid;
        Integer change2 = moneyPaid;

        do{
            for(int i = 0;i<2;i++){
                if(i==0){
                    if(change1 >=11){
                        change1 -=11;
                        customerChange1.add(11);
                    }
                    else if(change1>=9){
                        change1 -=9;
                        customerChange1.add(9);
                    }
                    else if(change1>=7){
                        change1 -=7;
                        customerChange1.add(7);
                    }
                    else if(change1>=5){
                        change1 -=5;
                        customerChange1.add(5);
                    }
                    else if(change1>=2){
                        change1 -=2;
                        customerChange1.add(2);
                    }
                    else{
                        change1 -= 1;
                        customerChange1.add(1);
                    }

                }
                else{
                    if(change2 >=9){
                   change2-=9;
                    customerChange2.add(9);
                }
                else if(change2>=7){
                   change2 -=7;
                    customerChange2.add(7);
                }
                else if(change2>=5){
                   change2-=5;
                    customerChange2.add(5);
                }
                else if(change2>=2){
                    change2-=2;
                    customerChange1.add(2);
                }
                else {
                   change2 -= 1;
                    customerChange2.add(1);
                }}
            }


        } while (change1>0);

        if (customerChange1.size()<customerChange2.size()){
            return customerChange1;
        }
else {
            return customerChange2 ;
        }

    }
}
