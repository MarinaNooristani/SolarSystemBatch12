package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SolarSystem factorX=new SolarSystem();
        factorX.sun="1";
        factorX.moon="4";
        factorX.planet="2";
        factorX.stars="10000";

        //adding features to our sun
        FeatureSun Xfact=new FeatureSun();
        Xfact.color="green";
        Xfact.radius="10000000000km";
        Xfact.heat="435364646k1341j";
    }
}
