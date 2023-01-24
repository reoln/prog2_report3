package jp.ac.uryukyu.ie.e225709;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class WarriorTest {
    @Test void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", defaultHeroHp, 100);
        Enemy slime = new Enemy("スライムもどき", 10, 100);
        for(int count=0; count<3; count++){
            demoWarrior.attackWithWeponSkill(slime); 
            assertEquals(150, Warrior.attack * 1.5);
        }
    }   
}
