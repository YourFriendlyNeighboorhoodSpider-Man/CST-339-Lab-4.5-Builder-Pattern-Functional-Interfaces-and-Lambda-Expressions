package com.gcu.lab45;

import java.util.function.Consumer;

public class ServerOptions {
    private boolean logging;
    private int port;


    public void setLogging(boolean logging) {
        this.logging = logging;
    }
    public boolean isLogging() {
        return logging;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public int getPort() {
        return port;
    }

    public static void configure(Consumer<ServerOptions> config) {
        ServerOptions options = new ServerOptions();
        config.accept(options);
        System.out.println("Logging: " + options.isLogging());
        System.out.println("Port: " + options.getPort());
    }
}
