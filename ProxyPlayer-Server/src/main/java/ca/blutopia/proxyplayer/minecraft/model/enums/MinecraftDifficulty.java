package ca.blutopia.proxyplayer.minecraft.model.enums;

public enum MinecraftDifficulty {

    Peaceful,
    Easy,
    Normal,
    Hard;

    public static MinecraftDifficulty parseInt(int x) {
        return switch (x) {
            case 0 -> Peaceful;
            case 1 -> Easy;
            case 2 -> Normal;
            case 3 -> Hard;
            default -> null;
        };
    }

}
