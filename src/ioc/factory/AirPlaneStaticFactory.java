package ioc.factory;


import ioc.bean.AirPlane;

/*
* static 工厂
* */
public class AirPlaneStaticFactory {

    //静态方法AirPlaneStaticFactory.getAirPlane()
    public static AirPlane getAirPlane(String jzName){
        System.out.println("static AirPlaneStaticFactory 造飞机");
        AirPlane airPlane = new AirPlane();
        airPlane.setFdj("太行");
        airPlane.setJzName(jzName);
        airPlane.setYc("148.39m");
        airPlane.setPersonNum(300);
        airPlane.setFjzName("副机长");
        return airPlane;
    }
}
