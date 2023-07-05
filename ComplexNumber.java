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
     public void print()
     {
         System.out.println("( " +realpart+" + "+imgpart+" i)");
     }
     public ComplexNumber add(ComplexNumber c)
     {
         int r = this.realpart + c.realpart;
         int i = this.imgpart + c.imgpart;
         return new ComplexNumber(r,i);
     }
    public ComplexNumber subtract(ComplexNumber c)
    {
        int r = this.realpart - c.realpart;
        int i = this.imgpart - c.imgpart;
        return new ComplexNumber(r,i);
    }

}
