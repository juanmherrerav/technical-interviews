package cl.juan.playground.microsoft;

import java.util.ArrayList;

public class MsTest {

    /**Given a list of commit ids which contain broken builds in a historical fashion how would you find the first bad commit id.

     [id1, id2, id3....idn-1. idn]

     bool isBuildBroken(string comitid);

     Constraint, 1 st broken commit makes all other commits and builds broken.*/

    /**        [f,f,f,f,f,f,f,f,t,t,t, t]
     [0,1,2,3,4,5,6,7,8,9,10,11]
     0-12 ->6
     6-12 ->9
     6-9 ->7
     7-9

     [f,f,f,f,f,f,f,f,f,f,f,f]
     [t,t,t,t,t,t,t,t,t,t,t,t]
     [f,f,f,f,f,f,f,f,t,t,t,t]
     [f,f,t]
     [f,t,t]
     []*/

        public int findFirstBrokenBuild(ArrayList<String> commits){
            if (null==commits || commits.size()==0){
                return -1;
            }else if (isBuildBroken(commits.get(0))){
                return 0;
            }
            int first=0;
            int last=commits.size();
            int current=(last-first)/2;
            while ((last>first) ){
                int halfPosition = (last+first)/2;
                if (isBuildBroken(commits.get(halfPosition))) last = halfPosition;
                else first = halfPosition+1;
                if (   (((halfPosition-1)>0) &&  !isBuildBroken(commits.get(halfPosition-1))    )
                        && isBuildBroken(commits.get(halfPosition)) ) {
                    return halfPosition;
                }else if (   !isBuildBroken(commits.get(halfPosition)) &&
                        ( (halfPosition+1)<commits.size()  && isBuildBroken(commits.get(halfPosition+1)) )   ){
                    return halfPosition+1;
                }
            }

            return -1;
        }

    private boolean isBuildBroken(String s) {
            return "t".equalsIgnoreCase(s);
    }

}
