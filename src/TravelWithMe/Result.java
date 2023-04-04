public class Result {
    double fare;
    double cash;
    double discount;
    double ownmoney;
    Result(double fare,double discount,double cash,double ownmoney){
        
        this.fare = fare;
        this.discount = discount;
        this.cash = cash;
        this.ownmoney=ownmoney;
    }
    public void setFare(double fare){
        this.fare = fare;
    }
    public double getfare(){
        return fare;
    }
    public double getdiscount(){
        return discount;
    } 
    public double discountcal(double discount,double fare){
        return discount = fare/100;
    }  
}
