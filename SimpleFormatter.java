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
      total += item.getPrice()*item.getCounter();
      return (String.format(item.getCounter()+"x %s: $%.2f"
      		+ " ($"+item.getPrice()+" each)\n",item.toString(),item.getPrice()*item.getCounter()));
   }

   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }

   private double total;
}