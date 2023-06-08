public final class Fruit extends Tree {
    private String name;
    private boolean edible;
    private String type;

    public Fruit(String name, String climate, PlantTypeEnum plantType,
                 int height, int age, String name1,
                 boolean edible, String type) {
        super(name, climate,plantType, height, age);
        this.name = name1;
        this.edible = edible;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public boolean isEdible() {
        return edible;
    }

    public String getType() {
        return type;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nFruit name: " + name +
                "\nEdible: " + edible +
                "\nFruit type: " + type;
    }
}
