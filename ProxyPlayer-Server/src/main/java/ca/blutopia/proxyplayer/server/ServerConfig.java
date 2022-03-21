package ca.blutopia.proxyplayer.server;

public class ServerConfig {


    private String worldsPath;
    private String serversPath;


    ServerConfig() {

    }

    public String getWorldsPath() {
        return worldsPath;
    }

    public void setWorldsPath(String worldsPath) {
        this.worldsPath = worldsPath;
    }

    public String getServersPath() {
        return serversPath;
    }

    public void setServersPath(String serversPath) {
        this.serversPath = serversPath;
    }
}
