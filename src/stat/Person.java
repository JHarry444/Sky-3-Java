package stat;

public class Person {

    private String name;
    private int age;
    private String job;

    public final static String latinName = "Homo Sapiens";

    public static void main(String[] args) {
//        System.out.println(name);

        System.out.println(Person.latinName);

        System.out.println(new Person().latinName);
        System.out.println(new Person().latinName);
        System.out.println(new Person().latinName);
        System.out.println(new Person().latinName);
//        latinName = "Homo Superior";

        System.out.println(new Person().latinName);
        System.out.println(new Person().latinName);
        System.out.println(new Person().latinName);
        System.out.println(new Person().latinName);
    }
}
