public class leason2_1 {
    public static void main(String [] args){
        try {

            System.out.println("input c:");
            char c = (char) System.in.read();
            switch(c)
            {
                case 'y':
                    System.out.println("ok:im y");
                    break;

                case 'a':
                    System.out.println("ok:im a");
                    break;
                
                case 'b':
                    System.out.println("ok:im b");
                    break;
                    
                default:
                    System.out.println("ok:defult "+c);
                    break;

            }	
        } catch (Exception e) {
            //TODO: handle exception
        }
        		        			 				

    }

}
