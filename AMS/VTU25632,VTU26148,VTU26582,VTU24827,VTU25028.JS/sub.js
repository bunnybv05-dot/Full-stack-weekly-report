function loadSubjects() {
    return JSON.parse(localStorage.getItem("subjects")) || [];
}

function saveSubjects(subjects) {
    localStorage.setItem("subjects", JSON.stringify(subjects));
}

function addSubject(code, name) {
    let subjects = loadSubjects();
    subjects.push({ code, name });
    saveSubjects(subjects);
}
