public class Plant {
    private String name;
    private String climate;

    private PlantTypeEnum plantType;

    public Plant(String name, String climate, PlantTypeEnum plantType) {
        this.name = name;
        this.climate = climate;
        this.plantType = plantType;
    }

    public String getName() {
        return name;
    }

    public String getClimate() {
        return climate;
    }

    public PlantTypeEnum getPlantType() {
        return plantType;
    }

    public String getInfo() {
        return "Name: " + name +
                "\nClimate: " + climate +
                "\nPlant type: " + plantType;
    }
}
