package lesson5.solid.provider;

import java.util.HashMap;
import java.util.Map;

public class DefaultValueProvider implements PropertyProvider {
    private static final Map<String, String> MAP = new HashMap<>();

    static {
//...
    }

    @Override
    public String getProperty(String propertyName) {
        return MAP.get(propertyName);
    }
}
