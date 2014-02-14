package com.hibernate;

import java.util.ArrayList;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("blabla");

		long[] results = new long[2];

		System.out.println("blabla2");
		results = new GetData().getStats();

		System.out.println((float)results[0]+" - "+(float)results[1]);


		ArrayList<Float> resultsPercent = new ArrayList<>();

		float countYes = (float)(results[0]/((float)results[0]+(float)results[1]))*100;
		float countNo = (float)(results[1]/((float)results[0]+(float)results[1]))*100;

		resultsPercent.add(countYes);
		resultsPercent.add(countNo);
		
		for(Float f : resultsPercent)
		{
			System.out.println("==="+f.floatValue());
		}
		
		
		
		/*long somme = 0;
		for(int i=0; i<results2.length; i++)
		{
			somme += results2[i];
		}*/
		
		//System.out.println(somme);
		
		long[] results2 = new long[11];
		
		results2 = new GetData().getSubcats();
		
		ArrayList<Float> resultsPercent2 = new ArrayList<>();
		
		float countAnorexia = (float)(results2[0]/(float) results2[10])*100;
		float countCyberbullying = (float)(results2[1]/(float) results2[10])*100;
		float countDepression = (float)(results2[2]/(float) results2[10])*100;
		float countFear = (float)(results2[3]/(float) results2[10])*100;
		float countHurt = (float)(results2[4]/(float) results2[10])*100;
		float countInsults = (float)(results2[5]/(float) results2[10])*100;
		float countLoneliness = (float)(results2[6]/(float) results2[10])*100;
		float countLonely = (float)(results2[7]/(float) results2[10])*100;
		float countMethod = (float)(results2[8]/(float) results2[10])*100;
		float countSentence = (float)(results2[9]/(float) results2[10])*100;
		
		resultsPercent2.add(countAnorexia);
		resultsPercent2.add(countCyberbullying);
		resultsPercent2.add(countDepression);
		resultsPercent2.add(countFear);
		resultsPercent2.add(countHurt);
		resultsPercent2.add(countInsults);
		resultsPercent2.add(countLoneliness);
		resultsPercent2.add(countLonely);
		resultsPercent2.add(countMethod);
		resultsPercent2.add(countSentence);

		for(Float f : resultsPercent2)
		{
			System.out.println("===> "+f.floatValue());
		}
		
		resultsPercent.addAll(resultsPercent2);

		for(Float f : resultsPercent)
		{
			System.out.println("##### "+f.floatValue());
		}
	}

}
