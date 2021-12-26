package io.javabrains.springcloudconfigclinet.controller;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(value = "db")
public class GreetingConfig {

    private String connection;
    private String IP;
    private int port;

    public String getConnection() {
        return connection;
    }

    public String getIP() {
        return IP;
    }

    public int getPort() {
        return port;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
