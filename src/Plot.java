public class Plot {

    public String plantName;
    public int numberOfPlants;

    public boolean needsWater;

    public Plot(){
        numberOfPlants=(int)(10+(Math.random()*90));

        int plantID=(int)((Math.random()*5));
        if(plantID==0){
            plantName="tomato";
        }else if(plantID==1){
            plantName="carrot";
        }else if(plantID==2){
            plantName="lettuce";
        }else if(plantID==3){
            plantName="tulip";
        }else{
            plantName="empty";
            numberOfPlants=0;
        }

        int waterID=(int)((Math.random()*2));
        if(waterID==0 && !plantName.equals("empty")){
            needsWater=true;
        }
        if(waterID==1){
            needsWater=false;
        }


    }

    public void printPlotInfo(){
        System.out.println("number of plants: " + numberOfPlants);
        System.out.println("needs water: " + needsWater);
        System.out.println("plant name: " + plantName);
    }

}
