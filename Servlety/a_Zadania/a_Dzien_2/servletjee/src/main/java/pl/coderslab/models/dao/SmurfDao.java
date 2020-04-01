package pl.coderslab.models.dao;

import pl.coderslab.models.Smurf;

import java.util.ArrayList;
import java.util.List;

public class SmurfDao {
    public static List<Smurf> getList() {
        List<Smurf> smurfs = new ArrayList<>();
        smurfs.add(new Smurf("Papa smerf", "broda", "Szef"));
        smurfs.add(new Smurf("Wazniak", "okulary", "Wazny bardzo"));
        smurfs.add(new Smurf("Lalus", "lusterko", "patrzy w lusterko"));
        smurfs.add(new Smurf("Osilek", "Sztanga", "koks"));
        smurfs.add(new Smurf("Smerfetka", "Wlosy", "Jedyna baba"));
        return smurfs;

    }
}
