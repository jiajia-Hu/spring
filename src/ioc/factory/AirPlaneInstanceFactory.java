package ioc.factory;

import ioc.bean.AirPlane;

public class AirPlaneInstanceFactory {



    public AirPlane getAirPlane(String jzName){
        System.out.println("AirPlaneInstanceFactory 造飞机");
        AirPlane airPlane = new AirPlane();
        airPlane.setFdj("太行");
        airPlane.setJzName(jzName);
        airPlane.setYc("148.39m");
        airPlane.setPersonNum(300);
        airPlane.setFjzName("副机长");
        return airPlane;
    }



}
