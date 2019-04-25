package P1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;


public class ReizigerOracleDaoImpl implements ReizigerDao {

    private ArrayList<Reiziger> list = new ArrayList<Reiziger>();

    @Override
    public ArrayList<Reiziger> findAll() {
        return list;
    }


    @Override
    public ArrayList<Reiziger> findByGBdatum(String GBdatum) {
        String gd = null;
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        ArrayList<Reiziger> reizigerGBdatum = new ArrayList<Reiziger>();

        for (Reiziger r : list) {
            gd = r.getGbDatum();
            try {
                gd = String.valueOf(format.parse(String.valueOf(gd)));
                reizigerGBdatum.add(r);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        return reizigerGBdatum;

    }

    @Override
    public void save(Reiziger r) {
        list.add(r);
    }

    @Override
    public void update(Reiziger r, String naam, String date) {
        r.setNaam(naam);
        r.setGbDatum(date);

        list.add(r);

    }

    @Override
    public void delete(Reiziger r) {

        list.remove(r);
    }
}
