public class LambaMain {
    public static void main(String[] args) {
        SumInter sumInter =  (
            (a,b) -> a+b
            );
            System.out.println(sumInter.add(3, 4));
        
        // Sum sum = ()->{
        //     System.out.println("Hello you are using lambda function");
        // };

        // sum.sayHEllo();

        Sum sum = (s) -> s.length();

        System.out.println(sum.getLength("Adil Khan"));
        
        }   
    
    
        
}
