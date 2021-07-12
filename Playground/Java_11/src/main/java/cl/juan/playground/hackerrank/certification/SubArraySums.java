package cl.juan.playground.hackerrank.certification;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findSum' function below.
     *
     * The function is expected to return a LONG_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY numbers
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
        // Write your code here

        List<Long> solution = new ArrayList<>();
        Map<String, List<Long>> subArraySums = new HashMap<>();
        for (List<Integer> query : queries){
            long sum = 0;
            int start = (query.get(0)-1);
            int end = (query.get(1)-1);
            String key = start+"-"+end;
            if (subArraySums.get(key)!=null){
                sum = subArraySums.get(key).get(0) + subArraySums.get(key).get(1)*query.get(2);
            }else{
                long partialsum = 0;
                long zeroes = 0;
                for(int i = start; i<= end; i++ ){
                    if (numbers.get(i)==0){
                        zeroes++;
                    } else {
                        partialsum = partialsum + numbers.get(i);
                    }
                }
                subArraySums.put(key, Arrays.asList(partialsum, zeroes));
                sum = partialsum + zeroes * query.get(2);
            }
            solution.add(sum);
        }
        return solution;
    }

}

class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int queriesRows = Integer.parseInt(bufferedReader.readLine().trim());
        int queriesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, queriesRows).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Long> result = Result.findSum(numbers, queries);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
