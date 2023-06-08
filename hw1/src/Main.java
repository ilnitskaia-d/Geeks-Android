public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree("Pine", "either",  PlantTypeEnum.CONIFER, 30, 10);
        Fruit fruit1 = new Fruit("Pine", "either",  PlantTypeEnum.CONIFER, 30, 10, "Pine cone", false, "dry");
        Fruit fruit2 = new Fruit("Apple", "cold", PlantTypeEnum.FLOWERING, 2, 1, "Apple", true, "fleshy");

        System.out.println("ObjectA:");
        System.out.println(tree.getInfo());

        System.out.println("\nObjectB:");
        System.out.println(fruit1.getInfo());

        System.out.println("\nObjectC:");
        System.out.println(fruit2.getInfo());

    }
}