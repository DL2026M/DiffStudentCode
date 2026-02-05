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
    public static int longestSharedSubstring(String doc1, String doc2) {

        // TODO Complete this function to return the length of the longest shared substring.
        int longestString = 0;
        // Base cases
        if (doc1 == null || doc2 == null || doc1.isEmpty() || doc2.isEmpty()) {
            return longestString;
        }
        while (doc1.length() > 0 && doc2.length() > 0) {

        }
        return longestString;
    }
}
