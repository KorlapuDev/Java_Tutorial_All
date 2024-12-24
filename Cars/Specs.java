package Cars;

public class Specs {

    static int wheels = 4;
    static int spareWheels = 1;

    String engineName;
    String modelName;
    String companyName;



    public Specs(String engineName, String companyName, String modelName){
        this.engineName = engineName;
        this.modelName = modelName;
        this.companyName = companyName;
    }

    public void infoAboutClass(){
        System.out.println("Engine Name ---> " + this.engineName + " This object variable / attribute");
        System.out.println("Model Name ---> " + this.modelName + " This object variable / attribute");
        System.out.println("Commpany Name ---> " + this.companyName + " This object variable / attribute");
    }
}
