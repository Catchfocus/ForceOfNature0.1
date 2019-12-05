import java.util.Scanner;

public class Map {

    public String name="";
    public double x=0.0;
    public double y=0.0;
    public int choice=0;


    public static void mapMenu(Map map, Character hero){
        Scanner be = new Scanner(System.in);
        System.out.println("Merre fele szeretnel haladni? \n\n1 - Észak-Nyugat    2 - Észak    3 - Észak-Kelet\n"
                + "4 - Nyugat          ITT VAGY     5 - Kelet\n"
                + "6 - Dél-Nyugat      7 - Dél      7 - Dél-Kelet\n\n");
        map.choice=be.nextInt();
        switch(map.choice) {
            case 1: hero.move(-1, 1); break; // Észak-Nyugat
            case 2:	hero.move(0, 1);break; // Észak
            case 3: hero.move(1, 1);break; // Észak-Kelet
            case 4: hero.move(-1, 0);break; // Nyugat
            case 5: hero.move(1, 0);break; // Kelet
            case 6: hero.move(-1, -1);break; // Dél-Nyugat
            case 7: hero.move(0, -1);break; // Dél
            case 8: hero.move(1, -1);break; // Dél-Kelet
        }

        hero.writePosition(map);

        countinueMoving(map,hero);

    }




    public static void countinueMoving (Map map, Character hero) {
        System.out.println("Szeretnel tovabb mozogni?\n\n1 - Igen\n2 - Nem\n\n");
        Scanner beker = new Scanner(System.in);
        int yesno = beker.nextInt();
        if(yesno==1) {
            mapMenu(map,hero);
        }else if(yesno==2) {
            System.out.println("Visszalépés a menübe...\n\n");
        }else {
            System.out.println("Hibás értéket adtál meg...\nKérlek csak a lehetőségek közül válassz!\n\n");
            countinueMoving(map,hero);
        }

    }
}