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
    // перевод типов добычи
    final static TreeMap<LootType, String> lootTypeNames = new TreeMap<>();
    // маршрут набега
    final ArrayList<Village> conquestPath = new ArrayList<>();
    // число серебра в сокровищнице
    int silverPieces = 0;
    // текущая дата
    LocalDate currentDate = LocalDate.of(1000, Month.MAY, 6);
    // список возможных личных имён
    final List<String> firstNames = List.of("Eric", "Harald", "Dyre", "Denholm", "Knute", "Niels", "Egil", "Bjarn", "Arvid", "Ingvar", "Snorre", "Sven", "Steinar");
    // список родов
    final List<String> families = List.of("Arenander", "Brandvold", "Elfving", "Gunnarson", "Holmsten", "Kjellson", "Lundevall", "Magnussen", "Nydahl", "Olasson", "Renberg", "Thorstad", "Widding", "Ylandeer");
