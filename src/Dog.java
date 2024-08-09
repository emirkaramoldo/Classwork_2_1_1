import java.util.Arrays;

public class Dog extends Pet {

    private String name;
    private String breed;
    private String[] commands;

    public Dog(String name, String breed, String[] commands,
               Colors colors, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColors(colors);
    }

    public Dog(String name, String breed,
               Colors colors, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        super.setShelter(shelter);
        super.setColors(colors);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(){
        System.out.println("Гав гав гав");
    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands " + Arrays.toString(commands);
    }
}
