package radioAlarm;

public class RadioAlarm implements Alarm, Radio{
    @Override
    public void a() {
        System.out.println("A");
    }

    @Override
    public void b() {
        System.out.println("B");
    }

    @Override
    public void c() {
        System.out.println("C");
    }

    @Override
    public void d() {
        System.out.println("D");
    }
}
