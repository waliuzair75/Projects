public class Pet2 {
    //private data fields
    private String name;
    private int age;
    private String type;
    private String sound;

    //public constructors
    public Pet2() {
        this.setName("Pet Name");
        this.setAge(1);
        this.setType("Animal");
        this.setSound("Noise");
    }

    //public mutators for private data fields
    public void setName(String newName){
        this.name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setType(String newType){
        this.type = newType;
    }
    public void setSound(String newSound){
        this.sound = newSound;
    }

    //public accessors for private data fields
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getType(){
        return this.type;
    }
    public String getSound(){
        return this.sound;
    }
}
