package Arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}


public class SumPair {
    public pair[] allPairs( long As[], long Bs[], long N, long M, long X) {
        Arrays.sort(As);
        Arrays.sort(Bs);
        pair p ;
        List<pair> listp= new ArrayList<>();

        for(int i=0;i<As.length-1;i++){
            for(int j=Bs.length-1;j>=0;j--) {
                System.out.println(As[i]+" "+Bs[j]);
                if (As[i] + Bs[j] == X) {
                    p = new pair(As[i], Bs[j]);
                    listp.add(p);
                } else if (As[i]+Bs[j]>X)
                    continue;
            }
        }
        pair[] pairss = new pair[listp.size()];
        return listp.toArray(pairss);
    }
    public static void main(String[] args){
        pair[] res = new SumPair().allPairs(new long[]{65, 37, 2,
                -113, 147, 65, 37, 6, -27, -73, 109, 31, -8, -102, -74, -183, -186, 131, 40, 150, -123, -111, -91, 176, 170, -4, -165, -49, 93, -68, 142, 171, 98, -60, -196, 99, 69, 138, -20, -143, -63, 129, -158, -103, -30, 73, 32, 151, 136, 82, -150, -31, -37, -164, 101, -69, -62, -100, -14, 111, -97, 119, -137, 68, -130, -127, -161, 124},new long[]{-122, 102, -67, 152, -169, 48, -52, -134, 33, -91, 188, 6, -148, -109, -35, 64, 32, 75, 198, 22, 65, -168, 185, -66, -127, -147, 145, -29, 104, 51, 93, 71, 129, 39, 76, 10, 70},6,4,2);
       // Arrays.stream(res).forEach(p->System.out.println(p.first+""+p.second));
    }
}
