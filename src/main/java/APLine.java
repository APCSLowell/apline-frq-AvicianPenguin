public class APLine
{
  private int a; 
  private int b; 
  private int c;
  private double slope;
  public APLine(int a, int b, int c)
  {
    this.a = a;
    this.b = b;
    this.c = c;
    slope = (double)(-b/a);
  }
  public double getSlope()
  {
    return slope;
  }
  public boolean isOnLine(int x, int y)
  {
    return(a*x + b*y + c == 0);
  }
}
