package task1;

public class Tehnialogy {
    private String name;
    private String brand;
    private String version;


    public Tehnialogy(String name, String brand, String version){
        this.name = name;
        this.brand = brand;
        this.version = version;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String turOn(){
        return this.name + "Kuidu ";
    }
    public String turnOf (){
       return this.name + "Ochtu ";
    }
    @Override
    public String toString() {
        return "task1.Tehnialogy{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public static class askhdf {
        public static void main(String[] args) {
                for (int i = 1; i < 10; i++) {
                for (int j = 1; j < 10; j++) {
                    System.out.printf("%4d", (i*j));
                }
                    System.out.println();
            }
        }
    }
}
