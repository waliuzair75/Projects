public class Pet {
    private String name;
    public Pet() {
        setName("Pet Name");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Pet information:\nName: " + name + "\n";
    }
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1);
        Pet pet2 = new Pet();
        pet2.setName("Buster");
        System.out.println(pet2);
    }
}