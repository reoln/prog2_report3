package jp.ac.uryukyu.ie.e225709;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        this.setName(name);
        setHitPoint(maximumHP);
        Hero.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
 

    @Override
    public void wounded(int damage){
        hitPoint -= damage;
       if( getHitPoint() < 0 ) {
           dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}
    