package com.company.zoo.abc.demo30;

/**
 * @author lilei
 * @date 2020-09-06 15:28
 * @apiNote
 */

public class CharacterSimulator {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();
        king.performUseWeapon();

        Character queen = new Queen();
        queen.setWeaponBehavior(new KnifeBehavior());
        queen.fight();
        queen.performUseWeapon();
    }
}
