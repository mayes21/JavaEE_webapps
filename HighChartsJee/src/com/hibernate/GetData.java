package com.hibernate;

import org.hibernate.Session;



public class GetData 
{
	
	public GetData() {
		// TODO Auto-generated constructor stub
	}
	
	private static Session s = null;
	private String query1 = "select count(classe) from Results where classe='y'";
	private String query2 = "select count(classe) from Results where classe='n'";
	
	
	private String query3 = "select count(anorexia) from TweetsNew where anorexia > 0";
	private String query4 = "select count(cyberbullying) from TweetsNew where cyberbullying > 0";
	private String query5 = "select count(depression) from TweetsNew where depression > 0";
	private String query6 = "select count(fear) from TweetsNew where fear > 0";
	private String query7 = "select count(hurt) from TweetsNew where hurt > 0";
	private String query8 = "select count(insults) from TweetsNew where insults > 0";
	private String query9 = "select count(loneliness) from TweetsNew where loneliness > 0";
	private String query10 = "select count(lonely) from TweetsNew where lonely > 0";
	private String query11 = "select count(method) from TweetsNew where method > 0";
	private String query12 = "select count(sentence) from TweetsNew where sentence > 0";
	
	private String queryAll = "select count(anorexia) from TweetsNew";
	
	public long[] getStats()
	{
		long[] res = new long[2];
		
		System.out.println("blablaGetdata()");
		
		s = HibernateUtils.getSession();
		
		//System.out.println("blablaGetdata()");
		
		
		long q1 = (long) ((Long) s.createQuery(query1).uniqueResult()).longValue();
		res[0] = q1;
		System.out.println("nombre de y = "+res[0]);
		
		long q2 = (long) ((Long) s.createQuery(query2).uniqueResult()).longValue();
		res[1] = q2;
		System.out.println("nombre de n = "+res[1]);
		s.close();
		
		return res;	
	}
	
	public long[] getSubcats()
	{
		long[] res = new long[11];
		
		s = HibernateUtils.getSession();
		
		long qAnorexia = (long) ((Long) s.createQuery(query3).uniqueResult()).longValue();
		long qCyberbullying = (long) ((Long) s.createQuery(query4).uniqueResult()).longValue();
		long qDepression = (long) ((Long) s.createQuery(query5).uniqueResult()).longValue();
		long qFear = (long) ((Long) s.createQuery(query6).uniqueResult()).longValue();
		long qHurt = (long) ((Long) s.createQuery(query7).uniqueResult()).longValue();
		long qInsults = (long) ((Long) s.createQuery(query8).uniqueResult()).longValue();
		long qLoneliness= (long) ((Long) s.createQuery(query9).uniqueResult()).longValue();
		long qLonely= (long) ((Long) s.createQuery(query10).uniqueResult()).longValue();
		long qMethod= (long) ((Long) s.createQuery(query11).uniqueResult()).longValue();
		long qSentence= (long) ((Long) s.createQuery(query12).uniqueResult()).longValue();
		
		long qAll = (long) ((Long) s.createQuery(queryAll).uniqueResult()).longValue();
		
		res[0] = qAnorexia;
		res[1] = qCyberbullying;
		res[2] = qDepression;
		res[3] = qFear;
		res[4] = qHurt;
		res[5] = qInsults;
		res[6] = qLoneliness;
		res[7] = qLonely;
		res[8] = qMethod;
		res[9] = qSentence;
 		res[10] = qAll;
 		
		System.out.println(res[0]+" - "+res[1]+" - "+res[2]+" - "+res[3]+" - "+res[4]+" - "+res[5]
				+" - "+res[6]+" - "+res[7]+" - "+res[8]+" - "+res[9]+" - "+res[10]);
		
		return res;
	}
}
