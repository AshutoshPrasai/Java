
  public class InstrumentToRent extends Instrument
{
    private int ChargePerDay;
    private String DateOfRent;
    private String DateOfReturn;
    private int NoOfDays;    
    private boolean isRented;
    public InstrumentToRent( String INSTRUMENTNAME, int ChargePerDay) // parameterized constructor with two parameters
    {
        super(INSTRUMENTNAME);
        // initialization of variables
        this.ChargePerDay = ChargePerDay;
        this.DateOfRent = "";
        this.DateOfReturn = "";
        this.NoOfDays = 0;    
        this.isRented = false;
    }
    // public getter method for accessing private variables from any class
    public int getChargePerDay()
    {
        return this.ChargePerDay;
    }
    public String getDateOfRent()
    {
        return this.DateOfRent;
    }
    public String getDateOfReturn()
    {
        return this.DateOfReturn;
    }
    public int getNoOfDays()
    {
        return this.NoOfDays;
    }
    public boolean getsRented()
    {
        return this.isRented;
    }
    // set value for private variable from outside the class
    public void setChargePerDay(int ChargePerDay)
    {
        this.ChargePerDay = ChargePerDay;
    }
    public void setDateOfRent(String DateOfRent)
    {
        this.DateOfRent = DateOfRent;
    }
    public void setDateOfReturn(String DateOfReturn)
    {
        this.DateOfReturn = DateOfReturn;
    }
    public void setNoOfDays(int NoOfDays)
    {
        this.NoOfDays = NoOfDays;
    }
    public void setisRented(boolean isRented)
    {
        this.isRented = isRented;
    }
   
    public void Rent_Instrument (String CUSTOMERNAME, String CUSTOMERMOBILENUMBER, int PANNO, String DateOfRent, String DateOfReturn, int NoOfDays)
    {
        if(isRented == true)
        {
            System.out.println("Customer Name: " + getCUSTOMERNAME());
            System.out.println("Customer Mobile Number: "+ getCUSTOMERMOBILENUMBER());
            System.out.println("Customer PAN Number: " + getPANNO());
            System.out.println("The instrument is already rented..");
            
        }
        else
        {
            setCUSTOMERNAME(CUSTOMERNAME);
            setCUSTOMERMOBILENUMBER(CUSTOMERMOBILENUMBER);          
            setPANNO(PANNO);
            setDateOfRent(DateOfRent);
            setDateOfReturn(DateOfReturn);
            setNoOfDays(NoOfDays);
            setisRented(true);
            System.out.println("Customer Name: " + getCUSTOMERNAME());
            System.out.println("Customer Mobile Number: "+ getCUSTOMERMOBILENUMBER());
            System.out.println("Customer PAN number: " + getPANNO());
            System.out.println("Customer Date of Rent: " + getDateOfRent());
            System.out.println("Customer Date of Return: "+ getDateOfReturn());
            System.out.println("Customer Number of Days: " + getNoOfDays());
            
            System.out.println("The total cost: " + getChargePerDay() * getNoOfDays());
        }
    }
    public void toReturn()
    {
        if(isRented == false){
            System.out.println("The particular instrument is not available at the moment");  
        }
        else{
            setCUSTOMERNAME("");
            setCUSTOMERMOBILENUMBER("");
            setPANNO(0);
            setDateOfReturn("");
            setDateOfRent("");
            setNoOfDays(0); 
            setisRented(false);
        }
    }
    // dislay method to display values if registered
    public void display()
    {
        super.display();
        if(isRented == false){            
            System.out.println("The Instrument was rented in:" + getDateOfRent());
            System.out.println("The date to return Instrument is:" + getDateOfReturn());

        }
        else
        {
            System.out.println("Customer Name: " + getCUSTOMERNAME());
            System.out.println("Customer Phone Number: "+ getCUSTOMERMOBILENUMBER());
            System.out.println("Customer PAN number: " + getPANNO());
        }
    }
}

