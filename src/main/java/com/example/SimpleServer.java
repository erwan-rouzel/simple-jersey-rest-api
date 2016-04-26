package com.example;

import com.sun.jersey.api.core.DefaultResourceConfig;
import com.sun.jersey.simple.container.SimpleServerFactory;

/**
 * Created by ERL1 on 4/26/2016.
 */
public class SimpleServer {
    public static void main( String[] args ) throws Exception {

        java.io.Closeable server = null;

        try {
            DefaultResourceConfig resourceConfig = new DefaultResourceConfig(RestApi.class);

            // Creates a server and listens on the address below.
            // Scans classpath for JAX-RS resources
            server = SimpleServerFactory.create("http://localhost:7777", resourceConfig);
            System.out.println("Press any key to stop the service...");
            System.in.read();
        } finally {
            try {
                if (server != null) {
                    server.close();
                }
            } finally {
            }
        }
    }
}
