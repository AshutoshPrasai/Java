
public class InstrumentToSell extends Instrument
{
    private float price;
    private String sellDate;
    private float discountPercent;
    private boolean is_Sold;
    public InstrumentToSell(String INSTRUMENTNAME, float price) // parameterized constructor with two parameters
    {
         super(INSTRUMENTNAME);
         // initilazation
         this.price=price;
         this.sellDate="";
         this.discountPercent = 0;
         this.is_Sold =false;      
    }
     // public getter method for accessing private variables from any class
    public float getprice()
    {
        return this.price;
    }
    public String getsellDate()
    {
        return this.sellDate;
    }
    public float getdiscountPercent()
    {
        return this.discountPercent;
    }
    public boolean getis_Sold()
    {
        return this.is_Sold;
    }
    // setter method to set value for instructor name if the course has been registered
    public void setprice(float price)
    {        
        if(!is_Sold==false){
            this.price = price;
        }
       
        else{
            System.out.println("The Instrument has already been sold. Price cannot be changed");
        }        
    }
    public void setsellDate(String sellDate)
    {        
        this.sellDate = sellDate;
    }
    public void setdiscountPercent(float discountPercent)
    {        
        this.discountPercent = discountPercent;
    }
    public void setis_Sold(boolean is_Sold)
    {        
        this.is_Sold = is_Sold;
    }    
    //set initial value of variable in superclass
    public void toSell(String CUSTOMERNAME, String CUSTOMERMOBILENUMBER, int PANNO, String sellDate, int discountPercent)
    {
        if(is_Sold==true){
            System.out.println("instrument has been sold out");
            System.out.println("Customer Name: " + getCUSTOMERNAME());
            System.out.println("Customer Mobile Number: "+ getCUSTOMERMOBILENUMBER());
            System.out.println("Customer PAN Number: " + getPANNO());
        }
        else{
            setCUSTOMERNAME(CUSTOMERNAME);
            setCUSTOMERMOBILENUMBER(CUSTOMERMOBILENUMBER);
            setPANNO(PANNO);
            this.sellDate=sellDate;
            this.discountPercent=discountPercent;
            setis_Sold(true);
            
            super.setCUSTOMERNAME(CUSTOMERNAME);
            super.setCUSTOMERMOBILENUMBER(CUSTOMERMOBILENUMBER);
            super.setPANNO(PANNO);
            
            float final_price= this.price-(getdiscountPercent() / 100 * this.price);
            System.out.println("The selling price of the Instrument is: "+ final_price);
        }
    }
    //display value if registered
    public void display()
    {
        super.display();
        System.out.println("instrument price is " + getprice());
        if(is_Sold==true){
            System.out.println("Customer Name: " + getCUSTOMERNAME());
            System.out.println("Customer Mobile Number: "+ getCUSTOMERMOBILENUMBER());
            System.out.println("Customer PAN Number: " + getPANNO());
            System.out.println("The Instrument was sold in: "+getsellDate());
        }  
    }
}
