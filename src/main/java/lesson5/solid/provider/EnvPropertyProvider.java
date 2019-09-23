package lesson5.solid.provider;

public class EnvPropertyProvider implements PropertyProvider {
    @Override
    public String getProperty(String propertyName) {
        return System.getenv(propertyName);
    }
}
