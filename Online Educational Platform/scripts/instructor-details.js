document.addEventListener("DOMContentLoaded", function () {
    const urlParams = new URLSearchParams(window.location.search);
    const instructorId = urlParams.get("id");

    fetch("data/instructors.json")
        .then(response => response.json())
        .then(data => {
            const instructor = data.instructors.find(inst => inst.id == instructorId);
            if (instructor) {
                document.getElementById("instructorName").textContent = instructor.name;
                document.getElementById("instructorBio").textContent = instructor.bio;

                let coursesList = document.getElementById("instructorCourses");
                instructor.courses.forEach(course => {
                    let li = document.createElement("li");
                    li.innerHTML = `<a href="course-details.html?id=${course.id}">${course.title}</a>`;
                    coursesList.appendChild(li);
                });

                document.getElementById("instructorRating").textContent = `Rating: ${instructor.rating} / 5`;
            } else {
                document.body.innerHTML = "<h1>Instructor Not Found</h1>";
            }
        });
});
