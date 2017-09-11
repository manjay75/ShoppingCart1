package main.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import main.ItemPosition;


public class ShoppingScreen  extends JFrame implements ActionListener{
	
	
	private static final String items = "Items";
	private static final String noOfItems = "No. Of Items";
	private static final String price = "Price";
	private static final String totalAmount = "Total Cost :- £ ";
	//item declaration - We can store these items in flat files or Database to make it more generic
	private static final String item1 = "Bananas";
	private static final String item2 = "Oranges";
	private static final String item3 = "Apple";
	private static final String item4 = "Lemons";
	private static final String item5 = "Peaches";
	

	private static final int col = 2;
	
	private static ShoppingScreen ss = null;
	
	JTextField itemPrice1 =null;
	JTextField itemPrice2 =null;
	JTextField itemPrice3 =null;
	JTextField itemPrice4 =null;
	JTextField itemPrice5 =null;
	
	JLabel totalPriceLabel = null;
	JTextField totalPrice = null;
	
	JTextField nois1 = null;
	JTextField nois2 = null;
	JTextField nois3 = null;
	JTextField nois4 = null;
	JTextField nois5 = null;
	
	JPanel shoppingPane= null;
	//items cost declaration - We can store these items in flat files or Database to make it more generic
	private static final double price1 = 0.18;
	private static final double price2 = 0.20;
	private static final double price3 = 0.50;
	private static final double price4 = 0.30;
	private static final double price5 = 0.25;
	/**
	 * @param args
	 */
	//Creating Shopping screen
	public  ShoppingScreen(){

		shoppingPane = new JPanel();
        getContentPane().add(shoppingPane);
        
        
		
		JLabel item = new JLabel(items);
		JLabel nois = new JLabel(noOfItems);
		JLabel itemsPrice = new JLabel(price);
		
		JLabel itemNo1 = new JLabel(item1);
		JLabel itemNo2 = new JLabel(item2);
		JLabel itemNo3 = new JLabel(item3);
		JLabel itemNo4 = new JLabel(item4);
		JLabel itemNo5 = new JLabel(item5);
		
		JLabel priceLabel1 = new JLabel("@ " + price1);
		JLabel priceLabel2 = new JLabel("@ " + price2);
		JLabel priceLabel3 = new JLabel("@ " + price3);
		JLabel priceLabel4 = new JLabel("@ " + price4);
		JLabel priceLabel5 = new JLabel("@ " + price5);
		
		
		
		nois1 = new JTextField(col);
		nois2 = new JTextField(col);
		nois3 = new JTextField(col);
		nois4 = new JTextField(col);
		nois5 = new JTextField(col);
		
		
		itemPrice1 = new JTextField(col);
		itemPrice2 = new JTextField(col);
		itemPrice3 = new JTextField(col);
		itemPrice4 = new JTextField(col);
		itemPrice5 = new JTextField(col);
	
		
		totalPrice = new JTextField();
		
		
		JButton cOut = new JButton("CheckOut");
		
		
		
		itemPrice1.setEditable(false);
		itemPrice2.setEditable(false);
		itemPrice3.setEditable(false);
		itemPrice4.setEditable(false);
		itemPrice5.setEditable(false);
		
		totalPrice.setEditable(false);
		
		
		shoppingPane.setLayout(null);
		
		item.setBounds(85,80,70,ItemPosition.textHeight);
		nois.setBounds(150,80,70,ItemPosition.textHeight);
		itemsPrice.setBounds(250,80,70,ItemPosition.textHeight);
		
		itemNo1.setBounds(85,100,70,ItemPosition.textHeight);
		itemNo2.setBounds(85,120,70,ItemPosition.textHeight);
		itemNo3.setBounds(85,140,70,ItemPosition.textHeight);
		itemNo4.setBounds(85,160,70,ItemPosition.textHeight);
		itemNo5.setBounds(85,180,70,ItemPosition.textHeight);
		
		
		nois1.setBounds(155,100,50,ItemPosition.textHeight);
		nois2.setBounds(155,122,50,ItemPosition.textHeight);
		nois3.setBounds(155,142,50,ItemPosition.textHeight);
		nois4.setBounds(155,162,50,ItemPosition.textHeight);
		nois5.setBounds(155,182,50,ItemPosition.textHeight);
		
		
		itemPrice1.setBounds(250,100,50,ItemPosition.textHeight);
		itemPrice2.setBounds(250,122,50,ItemPosition.textHeight);
		itemPrice3.setBounds(250,142,50,ItemPosition.textHeight);
		itemPrice4.setBounds(250,162,50,ItemPosition.textHeight);
		itemPrice5.setBounds(250,182,50,ItemPosition.textHeight);
		
		
		priceLabel1.setBounds(300,100,80,ItemPosition.textHeight);
		priceLabel2.setBounds(300,122,80,ItemPosition.textHeight);
		priceLabel3.setBounds(300,142,80,ItemPosition.textHeight);
		priceLabel4.setBounds(300,162,80,ItemPosition.textHeight);
		priceLabel5.setBounds(300,182,80,ItemPosition.textHeight);
		
		
		totalPrice.setBounds(200,210,150,ItemPosition.textHeight);
		
		cOut.setBounds(155,250,100,ItemPosition.textHeight);
		cOut.setActionCommand("calc");

		cOut.addActionListener(this);
		
        
        shoppingPane.add(item);
        shoppingPane.add(nois);
        shoppingPane.add(itemsPrice);
        
		shoppingPane.add(itemNo1);
		shoppingPane.add(itemNo2);
		shoppingPane.add(itemNo3);
		shoppingPane.add(itemNo4);
		shoppingPane.add(itemNo5);
		
		shoppingPane.add(nois1);
		shoppingPane.add(nois2);
		shoppingPane.add(nois3);
		shoppingPane.add(nois4);
		shoppingPane.add(nois5);
		
		shoppingPane.add(itemPrice1);
		shoppingPane.add(itemPrice2);
		shoppingPane.add(itemPrice3);
		shoppingPane.add(itemPrice4);
		shoppingPane.add(itemPrice5);
		
		
		shoppingPane.add(priceLabel1);
		shoppingPane.add(priceLabel2);
		shoppingPane.add(priceLabel3);
		shoppingPane.add(priceLabel4);
		shoppingPane.add(priceLabel5);
		
		shoppingPane.add(totalPrice);
		
		shoppingPane.add(cOut);

	}
	public static void main(String[] args) {
		
		ss = new ShoppingScreen();
		ss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ss.setVisible(true);
        ss.setSize(500,400);
   	}

	public void actionPerformed(ActionEvent event) {
		
		if(event.getActionCommand().equalsIgnoreCase("Calc"))
		{
			
			//calculating cost for each item		
			
		
			try{
					double priceItem1 =  new Double((nois1.getText().isEmpty() || new Double(nois1.getText()).isNaN())? "0.0" :nois1.getText())*price1;
					double priceItem2 =  new Double((nois2.getText().isEmpty() || new Double(nois2.getText()).isNaN())? "0.0" :nois2.getText())*price2;
					double priceItem3 =  new Double((nois2.getText().isEmpty() || new Double(nois3.getText()).isNaN())? "0.0" :nois2.getText())*price3;
					double priceItem4 =  new Double((nois2.getText().isEmpty() || new Double(nois4.getText()).isNaN())? "0.0" :nois2.getText())*price4;
					double priceItem5 =  new Double((nois2.getText().isEmpty() || new Double(nois5.getText()).isNaN())? "0.0" :nois2.getText())*price5;
			
			
					itemPrice1.setText(Double.toString(priceItem1));
					itemPrice2.setText(Double.toString(priceItem2));
					itemPrice3.setText(Double.toString(priceItem3));						
					itemPrice4.setText(Double.toString(priceItem4));
					itemPrice5.setText(Double.toString(priceItem5));
					
					totalPrice.setText(totalAmount + Double.toString(priceItem1+priceItem2+priceItem3+priceItem4+priceItem5));		
				
			
			
			
			}
			
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null,nfe.getMessage() + "***Item should be number only***");
			}
			
			
			
			
			
			
		
		}
		
		
		
			
	}
 
}
