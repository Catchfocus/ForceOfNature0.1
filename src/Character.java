
public class Character {

    public String name; // karakter neve
    public int gold = 0;

    // === HP/MANA/DMG/ARMOR ===
    public double hp, maxHp = 0.0;  // HP = JELENLEGI ÉLETE , MAX HP =AMENNYI LEHET MAXIMUM
    public double mana, maxMana = 0.0; // MANA = JELENLEGI FELHASZNÁLHATÓ MANA, MAX MANA = AMENNYI LEHET MAXIMUM
    public double actualPhysicalDamage, physicalDamage = 0.0; // 1. FIZIKAI SEBZÉS JELNLEG (PL DEBUFF ESETÉN KISEBB BUFF ESETÉN NAGYOBB A FIZIKAI SEBZÉSNÉL) 2. FIZIKAI SEBZÉS
    public double actualArmor, armor = 0.0; // 1. FIZIKAI VÉDELEM JELNLEG (DEBUFF ESETÉN KISEBB BUFF ESETÉN NAGYOBB public double movementSpeed=1.0; // ALAP STATOS MOZGÁSI SEBESSÉG, MEGHATÁROZZA MENNYIT HALADSZ A TÉKRÉPEN
    // === === === === === === ===


    // === KASZTOK ÉS FAJOK ===
    public int classIndicator = 0; // Értéke meghatározza a kasztot, Harcos,Íjász,Tolvaj,Mágus stb...
    public int raceIndicator = 0; // Értéke meghatározza a fajt, Elf,Ember,Ork,Goblin stb...
    // === === === === === === ===


    // === LEVELING & SKILL POINT RENDSZER ===
    public int exp = 0; // FEJLŐDÉSI MUTATÓ, HA ELÉR EGY BIZONYOS PONTSZÁMOT AKKOR SZINTET LÉPHET A KARAKTER
    public int level = 1; // MEGFELELŐ EXP PONTOK UTÁN, NŐ AZ ÉRTÉKE, HA A KARAKTER SZINTET LÉP SKILL POINTOKAT KAP
    public int skillPoint = 0; // AZ ELOSZTHATÓ KÉPESSÉG PONTOK SZÁMA,EL LEHET OSZTANI AZ ALAP STATOKRA


    // == ALAP STATOK ===
    public double movementSpeed= 1.0; // MOZGÁSI SEBESSÉG, MEGHATÁROZZA MENNYIT HALADSZ A TÉKRÉPEN, AZ EGYETLEN ALAP STAT AMIT NEM LEHET NÖVELNI SKILL POINTTAL, CSAK ALACSONYABB LEHET
    public int vitality = 0; // ÉLETERŐ , NÖVELÉSÉVEL NŐ A HP
    public int intelligence = 0; // INTELLIGENCIA, NÖVELÉSÉVEL NŐ A MANA ÉS CSÖKKEN ANNAK AZ ESÉLYE HOGY ÁTVERNEK
    public int carisma = 0; // KARIZMA , NÖVELÉSÉVEL TÖBB LEHETŐSÉG NYÍLIK MEG AZ NPC-KNÉL, KERESKEDÉSKOR BOLTOKBAN OLCSÓBBAK A TÁRGYAK A NORMÁL ÁRNÁL
    public int dexterity = 0; // ÜGYESSÉG , AZ ELLENFÉL TÁMADÁSAINAK BLOKKOLÁSI ESÉLYÉT, KITÉRÉSI ESÉLYT NÖVEL
    public int strenght = 0; // ERŐ, NÖVELI A FIZIKAI SEBZÉS ÉRTÉKÉT

    // === === === === === === === ===



    // === TÉRKÉPEN VALÓ ELHELYEZKEDÉS
    public double[] position = { 0.0 , 0.0 };

    // === === === === === === ===


    // === FÜGGVÉNYEK ===


    // === NAME ===

    // === SETTER ===

    public void setName(String name) {
        this.name = name;
    }

    // === === === ===

    // === GETTER ===

    public String getName() {
        return this.name;
    }

    // === === === ===

    // === === === ==

    // === GOLD ===

    // === SETTER ===

    public void setGold(int gold) {
        this.gold = gold;
    }

    // === === === ===

    // === GETTER ===

    public int getGold() {
        return this.gold;
    }

    // === === === ==


    // === HP / MAXHP ===

    // === SETTER ===

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setMaxHp(double maxhp) {
        this.maxHp = maxhp;
    }

    // === === === ===


    // === GETTER ===
    public double getHp() {

        return this.hp;
    }

    public double getMaxHp() {

        return this.maxHp;
    }

    // === === === ===


    // === === === === ===



    // === MANA / MAXMANA ===

    // === SETTER ===

    public void setMana(double mana) {
        this.mana = mana;
    }

    public void setMaxMana(double maxmana) {
        this.maxMana = maxmana;
    }

    // === === === ===


    // === GETTER ===

    public double getMana() {

        return this.mana;
    }

    public double getMaxMana() {

        return this.maxMana;
    }


    // === === === ===

    // === === === === === ===



    // === ACUTAL DMG / DMG ===

    // === SETTER ===

    public void setActualPhysicalDamage(double actualdmg) {
        this.actualPhysicalDamage = actualdmg;
    }

    public void setPhysicalDamage(double dmg) {
        this.physicalDamage = dmg;
    }

    // === === === ===


    // === GETTER ===

    public double getActualPhysicalDamage() {

        return this.actualPhysicalDamage;
    }

    public double getPhysicalDamage() {

        return this.physicalDamage;
    }

    // === === === ===

    // === === === === === ===



    // === ACTUAL ARMOR / ARMOR ===

    // === SETTER ===

    public void setActualArmor(double actualarmor) {
        this.actualArmor = actualarmor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    // === === === ===


    // === GETTER ===

    public double getActualArmor() {
        return this.actualArmor;
    }

    public double getArmor() {
        return this.armor;
    }


    // === === === ===

    // === === === === === === ===


    // === KASZTOK ÉS FAJOK ===

    // === SETTER ===

    public void setClassIndicator(int classindicator) {
        this.classIndicator = classindicator;
    }

    public void setRaceIndicator(int raceindicator) {
        this.raceIndicator = raceindicator;
    }
    // === === === ===

    // === GETTER ===

    public int getClassIndicator() {
        return this.classIndicator;
    }

    public int getRaceIndicator() {
        return this.raceIndicator;
    }

    // === === === ==

    // === === === === === === ===



    // === EXP ===

    // === SETTER ===

    public void setExp(int exp) {
        this.exp = exp;
    }

    // === === === ===

    // === GETTER ===

    public int getExp() {
        return this.exp;
    }

    // === === === ==

    // === === === === === === === === === === ===


    // === LEVEL ===

    // === SETTER ===

    public void setLevel(int level) {
        this.level = level;
    }

    // === === === ===

    // === GETTER ===

    public int getLevel() {
        return this.level;
    }

    // === === === ==

    // === === === ===


    // === SKILLPOINT ===



    // === SETTER ===

    public void setSkillPoint(int skillpoint) {
        this.skillPoint = skillpoint;
    }

    // === === === ===

    public void upgradeSkillPoint(int skillpoint) {
        this.skillPoint += skillpoint;
    }

    // === GETTER ===

    public int getSkillPoint() {
        return this.skillPoint;
    }


    // === === === ==

    // === === === === ===

    // === MOVEMENT SPEED ===

    // === SETTER ===

    public void setMovementSpeed(double movementspeed) {
        this.movementSpeed = movementspeed;
    }

    // === === === ===

    public void upgradeMovementSpeed(double movementspeed) {
        this.movementSpeed += movementspeed;
        if(this.movementSpeed>1.0) {
            this.setMovementSpeed(1.0);
        }


    }

    // === GETTER ===

    public double getMovementSpeed() {
        return this.movementSpeed;
    }

    // === === === ==

    // === === === === ===

    // === VITALITY ===

    // === SETTER ===

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    // === === === ===

    public void upgradeVitality(int vitality) {
        this.vitality += vitality;
        this.skillPoint -=vitality;
    }

    // === GETTER ===

    public int getVitality() {
        return this.vitality;
    }

    // === === === ==

    // === === === ===

    // === INTELLIGENCE ===

    // === SETTER ===

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    // === === === ===

    public void upgradeIntelligence(int intelligence) {
        this.intelligence += intelligence;
        this.skillPoint -= intelligence;
    }

    // === GETTER ===

    public int getIntelligence() {
        return this.intelligence;
    }

    // === === === ==

    // === === === === ===


    // === CARISMA ===

    // === SETTER ===

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    // === === === ===

    public void upgradeCarisma(int carisma) {
        this.carisma += carisma;
        this.skillPoint -= carisma;
    }

    // === GETTER ===

    public int getCarisma() {
        return this.carisma;
    }

    // === === === ===

    // === === === === === === ===


    // === DEXTERITY ===

    // === SETTER ===

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    // === === === ===

    public void upgradeDexterity(int dexterity) {
        this.dexterity += dexterity;
        this.skillPoint -= dexterity;
    }

    // === GETTER ===

    public int getDexterity() {
        return this.dexterity;
    }

    // === === === ==

    // === === === ===

    // === STRENGHT ===

    // === SETTER ===

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    // === === === ===

    public void upgradeStrenght(int strenght) {
        this.strenght += strenght;
        this.strenght -= strenght;
    }

    // === GETTER ===

    public int getStrenght() {
        return this.strenght;
    }

    // === === === ==

    // === === === === === === ===

    // === POSITION ===

    // === SETTER ===

    public void setCoordX(double x) {
        this.position[0] = x;
    }

    public void setCoordY(double y) {
        this.position[1] = y;
    }

    public void setPosition(double x, double y) {
        this.setCoordX(x);
        this.setCoordY(y);

    }

    public void stepTo(double x, double y) {
        this.position[0]+=x;
        this.position[1]+=y;
    }


    // === === === ===

    // === GETTER ===

    public double getCoordX() {
        return this.position[0];
    }

    public double getCoordY() {
        return this.position[1];
    }

    public double[] getPosition() {
        return this.position;
    }

    // === === === ==

    // === === === === === === ===


    // === OTHER METHODS ===


    public void writePosition(Map map) {
        System.out.println("Jelenleg " + map.name + " terület X:" + this.getCoordX() + ", Y:" + this.getCoordY() + " koordinátáin vagy.\n\n");
    }

    public void move(int x, int y) {
        if(x<0) {

            if(y<0) {
                this.stepTo(-this.movementSpeed/2, -this.movementSpeed/2);
                System.out.println("Dél-Nyugat felé haladtál.\n\n");

            }else if(y==0) {

                this.stepTo(-this.movementSpeed, 0);
                System.out.println("Nyugat felé haladtál.\n\n");

            }else if(y>0) {

                this.stepTo(-this.movementSpeed/2, this.movementSpeed/2);
                System.out.println("Észak-Nyugat felé haladtál.\n\n");

            }

        }else if(x==0) {

            if(y<0) {

                this.stepTo(0, this.movementSpeed);
                System.out.println("Dél felé haladtál.\n\n");

            }else if(y>0) {

                this.stepTo(0, -(this.movementSpeed));
                System.out.println("Észak felé haladtál.\n\n");
            }

        }else if(x>0) {

            if(y<0) {

                this.stepTo(this.movementSpeed/2,-this.movementSpeed/2);
                System.out.println("Dél-Kelet felé haladtál. \n\n");

            }else if(y==0) {

                this.stepTo(this.movementSpeed, 0);
                System.out.println("Kelet felé haladtál. \n\n");

            }else if(y>0) {

                this.stepTo(this.movementSpeed/2, this.movementSpeed/2);
                System.out.println("Észak-Kelet felé haladtál. \n\n");

            }

        }
    }


    // === === === === === === === === ===


    public void upgradeStats( double hp, double mana,double physicalDamage, double armor) {
        this.maxHp += hp;
        this.maxMana += mana;
        this.physicalDamage += physicalDamage ;
        this.armor += armor;
        System.out.println("A statuszaid frissultek...\n");
    }

    public void upgradeAllSkill(int vitality, int intelligence, int carisma, int dexterity, int strenght, double movementspeed) {
        this.upgradeVitality(vitality);
        this.upgradeIntelligence(intelligence);
        this.upgradeCarisma(carisma);
        this.upgradeDexterity(dexterity);
        this.upgradeStrenght(strenght);
        this.upgradeMovementSpeed(movementspeed);

    }

    public void allStatsToMax() {
        this.hp=this.maxHp;
        this.actualArmor=this.armor;
        this.mana=this.maxMana;
        this.actualPhysicalDamage = this.physicalDamage;
    }

    public void writeStats() {
        System.out.println("Karakter statuszpontjai\n");
        System.out.println("  HP: " + this.hp + "/" + this.maxHp);
        System.out.println("  Mana: " + this.mana + "/" + this.maxMana);
        System.out.println("  Level: " + this.level);
        System.out.println("  Exp: " + this.exp);
        System.out.println("  Physical Damage: " + this.actualPhysicalDamage);
        System.out.println("  Armor: " + this.armor);
    }

    public void writeSkillPoints() {
        System.out.println("Karakter képességpontjai\n");
        System.out.println("  Életerő: " + this.getVitality());
        System.out.println("  Inteligencia: " + this.getIntelligence() );
        System.out.println("  Karizma: " + this.getCarisma());
        System.out.println("  Ügyesség: " + this.getDexterity());
        System.out.println("  Erő: " + this.getStrenght());
        System.out.println("  Mozgási sebesség: " + this.getMovementSpeed());
    }


    public void levelUp() {
        switch(this.level){
            case 1:
                if(this.exp>=30) {
                    this.level++;
                    this.upgradeSkillPoint(2);
                    System.out.println("Gratulalok elerted a "+ this.level + ". szintet!\n" + this.skillPoint + " db elosztható képesség pontod van.\n");
                    switch(this.classIndicator){
                        case 1: this.upgradeStats( (this.maxHp*1.2), 0 , (this.physicalDamage*1.1), (this.armor*1.4));
                        case 2: this.upgradeStats( (this.maxHp*1.1),(this.maxMana*1.1), (this.physicalDamage*1.3), (this.armor*1.2));
                    }
                    this.exp-=30;
                }break;

            case 2:
                if(this.exp>=60) {
                    this.level++;
                    this.upgradeSkillPoint(4);
                    System.out.println("Gratulalok elerted a "+ this.level + ". szintet!\n" + this.skillPoint + " db elosztható képesség pontod van.\n");
                    switch(this.classIndicator){
                        case 1: this.upgradeStats( (this.maxHp*1.2),0 , (this.physicalDamage*1.1), (this.armor*1.4));
                        case 2: this.upgradeStats( (this.maxHp*1.1),(this.maxMana*1.1), (this.physicalDamage*1.3), (this.armor*1.2));
                    }
                    this.exp-=60;
                }break;
            case 3:
                if(this.exp>=120) {
                    this.level++;
                    this.upgradeSkillPoint(6);
                    System.out.println("Gratulalok elerted a "+ this.level + ". szintet!\n" + this.skillPoint + " db elosztható képesség pontod van.\n");
                    switch(this.classIndicator){
                        case 1: this.upgradeStats( (this.maxHp*1.2),0 , (this.physicalDamage*1.1), (this.armor*1.4));
                        case 2: this.upgradeStats( (this.maxHp*1.1),(this.maxMana*1.1), (this.physicalDamage*1.3), (this.armor*1.2));
                    }
                    this.exp-=120;
                }break;

            case 4:
                if(this.exp>=240) {
                    this.level++;
                    this.upgradeSkillPoint(10);
                    System.out.println("Gratulalok elerted a "+ this.level + ". szintet!\n" + this.skillPoint + " db elosztható képesség pontod van.\n");
                    switch(this.classIndicator){
                        case 1: this.upgradeStats((this.maxHp*1.2),0 , (this.physicalDamage*1.1), (this.armor*1.4));
                        case 2: this.upgradeStats( (this.maxHp*1.1),(this.maxMana*1.1), (this.physicalDamage*1.3), (this.armor*1.2));
                    }
                    this.exp-=240;
                }break;


        }

    }

}