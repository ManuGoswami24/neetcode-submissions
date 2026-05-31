class Solution {
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<numbers.length; i++){
            map.put(numbers[i],i);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int j=0; j<numbers.length; j++){
            int compliment = target-numbers[j];
            if (map.containsKey(compliment)){
                ans.add(j+1);
                ans.add(map.get(compliment)+1);
                break;
            }
        }

        int [] finalAns = ans.stream().mapToInt(Integer::intValue).toArray();
        return finalAns;
    }
}
