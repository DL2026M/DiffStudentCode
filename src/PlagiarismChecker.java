/**
 * Plagiarism Checker
 * A tool for finding the longest shared substring between two documents.
 *
 * @author Zach Blick
 * @author David Lutch
 */
public class PlagiarismChecker {

    /**
     * This method finds the longest sequence of characters that appear in both texts in the same order,
     * although not necessarily contiguously.
     * @param doc1 the first document
     * @param doc2 the second
     * @return The length of the longest shared substring.
     */
    // Tabulation
    public static int longestSharedSubstring(String doc1, String doc2) {
        final int DOC1_LENGTH = doc1.length();
        final int DOC2_LENGTH = doc2.length();
        int[][] tabulation = new int[DOC1_LENGTH + 1][DOC2_LENGTH + 1];

        for (int i = 1; i <= DOC1_LENGTH; i++) {
            for (int j = 1; j <= DOC2_LENGTH; j++) {
                // Checks to see if the last letter on each string is the same
                if (doc1.charAt(i - 1) == doc2.charAt(j - 1)) {
                    tabulation[i][j] = tabulation[i - 1][j - 1] + 1;
                }
                else {
                    tabulation[i][j] = Math.max(tabulation[i - 1][j], tabulation[i][j - 1]);
                }
            }
        }
        return tabulation[DOC1_LENGTH][DOC2_LENGTH];
    }

}
