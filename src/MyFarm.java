import java.util.ArrayList;

public class MyFarm {
    ArrayList<Plot> row;
    public static void main(String[] args){
        //System.out.println("this is my farm")

MyFarm LettuceCode= new MyFarm();
    }

public MyFarm() {
    row = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
        row.add(new Plot());
    }
    plantWithMinNumber();


}

    public void totalPlants(){
        int total=0;
        for (int s=0;s<row.size();s++){
            total=total+row.get(s).numberOfPlants;
        }
        System.out.println("total plants in row: " + total);
    }

    public void printPlantNames(){
        for (int i=0;i<row.size();i++){
            System.out.print(i+": "+row.get(i).plantName+ ", ");
        }
    }

    public void printRowInfo(){
        for (int i=0;i<row.size();i++){
            System.out.print(i+": "+row.get(i).plantName+ ", " + row.get(i).needsWater+", "+row.get(i).numberOfPlants+"; ");
        }
    }

    public void addLettuce(){
        printPlantNames();
        row.add(new Plot());
        row.get(10).plantName="lettuce";
        row.get(10).numberOfPlants=42;
        row.get(10).needsWater=true;
    }

    public void addTulip() {
        printPlantNames();
        row.get(3).plantName="tulip";
        row.get(3).numberOfPlants=70;
        row.get(3).needsWater=false;
        printPlantNames();
    }

    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
        printPlantNames();

        for (int i=0;i<row.size();i++){
            if (row.get(i).plantName=="tomato"){
                System.out.print(i+": tomato, ");
            }
        }
    }


    public void totalCarrots() {
        // how many total carrot plants are there?
        printPlantNames();
        int total=0;
        for (int i=0;i<row.size();i++){
            if (row.get(i).plantName=="carrot"){
                total=total+row.get(i).numberOfPlants;
            }
        }
        System.out.print(total);
    }


    public void averageNumberOfPlants() {
        // what is the average number of plants across the whole row?

        printPlantNames();
        int total=0;
        int average=0;
        for (int i=0;i<row.size();i++){
            total=total+row.get(i).numberOfPlants;
        }
        average=total/row.size();
        System.out.print(average);

    }


    public void numberOfCarrotPlots() {
        // how many plots have carrots on them
// call printPlantNames() method to check
        printPlantNames();
        int total=0;
        for (int i=0;i<row.size();i++){
            if (row.get(i).plantName=="carrot"){
                total++;
            }
        }
        System.out.print(total);

    }


    public void numberOfEmptyPlots() {
        // how many plots are empty
// call printPlantNames() method to check

        printPlantNames();
        int total=0;
        for (int i=0;i<row.size();i++){
            if (row.get(i).plantName=="empty"){
                total++;
            }
        }
        System.out.print(total);

    }


    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for every other plot

        for (int i=0;i<row.size();i+=2){
            row.get(i).needsWater=true;
        }
        printRowInfo();
    }

    public void greaterThan10() {
        // how many plots have more than 10 plants in the plot?

        printPlantNames();
        int total=0;
        for (int i=0;i<row.size();i++){
            if (row.get(i).numberOfPlants>10){
                total++;
            }
        }
        System.out.print(total);

    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        printRowInfo();
        int carrot=0;
        int tulip=0;
        int lettuce=0;
        int tomato=0;
        int mostPlants=0;
        for (int i=0;i<row.size();i++) {
            if (row.get(i).plantName == "carrot") {
                carrot += row.get(i).numberOfPlants;
            } else if (row.get(i).plantName == "tulip") {
                tulip += row.get(i).numberOfPlants;
            } else if (row.get(i).plantName == "lettuce") {
                lettuce += row.get(i).numberOfPlants;
            } else if (row.get(i).plantName == "tomato") {
                tomato += row.get(i).numberOfPlants;
            }
        }
            if (carrot>tulip && carrot>lettuce && carrot>tomato){
                System.out.println("carrots");
            }else if (tulip>carrot && tulip>lettuce && tulip>tomato){
                System.out.println("tulips");
            }else if (lettuce>tulip && lettuce>carrot && lettuce>tomato){
                System.out.println("lettuce");
            }else if (tomato>tulip && tomato>lettuce && tomato>carrot){
                System.out.println("tomatoes");
            }
        }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        printRowInfo();
        int carrot=0;
        int tulip=0;
        int lettuce=0;
        int tomato=0;
        int currentMin=1;
        String plantType="empty";
        for (int i=0;i<row.size();i++) {
            if (row.get(i).plantName == "carrot") {
                carrot += row.get(i).numberOfPlants;
            } else if (row.get(i).plantName == "tulip") {
                tulip += row.get(i).numberOfPlants;
            } else if (row.get(i).plantName == "lettuce") {
                lettuce += row.get(i).numberOfPlants;
            } else if (row.get(i).plantName == "tomato") {
                tomato += row.get(i).numberOfPlants;
            }
        }
//        if (carrot<tomato && carrot>0){
//            currentMin=carrot;
//            plantType="carrot";
//        }else if (tomato<carrot && tomato>0){
//            currentMin=tomato;
//            plantType="tomato";
//        }
//        if (tulip<currentMin && tulip>0){
//            currentMin=tulip;
//            plantType="tulip";
//        }
//        if (lettuce<currentMin && lettuce>0){
//            currentMin=lettuce;
//            plantType="lettuce";
//        }
//        System.out.println("the min plant type is + "+currentMin);

        if (carrot<tulip && carrot<lettuce && carrot<tomato){
            System.out.println("carrots");
        }else if (tulip<carrot && tulip<lettuce && tulip<tomato){
            System.out.println("tulips");
        }else if (lettuce<tulip && lettuce<carrot && lettuce<tomato){
            System.out.println("lettuce");
        }else if (tomato<tulip && tomato<lettuce && tomato<carrot){
            System.out.println("tomatoes");
        }
    }



    public void plantWithMaxNumberNeedsWater(){
        // which plant type has the most total plants (not counting empty plots) that needs water?
        printRowInfo();
        int carrot=0;
        int tulip=0;
        int lettuce=0;
        int tomato=0;
        int mostPlants=0;
        for (int i=0;i<row.size();i++) {
            if (row.get(i).plantName == "carrot" && row.get(i).needsWater==true) {
                carrot+=1;
            } else if (row.get(i).plantName == "tulip" && row.get(i).needsWater==true) {
                tulip+=1;
            } else if (row.get(i).plantName == "lettuce" && row.get(i).needsWater==true) {
                lettuce+=1;
            } else if (row.get(i).plantName == "tomato" && row.get(i).needsWater==true) {
                tomato+=1;
            }
        }
        if (carrot>tulip && carrot>lettuce && carrot>tomato){
            System.out.println("carrots");
        }else if (tulip>carrot && tulip>lettuce && tulip>tomato){
            System.out.println("tulips");
        }else if (lettuce>tulip && lettuce>carrot && lettuce>tomato){
            System.out.println("lettuce");
        }else if (tomato>tulip && tomato>lettuce && tomato>carrot){
            System.out.println("tomatoes");
        }
    }
}

