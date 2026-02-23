package ca.blutopia.proxyplayer.minecraft.model;

import ca.blutopia.proxyplayer.minecraft.model.enums.MinecraftDifficulty;
import ca.blutopia.proxyplayer.minecraft.model.enums.MinecraftGameMode;

public class MinecraftWorld {

    private String _name;
    private MinecraftDifficulty _difficulty;
    private MinecraftGameMode _gamemode;

    public MinecraftWorld(String name, MinecraftDifficulty difficulty, MinecraftGameMode gamemode) {

        _name = name;
        _difficulty = difficulty;
        _gamemode = gamemode;

    }

    public MinecraftGameMode get_gamemode() {
        return _gamemode;
    }

    public void set_gamemode(MinecraftGameMode _gamemode) {
        if (!_gamemode.equals(MinecraftGameMode.Hardcore))
            this._gamemode = _gamemode;
    }

    public MinecraftDifficulty get_difficulty() {
        return _difficulty;
    }

    public void set_difficulty(MinecraftDifficulty _difficulty) {
        if (!_gamemode.equals(MinecraftGameMode.Hardcore))
            this._difficulty = _difficulty;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
}
