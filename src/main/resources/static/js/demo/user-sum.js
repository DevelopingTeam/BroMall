// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';
Chart.defaults.global.responsive = true;


// 用户总览
var ctx = document.getElementById('userPieChart');
var userPieChart = new Chart(ctx, {
    type: 'pie',
    data: {
        labels: ['今日新增', '昨日新增', '本月新增', "会员总数"],
        datasets: [{
            label: '用户总览',
            data: [100, 200, 1500, 10000],
            borderColor:'lightGray',
            backgroundColor:['pink','skyblue','LightYellow', 'LawnGreen'],
            borderWidth: 1
        }]
    }
});
