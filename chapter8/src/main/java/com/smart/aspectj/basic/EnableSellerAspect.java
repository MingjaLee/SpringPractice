package com.smart.aspectj.basic;

import com.smart.Seller;
import com.smart.SmallSeller;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * @author jerry
 * @create 17/6/28 14:36
 */
@Aspect
public class EnableSellerAspect {
    @DeclareParents(value = "com.smart.NaiveWaiter", defaultImpl = SmallSeller.class)
    public Seller seller;
}
