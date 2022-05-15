
public class StarPattern2 {

			public static void main(String args[])
		            {
	                            // The x-pattern problem
				for(int i=4;i>=1;i--)
				{
					for(int j=4;j>i-1;j--)
					{
						System.out.print(" ");
					}
					
					for(int k=1;k<(2*i);k++)
					{
					  
						if(k>1 && k<((2*i)-1))
						{
							System.out.print(" ");
						}
						else {
							System.out.print("*");
						}
					}

				   System.out.println();
			       }			

				for(int i=1;i<=3;i++)
				{
					for(int j=3;j>=i;j--)
					{
						System.out.print(" ");
					}
					for(int k=1;k<=((2*i)+1);k++)
					{
						
							if(k>1 && k<(2*i+1))
						      {
							System.out.print(" ");
						     }
						      else {
							System.out.print("*");
						    }
						
				         }
				 System.out.println();
			     }
			}			
}
