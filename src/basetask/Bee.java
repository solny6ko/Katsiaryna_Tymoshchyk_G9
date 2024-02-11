package basetask;

public class Bee {

    private String gender;
    private Long weight;

    public Bee(String gender, Long weight) {
        this.gender = gender;
        this.weight = weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public long getWeight() {
        return weight;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void printBeeDetails() {
        long longResult = 500 / Long.valueOf(weight);
        System.out.println("Я легче лося в " + longResult + " раз");
    }

}

