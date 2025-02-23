document.addEventListener("DOMContentLoaded", function () {
    fetch("data/courses.json")
        .then(response => response.json())
        .then(data => {
            const courseList = document.getElementById("courseList");
            data.courses.forEach(course => {
                let courseCard = document.createElement("div");
                courseCard.classList.add("course-card");
                courseCard.innerHTML = `
                    <h3>${course.title}</h3>
                    <p>${course.description}</p>
                    <button onclick="location.href='course-details.html?id=${course.id}'">View Details</button>
                `;
                courseList.appendChild(courseCard);
            });
        });
});
