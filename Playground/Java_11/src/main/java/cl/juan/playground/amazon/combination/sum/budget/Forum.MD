public class ShoppingOptions {

private static int getOptions(int[] a, int[] b, int[] c, int[] d, int dollars) {
int longest = Math.max(a.length, Math.max(b.length, Math.max(c.length, d.length)));

    if (d.length == longest) {
        return helper(d, a, b, c, dollars);
    }

    if (c.length == longest) {
        return helper(c, a, b, d, dollars);
    }

    if (b.length == longest) {
        return helper(b, a, c, d, dollars);
    }

    return helper(a, b, c, d, dollars);
}

private static int helper(int[] longest, int[] a, int[] b, int[] c, int dollars) {
Arrays.sort(longest);
Arrays.sort(a);
Arrays.sort(b);
Arrays.sort(c);
int[] abSum = new int[a.length * b.length];
int index = 0;
for (int ai : a) {
if (ai >= dollars) {
break;
}

        for (int bi : b) {
            if (bi >= dollars) {
                break;
            }

            if (ai + bi < dollars) {
                abSum[index++] = ai + bi;
            } else {
                break;
            }
        }
    }

    int abcIndex = 0;
    int[] abcSum = new int[index * c.length];
    for (int i = 0; i < index; i++) {
        if (abSum[i] == 0) {
            break;
        }

        for (int ci : c) {
            if (ci >= dollars) {
                break;
            }

            if (abSum[i] + ci < dollars) {
                abcSum[abcIndex++] = abSum[i] + ci;
            } else {
                break;
            }
        }
    }

    int result = 0;
    for (int i = 0; i < abcIndex; i++) {
        if (abcSum[i] == 0) {
            break;
        }

        for (int di : longest) {
            if (abcSum[i] + di <= dollars) {
                result++;
            } else {
                break;
            }
        }
    }

    return result;
}

}
zz

I think we can do something similar to https://leetcode.com/problems/4sum-ii with some modification where we increment count for <= budgeted similar to Two Sum less than K. We can use prefixSum and binary search to optimize.


Java solution time O(n^2) space O(n^2)

public static long numWays(List<Integer> tops,
List<Integer> skirts,
List<Integer> shoes,
List<Integer> jeans,
int dolars) {

    Map<Integer, Integer> sumMap = new TreeMap<>();
    int res = 0;


    for (int i = 0; i < tops.size(); i++) {
        for (int j = 0; j < skirts.size(); j++) {
            int part = tops.get(i) + skirts.get(j);
            sumMap.put(part, sumMap.getOrDefault(part, 0) + 1);
        }
    }

    int totalEntries = 0;
    List<Pair<Integer, Integer>> dp = new ArrayList<>();
    for (Map.Entry<Integer, Integer> entry : sumMap.entrySet()) {
        totalEntries += entry.getValue();
        dp.add(new Pair<>(entry.getKey(), totalEntries));
    }


    for (int i = 0; i < shoes.size(); i++) {
        for (int j = 0; j < jeans.size(); j++) {
            int secondPart = shoes.get(i) + jeans.get(j);
            int left = dolars - secondPart;
            int dpIndex = search(dp, left);
            if (dpIndex != -1) {
                res += dp.get(dpIndex).getValue();
            }
        }
    }

    return res;
}

private static int search(List<Pair<Integer, Integer>> list, int target) {
for (int i = list.size() - 1; i >= 0; i--) {
if (list.get(i).getKey() <= target) return i;
}
return -1;
}



•	Practices: Scrum, Peer Programming, Jira, Confluence, Agile Artifacts (Burn Down, Kanban).
•	Backend: Java EE8 (Lambdas, Streams, Optionals), PostgreSql, Vert.x (Service Bus),REST, Reactive Programming Paradigm, SonarQube, Java Console, Microservices Paradigm.
•	FrontEnd: JavaScript (ES2015, Promises), AngularJS 1.5, Chrome Dev Tools, Postman.
•	Infrastructure: Amazon EC2, Docker, Amazon RDS, Shippable, BitBucket.



import java.util.*;
class Comparator{
public boolean compare(String s1, String s2){
if(Objects.equals(s1, s2))
return true;
else
return false;
}
public boolean compare(int num1,int num2) {
if (num1 == num2)
return true;
else
return false;
}
public boolean compare(int array1[],int array2[]) {
Object[] objArray1 = {array1};
Object[] objArray2 = {array2};
if (Arrays.deepEquals(objArray1,objArray2))
return true;
else
return false;
}
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Comparator comp = new Comparator();
        
        int testCases = Integer.parseInt(scan.nextLine());
        while(testCases-- > 0){
            int condition = Integer.parseInt(scan.nextLine());
            switch(condition){
                case 1:
                    String s1=scan.nextLine().trim();
                    String s2=scan.nextLine().trim();
                    
                    System.out.println( (comp.compare(s1,s2)) ? "Same" : "Different" );
                    break;
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    
                    System.out.println( (comp.compare(num1,num2)) ? "Same" : "Different");
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                case 3:
                    // create and fill arrays
                    int[] array1 = new int[scan.nextInt()];
                    int[] array2 = new int[scan.nextInt()];
                    for(int i = 0; i < array1.length; i++){
                        array1[i] = scan.nextInt();
                    }
                    for(int i = 0; i < array2.length; i++){
                        array2[i] = scan.nextInt();
                    }
                    
                    System.out.println( comp.compare(array1, array2) ? "Same" : "Different");
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                default:
                    System.err.println("Invalid input.");
            }// end switch
        }// end while
        scan.close();
    }
}




import java.util.Scanner;

abstract class Calculator {
abstract int add(int a, int b);
}

class Adder extends Calculator {

    int add(int a, int b){
        return a + b;
    }
}


/*
Write the Adder class here. Do not use an access modifier at the beginning of your class declaration.
*/
public class Solution {
public static void main(String[] args) {
int a, b;
try (Scanner scan = new Scanner(System.in)) {
a = scan.nextInt();
b = scan.nextInt();
}

        Calculator adderObject = new Adder();
        System.out.println("The sum is: " + adderObject.add(a, b));
    }
}