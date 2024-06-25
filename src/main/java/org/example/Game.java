import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Game {

    // драккары, викинги дла найма, деревни
    final ArrayList<Drakkar> allDrakkars = new ArrayList<>();
    final ArrayList<Village> allVillages = new ArrayList<>();
    final ArrayList<Viking> allVikings = new ArrayList<>();
    // макс широта и долгота. Для удобства в км.
    final int maxLat;
    final int maxLng;
    // имена и короткие имена деревень
    final static TreeMap<VillageType, String> villageTypeNames = new TreeMap<>();
    final static TreeMap<VillageType, String> villageShortNames = new TreeMap<>();