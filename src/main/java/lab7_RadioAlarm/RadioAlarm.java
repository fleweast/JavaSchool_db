package lab7_RadioAlarm;

public class RadioAlarm implements Alarm, Radio{
    @Override
    public void A() {
        System.out.println("A");
    }

    @Override
    public void B() {
        System.out.println("B");
    }

    @Override
    public void C() {
        System.out.println("C");
    }

    @Override
    public void D() {
        System.out.println("D");
    }
}
