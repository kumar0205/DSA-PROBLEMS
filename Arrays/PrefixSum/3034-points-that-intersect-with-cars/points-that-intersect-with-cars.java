// class Solution {
//     public int numberOfPoints(List<List<Integer>> nums) {
//         nums.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
//         int points=0,le=0;
//         points=(nums.get(0).get(0))-1;
//         le=nums.get(0).get(1);
//         for(int i=1;i<nums.size();i++){
//             if(nums.get(i).get(0)>le){
//                 points+=nums.get(i).get(0)-(le+1);
//             }
//             if(le<nums.get(i).get(1)) le=nums.get(i).get(1);
//         }
//         return le-points;
//     }
// }
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> uniquePoints = new HashSet<>();
        for (List<Integer> car : nums) {
            for (int i = car.get(0); i <= car.get(1); i++) {
                uniquePoints.add(i);
            }
        }
        return uniquePoints.size();
    }
}