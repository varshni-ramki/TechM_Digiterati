document.addEventListener("DOMContentLoaded", function () {
    const courseSelect = document.getElementById("courseSelect");

    fetch("data/courses.json")
        .then(response => response.json())
        .then(data => {
            data.courses.forEach(course => {
                let option = document.createElement("option");
                option.value = course.id;
                option.textContent = course.title;
                courseSelect.appendChild(option);
            });
        });

    document.getElementById("enrollForm").addEventListener("submit", function (e) {
        e.preventDefault();
        
        let name = document.getElementById("name").value.trim();
        let email = document.getElementById("email").value.trim();
        let course = courseSelect.value;

        if (!name || !email || !course) {
            alert("Please fill in all fields.");
            return;
        }

        alert(`Enrollment Successful!\nName: ${name}\nCourse: ${courseSelect.options[courseSelect.selectedIndex].text}`);
    });
});
