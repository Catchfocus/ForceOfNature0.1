import java.util.*;

public class Main {


    // === Képességek menü === === === ===

    public static void skillMenu(Character hero) {

        System.out.println("\n === Képességek ===\n");
        hero.writeSkillPoints();
        hero.setSkillPoint(10);

        do {
            if(hero.skillPoint>0) {
                Scanner beker = new Scanner(System.in);
                int choice = 0;
                System.out.println("\n\nJelenleg " + hero.skillPoint + " elosztható képesség pontod van\n");
                System.out.println("\nMelyik tulajdonságod szeretnéd növelni?\n"
                        + "\n    1 - Életerő       2 - Inteligencia      3 - Karizma"
                        + "\n    4 - Ügyesség      5 - Erős\n");

                choice=beker.nextInt();

                switch(choice) {
                    case 1: hero.upgradeVitality(1); break;
                    case 2: hero.upgradeIntelligence(1); break;
                    case 3: hero.upgradeCarisma(1);  break;
                    case 4: hero.upgradeDexterity(1);  break;
                    case 5: hero.upgradeStrenght(1);  break;
                    default: System.out.println("Csak a megadott lehetőségek közül válassz!");
                }
            }
        }while(hero.skillPoint>0);

        System.out.println("\n\nTanult képességek:\n\n");

    }

    // === === === === === === ===




    // === Karakter kreációs menü ===


    public static void choiceClass(Character hero) {
        System.out.println("\nVálassz kasztot!\n\n  1 - Harcos\n"
                + "\n      Státuszai:"
                + "\n        HP: 500"
                + "\n        Mana: 0"
                + "\n        DMG: 20"
                + "\n        Armor: 50"
                + "\n\n"
                + "\n  2 - Íjász\n"
                + "\n      Státuszai:"
                + "\n        HP: 300"
                + "\n        Mana: 20"
                + "\n        DMG: 40"
                + "\n        Armor: 30"
                + "\n\n");

        Scanner be = new Scanner(System.in);
        hero.classIndicator=be.nextInt();
        switch(hero.classIndicator) {
            case 1: hero.upgradeStats(500.0, 0.0, 20.0, 50.0); hero.allStatsToMax();break;
            case 2: hero.upgradeStats( 300.0, 20.0, 40.0, 30.0); hero.allStatsToMax();break;
            default: System.out.println("Kerlek csak a megadott szamokat ird be!\n"); choiceClass(hero); break;
        }
    }

    public static void choiceRace(Character hero) {
        System.out.println("\nVálassz kasztot!\n\n  1 - Ember\n"
                + "\n      Képesség pontok:"
                + "\n        Életerő:6"
                + "\n        Inteligencia:8"
                + "\n        Karizma:10"
                + "\n        Ügyesség:6"
                + "\n        Erő:5\n"
                + "\n        Mozgási sebesség: 0.8"
                + "\n\n"
                + "\n  2 - Elf\n"
                + "\n      Képesség pontok:"
                + "\n        Életerő:5"
                + "\n        Inteligencia:11"
                + "\n        Karizma:6"
                + "\n        Ügyesség:8"
                + "\n        Erő:3\n"
                + "\n        Mozgási sebesség: 1"
                + "\n\n"
                + "\n  3 - Ork\n"
                + "\n      Képesség pontok:"
                + "\n        Életerő:13"
                + "\n        Inteligencia:3"
                + "\n        Karizma:3"
                + "\n        Ügyesség:3"
                + "\n        Erő:10\n"
                + "\n        Mozgási sebesség: 0.6"
                + "\n\n");


        Scanner be = new Scanner(System.in);
        hero.raceIndicator=be.nextInt();
        switch(hero.raceIndicator) {
            case 1: hero.upgradeAllSkill(6, 8, 10, 6, 5, 0.8); System.out.println("Az emberi fajt választottad\n");;break;
            case 2: hero.upgradeAllSkill(5, 11, 6, 8, 3, 1.0); System.out.println("Az elf fajt választottad\n");;break;
            case 3: hero.upgradeAllSkill(13, 3, 3, 3, 10, 0.6); System.out.println("Az ork fajt választottad\n");;break;
            default: System.out.println("Kerlek csak a megadott szamokat ird be!\n"); choiceRace(hero); break;
        }

    }


    public static boolean characterCreate(Character hero) {
        Scanner be = new Scanner(System.in);
        boolean create = false;

        System.out.print("Add meg a karakter nevét: ");
        hero.name=be.next();

        choiceClass(hero);
        choiceRace(hero);


        create = true;

        return create;

    }


// === === === ===


// === INGAME MENU ===


    public static void inGameMenu(Character hero, Map map, boolean created) {
        int choice = 0;
        Scanner be = new Scanner(System.in);

        do {
            System.out.println("\n = = = = = = = = = = Ingame Menu = = = = = = = = = = \n"
                    + "\n  1 - Karakter státusz   2 - Eszköztár    3 - Képességek"
                    + "\n  4 - Térkep             5 - Főmenü  \n"
                    + "\n = = = = = = = = = = = = = = = = = =  = = = = = = = = \n ");
            choice=be.nextInt();
            switch(choice){
                case 1: System.out.println("Karakter statuszainak megnyitasa...\n"); hero.writeStats(); inGameMenu(hero,map,created);;break;
                case 2: System.out.println("Eszkoztar megnyitasa...\n");inGameMenu(hero,map,created); ;break;
                case 3: System.out.println("Kepessegek megnyitasa...\n");skillMenu(hero); inGameMenu(hero,map,created); break;
                case 4: System.out.println("Terkep megnyitasa...\n"); Map.mapMenu(map, hero);inGameMenu(hero,map,created);break;
                case 5: System.out.println("Vissza a főmenübe...\n"); mainMenu(hero,map,created);break;
                default: inGameMenu(hero,map,created); break;
            }


        }while(choice != 1 && choice != 2 && choice != 3 && choice != 4);

    }


// === === === === ===


// === MAIN MENU ===

    public static void mainMenu(Character hero,Map map,boolean created) {
        int choice = 0;
        Scanner be = new Scanner(System.in);

        System.out.println("Valassz az alabbi menüpontok közül!\n\n");
        if(created==true) {
            System.out.println("1 - Játék folytatása\n");
        }else {
            System.out.println("1 - Új játék\n");
        }
        System.out.println("2 - Kilépés\n");

        choice=be.nextInt();
        do {

            if(choice==1) {  //1 - folytatás
                if(created) {
                    System.out.println("\nVisszalépés az Ingame Menübe...\n\n");
                    inGameMenu(hero,map,created);
                }else {
                    System.out.println("\nÚj játék indul...\n\n");
                }
            }else if(choice==2){ //1 - új játék
                System.exit(0);
            }else {
                System.out.println("\nCsak a megadott menupontokat valaszd!");
                mainMenu(hero,map, created);
            }


        }while(choice != 1 && choice != 2);

    }


// === === === === ===








    public static void main(String[] args) {
        Map map1 = new Map();
        map1.name="Lofasz";
        Character hero = new Character();

        boolean created = false;

        mainMenu(hero,map1,created);

        created = characterCreate(hero);

        inGameMenu(hero,map1,created);


    }

}

