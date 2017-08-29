$( document ).ready(function() {
	var ctx = document.getElementById("myChart").getContext('2d');
//	var myChart = new Chart(ctx, config);
	window.myLine = new Chart(ctx, config);
	alert(path);
	$('#randomizeData').click(function(e) {
		config.data.datasets.forEach(function(dataset) {
			// 새로 받은 데이터를 설정하는 부분(서버 호출)
			$.get(path+"/update_graph.do", function(data, status){
		        console.log("Data: " + JSON.stringify(data) + "\nStatus: " + status);
		        
		        // 받아온 데이터를 추가한다.
		        config.data.labels = ["8/10", "8/11", "8/12", "8/13", "8/14", "8/15"];
		        dataset.data = data.test.arr;
		        window.myLine.update();
		    });
			
			// 새로 받은 데이터를 설정하는 부분(직접 설정)
//			console.log(dataset.data);
//			dataset.data = [19,12,5,3,3,2];
//			console.log(dataset.data);
		});
	});
	
	$('#phone').click(function(e) {
		$.get(path+"/update_graph_iphone.do", function(data, status){
	        console.log("Data: " + JSON.stringify(data) + "\nStatus: " + status);
	        
	        // 받아온 데이터를 추가한다.
	        config.type = data.type;
	        config.data.label = data.label;
	        config.data.labels = data.labels;
	        config.data.datasets[0].data = data.data;
	        
	        window.myLine.update();
	    });
		
		
	});
});


var config = {
    type: 'line',
    data: {
        labels: ["8/10", "8/11", "8/12", "8/13", "8/14", "8/15"],
        datasets: [{
            label: 'price of iPhone7',
            data: [12, 19, 3, 5, 2, 3],
            backgroundColor: [
                'rgba(255, 99, 132, 0.2)',
            ],
            borderColor: [
                'rgba(255,99,132,1)',
            ],
            borderWidth: 1
        }]
    },
    options: {
        responsive: true,
        title:{
            display:true,
            text:'iPhone7'
        },
        scales: {
            xAxes: [{
                display: true,
            }],
            yAxes: [{
                display: true,
                // type: 'logarithmic',
            }]
        },
        annotation: {
            events: ['click'],
            annotations: [{
                drawTime: 'afterDraw',
                id: 'hline',
                type: 'line',
                mode: 'horizontal',
                scaleID: 'y-axis-0',
                value: 7,
                borderColor: 'red',
                borderWidth: 2,
                label: {
                    backgroundColor: "red",
                    content: "Mean",
                    enabled: true
                }
            }, {
                drawTime: 'afterDraw',
                id: 'vline',
                type: 'line',
                mode: 'vertical',
                scaleID: 'x-axis-0',
                value: '8/12',
                borderColor: 'orange',
                borderWidth: 2,
                label: {
                    backgroundColor: "red",
                    content: "Release Day",
                    enabled: true
                }
            }]
        }
    }
}


