/*
 * Copyright 2018 IFlyTek. All rights reserved.
 */

package com.github.jianzh5.strategy;

/**
 * 环境角色拥有选择策略的能力，客户端只需要认识Context角色
 */
public class FightClient {
    public static void main(String[] args) {
        FightClient client = new FightClient();
        client.fightEnemy("王二");
    }

    private void fightEnemy(String enemyName) {
        StrategyContext context = new StrategyContext(enemyName);
        context.fight();
    }
}
