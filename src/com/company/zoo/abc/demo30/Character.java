package com.company.zoo.abc.demo30;

/**
 * @author lilei
 * @date 2020-09-06 15:20
 * @apiNote
 */

public abstract class Character {
    WeaponBehavior weaponBehavior;

    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performUseWeapon() {
        weaponBehavior.useWeapon();
    }

}
