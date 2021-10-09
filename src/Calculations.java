public class Calculations {
    private String position;
    private int years;

    public Calculations(String position, int years) {
        this.position = position;
        this.years = years;
        calc();
    }

    public void disp(int targets){
        System.out.println("Monthly sales target : "+targets);
    }

    public void calc(){
        if(position.equals("intern")){
            disp(15);
        }
        else if(position.equals("junior")){
            if(years<1){
                disp(15);
            }
            else{
                disp(15+(2*years));
            }
        }
        else if(position.equals("senior")){
            if(years<1){
                disp(20);
            }
            else{
                disp(20+(2*years));
            }
        }
        else{
            System.out.println("Not Valid Position");
        }
    }

}
