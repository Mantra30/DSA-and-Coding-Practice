class Solution {
    public int mostWordsFound(String[] sentences) {

        int count = 1;
        int maxWords = 0;

        for (int i = 0; i < sentences.length; i++) {

            count = 1;
            String currentSentence = sentences[i];

            for (int j = 0; j < currentSentence.length(); j++) {
                char currentChar = currentSentence.charAt(j);

                if (currentChar == ' ') {
                    count++;
                }
                if (count > maxWords) {
                    maxWords = count;
                }
            }
        }
        return maxWords;
    }
}