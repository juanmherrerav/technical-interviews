package cl.juan.playground.amazon.demo;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
class ActiveHouse {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public List<Integer> cellCompete(int[] states, int days) {
        int new_states[] = new int[states.length];
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < states.length; j++) {
                new_states[j] = evaluate(states, j);
            }
            states = new_states.clone();
        }
        List<Integer> list = Arrays.stream(new_states).boxed().collect(Collectors.toList());
        return  list;
    }

    public int evaluate(int[] states, int pos) {
        if (pos == states.length - 1) { //border cell is inactive
            return states[pos - 1];
        } else if (pos == 0) {        //border cell is inactive
            return states[pos + 1];
        } else if (states[pos - 1] != states[pos + 1]) {
            return 1;
        } else {
            return 0;
        }
    }
    // METHOD SIGNATURE ENDS
}

