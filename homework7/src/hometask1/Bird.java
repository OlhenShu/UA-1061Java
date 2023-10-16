package hometask1;
abstract class Bird {
    private String name, feathers;
    private int layEggs;

    public Bird(String name,String feathers,int layEggs){
        this.name=name;
        this.feathers=feathers;
        this.layEggs=layEggs;
    }
    public String getName(){
        return name;
    }
    public String getFeathers(){
        return feathers;
    }
    public int getEggs(){
        return layEggs;
    }
    abstract public String fly();
}
