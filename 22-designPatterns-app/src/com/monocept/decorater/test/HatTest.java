package com.monocept.decorater.test;

import com.monocept.decorater.model.GoldenHat;
import com.monocept.decorater.model.IHat;
import com.monocept.decorater.model.PremiumHat;
import com.monocept.decorater.model.RibbonedHat;
import com.monocept.decorater.model.StandardHat;

public class HatTest {

	public static void main(String[] args) {
		IHat standardHat = new StandardHat();
        IHat premiumHat = new PremiumHat();

        IHat goldenStandardHat = new GoldenHat(standardHat);
        IHat ribbonedPremiumHat = new RibbonedHat(premiumHat);

        System.out.println(goldenStandardHat.getName());
        System.out.println(goldenStandardHat.getPrice());
        System.out.println(goldenStandardHat.getDescription());

        System.out.println(ribbonedPremiumHat.getName());
        System.out.println(ribbonedPremiumHat.getPrice());
        System.out.println(ribbonedPremiumHat.getDescription());
    }
}