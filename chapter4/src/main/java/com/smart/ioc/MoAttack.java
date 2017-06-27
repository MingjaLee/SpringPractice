package com.smart.ioc;

/**
 * @author jerry
 * @create 17/6/26 20:33
 */
public class MoAttack implements ActorArrangable{
    private GeLi geli;

    //public void setGeli(GeLi geli) {
    //    this.geli = geli;
    //}

    public void injectGeLi(GeLi geli) {
        this.geli = geli;
    }

    public void cityGateAsk() {
        geli.responseAsk("墨者革离");
    }
}
