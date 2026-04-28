function loadAttendance() {
    return JSON.parse(localStorage.getItem("attendance")) || {};
}

function saveAttendance(data) {
    localStorage.setItem("attendance", JSON.stringify(data));
}

function submitAttendance() {
    let attendance = loadAttendance();

    document.querySelectorAll("table tr").forEach((row, index) => {
        if (index === 0) return;

        let roll = row.children[0].innerText;
        let status = row.querySelector("select").value;

        if (!attendance[roll]) {
            attendance[roll] = [];
        }

        if (status) {
            attendance[roll].push(status);
        }
    });

    saveAttendance(attendance);
    alert("Attendance Submitted Successfully");
}
