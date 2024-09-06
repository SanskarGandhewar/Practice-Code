package GreekForGreek;

public class Soluution 
{
    static int minJump(int arr[], int n)
    {
        int jump=0;
        int count=0;
 
        for (int i = 0; i < arr.length-1; i++) 
        {
    		count=arr[i+1]-arr[i];
    		
    		if(count%2==0 || count%3==0)
    		{
    			jump++;
    		}	
		}
        return jump;
    }
    
    public static void main(String[]args)
    {
        int arr[]={2,5,7,9};
        System.out.println(Soluution.minJump(arr,4));
       
    }   
}