package CodingPractice.morgan;
enum Animal
{
    LION,DOG,COW;
}
public class EnumDemo {
    public static void main(String[] args) {
        Animal[] animals=Animal.values();
        System.out.println(animals[0]);

    }


}
