package cl.juan.playground.amazon.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightRouteOptimization {


    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> optimalUtilization(int maxTravelDist,
                                           List<List<Integer>> forwardRouteList,
                                           List<List<Integer>> returnRouteList)
    {

        List<List<Integer>> allPossibleRoutes= new ArrayList<>();

        for (List<Integer> fordwardRoute: forwardRouteList ){
            for (List<Integer> returnRoute: returnRouteList ){
                allPossibleRoutes.add(Arrays.asList(fordwardRoute.get(1)+returnRoute.get(1),fordwardRoute.get(0),returnRoute.get(0)));
            }
        }
        allPossibleRoutes=allPossibleRoutes.stream()
                .filter(route -> route.get(0)<=maxTravelDist)    //Filtering by maxTravelDist
                .sorted(Comparator.comparing((List<Integer> route) -> route.get(0)).reversed())
                .collect(Collectors.toList());
        Set<Integer> forwardRouteSet = forwardRouteList.stream()
                .map(route -> route.get(0))
                .collect(Collectors.toSet());
        Set<Integer> returnRouteSet = returnRouteList.stream()
                .map(route -> route.get(0))
                .collect(Collectors.toSet());
        List<List<Integer>> optimal = new ArrayList<>();
        for (List<Integer> factibleRoute : allPossibleRoutes){
            if (forwardRouteSet.contains(factibleRoute.get(1))&& returnRouteSet.contains(factibleRoute.get(2))){
                optimal.add(Arrays.asList(factibleRoute.get(1),factibleRoute.get(2)));
                forwardRouteSet.remove(factibleRoute.get(1));
                returnRouteSet.remove(factibleRoute.get(2));
            }
        }
        return optimal;
    }
}
