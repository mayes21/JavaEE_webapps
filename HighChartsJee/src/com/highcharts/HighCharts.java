package com.highcharts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.hibernate.GetData;

/**
 * Servlet implementation class HighCharts
 */
@WebServlet("/HighCharts")
public class HighCharts extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HighCharts() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		long[] results = new long[2];

		results = new GetData().getStats();

		ArrayList<Float> resultsPercent = new ArrayList<>();

		float countYes = (float)(results[0]/((float)results[0]+(float)results[1]))*100;
		float countNo = (float)(results[1]/((float)results[0]+(float)results[1]))*100;

		resultsPercent.add(countYes);
		resultsPercent.add(countNo);

		for(Float f : resultsPercent)
		{
			System.out.println("==="+f.floatValue());
		}

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

		//ArrayList<Float> resultsGlobal = new ArrayList<>();
		
		resultsPercent.addAll(resultsPercent2);
		
		/*float[] resultsPercent = new float[2];

		resultsPercent[0] = (float)(results[0]/((float)results[0]+(float)results[1]))*100;
		resultsPercent[1] = (float)(results[1]/((float)results[0]+(float)results[1]))*100;

		System.out.println(resultsPercent[0]+" - "+resultsPercent[1]);*/

		Gson gson = new Gson();

		JsonElement element = gson.toJsonTree(resultsPercent, new TypeToken<ArrayList<Float>>() {}.getType());

		JsonArray jsonArray = element.getAsJsonArray();

		System.out.println(jsonArray);

		response.setContentType("application/json");

		response.getWriter().print(jsonArray);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
