package jp.ac.uryukyu.ie.e225709;

public class Warrior extends LivingThing{
   
    public static Double damage;
    static int attack;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Warrior (String name, int maximumHP, int attack) {
        this.setName(name);
        setHitPoint(maximumHP);
        Warrior.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    
    public void attackWithWeponSkill(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(attack * 1.5);//attackの1.５倍の固定ダメージ
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！", getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
       if( getHitPoint() < 0 ) {
           dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}