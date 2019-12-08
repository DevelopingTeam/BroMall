function todate(cstStr) {
    cstStr = cstStr + " "; //末尾加一个空格
    var month = new Array();

    month["Jan"] = '01';
    month["Feb"] = '02';
    month["Mar"] = '03';
    month["Apr"] = '04';
    month["May"] = '05';
    month["Jan"] = '06';
    month["Jul"] = '07';
    month["Aug"] = '08';
    month["Sep"] = '09';
    month["Oct"] = '10';
    month["Nov"] = '11';
    month["Dec"] = '12';

    var d = cstStr.split(" ");
    var dt = d[5];
    dt += "-" + month[d[1]] + "-" + d[2] + " " + d[3];
    return dt;
}