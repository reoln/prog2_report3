package jp.ac.uryukyu.ie.e225709;

public class LivingThing {
    public String name;
    public int hitPoint;
    public static int attack;
    public boolean dead;

    public boolean isDead() {
        return dead;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void attack(LivingThing opponent){
        if (this.dead == false){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", getName(), opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */

    public void wounded(int damage){
        hitPoint = hitPoint - damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}

