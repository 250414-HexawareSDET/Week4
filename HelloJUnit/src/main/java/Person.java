public class Person {

    //Probably not gonna worry about any fields or boilerplate code for now

    public String walk(){
        return "Person is walking";
    }

    public String eat(String food){

        if(food.equals("peanut butter")){
            throw new IllegalArgumentException("I'm allergic to PB and you've killed me :(");
        }

        return "Person is eating: " + food;

    }

}
