function loadStudents() {
    return JSON.parse(localStorage.getItem("students")) || [];
}

function saveStudents(students) {
    localStorage.setItem("students", JSON.stringify(students));
}

function addStudent(id, name, dept, year) {
    let students = loadStudents();
    students.push({ id, name, dept, year });
    saveStudents(students);
}
