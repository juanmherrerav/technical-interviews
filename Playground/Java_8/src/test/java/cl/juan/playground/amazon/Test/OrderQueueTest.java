package cl.juan.playground.amazon.Test;

import java.util.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class OrderQueueTest
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<String> prioritizedOrders(int numOrders, List<String> orderList)
    {
        // WRITE YOUR CODE HERE
        // WRITE YOUR CODE HERE
        List<List<String>> primeOrdersList = new ArrayList<>();
        List<List<String>> nonPrimeOrdersList = new ArrayList<>();

        for (String data : orderList){
            ArrayList<String> customer = new ArrayList(Arrays.asList(data.split(" ")));
            if (!isNumeric(customer.subList(1,customer.size()))){
                primeOrdersList.add(customer);
            }else{
                nonPrimeOrdersList.add(customer);
            }
        }

        primeOrdersList.sort(new Comparator<List<String>>() {
            @Override
            public int compare(List<String> m1, List<String> m2) {
                String m1S = String.join(" ", m1.subList(1,m1.size()));
                String m2S = String.join(" ", m2.subList(1,m2.size()));
                if(m1S.compareTo(m2S)<0){
                    return -1;
                }else if (m1S.compareTo(m2S)>0){
                    return 1 ;
                }else if (m1S.compareTo(m2S)==0){
                    return m1.get(0).compareTo(m2.get(0));
                }
                return 0;
            }
        });
//        nonPrimeOrdersList.sort(new Comparator<List<String>>() {
//            @Override
//            public int compare(List<String> m1, List<String> m2) {
//                String m1S = String.join(" ", m1.subList(1,m1.size()));
//                String m2S = String.join(" ", m2.subList(1,m2.size()));
//                if(m1S.compareTo(m2S)<0){
//                    return -1;
//                }else if (m1S.compareTo(m2S)>0){
//                    return 1 ;
//                }else if (m1S.compareTo(m2S)==0){
//                    return m1.get(0).compareTo(m2.get(0));
//                }
//                return 0;
//            }
//        });

        List<String> result = new ArrayList<>();
        for (List<String> list : primeOrdersList){
            result.add(String.join(" ",list));
        }
        for (List<String> list : nonPrimeOrdersList){
            result.add(String.join(" ",list));
        }
        return result;
    }



    public static boolean isNumeric(List<String> stringList) {
        for (String word: stringList){
            if (!word.matches("-?\\d+(\\.\\d+)?") )
                return false;
        }
        return true;
    }

}