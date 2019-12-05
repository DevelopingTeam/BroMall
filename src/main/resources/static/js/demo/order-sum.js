// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';
Chart.defaults.global.responsive = true;

// 订单统计
var ctx = document.getElementById("orderTotal");
var orderTotalLineChart = new Chart(ctx, {
    type: 'line',
    data: {
        labels: ["Mar 1", "Mar 2", "Mar 3", "Mar 4", "Mar 5", "Mar 6", "Mar 7", "Mar 8", "Mar 9", "Mar 10", "Mar 11", "Mar 12"],
        datasets: [
            {
                label: "订单金额",
                yAxisID: "order_money",
                lineTension: 0.3,
                backgroundColor: "rgba(245,222,179,0.2)",
                borderColor: "rgba(245,222,179,1)",
                pointRadius: 5,
                pointBackgroundColor: "rgba(245,222,179,1)",
                pointBorderColor: "rgba(255,255,255,0.8)",
                pointHoverRadius: 5,
                pointHoverBackgroundColor: "rgba(245,222,179,1)",
                pointHitRadius: 50,
                pointBorderWidth: 2,
                data: [10000, 30162, 26263, 18390, 18287, 28682, 31274, 33259, 25849, 24159, 32651, 31984],
            },
            {
                label: "订单数量",
                yAxisID: "order_number",
                lineTension: 0.3,
                backgroundColor: "rgba(2,117,216,0.2)",
                borderColor: "rgba(2,117,216,1)",
                pointRadius: 5,
                pointBackgroundColor: "rgba(2,117,216,1)",
                pointBorderColor: "rgba(255,255,255,0.8)",
                pointHoverRadius: 5,
                pointHoverBackgroundColor: "rgba(2,117,216,1)",
                pointHitRadius: 50,
                pointBorderWidth: 2,
                data: [100, 162, 262, 183, 182, 286, 312, 332, 258, 241, 326, 319],
            }],
    },
    options: {
        scales: {
            yAxes: [{
                type: "linear",
                display: true,
                position: "left",
                id: "order_number"
            }, {
                type: "linear",
                display: true,
                position: "right",
                id: "order_money"
            }],
        },
        tooltips: {
            mode: "index",
            intersect: false,
        }
    }
});
