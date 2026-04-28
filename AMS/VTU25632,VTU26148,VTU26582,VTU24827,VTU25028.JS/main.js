const pageMap = {
    "Student Details": "SM.html",
    "Faculty Details": "FM.html",
    "Subject Details": "SubM.html",
    "Attendance": "Attendence.html",
    "Reports": "report.html"
};

document.querySelectorAll(".card").forEach(card => {
    card.addEventListener("click", () => {
        const title = card.querySelector("h3").innerText;
        if (pageMap[title]) {
            window.location.href = pageMap[title];
        }
    });
});
