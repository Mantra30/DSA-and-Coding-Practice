class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int stoneCount = 0;

        for( int i = 0; i < stones.length(); i++)
        {
            char currentStone = stones.charAt(i);

            if(jewels.indexOf(currentStone) != -1)
            {
                stoneCount++;
            }
        }
        return stoneCount;
    }
}