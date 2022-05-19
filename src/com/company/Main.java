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

        //adding the features for star in the solar system
        FeatureStars facX=new FeatureStars();
        facX.color="green";
        facX.radius="9783284266428km";
        facX.size="3144242424m";

    }
}
