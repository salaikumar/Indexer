package me.salai.datastructures;

import java.util.List;

/**
 * IndexDetail
 * This Class holds the information that we are going to store in the index.
 */
public class IndexDetail {
    private int documentId;
    private List<Integer> startPosition;

    public IndexDetail(int documentId, List<Integer> startPosition) {
        this.documentId = documentId;
        this.startPosition = startPosition;
    }

    public IndexDetail(int documentId) {
        this.documentId = documentId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public List<Integer> getStartPosition() {
        return startPosition;
    }

    public void addStartPosition(int start){
        startPosition.add(start);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IndexDetail that = (IndexDetail) o;

        if (getDocumentId() != that.getDocumentId()) return false;
        return getStartPosition().equals(that.getStartPosition());

    }

    @Override
    public int hashCode() {
        int result = getDocumentId();
        result = 31 * result + getStartPosition().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "IndexDetail{" +
                "documentId=" + documentId +
                ", startPosition=" + startPosition +
                '}';
    }
}
