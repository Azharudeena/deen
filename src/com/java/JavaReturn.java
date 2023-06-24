package com.java;
//ReturnedType video 2
public class JavaReturn
{
	
	 Integer collectAmount = 1000;
	
	 public Integer CollecttheamountAndGivenToMe()
	 {
		 System.out.println("Daddy i collect the amunt "+" " + collectAmount +  "i send it to you" );
		return collectAmount;
		 
	 }

	public static void main(String[] args)
	{
		JavaReturn myson = new JavaReturn();
		Integer collect =myson.CollecttheamountAndGivenToMe();
		System.out.println("Got the amount my son "+" " + collect);
		

	}

}
