package P1;

import java.util.ArrayList;
import java.util.Date;

public interface ReizigerDao {

    ArrayList<Reiziger> findAll();

    ArrayList<Reiziger> findByGBdatum(String GBdatum);

    void save(Reiziger r);

    void update(Reiziger r, String naam, String date);

    void delete(Reiziger r);

}
