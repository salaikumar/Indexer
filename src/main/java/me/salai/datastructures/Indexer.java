package me.salai.datastructures;

/**
 * Indexer class indexes one file at at a time. The Logic to parse the input file is moved to the client program
 * It has a static method index that accepts a input string and index it.
 * By now, the Indexer would also be queried. All Query to Inverted Index pass through our Indexer
 */
public class Indexer {

    private static InvertedIndex ivx;
    /**
     *
     * @param pathToFile - file to be indexed
     */
    public static void index(String pathToFile){

    }

    /**
     * Queries the inverted index and returns in present
     * @param queryString - input Query. May be a Single word,sentence,unique phrase.
     * @return   return the Index details if present. Else, null is returned.
     */
    private String query(String queryString){
        return null;
    }
}
