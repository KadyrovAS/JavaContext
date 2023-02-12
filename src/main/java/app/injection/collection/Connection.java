package app.injection.collection;

import java.util.Properties;

public class Connection {
    private Properties properties;

    public Connection(){}
    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
