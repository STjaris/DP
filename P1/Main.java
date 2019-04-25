package P1;

public class Main {

    public static void main(String args[]) {

        ReizigerOracleDaoImpl dao = new ReizigerOracleDaoImpl();

        Reiziger r1 = new Reiziger("Jeffrey van Es", "8/12/1999");
        System.out.println(r1.getNaam() + "  -  " + r1.getGbDatum());
        dao.save(r1);

        Reiziger r2 = new Reiziger("Rick van Tol", "9/8/2000");
        System.out.println(r2.getNaam() + "  -  " + r2.getGbDatum());
        dao.save(r2);

        Reiziger r3 = new Reiziger("Thom van Bemmelen", "19/5/2000");
        System.out.println(r3.getNaam() + "  -  " + r3.getGbDatum());
        dao.save(r3);

        System.out.println(dao.findAll());

        dao.delete(r2);

        System.out.println(dao.findAll());


    }
}
