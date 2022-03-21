package ca.blutopia.proxyplayer.minecraft;

import ca.blutopia.proxyplayer.minecraft.enums.MinecraftDifficulty;
import ca.blutopia.proxyplayer.minecraft.enums.MinecraftGameMode;

import java.nio.file.Path;

public class MinecraftServerInstance {

    private String enablejmxmonitoring;
    private String rconPort;
    private String levelseed;
    private String gamemode;
    private String enablecommandblock;
    private String enablequery;
    private String levelname;
    private String motd;
    private String queryPort;
    private String pvp;
    private String generatestructures;
    private String difficulty;
    private String networkcompressionthreshold;
    private String maxticktime;
    private String requireresourcepack;
    private String usenativetransport;
    private String maxplayers;
    private String onlinemode;
    private String allowflight;
    private String broadcastrcontoops;
    private String viewdistance;
    private String serverip;
    private String enablestatus;
    private String resourcepackprompt;
    private String allownether;
    private String serverport;
    private String enablercon;
    private String syncchunkwrites;
    private String oppermissionlevel;
    private String preventproxyconnections;
    private String hideonlineplayers;
    private String resourcepack;
    private String entitybroadcastrangepercentage;
    private String simulationdistance;
    private String RconPassword;
    private String playeridletimeout;
    private String forcegamemode;
    private String ratelimit;
    private String hardcore;
    private String generatorsettings;
    private String whitelist;
    private String broacastconsoletoops;
    private String spawnnpcs;
    private String spawnanimals;
    private String functionpermissionlevel;
    private String leveltype;
    private String textfilteringconfig;
    private String spawnmonsters;
    private String enforcewhitelist;
    private String resourcepacksha1;
    private String spawnprotection;
    private String maxworldsize;

    private String version;
    private String software;
    private String name;
    private Path path;

    public void setPath(Path path) {
        this.path = path;
    }

    public Path getPath() {
        return path;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public String getSoftware() {
        return software;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public MinecraftServerInstance() {

    }

    public String getEnablejmxmonitoring() {
        return enablejmxmonitoring;
    }

    public void setEnablejmxmonitoring(String enablejmxmonitoring) {
        this.enablejmxmonitoring = enablejmxmonitoring;
    }

    public String getRconport() {
        return rconPort;
    }

    public void setRconport(String rconPort) {
        this.rconPort = rconPort;
    }

    public String getLevelseed() {
        return levelseed;
    }

    public void setLevelseed(String levelseed) {
        this.levelseed = levelseed;
    }

    public String getGamemode() {
        return gamemode;
    }

    public void setGamemode(String gamemode) {
        this.gamemode = gamemode;
    }

    public String getEnablecommandblock() {
        return enablecommandblock;
    }

    public void setEnablecommandblock(String enablecommandblock) {
        this.enablecommandblock = enablecommandblock;
    }

    public String getEnablequery() {
        return enablequery;
    }

    public void setEnablequery(String enablequery) {
        this.enablequery = enablequery;
    }

    public String getLevelname() {
        return levelname;
    }

    public void setLevelname(String levelname) {
        this.levelname = levelname;
    }

    public String getMotd() {
        return motd;
    }

    public void setMotd(String motd) {
        this.motd = motd;
    }

    public String getQueryport() {
        return queryPort;
    }

    public void setQueryport(String queryPort) {
        this.queryPort = queryPort;
    }

    public String getPvp() {
        return pvp;
    }

    public void setPvp(String pvp) {
        this.pvp = pvp;
    }

    public String getGeneratestructures() {
        return generatestructures;
    }

    public void setGeneratestructures(String generatestructures) {
        this.generatestructures = generatestructures;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getNetworkcompressionthreshold() {
        return networkcompressionthreshold;
    }

    public void setNetworkcompressionthreshold(String networkcompressionthreshold) {
        this.networkcompressionthreshold = networkcompressionthreshold;
    }

    public String getMaxticktime() {
        return maxticktime;
    }

    public void setMaxticktime(String maxticktime) {
        this.maxticktime = maxticktime;
    }

    public String getRequireresourcepack() {
        return requireresourcepack;
    }

    public void setRequireresourcepack(String requireresourcepack) {
        this.requireresourcepack = requireresourcepack;
    }

    public String getUsenativetransport() {
        return usenativetransport;
    }

    public void setUsenativetransport(String usenativetransport) {
        this.usenativetransport = usenativetransport;
    }

    public String getMaxplayers() {
        return maxplayers;
    }

    public void setMaxplayers(String maxplayers) {
        this.maxplayers = maxplayers;
    }

    public String getOnlinemode() {
        return onlinemode;
    }

    public void setOnlinemode(String onlinemode) {
        this.onlinemode = onlinemode;
    }

    public String getEnablestatus() {
        return enablestatus;
    }

    public void setEnablestatus(String enablestatus){
        this.enablestatus = enablestatus;
    }

    public String getAllowflight() {
        return allowflight;
    }

    public void setAllowflight(String allowflight) {
        this.allowflight = allowflight;
    }

    public String getBroadcastrcontoops() {
        return broadcastrcontoops;
    }

    public void setBroadcastrcontoops(String broadcastrcontoops) {
        this.broadcastrcontoops = broadcastrcontoops;
    }

    public String getViewdistance() {
        return viewdistance;
    }

    public void setViewdistance(String viewdistance) {
        this.viewdistance = viewdistance;
    }

    public String getServerip() {
        return serverip;
    }

    public void setServerip(String serverip) {
        this.serverip = serverip;
    }

    public String getResourcepackprompt() {
        return resourcepackprompt;
    }

    public void setResourcepackprompt(String resourcepackprompt) {
        this.resourcepackprompt = resourcepackprompt;
    }

    public String getAllownether() {
        return allownether;
    }

    public void setAllownether(String allownether) {
        this.allownether = allownether;
    }

    public String getServerport() {
        return serverport;
    }

    public void setServerport(String serverport) {
        this.serverport = serverport;
    }

    public String getEnablercon() {
        return enablercon;
    }

    public void setEnablercon(String enablercon) {
        this.enablercon = enablercon;
    }

    public String getSyncchunkwrites() {
        return syncchunkwrites;
    }

    public void setSyncchunkwrites(String syncchunkwrites) {
        this.syncchunkwrites = syncchunkwrites;
    }

    public String getOppermissionlevel() {
        return oppermissionlevel;
    }

    public void setOppermissionlevel(String oppermissionlevel) {
        this.oppermissionlevel = oppermissionlevel;
    }

    public String getPreventproxyconnections() {
        return preventproxyconnections;
    }

    public void setPreventproxyconnections(String preventproxyconnections) {
        this.preventproxyconnections = preventproxyconnections;
    }

    public String getHideonlineplayers() {
        return hideonlineplayers;
    }

    public void setHideonlineplayers(String hideonlineplayers) {
        this.hideonlineplayers = hideonlineplayers;
    }

    public String getResourcepack() {
        return resourcepack;
    }

    public void setResourcepack(String resourcepack) {
        this.resourcepack = resourcepack;
    }

    public String getEntitybroadcastrangepercentage() {
        return entitybroadcastrangepercentage;
    }

    public void setEntitybroadcastrangepercentage(String entitybroadcastrangepercentage) {
        this.entitybroadcastrangepercentage = entitybroadcastrangepercentage;
    }

    public String getSimulationdistance() {
        return simulationdistance;
    }

    public void setSimulationdistance(String simulationdistance) {
        this.simulationdistance = simulationdistance;
    }

    public String getRconpassword() {
        return RconPassword;
    }

    public void setRconpassword(String rconPassword) {
        RconPassword = rconPassword;
    }

    public String getPlayeridletimeout() {
        return playeridletimeout;
    }

    public void setPlayeridletimeout(String playeridletimeout) {
        this.playeridletimeout = playeridletimeout;
    }

    public String getForcegamemode() {
        return forcegamemode;
    }

    public void setForcegamemode(String forcegamemode) {
        this.forcegamemode = forcegamemode;
    }

    public String getRatelimit() {
        return ratelimit;
    }

    public void setRatelimit(String ratelimit) {
        this.ratelimit = ratelimit;
    }

    public String getHardcore() {
        return hardcore;
    }

    public void setHardcore(String hardcore) {
        this.hardcore = hardcore;
    }

    public String getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(String whitelist) {
        this.whitelist = whitelist;
    }

    public String getBroacastconsoletoops() {
        return broacastconsoletoops;
    }

    public void setBroacastconsoletoops(String broacastconsoletoops) {
        this.broacastconsoletoops = broacastconsoletoops;
    }

    public String getSpawnnpcs() {
        return spawnnpcs;
    }

    public void setSpawnnpcs(String spawnnpcs) {
        this.spawnnpcs = spawnnpcs;
    }

    public String getSpawnanimals() {
        return spawnanimals;
    }

    public void setSpawnanimals(String spawnanimals) {
        this.spawnanimals = spawnanimals;
    }

    public String getFunctionpermissionlevel() {
        return functionpermissionlevel;
    }

    public void setFunctionpermissionlevel(String functionpermissionlevel) {
        this.functionpermissionlevel = functionpermissionlevel;
    }

    public String getLeveltype() {
        return leveltype;
    }

    public void setLeveltype(String leveltype) {
        this.leveltype = leveltype;
    }

    public String getTextfilteringconfig() {
        return textfilteringconfig;
    }

    public void setTextfilteringconfig(String textfilteringconfig) {
        this.textfilteringconfig = textfilteringconfig;
    }

    public String getSpawnmonsters() {
        return spawnmonsters;
    }

    public void setSpawnmonsters(String spawnmonsters) {
        this.spawnmonsters = spawnmonsters;
    }

    public String getEnforcewhitelist() {
        return enforcewhitelist;
    }

    public void setEnforcewhitelist(String enforcewhitelist) {
        this.enforcewhitelist = enforcewhitelist;
    }

    public String getResourcepacksha1() {
        return resourcepacksha1;
    }

    public void setResourcepacksha1(String resourcepacksha1) {
        this.resourcepacksha1 = resourcepacksha1;
    }

    public String getSpawnprotection() {
        return spawnprotection;
    }

    public void setSpawnprotection(String spawnprotection) {
        this.spawnprotection = spawnprotection;
    }

    public String getMaxworldsize() {
        return maxworldsize;
    }

    public void setMaxworldsize(String maxworldsize) {
        this.maxworldsize = maxworldsize;
    }

    public void setGeneratorsettings(String generatorsettings) {
        this.generatorsettings = generatorsettings;
    }

    public String getGeneratorsettings() {
        return generatorsettings;
    }
}
