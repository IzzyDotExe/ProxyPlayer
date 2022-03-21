package ca.blutopia.proxyplayer.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;

@SpringBootApplication
public class ProxyPlayerServer {

    public static Logger LOGGER = LogManager.getLogger("proxyplayer");
    public static ConfigHandler config;

    public static void main(String[] args) throws FileNotFoundException {
        config = ConfigHandler.getInstance();
        SpringApplication.run(ProxyPlayerServer.class, args);
    }

}