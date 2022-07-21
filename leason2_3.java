import java.io.IOException;
class leason2_3 {
	public static void main(String args[]) throws IOException {
	    try {
            
            int i, n, sum=1;
            System.out.println("Please input(0~7):");
            n = System.in.read();
            n -= 48;  //  传入的是字符串，ASCII 码 转成数字，
            for (i = 1; i <= n; i++) 
            {
                sum *= i;
            }
                   
            System.out.println(n + "!= " + sum);

        } catch (Exception e) {
            //TODO: handle exception
        }

	}
}
