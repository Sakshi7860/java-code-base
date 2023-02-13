package MapSortingBasedOnValues;

class Pair implements Comparable<Pair> {
    String key;
    Integer value;

    Pair(Integer value, String key) {
        this.key = key;
        this.value = value;
    }

    public int compareTo(Pair pair) {
        return this.value.compareTo(pair.value);
    }
}
