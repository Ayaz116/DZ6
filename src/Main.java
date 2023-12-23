
public class Main {
    public static void main(String[] args) {
        Smeshariki Pers1 = new Smeshariki();
        Pers1.setName("Крош");
        Pers1.setAge(12);
        Pers1.setAnimal("Заяц");
        Pers1.setPersonality("Веселый");
        System.out.println(Pers1.getName()+" - "+Pers1.getAnimal()+" "+Pers1.getAge()+" лет. Характер: "+Pers1.getPersonality());
    }
}