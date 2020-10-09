public class ArcherUnit extends AbstractUnit {
    public ArcherUnit(int hp, int atk){
        super(hp, atk);
    }
    public void attack(IUnit opponent ) {
        opponent.attackedByArcher(this);
    }

    public void attackedByArcher(ArcherUnit au) {
        int dmg = au.atk;
        hp -= dmg;
    }

    public void attackedByCavalry(CavalryUnit cu) {
        int dmg = cu.atk + 15;
        hp -= dmg;
    }

    public void attackedByInfantry(InfantryUnit iu) {
        int dmg = iu.atk/2;
        hp -= dmg;
    }
}
