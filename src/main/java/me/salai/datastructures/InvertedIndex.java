package me.salai.datastructures;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * InvertedIndex
 * Plain Old Inverted Index DS.
 */
public class InvertedIndex {
    private Map<String, List<IndexDetail>> index;
    private String indexName;

    public InvertedIndex(String indexName) {
        this.indexName = indexName;
        index = new HashMap<String, List<IndexDetail>>();
    }

    public void addIndex(String key,IndexDetail newIndex){
        if (key == null || newIndex == null)
            return;
        List<IndexDetail> allIndexPositions = index.containsKey(key)? index.get(key): new ArrayList<IndexDetail>();
        allIndexPositions.add(newIndex);
        index.put(key, allIndexPositions);
    }

    public List<IndexDetail> get(String key){
        if (key == null)
            return null;
        return index.get(key);
    }
}
