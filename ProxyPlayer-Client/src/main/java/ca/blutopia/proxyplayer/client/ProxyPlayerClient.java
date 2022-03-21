package ca.blutopia.proxyplayer.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Environment(EnvType.CLIENT)
public class ProxyPlayerClient implements ClientModInitializer {

    // Static fields
    public static Logger LOGGER = LogManager.getLogger("proxyplayer");
    public static ProxyPlayerClient INSTANCE;

    // Instance fields

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        LOGGER.info("Hello Fabric World");
    }



}
