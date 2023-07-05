public class ComplexNumber {
    private int realpart;
    private int imgpart;
    public ComplexNumber()
    {
        realpart = 0;
        imgpart = 0;
    }
     public ComplexNumber(int realpart, int imgpart)
     {
         this.imgpart = imgpart;
         this.realpart = realpart;
     }
     private void print()
     {
         System.out.println("( " +realpart+" + "+imgpart+" )");
     }
}
