package home_work_4.taskStudent;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Student {
    private int number;
    private String name;
    private byte age;
    private float mark;
    private boolean isOlimp;

    public Student(){
        this(1);
    }

    public Student(int number) {
        this.number = number;
        this.name= nameRandomChaos();
        this.age = (byte) ThreadLocalRandom.current().nextInt(7,17);
        this.mark = (float) Math.random()*10;
        int isOlimpRnd = ThreadLocalRandom.current().nextInt(0,1);
        if (isOlimpRnd == 0){
            this.isOlimp=false;
        } else {
            this.isOlimp=true;
        }
    }

        public String nameRandomChaos(){
        String result="";
        int nameRndLength = ThreadLocalRandom.current().nextInt(3,10);
        char[] nameCharRnd = new char[nameRndLength];
        for (int i = 0; i < nameCharRnd.length; i++) {
            nameCharRnd[i]=(char)ThreadLocalRandom.current().nextInt(1040,1103);
            result += nameCharRnd[i];
        }
        return result;
    }


    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + new DecimalFormat("#.##").format(mark) +
                ", isOlimp=" + isOlimp +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setName() {
        Random random = new Random(100);
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public boolean isOlimp() {
        return isOlimp;
    }

    public void setOlimp(boolean olimp) {
        isOlimp = olimp;
    }
}
