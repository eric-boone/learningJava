public class Reformatory {
    private int weightCalledCounter;

    public int weight(Person person) {
        // return the weight of the person
        this.weightCalledCounter++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return this.weightCalledCounter;
    }

}
