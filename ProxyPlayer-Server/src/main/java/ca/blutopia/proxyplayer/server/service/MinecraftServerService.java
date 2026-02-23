package ca.blutopia.proxyplayer.server.service;

import ca.blutopia.proxyplayer.minecraft.model.MinecraftServerInstance;
import ca.blutopia.proxyplayer.server.ProxyPlayerServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.Yaml;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class MinecraftServerService {

    // The route here is for fetching all of the servers avalible.
    @GetMapping("/servers")
    public MinecraftServerInstance[] getMinecraftServers() throws IOException {

        // Get the path of all the servers from the config.
        File serversFile = new File(ProxyPlayerServer.config.getConfig().getServersPath());
        ArrayList<MinecraftServerInstance> servers = new ArrayList<MinecraftServerInstance>();

        // For each directory in the servers directory, we're gonna look into the files and set up the json response
        for (File server : serversFile.listFiles()) {

            // We have to look for 2 files, server.properties and proxyplayer.yml
            // Every server should have these two files and the files will have enough information
            // for the client.
            File serverProperties = null;
            File proxyplayerconfg = null;
            for (File file : server.listFiles()) {
                if (file.getName().equals("server.properties")) {
                    serverProperties = file;
                } else if (file.getName().equals("proxyplayer.yml")) {
                    proxyplayerconfg = file;
                };
            }

            // We need to format our server.properties file in order to use it to set our fields
            String content = null;
            try (Stream<String> lines = Files.lines(serverProperties.toPath())) {
                content = lines.collect(Collectors.joining(System.lineSeparator()));
                content = content.replaceAll("(?m)(=$)+", "=null");
                content = content.replace("-", "");
                content = content.replace(".", "");
            }catch (IOException e) {
                e.printStackTrace();
            }

            MinecraftServerInstance instance = new MinecraftServerInstance();

            // Using reflection we will automatically set a bunch of fields for our minecraft server class
            // Saving lots of time
            Scanner scanner = new Scanner(content);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] linear = line.split("[=]");
                Method setMethod;
                try {
                    setMethod = instance.getClass().getMethod("set" + linear[0].substring(0, 1).toUpperCase() + linear[0].substring(1), String.class);
                    setMethod.invoke(instance, linear[1]);
                    System.out.println(line + " | " + linear[0] + " | " + linear[1] + " | " + setMethod.getName());

                } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            scanner.close();

            // Next we deal with the proxyplayer.yaml which is easier since we control what is set in there.
            Yaml yaml = new Yaml();
            LinkedHashMap<String, String> yamlread = yaml.load(Files.newInputStream(proxyplayerconfg.toPath()));
            instance.setVersion(yamlread.get("mcversion"));
            instance.setName(yamlread.get("servername"));
            instance.setSoftware(yamlread.get("serversoftware"));
            instance.setPath(server.toPath());

            servers.add(instance);

        }

        // Our return is an array of MinecraftServer onjects which are converted to json automaticlly by the spring server.
        return servers.toArray(new MinecraftServerInstance[0]);

    }

    // The route here is for fetching an individual server.
    @GetMapping("/server")
    public MinecraftServerInstance getMinecraftServer(@RequestParam(name = "path", required = true) String path) throws URISyntaxException, IOException {

        // First we have to find the server
        Path serverPath = Paths.get(ProxyPlayerServer.config.getConfig().getServersPath()).resolve(path);
        File serverFile = serverPath.toFile();

        // We have to look for 2 files, server.properties and proxyplayer.yml
        // Every server should have these two files and the files will have enough information
        // for the client.
        File serverProperties = null;
        File proxyplayerconfg = null;
        for (File file : serverFile.listFiles()) {
            if (file.getName().equals("server.properties")) {
                serverProperties = file;
            } else if (file.getName().equals("proxyplayer.yml")) {
                proxyplayerconfg = file;
            };
        }

        // We need to format our server.properties file in order to use it to set our fields
        String content = null;
        try (Stream<String> lines = Files.lines(serverProperties.toPath())) {
            content = lines.collect(Collectors.joining(System.lineSeparator()));
            content = content.replaceAll("(?m)(=$)+", "=null");
            content = content.replace("-", "");
            content = content.replace(".", "");
        }catch (IOException e) {
            e.printStackTrace();
        }

        MinecraftServerInstance instance = new MinecraftServerInstance();

        // Using reflection we will automatically set a bunch of fields for our minecraft server class
        // Saving lots of time
        Scanner scanner = new Scanner(content);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] linear = line.split("[=]");
            Method setMethod;
            try {
                setMethod = instance.getClass().getMethod("set" + linear[0].substring(0, 1).toUpperCase() + linear[0].substring(1), String.class);
                setMethod.invoke(instance, linear[1]);
                System.out.println(line + " | " + linear[0] + " | " + linear[1] + " | " + setMethod.getName());

            } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        scanner.close();

        // Next we deal with the proxyplayer.yaml which is easier since we control what is set in there.
        Yaml yaml = new Yaml();
        LinkedHashMap<String, String> yamlread = yaml.load(Files.newInputStream(proxyplayerconfg.toPath()));
        instance.setVersion(yamlread.get("mcversion"));
        instance.setName(yamlread.get("servername"));
        instance.setSoftware(yamlread.get("serversoftware"));
        instance.setPath(serverPath);

        return instance;
    }


}
