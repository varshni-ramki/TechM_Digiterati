document.addEventListener("DOMContentLoaded", function () {
    const urlParams = new URLSearchParams(window.location.search);
    const courseId = urlParams.get("id");

    fetch("data/courses.json")
        .then(response => response.json())
        .then(data => {
            const course = data.courses.find(c => c.id == courseId);
            if (course) {
                document.getElementById("courseTitle").textContent = course.title;
                document.getElementById("courseDescription").textContent = course.description;

                let prerequisitesList = document.getElementById("coursePrerequisites");
                course.prerequisites.forEach(prereq => {
                    let li = document.createElement("li");
                    li.textContent = prereq;
                    prerequisitesList.appendChild(li);
                });

                let reviewsDiv = document.getElementById("courseReviews");
                course.reviews.forEach(review => {
                    let p = document.createElement("p");
                    p.textContent = `"${review.comment}" - ${review.user}`;
                    reviewsDiv.appendChild(p);
                });
            } else {
                document.body.innerHTML = "<h1>Course Not Found</h1>";
            }
        });
});
