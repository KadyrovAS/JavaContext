package app.injection.collection;

import java.util.HashSet;
import java.util.Set;

public class IntegerSet {
    private Set<Integer> set = new HashSet<>();
    public IntegerSet(Set<Integer> set){
        this.set = set;
    }
    public Set<Integer> getSet() {
        return set;
    }

}
