package ca.blutopia.proxyplayer.server;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ConfigHandler {

    public static final Path configPath = Paths.get("./config.yml");

    private static ConfigHandler configHandler;

    ServerConfig config;

    public static ConfigHandler getInstance() throws FileNotFoundException {
        return getInstance(configPath);
    }

    public static ConfigHandler getInstance(Path configPath) throws FileNotFoundException {
        if (configHandler == null) {
            configHandler = new ConfigHandler(configPath);
        }
        return configHandler;
    }

    private ConfigHandler(Path configPath) throws FileNotFoundException {
        this.config = loadConfig(configPath);
    }

    public ServerConfig loadConfig(Path configPath) throws FileNotFoundException {
        Constructor constructor = new Constructor(ServerConfig.class);
        Yaml yaml = new Yaml(constructor);
        return yaml.load(new FileInputStream(configPath.toFile()));
    }

    public void dumpConfig() throws IllegalArgumentException, IllegalAccessException, IOException {
        dumpConfig(this.config, ConfigHandler.configPath);
    }

    public void dumpConfig(ServerConfig config, Path configPath) throws IllegalArgumentException, IllegalAccessException, IOException {
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        options.setPrettyFlow(true);
        Yaml yaml = new Yaml(options);
        yaml.dump(config, new FileWriter(configPath.toFile()));
    }

    public ServerConfig getConfig() {
        return config;
    }
}
