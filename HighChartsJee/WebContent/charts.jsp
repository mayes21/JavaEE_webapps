<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Charts</title>
<script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script src="highcharts.js"></script>
<script src="exporting.js"></script>
<script type="text/javascript">
	function showPie()
	{
		$(function () {
		    	//var chart;
		    	
		    	var countYes, countNo;
		    	
		    	$.get('HighCharts', function(responseJson) {
		    		alert(responseJson[0]+' - '+responseJson[1]);
		    		countYes = responseJson[0];
		    		countNo = responseJson[1];
		    		alert(countYes+" - "+countNo);
		    	
		    	
		    /*	var cYes = JSON.stringify(countYes);
		    	var cNo = JSON.stringify(countNo);
		    	*/
		    	
		    	// Build the chart
		        $('#container').highcharts({
		        	
		        	
		            chart: {
		                plotBackgroundColor: null,
		                plotBorderWidth: null,
		                plotShadow: false
		            },
		            title: {
		                text: 'Suspects tweets (Suicidal ones and none)'
		            },
		            tooltip: {
		        	    pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
		            },
		            plotOptions: {
		                pie: {
		                    allowPointSelect: true,
		                    cursor: 'pointer',
		                    dataLabels: {
		                        enabled: false
		                    },
		                    showInLegend: true
		                }
		            },
		            series: [{
		                type: 'pie',
		                name: 'Browser share',
		                data: [
		                    ['Suspects tweets but not suicidal',  countNo],
		                    {
		                        name: 'Suspects and suicidal tweets',
		                        y: countYes,
		                        sliced: false,
		                        selected: true
		                    },
		                ]
		            }]
		        });
		    });
		});
	}
	
	function drawColumn()
	{
		$(function () {
			
			var count1, count2, count3, count4, count5, count6, count7, count8, count9, count10;
			
			$.get('HighCharts', function(responseJson) {
	    		alert(responseJson[2]+' - '+responseJson[3]+' - '+responseJson[4]+' - '+responseJson[5]+' - '+responseJson[6]+' - '+responseJson[7]+' - '+responseJson[8]+' - '+responseJson[9]+' - '+responseJson[10]+' - '+responseJson[11]);
	    		count1 = responseJson[2];
	    		count2 = responseJson[3];
	    		count3 = responseJson[4];
	    		count4 = responseJson[5];
	    		count5 = responseJson[6];
	    		count6 = responseJson[7];
	    		count7 = responseJson[8];
	    		count8 = responseJson[9];
	    		count9 = responseJson[10];
	    		count10 = responseJson[11];
	    		alert(count1+" - "+count2+" - "+count3+" - "+count4+" - "+count5+" - "+count6+" - "+count7+" - "+count8+" - "+count9+" - "+count10);
	    		
	        $('#container2').highcharts({
	            chart: {
	                type: 'column'
	            },
	            title: {
	                text: 'Monthly Average Rainfall'
	            },
	            xAxis: {
	                categories: [
	                    'Anorexia',
	                    'Cyberbullying',
	                    'Depression',
	                    'Fear',
	                    'Hurt',
	                    'Insults',
	                    'Loneliness',
	                    'Lonely',
	                    'Method',
	                    'Sentence'
	                ]
	            },
	            yAxis: {
	                min: 0,
	                title: {
	                    text: 'BLABLA'
	                }
	            },
	            tooltip: {
	                headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
	                pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
	                    '<td style="padding:0"><b>{point.y:.1f} </b></td></tr>',
	                footerFormat: '</table>',
	                shared: true,
	                useHTML: true
	            },
	            plotOptions: {
	                column: {
	                    pointPadding: 0.2,
	                    borderWidth: 0
	                }
	            },
	            series: [{
	                name: 'Subcategories',
	                data: [count1, count2, count3, count4, count5, count6, count7, count8, count9, count10]
	    
	            }]
	        });
	    });
	});
}
		</script>
</head>
<body>
	<a href="#" onclick="showPie()">link</a>
	<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
	
	<a href="#" onclick="drawColumn()">link2</a>
	<div id="container2" style="min-width: 310px; height: 400px; margin: 0 auto"></div>
	
</body>
</html>