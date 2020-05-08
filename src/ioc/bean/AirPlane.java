package ioc.bean;

public class AirPlane {
    private String fdj;//发动机
    private String yc;//机翼的长度
    private Integer personNum;//载客量
    private String jzName;//机长name
    private String fjzName;//副机长name


    public String getFdj() {
        return fdj;
    }

    public void setFdj(String fdj) {
        this.fdj = fdj;
    }

    public String getYc() {
        return yc;
    }

    public void setYc(String yc) {
        this.yc = yc;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public String getJzName() {
        return jzName;
    }

    public void setJzName(String jzName) {
        this.jzName = jzName;
    }

    public String getFjzName() {
        return fjzName;
    }

    public void setFjzName(String fjzName) {
        this.fjzName = fjzName;
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "fdj='" + fdj + '\'' +
                ", yc='" + yc + '\'' +
                ", personNum=" + personNum +
                ", jzName='" + jzName + '\'' +
                ", fjzName='" + fjzName + '\'' +
                '}';
    }
}
