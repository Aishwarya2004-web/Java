class DoWhileLoop{
    public static void main(String arg[]){
        int i=1;
        do{
            System.out.println("ishu"+i);
            int j=1;
            do{
                System.out.println("akshu"+j);
                j++;
            }while(j<=2);
            i++;
        
        }while(i<=4);
    }
}