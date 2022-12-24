import java.util.*;

public class SetTreeMap {

    private Map<Integer,Object> integerTreeSet = new TreeMap<>();
    private static final Object VALUE = new Object();

    public void addTreeMap(int setKey) {
        integerTreeSet.put(setKey, VALUE);
    }
}
