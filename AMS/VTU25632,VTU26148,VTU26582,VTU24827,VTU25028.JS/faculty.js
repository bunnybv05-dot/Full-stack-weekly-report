function loadFaculty() {
    return JSON.parse(localStorage.getItem("faculty")) || [];
}

function saveFaculty(faculty) {
    localStorage.setItem("faculty", JSON.stringify(faculty));
}

function addFaculty(id, name, dept) {
    let faculty = loadFaculty();
    faculty.push({ id, name, dept });
    saveFaculty(faculty);
}
