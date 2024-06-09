package entities;

public class Student {

    public String name;
    public double note;
    private double lack;

    public void calculateGrade(double note){

        this.note += note;
        lack = 60 - this.note;
    }

    public String toString(){

        if (this.note < 60) {

            return
            String.format("\nFINAL GRADE = %.2f\n",this.note)+
            String.format("FAILED\n")+
            String.format("MISSING %.2f POINTS\n",lack);
        }
        else{
            
            return
            String.format("\nFINAL GRADE = %.2f\n",this.note)+
            String.format("PASS\n");
        } 
    }
}
