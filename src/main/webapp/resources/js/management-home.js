document.addEventListener('DOMContentLoaded',()=>{
	
	am5.ready(()=>{
	  //Initialize Chart

	  	// Create root element
	  	// https://www.amcharts.com/docs/v5/getting-started/#Root_element
	  	var root = am5.Root.new("adminChart");


	  	// Set themes
	  	// https://www.amcharts.com/docs/v5/concepts/themes/
	  	root.setThemes([
	  	  am5themes_Animated.new(root)
	  	]);


	  	// Create chart
	  	// https://www.amcharts.com/docs/v5/charts/xy-chart/
	  	var chart = root.container.children.push(am5xy.XYChart.new(root, {
	  	  panX: true,
	  	  panY: false,
	  	  wheelX: "panX",
	  	  wheelY: "zoomX",
	  	  pinchZoomX:true
	  	}));
	  	

	  	// Add cursor
	  	// https://www.amcharts.com/docs/v5/charts/xy-chart/cursor/
	  	var cursor = chart.set("cursor", am5xy.XYCursor.new(root, {
	  	  behavior: "none"
	  	}));
	  	cursor.lineY.set("visible", false);

	  	// Generate random data
	  	
	  	// Create axes
	  	// https://www.amcharts.com/docs/v5/charts/xy-chart/axes/
	  	// https://www.amcharts.com/docs/v5/charts/xy-chart/axes/category-date-axis/
	  	var xRenderer = am5xy.AxisRendererX.new(root, {});
	  	xRenderer.labels.template.set("minPosition", 0.01);
	  	xRenderer.labels.template.set("maxPosition", 0.99);
	      
	  	
	  	var xAxis = chart.xAxes.push(
	  	  am5xy.CategoryDateAxis.new(root, {
	  	    categoryField: "date",
	  	    baseInterval: {
	  	      timeUnit: "day",
	  	      count: 1
	  	    },
	  	    renderer: xRenderer,
	  	    tooltip: am5.Tooltip.new(root, {})
	  	  })
	  	);

	  	var yAxis = chart.yAxes.push(
	  	  am5xy.ValueAxis.new(root, {
	  	    renderer: am5xy.AxisRendererY.new(root, {})
	  	  })
	  	);


	  	// Add series
	  	// https://www.amcharts.com/docs/v5/charts/xy-chart/series/
	  	var series = chart.series.push(am5xy.LineSeries.new(root, {
	  	  name: "Series",
	  	  xAxis: xAxis,
	  	  yAxis: yAxis,
	  	  valueYField: "value",
	  	  categoryXField: "date"
	  	}));
		
	  const loadChart =(data)=>{
		// Set data
		series.data.setAll(data);
		xAxis.data.setAll(data);

		// Make stuff animate on load
		// https://www.amcharts.com/docs/v5/concepts/animations/
		series.appear(1000);
		chart.appear(1000, 100);
	  }	
	  
		
	  //Load Data
	  const loadData = (url) =>{
		// console.log(`Request API: ${url}`)
	     fetch(url,{
			method:'GET',
			
			headers :{
				 'Content-Type' : 'application-json'
			   }
			}).then(response=>{
			  if(!response.ok){
				 console.log(response.json())
				 throw new Error(`API Error :${response.status}`)
			  }
				return response.json()
			}).then(data => 
				    loadChart(data))
			.catch(error =>{
				 console.error('Error Fetching API',error)
			})
	 }
	  
	  
	  const monthly = document.getElementById('monthly')
	  const yearly = document.getElementById('yearly')
	  
	  monthly.addEventListener('click',()=>loadData(monthly.dataset['restApi']))
	  yearly.addEventListener('click',()=>loadData(yearly.dataset['restApi']))
	  
	  const monthlyUrl = monthly.dataset['restApi']
	  
	  loadData(monthlyUrl)
	  
	}) 
	
})
