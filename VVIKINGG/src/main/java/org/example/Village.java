import java.util.Random;
import java.util.TreeMap;

public class Village {


    final int level;
    boolean destroyed = false;
    int slaves;
    final VillageType theType;
    final int longitude;
    final int lattitude;
    TreeMap<LootType, Integer> all_loot;

    Village(VillageType vt, int lvl, int lng, int lat){
        theType = vt;
        level = lvl;
        Random rnd = new Random();
        longitude = lng;
        lattitude = lat;
        slaves = lvl*2;
        all_loot = new TreeMap<>();