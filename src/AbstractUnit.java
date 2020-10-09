public abstract class AbstractUnit implements IUnit {
    protected int hp;
    protected int atk;

    public AbstractUnit(int hp, int atk) {
        this.hp = hp;
        this.atk = atk;
    }

}
