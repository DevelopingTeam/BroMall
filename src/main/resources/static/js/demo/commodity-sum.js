// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';
Chart.defaults.global.responsive = true;

// 商品总览
var ctx = document.getElementById('commodityPieChart');
var commodityPieChart = new Chart(ctx, {
    type: 'pie',
    data: {
        labels: ['已下架', '已上架', '缺库存'],
        datasets: [{
            label: '商品总览',
            data: [100, 400, 50],
            borderColor:'lightGray',
            backgroundColor:['pink','skyblue','LightYellow'],
            borderWidth: 1
        }]
    }
});