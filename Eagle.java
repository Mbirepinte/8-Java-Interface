public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff(){
        System.out.println(getName()+" takes off in the sky");
    }

    @Override
    public void ascend(int newAltitude) {
        this.setAltitude(newAltitude);
        System.out.println(getName()+"flies upward, altitude:" + getAltitude());
    }
    @Override
    public void glide(){
        System.out.println(getName()+" glides into the air");
    }
    @Override
    public void descend(int newAltitude){
        this.setAltitude(newAltitude);
        System.out.println(getName()+" flies downard, altitude :" + getAltitude());
    }
    @Override
    public void land (){
        if (getAltitude() > 9 ){
        System.out.println(getName()+" is too high, it can't lands");
        } else {
        System.out.println(getName()+" lands on the ground");    
        }
        }
    }

