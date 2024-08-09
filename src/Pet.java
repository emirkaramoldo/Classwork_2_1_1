import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    public Colors colors;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random random = new Random();
        return random.nextInt(15) + 1;
    }

    public String getInfo(){
        return "Age: " + age +
                "\nColor: " + colors +
                "\nShelter address: " + shelter.getAddress() +
                "\nShelter name "+ shelter.getName();
    }
}
