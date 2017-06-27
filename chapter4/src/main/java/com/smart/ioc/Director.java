package com.smart.ioc;

/**
 * @author jerry
 * @create 17/6/26 20:37
 */
public class Director {
    public void direct() {
        GeLi geli = new LiuDeHua();
        MoAttack moAttack = new MoAttack();
        moAttack.injectGeLi(geli);
        moAttack.cityGateAsk();
    }
}
