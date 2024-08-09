public class Main {
    public static void main(String[] args) {
            String[] commands = {"Sit", "Run"};
            Shelter shelter = new Shelter("World", "Brighton Beach");
            Dog dog = new Dog("Rex", "Pitbull", commands, Colors.BROWN, shelter);
            System.out.println(dog.getInfo());
            dog.makeVoice();
            dog.makeVoice("Гив Гив");
            dog.makeVoice("Гув Гув");
            Dog dog2 = new Dog("Spike", "Bulldog",
                    Colors.GRAY, shelter);
            System.out.println("---------------");
            System.out.println(dog2.getInfo());
        }
    }