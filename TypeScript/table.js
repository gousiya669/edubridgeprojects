var array = [["A1", "B1", "C1"],
    ["A2", "B2", "C2"],
    ["A3", "B3", "C3"],
    ["A4", "B4", "C4"],
    ["A5", "B5", "C5"],
    ["A1", "B1", "C1"],
    ["A2", "B2", "C2"],
    ["A3", "B3", "C3"],
    ["A4", "B4", "C4"],
    ["A5", "B5", "C5"],
    ["A6", "B6", "C6"],
    ["A7", "B7", "C7"]], table = document.getElementById("table");
for (var i = 0; i < array.length; i++) {
    // create a new row
    var newRow = table.insertRow(table.length);
    for (var j = 0; j < array[i].length; j++) {
        // create a new cell
        var cell = newRow.insertCell(j);
        // add value to the cell
        cell.innerHTML = array[i][j];
    }
}
