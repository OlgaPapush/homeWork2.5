import java.util.HashMap;
import java.util.Map;

public class Task_map {
    private final Map<String, Integer> map = new HashMap<>();

    public void addMap(String key, int value) {
        if (map.containsKey(key)) {
            map.put(key, value);
        } else {
            int valueFronMap = map.get(key);
            if (valueFronMap == value) {
                throw new RuntimeException();
            } else {
                map.put(key, valueFronMap + value);
            }
        }
    }
}


