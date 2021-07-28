var weeks;
(function (weeks) {
    weeks["Sunday"] = "sun";
    weeks["Monday"] = "mon";
    weeks["Tuesday"] = "tue";
    weeks["wednesday"] = "wed";
    weeks["Thursday"] = "thu";
    weeks["Friday"] = "fri";
    weeks["Saturday"] = "sat";
})(weeks || (weeks = {}));
console.log(weeks);
console.log(weeks.Sunday);
var day;
day = weeks.Sunday;
if (day == weeks.Sunday) {
    console.log('its holiday no class');
}
else {
    console.log('no holiday classes is their');
}
/* TODO: By Students:
* Create and enum of weekdays and assign it a string value
* and display the entire enum, just one constant using key and value
*/ 
