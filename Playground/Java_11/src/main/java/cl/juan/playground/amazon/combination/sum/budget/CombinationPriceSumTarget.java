package cl.juan.playground.amazon.combination.sum.budget;

public class CombinationPriceSumTarget {
/*    int getNumberOfOptions(int[] priceOfJeans, int[] priceOfShoes, int[] priceOfSkirts, int[] priceOfTops, int dollars){
        Arrays.sort(priceOfJeans);
        Arrays.sort(priceOfShoes);
        Arrays.sort(priceOfSkirts);
        Arrays.sort(priceOfTops);

        int[][] dp(2, int[dollars + 1, 0]);
        //vector<vector<int>> dp(2,vector<int>(dollars + 1,0));
        int res = 0;

 */

   public static int getNumberOfOptions(int[] priceOfJeans, int[] priceOfShoes, int[] priceOfSkirts, int[] priceOfTops, int dollars){

       int numberOfOptions = 0;
       int[] optionsJxS = partiallListOfOptions(priceOfJeans, priceOfShoes, dollars);
       printArray(optionsJxS);
       int[] optionsSxT = partiallListOfOptions(priceOfSkirts, priceOfTops, dollars);
       printArray(optionsSxT);
       int[] options = consolidateListOfOptions(optionsJxS, optionsSxT, dollars);
       printArray(options);
       for (int i = 1 ; i <= dollars; i++){
           numberOfOptions += options[i];
       }

       return numberOfOptions;
   }


    private static int[] consolidateListOfOptions(int[] listA, int[] listB, int dollars) {
        int[] consolidateOptions = new int[dollars+1];
        for(int a = 0; a < listA.length; a++){
            for (int b = 0; b < listB.length; b++){
                int partialAxB = a + b;
                if (partialAxB <= dollars){
                    consolidateOptions[partialAxB]+= listA[a] * listB[b];
                }
            }
            printArray(consolidateOptions);
        }
        return consolidateOptions;

    }

    private static int[] partiallListOfOptions(int[] listA, int[] listB, int dollars) {
        int[] optionsAxB = new int[dollars+1];
        for(int j = 0; j < listA.length; j++){
            for (int s = 0; s < listB.length; s++){
                int partialAxB = listA[j] + listB[s];
                if (partialAxB <= dollars){
                    optionsAxB[partialAxB]++;
                }
            }
        }
        return optionsAxB;
    }

    static void printArray(int[] array){
        for (int j = 0; j < array.length; j++) { //this equals to the column in each row.
            System.out.print(array[j] + " ");
        }
        System.out.println(); //change line on console as row comes to end in the matrix.
    }
    /*

    DP solution.
    Time Complexity: O(N^2), Space Complexity: O(N)
    Backtracking for this problem is ok but not efficient.
    We want to know how many way to buy each of different  type of product without cost more than budget, we don't have to enumerate all possible combination of each products.
    So we can use DP to solve this problem.
    dp[0][i] means number of ways to pick one jeans and one shoes with total price i.
    if dp[0][i] == 0, it means there is no such combination.
    dp[1][i] means number of ways to pick one jeans, shoes, and skirts with total price i.
    if dp[1][i] == 0, it means no such combination.

    To find all possible ways of each price of combinaiton take O(N^2) times.
    and we have to 3 times, so total Time Complexity is O(N^2) * 3;
    We build two array with O(N) size, so Space Complexity is O(N) * 2.
    */
/*
        // jeans, shoes
        for(int i = 0;i < priceOfJeans.length;i++){
            for(int j = 0;j < priceOfShoes.length;j++){
                int sum = priceOfJeans[i] + priceOfShoes[j];
                if(sum < dollars - 1)
                    dp[0][sum]++;
                else break;
            }
        }

        // jeans, shoes, and skirts
        for(int i = 0;i < priceOfSkirts.length;i++){
            for(int j = 1;j < dollars - 1;j++){
                if(dp[0][j] == 0) continue;
                int sum = priceOfSkirts[i] + j;
                if(sum < dollars)
                    dp[1][sum]+= dp[0][j];
                else break;
            }
        }

        // jeans, shoes, skirts, and top.
        for(int i = 0;i < priceOfTops.length;i++){
            for(int j = 1;j < dollars;j++){
                if(dp[1][j] == 0) continue;
                int sum = priceOfTops[i] + j;
                if(sum <= dollars)
                    res+= dp[1][j];
                else break;
            }
        }

        return res;
    }*/





/*
    public int getNumberOfOptions(final int[] priceOfJeans,
                                  final int[] priceOfShoes,
                                  final int[] priceOfSkirts,
                                  final int[] priceOfTops, final int dollars) {
        int[] res = getCosts(priceOfJeans, new int[]{0}, dollars);
        res = getCosts(priceOfShoes, res, dollars);
        res = getCosts(priceOfSkirts, res, dollars);
        res = getCosts(priceOfTops, res, dollars);
        return res.length;
    }

    private int[] getCosts(final int[] priceOfItem, final int[] cost, final int max) {
        final List<Integer> res = new ArrayList<>();
        for (final int p : priceOfItem) {
            for (final int c : cost) {
                final int r = p + c;
                if (r <= max) res.add(r);
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }

    public int getNumberOfOptions1(int[] priceOfJeans, int[] priceOfShoes, int[] priceOfSkirts, int[] priceOfTops, int dollar){
        int rst = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int priceOfJean : priceOfJeans) {
            for (int priceOfShoe : priceOfShoes) {
                int sum = priceOfJean + priceOfShoe;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        for (int priceOfSkirt : priceOfSkirts) {
            for (int priceOfTop : priceOfTops) {
                int sum = priceOfSkirt + priceOfTop;
                Integer curr = map.ceilingEntry(dollar - sum).getValue();
                rst += curr == null ? 0 : curr;
            }
        }
        return rst;
    }*/
}
/*
*     int getNumberOfOptions2(int[] priceOfJeans, int[] priceOfShoes, int[] priceOfSkirts, int[] priceOfTops, int dollars){
        Arrays.sort(priceOfJeans);
        Arrays.sort(priceOfShoes);
        Arrays.sort(priceOfSkirts);
        Arrays.sort(priceOfTops);

        int res = 0;

    /*
    backtracking with pruning.
    If current price plus previous product's price is less than dollars,
    this combination of products can be valid and we have to call DFS to
    keep check this sum of price with next product.
    If the sum of products larger than dollar, we can break it
    because rest of product's price are larger than this one.
    */
     /*   function<void(int,int)> DFS = [&](int idx,int n) {
        int sum = 0;
        if(idx == 0){
        for(int i = 0;i < priceOfJeans.size();i++){
        sum = n + priceOfJeans[i];
        if(sum < dollars - 2)
        DFS(idx + 1,sum);
        else break;
        }
        }
        else if(idx == 1){
        for(int i = 0;i < priceOfShoes.size();i++){
        sum = n + priceOfShoes[i];
        if(sum < dollars - 1)
        DFS(idx + 1,sum);
        else break;
        }
        }
        else if(idx == 2){
        for(int i = 0;i < priceOfSkirts.size();i++){
        sum = n + priceOfSkirts[i];
        if(sum < dollars)
        DFS(idx + 1,sum);
        else break;
        }
        }
        else{
        for(int i = 0;i < priceOfTops.size();i++){
        sum = n + priceOfTops[i];
        if(sum <= dollars)
        res++;
        else break;
        }
        }
        };

        DFS(0,0);

        return res;
        }
* */