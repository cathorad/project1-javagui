//-------------------+
//-Anthony Webb      |
//-Project 1	     |
//-CNT 4714	         |
//-Language: Java 	 |
//-Due: Sep 17th	 |
//-------------------+

// details for item - make it so user cant type
// + subtotal

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
	
	JButton exitApp, findItem, addtoCart,emptyCart, viewCart, checkout;
	JTextField idEntry, quantEntry, details, subtotal;
	
	GUI(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(0,2));
		this.setTitle("Bailey Webb Store");
		
		idEntry = new JTextField();
		idEntry.setPreferredSize(new Dimension(40,40));
		JLabel idLabel = new JLabel("Enter the ID for Item #1");
		
		quantEntry = new JTextField();
		idEntry.setPreferredSize(new Dimension(40,40));
		JLabel quantLabel = new JLabel("Enter the Quantity for Item #1 ");
		
		details = new JTextField();
		idEntry.setPreferredSize(new Dimension(40,40));
		JLabel detailsLabel = new JLabel("Details for Item #1");
		
		subtotal = new JTextField();
		idEntry.setPreferredSize(new Dimension(40,40));
		JLabel subtotalLabel = new JLabel("Subtotal for 0 item(s)");

		
		//Sets fonts to make GUI look pretty.
		idEntry.setFont(new Font("Consolas",Font.PLAIN,27));
		idLabel.setFont(new Font("Consolas",Font.BOLD,16));
		quantEntry.setFont(new Font("Consolas",Font.PLAIN,27));
		quantLabel.setFont(new Font("Consolas",Font.BOLD,16));
		details.setFont(new Font("Consolas",Font.PLAIN,27));
		detailsLabel.setFont(new Font("Consolas",Font.BOLD,16));
		subtotal.setFont(new Font("Consolas",Font.PLAIN,27));
		subtotalLabel.setFont(new Font("Consolas",Font.BOLD,16));
		
		
		//Assigns action listeners to buttons so they actually do something.
		//Button 1
		findItem = new JButton("Find Item");
		findItem.addActionListener(this);
		
		//Button 2
		addtoCart = new JButton("Add to Cart");
		addtoCart.addActionListener(this);
		
		//Button 3
		viewCart = new JButton("View Cart");
		viewCart.addActionListener(this);
		
		//Button 4
		checkout = new JButton("Checkout");
		checkout.addActionListener(this);
		
		//Button 5
		emptyCart = new JButton("Empty Cart - Start a New Order");
		emptyCart.addActionListener(this);
		
		//Button 6
		exitApp = new JButton("Exit (Close App)");
		exitApp.addActionListener(this);
		
		
		//Calling of GUI Elements.
		this.add(idLabel);
		this.add(idEntry);
		this.add(quantLabel);
		this.add(quantEntry);
		this.add(detailsLabel);
		this.add(details);
		this.add(subtotalLabel);
		this.add(subtotal);
		this.add(findItem);
		this.add(addtoCart);
		this.add(viewCart);
		this.add(checkout);
		this.add(emptyCart);
		this.add(exitApp);
		
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addtoCart) {
			//search the csv file for the ID
			//check if in stock
			//if yes, add to cart (transaction.csv)
			//else, say "out of stock"
			System.out.println("Item(s) Successfully Added to Cart!"+ idEntry.getText());
		}
		
		if(e.getSource()==exitApp) {
			System.exit(0);
		}
	}
}
