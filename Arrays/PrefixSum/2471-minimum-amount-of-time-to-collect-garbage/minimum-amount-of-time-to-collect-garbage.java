// class Solution {
//     public int garbageCollection(String[] garbage, int[] travel) {
//         int mi = 0, mf = 0, gi = 0, gf = 0, pi = 0, pf = 0, sum = 0, n = garbage.length;
        
//         // 1. Prefix sum remains the same
//         for(int i = 1; i < travel.length; i++) {
//             travel[i] += travel[i - 1];
//         }
        
//         // 2. Finding frequencies and last indices
//         for(int i = 0; i < n; i++) {
//             for(int j = 0; j < garbage[i].length(); j++) {
//                 if(garbage[i].charAt(j) == 'M') {
//                     mf++;
//                     mi = i;
//                 }
//                 else if(garbage[i].charAt(j) == 'G') {
//                     gf++;
//                     gi = i;
//                 }
//                 // FIX 1: Changed lowercase 'p' to uppercase 'P'
//                 else if(garbage[i].charAt(j) == 'P') {
//                     pf++;
//                     pi = i;
//                 }
//             }
//         }
        
//         // FIX 2: Total picking time is just the sum of all frequencies
//         sum = mf + gf + pf;
        
//         // FIX 3: Removed the "else if" chain so all trucks get calculated.
//         // Added "> 0" checks to prevent ArrayIndexOutOfBoundsException (travel[-1]).
//         if(mi > 0) sum += travel[mi - 1];
//         if(gi > 0) sum += travel[gi - 1];
//         if(pi > 0) sum += travel[pi - 1];
        
//         return sum;
//     }
// }






class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int totalTime = 0;
        int lastM = 0, lastP = 0, lastG = 0;

        // Create prefix sum of travel distances in-place
        for (int i = 1; i < travel.length; i++) {
            travel[i] += travel[i - 1];
        }

        for (int i = 0; i < garbage.length; i++) {
            totalTime += garbage[i].length(); // 1 min per item
            if (garbage[i].indexOf('M') != -1) lastM = i;
            if (garbage[i].indexOf('P') != -1) lastP = i;
            if (garbage[i].indexOf('G') != -1) lastG = i;
        }

        // Add travel times only if the truck actually left house 0
        if (lastM > 0) totalTime += travel[lastM - 1];
        if (lastP > 0) totalTime += travel[lastP - 1];
        if (lastG > 0) totalTime += travel[lastG - 1];

        return totalTime;
    }
}