public class Tree extends Plant {
    private int height;
    private int age;
    private String sanctuaryName;

    private String placeOfOrigin;

    public Tree(String name, String climate, PlantTypeEnum plantType,
                int height, int age,
                String sanctuaryName, String placeOfOrigin) {
        super(name, climate, plantType);
        this.height = height;
        this.age = age;
        this.sanctuaryName = sanctuaryName;
        this.placeOfOrigin = placeOfOrigin;
    }

    public Tree(String name, String climate, PlantTypeEnum plantType,
                int height, int age, String sanctuaryName) {
        super(name, climate, plantType);
        this.height = height;
        this.age = age;
        this.sanctuaryName = sanctuaryName;
    }

    public Tree(String name, String climate, PlantTypeEnum plantType,
                int height, int age) {
        super(name, climate, plantType);
        this.height = height;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getSanctuaryName() {
        return sanctuaryName;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nHeight: " + height +
                "\nAge: " + age +
                (placeOfOrigin == null ? "" : "\nOrigin: " + placeOfOrigin) +
                (sanctuaryName == null ? "" : "\nSanctuary name: " + sanctuaryName );
    }
}
