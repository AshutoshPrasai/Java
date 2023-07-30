
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Sarangi_Sansar implements ActionListener
{
    //declaring all required components
    ArrayList<Instrument> instrument_arraylist = new ArrayList<Instrument>();
    public JFrame frame = new JFrame("Sarangi Sansar");

    public JLabel sarangi_sansar_label, instrument_rent_label, 
        instrument_name1_label, instrument_charge_label, 
        instrument_name2_label, customer_name1_label, customer_phone1_label, 
        customer_pan1_label, number_days_label, rent_date_label, return_date_label,
        instrument_sell_label, instrument_name3_label, instrument_price_label, instrument_name4_label, 
        customer_name2_label, customer_phone2_label, customer_pan2_label, discount_label, sell_date_label;

    public JButton add_rent_button, clear_rent_button, rent_button, return_button, display_rent_button,
        add_sell_button, clear_sell_button, sell_button, display_sell_button;

    public JTextField instrument_name1_input, instrument_charge_input, 
        instrument_name2_input, customer_name1_input, customer_phone1_input, 
        customer_pan1_input, number_days_input, instrument_name3_input, 
        instrument_price_input, instrument_name4_input, 
        customer_name2_input, customer_phone2_input, 
        customer_pan2_input, discount_input;

    public JComboBox <String> day_rent, month_rent, year_rent, 
        day_return, month_return, year_return,
        day_sell, month_sell, year_sell;

        String days_array[] = {"DD","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
        String months_array[] = {"MM","January","February","March","April","May","June","July","August","September","October","November","December"};
        String years_array[] = {"YYYY","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
    
    public Sarangi_Sansar()
    {
        //initial frame configuration
        frame.setVisible(true);
        frame.setSize(1240,720);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(164, 195, 245));


        //initializing all required components
        //labels
        sarangi_sansar_label = new JLabel ("Sarangi Sansar");
        instrument_rent_label = new JLabel ("Instrument Renting");
        instrument_name1_label = new JLabel ("Instrument name");
        instrument_charge_label = new JLabel ("Charge per day");
        instrument_name2_label = new JLabel ("Instrument name");
        customer_name1_label = new JLabel ("Customer name ");
        customer_phone1_label = new JLabel ("Customer phone");
        customer_pan1_label = new JLabel ("Customer PAN");
        number_days_label = new JLabel ("No of rent days");
        rent_date_label = new JLabel ("Rent date");
        return_date_label = new JLabel ("Return date");
        instrument_sell_label = new JLabel ("Instrument Selling");
        instrument_name3_label = new JLabel ("Instrument name");
        instrument_price_label = new JLabel ("Instrument price");
        instrument_name4_label = new JLabel ("Instrument name");
        customer_name2_label = new JLabel ("Customer name ");
        customer_phone2_label = new JLabel ("Customer phone");
        customer_pan2_label = new JLabel ("Customer PAN");
        discount_label= new JLabel ("Discount");
        sell_date_label= new JLabel ("Date of sell");

        //buttons 
        add_rent_button = new JButton ("Add");
        rent_button = new JButton ("Rent");
        clear_rent_button = new JButton ("Reset");
        return_button = new JButton ("Return");
        display_rent_button = new JButton ("Display");
        add_sell_button = new JButton ("Add");
        clear_sell_button = new JButton ("Reset");
        sell_button = new JButton ("Sell");
        display_sell_button = new JButton ("Display");

        //textfields
        instrument_name1_input = new JTextField ();
        instrument_charge_input = new JTextField ();
        instrument_name2_input = new JTextField ();
        customer_name1_input = new JTextField ();
        customer_phone1_input = new JTextField ();
        customer_pan1_input = new JTextField ();
        number_days_input = new JTextField ();
        instrument_name3_input = new JTextField ();
        instrument_price_input = new JTextField ();
        instrument_name4_input = new JTextField ();
        customer_name2_input = new JTextField ();
        customer_phone2_input = new JTextField ();
        customer_pan2_input = new JTextField ();
        discount_input = new JTextField ();

        //combobox
        day_rent = new JComboBox <String> (days_array);
        month_rent = new JComboBox <String> (months_array);
        year_rent = new JComboBox <String> (years_array);
        day_return = new JComboBox <String> (days_array);
        month_return = new JComboBox <String> (months_array);
        year_return = new JComboBox <String> (years_array);    
        day_sell = new JComboBox <String> (days_array);
        month_sell = new JComboBox <String> (months_array);
        year_sell = new JComboBox <String> (years_array);   
        

        //adding all the components in the frame        
        frame.add(sarangi_sansar_label);
        frame.add(instrument_rent_label);
        frame.add(instrument_name1_label);
        frame.add(instrument_charge_label);
        frame.add(instrument_name2_label);
        frame.add(customer_name1_label);    
        frame.add(customer_phone1_label);
        frame.add(customer_pan1_label);
        frame.add(number_days_label);
        frame.add(rent_date_label);
        frame.add(return_date_label);
        frame.add(add_rent_button);
        frame.add(clear_rent_button);
        frame.add(rent_button);
        frame.add(return_button);
        frame.add(display_rent_button);
        frame.add(instrument_name1_input);
        frame.add(instrument_charge_input);
        frame.add(instrument_name2_input);
        frame.add(customer_name1_input);
        frame.add(customer_phone1_input);
        frame.add(customer_pan1_input);
        frame.add(number_days_input);
        frame.add(instrument_sell_label);
        frame.add(instrument_name3_label);
        frame.add(instrument_price_label);
        frame.add(add_sell_button);
        frame.add(instrument_name4_label);
        frame.add(customer_name2_label);
        frame.add(customer_phone2_label);
        frame.add(customer_pan2_label);
        frame.add(discount_label);
        frame.add(sell_date_label);
        frame.add(clear_sell_button);
        frame.add(sell_button);
        frame.add(display_sell_button);
        frame.add(instrument_name3_input);
        frame.add(instrument_price_input);
        frame.add(instrument_name4_input);
        frame.add(customer_name2_input);
        frame.add(customer_pan2_input);
        frame.add(customer_phone2_input);
        frame.add(discount_input);
        frame.add(day_rent);
        frame.add(month_rent);
        frame.add(year_rent);
        frame.add(day_return);
        frame.add(month_return);
        frame.add(year_return);
        frame.add(day_sell);
        frame.add(month_sell);
        frame.add(year_sell);


        //setting bounds for components
        sarangi_sansar_label.setBounds(582,19,175,35);
        instrument_rent_label.setBounds(263,71,164,22);
        instrument_name1_label.setBounds(46,136,106,22);
        instrument_charge_label.setBounds(358,137,120,22);
        instrument_name2_label.setBounds(46,304,106,22);
        customer_name1_label.setBounds(358,302,101,22);
        customer_phone1_label.setBounds(46,343,115,22);
        customer_pan1_label.setBounds(358,343,95,22);
        number_days_label.setBounds(46,385,100,22);
        rent_date_label.setBounds(46,427,64,22);
        return_date_label.setBounds(46,469,73,22);
        add_rent_button.setBounds(517,187,92,33);
        clear_rent_button.setBounds(475,537,91,33);
        rent_button.setBounds(195,537,91,33);
        return_button.setBounds(335,537,91,33);
        display_rent_button.setBounds(55,537,91,33);
        instrument_name1_input.setBounds(181,133,138,33);
        instrument_charge_input.setBounds(480,133,138,33);
        instrument_name2_input.setBounds(181,298,138,33);
        customer_name1_input.setBounds(480,298,138,33);
        customer_phone1_input.setBounds(181,339,138,33);
        customer_pan1_input.setBounds(480,339,138,33);
        number_days_input.setBounds(181,381,138,33);
        instrument_sell_label.setBounds(870,70,156,22);
        instrument_name3_label.setBounds(767,135,106,22);
        instrument_price_label.setBounds(767,180,101,22);
        add_sell_button.setBounds(976,230,92,33);
        instrument_name4_label.setBounds(767,286,106,22);
        customer_name2_label.setBounds(767,342,106,22);
        customer_phone2_label.setBounds(767,399,106,22);
        customer_pan2_label.setBounds(767,454,106,22);
        discount_label.setBounds(767,511,106,22);
        sell_date_label.setBounds(767,567,106,22);
        clear_sell_button.setBounds(987,623,91,33);
        instrument_name3_input.setBounds(897,135,180,33);
        instrument_price_input.setBounds(897,180,180,33);
        instrument_name4_input.setBounds(897,282,180,33);
        customer_name2_input.setBounds(897,338,180,33);
        customer_phone2_input.setBounds(897,394,180,33);
        customer_pan2_input.setBounds(897,450,180,33);
        discount_input.setBounds(897,506,180,33);
        sell_button.setBounds(871,623,91,33);
        display_sell_button.setBounds(767,623,91,33);

        day_rent.setBounds(181,423,72,33);
        month_rent.setBounds(260,423,72,33);
        year_rent.setBounds(340,423,72,33);
        day_return.setBounds(181,465,72,33);
        month_return.setBounds(260,465,72,33);
        year_return.setBounds(340,465,72,33);
        day_sell.setBounds(897, 562, 72, 33);
        month_sell.setBounds(967, 562, 72, 33);
        year_sell.setBounds(1047, 562, 72, 33);
        
        

        //additional settings for font and colors
        sarangi_sansar_label.setFont(new Font("Arial", Font.BOLD, 22));
        instrument_rent_label.setFont(new Font("Arial", Font.PLAIN, 18));
        instrument_sell_label.setFont(new Font("Arial", Font.PLAIN, 18));
        
        clear_sell_button.setBackground(new Color(100,100,100));

        //adding action listener to buttons
        add_rent_button.addActionListener(this);
        clear_rent_button.addActionListener(this);
        rent_button.addActionListener(this);
        return_button.addActionListener(this);
        display_rent_button.addActionListener(this);
        add_sell_button.addActionListener(this);
        clear_sell_button.addActionListener(this);
        sell_button.addActionListener(this);
        display_sell_button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == add_rent_button){
            boolean inst_duplicate = false;
            if(instrument_name1_input.getText().isEmpty() || instrument_charge_input.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Empty input fields.");  
            }
            else{
                if(instrument_arraylist.size() != 0){
                    for (Instrument i: instrument_arraylist){
                        if(i instanceof InstrumentToRent && i.getINSTRUMENTNAME().equals(instrument_name1_input.getText())){
                            inst_duplicate = true;
                        }
                    }
                }
    
                if(inst_duplicate){
                    JOptionPane.showMessageDialog(frame, "Item already present.");
                }else{
                    try{
                        instrument_arraylist.add(new InstrumentToRent(instrument_name1_input.getText(), Integer.parseInt(instrument_charge_input.getText())));
                        JOptionPane.showMessageDialog(frame, "Instrument added for rent.");  
                    }catch(NumberFormatException exception){
                        JOptionPane.showMessageDialog(frame, "Invalid input.");
                    }
                }    
            }
        }
        
        if (e.getSource() == clear_rent_button){
            instrument_name1_input.setText("");
            instrument_charge_input.setText("");
            instrument_name2_input.setText("");
            customer_name1_input.setText("");
            customer_phone1_input.setText("");
            customer_pan1_input.setText("");
            number_days_input.setText("");

            day_rent.setSelectedItem(days_array[0]);
            month_rent.setSelectedItem(months_array[0]);
            year_rent.setSelectedItem(years_array[0]);
            day_return.setSelectedItem(days_array[0]);
            month_return.setSelectedItem(months_array[0]);
            year_return.setSelectedItem(years_array[0]);

            JOptionPane.showMessageDialog(frame, "Fields cleared.");
    
        }

        if (e.getSource() == rent_button){
            boolean inst_present = false;
            
            if(instrument_name2_input.getText().isEmpty() || customer_name1_input.getText().isEmpty() || 
                customer_phone1_input.getText().isEmpty() || customer_pan1_input.getText().isEmpty() || 
                number_days_input.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(frame, "Empty input fields.");  
            }
            else{
                for (Instrument inst: instrument_arraylist) {
                    if (inst.getINSTRUMENTNAME().equals(instrument_name2_input.getText()) && inst instanceof InstrumentToRent){
                        InstrumentToRent rent_inst = (InstrumentToRent) inst; 
                        inst_present = true;
                        if (rent_inst.getsRented()){
                            JOptionPane.showMessageDialog(frame, "Instrument already rented.");
                        }else{
                            String rent_date = year_rent.getSelectedItem() + "/" + month_rent.getSelectedItem() + "/" + day_rent.getSelectedItem();
                            String return_date = year_return.getSelectedItem() + "/" + month_return.getSelectedItem() + " " + day_return.getSelectedItem();
                            try{
                                rent_inst.Rent_Instrument(customer_name1_input.getText(),customer_phone1_input.getText(),
                                Integer.parseInt(customer_pan1_input.getText()), rent_date,return_date,Integer.parseInt(number_days_input.getText()));
                                JOptionPane.showMessageDialog(frame, "Rent completed.");
                            }
                            catch(NumberFormatException exception){
                                JOptionPane.showMessageDialog(frame, "Invalid input.");
                            }                      
                        }
                    }
                }
                
                if (!inst_present){
                    JOptionPane.showMessageDialog(frame, "The instrument was not found." );
                }
            }
    
        }

        if (e.getSource() == return_button){
            boolean inst_present = false;
            if(instrument_name2_input.getText().isEmpty()){   
                JOptionPane.showMessageDialog(frame, "Empty input fields.");  
            }
            else{
                for (Instrument inst: instrument_arraylist) {
                    if (inst.getINSTRUMENTNAME().equals(instrument_name2_input.getText()) && inst instanceof InstrumentToRent){
                        InstrumentToRent rent_inst = (InstrumentToRent) inst; 
                        inst_present = true;
                        if (rent_inst.getsRented() == false){
                            JOptionPane.showMessageDialog(frame, "Instrument not rented. Cannot return.");
                        }else{
                            rent_inst.toReturn();
                            JOptionPane.showMessageDialog(frame, "Return completed.");                
                        }
                    }
                }
            }
    
        }
        if (e.getSource() == display_rent_button){
            int inst_count = 0;
            for(Instrument i: instrument_arraylist){
                if(i instanceof InstrumentToRent){
                    inst_count = inst_count + 1;
                    i.display();
                }
            }
                
            if (inst_count == 0){
                        JOptionPane.showMessageDialog(frame, "No items to display.");
            } else {
                        JOptionPane.showMessageDialog(frame, "Display successful.");
            }
        }
        if (e.getSource() == add_sell_button){
            boolean inst_duplicate = false;
            if(instrument_name3_input.getText().isEmpty() || instrument_price_input.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Empty input fields.");  
            }
            else{
                if(instrument_arraylist.size() != 0){
                    for (Instrument i: instrument_arraylist){
                        if(i instanceof InstrumentToSell && i.getINSTRUMENTNAME().equals(instrument_name3_input.getText())){
                            inst_duplicate = true;
                        }
                    }
                }
    
                if(inst_duplicate==true){
                    JOptionPane.showMessageDialog(frame, "Item already present.");
                }else{
                    try{
                        instrument_arraylist.add(new InstrumentToSell(instrument_name3_input.getText(), Integer.parseInt(instrument_price_input.getText())));
                        JOptionPane.showMessageDialog(frame, "Instrument added for sell.");  
                    }catch(NumberFormatException exception){
                        JOptionPane.showMessageDialog(frame, "Invalid input.");
                    }
                }    
            }
    
        }
        if (e.getSource() == clear_sell_button){
            instrument_name3_input.setText("");
            instrument_price_input.setText("");
            instrument_name4_input.setText("");
            customer_name2_input.setText("");
            customer_phone2_input.setText("");
            customer_pan2_input.setText("");
            discount_input.setText("");

            day_sell.setSelectedItem(days_array[0]);
            month_sell.setSelectedItem(months_array[0]);
            year_sell.setSelectedItem(years_array[0]);

            JOptionPane.showMessageDialog(frame, "Fields cleared.");
    
        }
        if (e.getSource() == sell_button){
            boolean inst_present = false;
            
            if(instrument_name4_input.getText().isEmpty() || customer_name2_input.getText().isEmpty() || 
                customer_phone2_input.getText().isEmpty() || customer_pan2_input.getText().isEmpty() || 
                discount_input.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(frame, "Empty input fields.");  
            }
            else{
                for (Instrument inst: instrument_arraylist) {
                    if (inst.getINSTRUMENTNAME().equals(instrument_name4_input.getText()) && inst instanceof InstrumentToSell){
                        InstrumentToSell sell_inst = (InstrumentToSell) inst;
                        inst_present = true;
                        
                        if (sell_inst.getis_Sold()){
                            JOptionPane.showMessageDialog(frame, "Instrument already rented.");
                        }else{
                            String sell_date = "";
                            try{
                                sell_inst.toSell(customer_name2_input.getText(), customer_phone2_input.getText(),
                                    Integer.parseInt(customer_pan2_input.getText()), sell_date, Integer.parseInt(discount_input.getText()));
                                JOptionPane.showMessageDialog(frame, "Sell successful.");
                            }
                            catch(NumberFormatException exception){
                                JOptionPane.showMessageDialog(frame, "Invalid input.");
                            }                      
                        }
                    }
                }
                
                if (!inst_present){
                    JOptionPane.showMessageDialog(frame, "The instrument was not found." );
                }
            }
    
        }
        if (e.getSource() == display_sell_button){
            int inst_count = 0;
                for(Instrument i: instrument_arraylist){
                    if(i instanceof InstrumentToSell){
                        inst_count = inst_count + 1;
                        i.display();
                    }
                }
                
                if (inst_count == 0){
                        JOptionPane.showMessageDialog(frame, "No items to display.");
                } else {
                        JOptionPane.showMessageDialog(frame, "Display successful.");
                }
            
    
        }
    }
    
    public static void main(String[] args)
    {
        new Sarangi_Sansar();
    }
}
