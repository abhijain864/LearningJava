package allEnums;


public enum EnglishDaily{

    TOI(10.7){
      public void trialMethod(){
          System.out.println("best paper");
      }
    },
    TheHindu(3.4),
    HindustanTimes(1.7);

    private double circulation;

    public void trialMethod(){
        System.out.println("good paper");
    }

    EnglishDaily(double circulationInMillions){
        this.circulation = circulationInMillions;
    }

    public double getCirculation() {
        return circulation;
    }

    public void setCirculation(double circulation) {
        this.circulation = circulation;
    }
}
