package day_7_lei;

class  Ifs  {
    public  static void main (String  []  args)  {
      boolean state=false;
      int i=2;
      if( (++i>2) && (state=true))         
i++;
      if( (++i>4) || (state=false))
        i++;
       System.out .println (i);
      }
}