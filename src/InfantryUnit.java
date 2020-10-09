public class InfantryUnit extends AbstractUnit {
    public InfantryUnit(int hp, int atk) {
        super(hp, atk);
    }

    public void attack(IUnit opponent) {
        opponent.attackedByInfantry(this);
    }

    public void attackedByArcher(ArcherUnit au) {
        int dmg = au.atk * 3;
        hp -= dmg;
    }

    public void attackedByCavalry(CavalryUnit cu) {
        int dmg = cu.atk / 4;
        hp -= dmg;
    }

    public void attackedByInfantry(InfantryUnit iu) {
        int dmg = iu.atk;
        hp -= dmg;
    }
}
