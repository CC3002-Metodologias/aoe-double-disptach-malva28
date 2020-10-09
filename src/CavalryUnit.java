public class CavalryUnit extends AbstractUnit{
    public CavalryUnit(int hp, int atk){
        super(hp, atk);
    }

    public void attack(IUnit opponent ) {
        opponent.attackedByCavalry(this);
    }

    public void attackedByArcher(ArcherUnit au) {
        int dmg = au.atk-10;
        hp -= dmg;
    }

    public void attackedByCavalry(CavalryUnit cu) {
        int dmg = cu.atk;
        hp -= dmg;
    }

    public void attackedByInfantry(InfantryUnit iu) {
        int dmg = iu.atk*5;
        hp -= dmg;
    }
}
