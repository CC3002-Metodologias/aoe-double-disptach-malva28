public interface IUnit {

    void attack(IUnit opponent );

    void attackedByArcher(ArcherUnit au);
    void attackedByCavalry(CavalryUnit cu);
    void attackedByInfantry(InfantryUnit iu);
}
