package lab;

/**
A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
public String formatHeader()
{
	
   total = 0;
   return "     I N V O I C E\n\n\n";
}

public String formatLineItem(LineItem item)
{

   total += item.getPrice()* item.getCount();
   return (String.format(
         "%d %s %s: ($%.2f %s)\n",item.getCount(),"x",item.toString(),item.getPrice(),"each"));
}

public String formatFooter()
{
   return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
}

private double total;

}