package home_work_Collections.suplier;

import home_work_Collections.dto.Person;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class PersonSupplier implements Supplier<Person> {
    private final String[] nicks = {"Pupkin", "FruktoZZa", "BlackKing", "Lambda", "ThreadMaximizer", "JavaJune", "ExCollect",
            "Elvira", "AtomicPers", "Randomizer", "Commando", "Cowboy","Detector", "Dragon", "Gutsy heart", "Hawk", "Killer",
            "Killer", "Phantom", "Shooter", "Warrior"};

    @Override
    public Person get() {
        String nick = nicks[new Random().nextInt(nicks.length)];
        return new Person(nick,passwordRandom());
    }
    private String passwordRandom(){
        String result="";
        StringBuilder builder = new StringBuilder();
        int passwordRndLength = ThreadLocalRandom.current().nextInt(5,10);
        char[] nameCharRnd = new char[passwordRndLength];
        for (int i = 0; i < nameCharRnd.length; i++) {
            nameCharRnd[i]=(char)ThreadLocalRandom.current().nextInt(65,122);
            builder.append(nameCharRnd[i]);
        }
        return builder.toString();
    }


}
