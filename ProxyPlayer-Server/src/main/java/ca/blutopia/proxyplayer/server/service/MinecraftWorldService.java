package ca.blutopia.proxyplayer.server.service;

import ca.blutopia.proxyplayer.minecraft.MinecraftWorld;
import ca.blutopia.proxyplayer.minecraft.enums.MinecraftDifficulty;
import ca.blutopia.proxyplayer.minecraft.enums.MinecraftGameMode;
import ca.blutopia.proxyplayer.server.ProxyPlayerServer;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import net.querz.nbt.io.NBTUtil;
import net.querz.nbt.io.NamedTag;
import net.querz.nbt.tag.StringTag;
import net.querz.nbt.tag.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

@RestController
public class MinecraftWorldService {

    static final Gson json = new Gson();

    @GetMapping("/worlds")
    public MinecraftWorld[] getMinecraftWorld(@RequestParam(value = "name", defaultValue = "null") String name) throws IOException {
        File worldsPath = new File(ProxyPlayerServer.config.getConfig().getWorldsPath());
        ArrayList<MinecraftWorld> worlds = new ArrayList<MinecraftWorld>();

        for (File world : worldsPath.listFiles()) {

            NamedTag tag = NBTUtil.read(world.toPath().toString() + "/level.dat");
            String jsondata = ((Tag<StringTag>)tag.getTag()).valueToString();
            JsonObject jsond = json.fromJson(jsondata, JsonObject.class);
            int oof = jsond.getAsJsonObject("Data").getAsJsonObject("value").getAsJsonObject("Difficulty").get("value").getAsInt();
            worlds.add(
                    new MinecraftWorld(world.getName(), MinecraftDifficulty.parseInt(oof), MinecraftGameMode.Creative)
            );
        }

        return worlds.toArray(new MinecraftWorld[0]);

    }

}
