class Demo {
    public static void main(String[] args) {
        
        try {
            System.out.println("Number "+args[0]);
            if(Integer.parseInt(args[0]) > 100) {
                throw new MyException();
            }

        }
        catch(MyException me) {
            System.out.println(me.getMessage());
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Terminating here");
        
    }
}