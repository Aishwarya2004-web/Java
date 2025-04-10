public class Conditional{
    public static void main(String arg[]){
        //single statement
          //two values
        int a=74;
        int b=56;
        if(a>b)
        System.out.println("Aishu");
        else
        System.out.println("Akshuu");
        //multiple Statement
        //two values
          int c=74;
        int d=56;
        if(c<d){
        System.out.println("pooju");
        System.out.println("navya");
        System.out.println("manuu");
        }
        else{
        System.out.println("sravss");
        System.out.println("rashitha");
        System.out.println("bajuu");
        }

       //three values
        int e=56;
        int f=85;
        int g=89;
        if(e<f&&f>g)
        System.out.println(e);
        else if(e>f && e<g)
        System.out.println(f);
        else 
         System.out.println(g);
    }
}