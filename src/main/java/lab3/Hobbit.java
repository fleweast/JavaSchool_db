package lab3;

public class Hobbit extends Hero{

    public Hobbit(String name){
        this.setName(name);
        this.setPower(0);
        this.setHp(3);
    }

    @Override
    public String kick(Hero c) {
        return toCry();
    }

    private String toCry(){
        return "Waaaaah, waaah, waaaah";
    }
}
