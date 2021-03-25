package untamedwilds.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigMobControl {
    public static ForgeConfigSpec.BooleanValue masterSpawner;
    public static ForgeConfigSpec.BooleanValue addBear;
    public static ForgeConfigSpec.BooleanValue addBigCat;
    public static ForgeConfigSpec.BooleanValue addHippo;
    public static ForgeConfigSpec.BooleanValue addAardvark;
    public static ForgeConfigSpec.BooleanValue addSnake;
    public static ForgeConfigSpec.BooleanValue addSoftshellTurtle;
    public static ForgeConfigSpec.BooleanValue addSunfish;
    public static ForgeConfigSpec.BooleanValue addTrevally;
    public static ForgeConfigSpec.BooleanValue addArowana;
    public static ForgeConfigSpec.BooleanValue addTarantula;
    public static ForgeConfigSpec.BooleanValue addGiantClam;

    ConfigMobControl(final ForgeConfigSpec.Builder builder) {
        builder.comment("Pest Control");
        masterSpawner = builder.comment("This toggle can used to fully disable the spawning of all UntamedWilds entities, giving flexibility if somebody chooses to use alternative mob spawning methods. [default: false]").define("mobcontrol.masterspawner", true);

        addBear = builder.comment("Controls whether to add Bears and their associated items.").define("mobcontrol.bear", true);
        addBigCat = builder.comment("Controls whether to add Big Cats and their associated items.").define("mobcontrol.bigcat", true);
        addHippo = builder.comment("Controls whether to add Hippos and their associated items.").define("mobcontrol.hippo", true);
        addAardvark = builder.comment("Controls whether to add Aardvarks and their associated items.").define("mobcontrol.aardvark", true);

        addSnake = builder.comment("Controls whether to add Snakes and their associated items.").define("mobcontrol.snake", true);
        addSoftshellTurtle = builder.comment("Controls whether to add Softshell Turtles and their associated items.").define("mobcontrol.softshell_turtle", true);
        addSunfish = builder.comment("Controls whether to add Sunfish and their associated items.").define("mobcontrol.sunfish", true);
        addTrevally = builder.comment("Controls whether to add Trevally and their associated items.").define("mobcontrol.trevally", true);
        addArowana = builder.comment("Controls whether to add Arowana and their associated items.").define("mobcontrol.arowana", true);
        addTarantula = builder.comment("Controls whether to add Tarantulas and their associated items.").define("mobcontrol.tarantula", true);
        addGiantClam = builder.comment("Controls whether to add Giant Clams and their associated items.").define("mobcontrol.giant_clam", true);
    }
}
