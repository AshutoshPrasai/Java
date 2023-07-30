public class Instrument // class named course created
{
    //declaration of private variables for encapsulation
    private static int INSTRUMENTID;
    private String INSTRUMENTNAME;    
    private String CUSTOMERNAME;
    private String CUSTOMERMOBILENUMBER;
    private int PANNO;
    public Instrument(String INSTRUMENTNAME) // constructor having one parameters
    {
        // initial values are set
        INSTRUMENTID++;
        this.INSTRUMENTNAME = INSTRUMENTNAME;
        this.CUSTOMERNAME = "";
        this.CUSTOMERMOBILENUMBER = "";
        this.PANNO = 0;
    }  
    // public getter method for accessing private variables in subclass
    public int getINSTRUMENTID()
    {
        return INSTRUMENTID;
    }
    public String getINSTRUMENTNAME()
    {
        return this.INSTRUMENTNAME;
    }
    public String getCUSTOMERNAME()
    {
        return this.CUSTOMERNAME;
    }
    public String getCUSTOMERMOBILENUMBER()
    {
        return this.CUSTOMERMOBILENUMBER;
    }
    public int getPANNO()
    {
        return this.PANNO;
    }
    // set value for private variable from outside the class
    public void setINSTRUMENTID(int INSTRUMENTID)
    {        
        this.INSTRUMENTID = INSTRUMENTID;
    }
    public void setINSTRUMENTNAME(String INSTRUMENTNAME)
    {        
        this.INSTRUMENTNAME = INSTRUMENTNAME;
    }
    public void setCUSTOMERNAME(String CUSTOMERNAME)
    {        
        this.CUSTOMERNAME = CUSTOMERNAME;
    }    
    // set value for private variable from outside the class
    public void setCUSTOMERMOBILENUMBER(String CUSTOMERMOBILENUMBER)
    {        
        this.CUSTOMERMOBILENUMBER = CUSTOMERMOBILENUMBER;
    }
    public void setPANNO(int PANNO)
    {
        this.PANNO = PANNO;
    }
    // method to display values
    public void display()
    {
        System.out.println("The INSTRUMENTID is:- " + getINSTRUMENTID());
        System.out.println("The Instrument is:- " + getINSTRUMENTNAME());
        
        if(this.CUSTOMERNAME != "" && this.CUSTOMERMOBILENUMBER !="" && this.PANNO != 0){
            System.out.println("The Customer name is :- " + CUSTOMERNAME);
            System.out.println("The Customer Mobile number is:-" + CUSTOMERMOBILENUMBER);          
            System.out.println("The Customer pan no is:- " + PANNO);
        }
    }
}




